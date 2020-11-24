package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProfileTimesResponse extends js.Object {
  
  /**
    * The nextToken value to include in a future ListProfileTimes request. When the results of a ListProfileTimes request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The list of start times of the available profiles for the aggregation period in the specified time range. 
    */
  var profileTimes: ProfileTimes = js.native
}
object ListProfileTimesResponse {
  
  @scala.inline
  def apply(profileTimes: ProfileTimes): ListProfileTimesResponse = {
    val __obj = js.Dynamic.literal(profileTimes = profileTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileTimesResponse]
  }
  
  @scala.inline
  implicit class ListProfileTimesResponseOps[Self <: ListProfileTimesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProfileTimesVarargs(value: ProfileTime*): Self = this.set("profileTimes", js.Array(value :_*))
    
    @scala.inline
    def setProfileTimes(value: ProfileTimes): Self = this.set("profileTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
