package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProfileTimesResponse extends StObject {
  
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
  implicit class ListProfileTimesResponseMutableBuilder[Self <: ListProfileTimesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProfileTimes(value: ProfileTimes): Self = StObject.set(x, "profileTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileTimesVarargs(value: ProfileTime*): Self = StObject.set(x, "profileTimes", js.Array(value :_*))
  }
}
