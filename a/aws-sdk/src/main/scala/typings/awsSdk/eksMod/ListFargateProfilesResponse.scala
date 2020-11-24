package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFargateProfilesResponse extends js.Object {
  
  /**
    * A list of all of the Fargate profiles associated with the specified cluster.
    */
  var fargateProfileNames: js.UndefOr[StringList] = js.native
  
  /**
    * The nextToken value to include in a future ListFargateProfiles request. When the results of a ListFargateProfiles request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListFargateProfilesResponse {
  
  @scala.inline
  def apply(): ListFargateProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFargateProfilesResponse]
  }
  
  @scala.inline
  implicit class ListFargateProfilesResponseOps[Self <: ListFargateProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setFargateProfileNamesVarargs(value: String*): Self = this.set("fargateProfileNames", js.Array(value :_*))
    
    @scala.inline
    def setFargateProfileNames(value: StringList): Self = this.set("fargateProfileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFargateProfileNames: Self = this.set("fargateProfileNames", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
