package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeQueryDefinitionsResponse extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The list of query definitions that match your request.
    */
  var queryDefinitions: js.UndefOr[QueryDefinitionList] = js.native
}
object DescribeQueryDefinitionsResponse {
  
  @scala.inline
  def apply(): DescribeQueryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryDefinitionsResponse]
  }
  
  @scala.inline
  implicit class DescribeQueryDefinitionsResponseMutableBuilder[Self <: DescribeQueryDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setQueryDefinitions(value: QueryDefinitionList): Self = StObject.set(x, "queryDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryDefinitionsUndefined: Self = StObject.set(x, "queryDefinitions", js.undefined)
    
    @scala.inline
    def setQueryDefinitionsVarargs(value: QueryDefinition*): Self = StObject.set(x, "queryDefinitions", js.Array(value :_*))
  }
}
