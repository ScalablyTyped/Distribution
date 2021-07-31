package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceDefinitionsResponse extends StObject {
  
  /**
    * Information about a definition.
    */
  var Definitions: js.UndefOr[listOfDefinitionInformation] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListResourceDefinitionsResponse {
  
  @scala.inline
  def apply(): ListResourceDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDefinitionsResponse]
  }
  
  @scala.inline
  implicit class ListResourceDefinitionsResponseMutableBuilder[Self <: ListResourceDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitions(value: listOfDefinitionInformation): Self = StObject.set(x, "Definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "Definitions", js.undefined)
    
    @scala.inline
    def setDefinitionsVarargs(value: DefinitionInformation*): Self = StObject.set(x, "Definitions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
