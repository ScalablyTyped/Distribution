package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFargateProfilesResponse extends StObject {
  
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
  implicit class ListFargateProfilesResponseMutableBuilder[Self <: ListFargateProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFargateProfileNames(value: StringList): Self = StObject.set(x, "fargateProfileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFargateProfileNamesUndefined: Self = StObject.set(x, "fargateProfileNames", js.undefined)
    
    @scala.inline
    def setFargateProfileNamesVarargs(value: String*): Self = StObject.set(x, "fargateProfileNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
