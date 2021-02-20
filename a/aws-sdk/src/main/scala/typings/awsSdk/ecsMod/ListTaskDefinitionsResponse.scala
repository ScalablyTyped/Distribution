package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTaskDefinitionsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListTaskDefinitions request. When the results of a ListTaskDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of task definition Amazon Resource Name (ARN) entries for the ListTaskDefinitions request.
    */
  var taskDefinitionArns: js.UndefOr[StringList] = js.native
}
object ListTaskDefinitionsResponse {
  
  @scala.inline
  def apply(): ListTaskDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskDefinitionsResponse]
  }
  
  @scala.inline
  implicit class ListTaskDefinitionsResponseMutableBuilder[Self <: ListTaskDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTaskDefinitionArns(value: StringList): Self = StObject.set(x, "taskDefinitionArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionArnsUndefined: Self = StObject.set(x, "taskDefinitionArns", js.undefined)
    
    @scala.inline
    def setTaskDefinitionArnsVarargs(value: String*): Self = StObject.set(x, "taskDefinitionArns", js.Array(value :_*))
  }
}
