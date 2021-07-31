package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionDefinitionVersionsResponse extends StObject {
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Information about a version.
    */
  var Versions: js.UndefOr[listOfVersionInformation] = js.undefined
}
object ListSubscriptionDefinitionVersionsResponse {
  
  @scala.inline
  def apply(): ListSubscriptionDefinitionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionDefinitionVersionsResponse]
  }
  
  @scala.inline
  implicit class ListSubscriptionDefinitionVersionsResponseMutableBuilder[Self <: ListSubscriptionDefinitionVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersions(value: listOfVersionInformation): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: VersionInformation*): Self = StObject.set(x, "Versions", js.Array(value :_*))
  }
}
