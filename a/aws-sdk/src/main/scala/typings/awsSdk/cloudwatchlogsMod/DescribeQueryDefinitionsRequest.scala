package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeQueryDefinitionsRequest extends StObject {
  
  /**
    * Limits the number of returned query definitions to the specified number.
    */
  var maxResults: js.UndefOr[QueryListMaxResults] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * Use this parameter to filter your results to only the query definitions that have names that start with the prefix you specify.
    */
  var queryDefinitionNamePrefix: js.UndefOr[QueryDefinitionName] = js.native
}
object DescribeQueryDefinitionsRequest {
  
  @scala.inline
  def apply(): DescribeQueryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryDefinitionsRequest]
  }
  
  @scala.inline
  implicit class DescribeQueryDefinitionsRequestMutableBuilder[Self <: DescribeQueryDefinitionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: QueryListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setQueryDefinitionNamePrefix(value: QueryDefinitionName): Self = StObject.set(x, "queryDefinitionNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryDefinitionNamePrefixUndefined: Self = StObject.set(x, "queryDefinitionNamePrefix", js.undefined)
  }
}
