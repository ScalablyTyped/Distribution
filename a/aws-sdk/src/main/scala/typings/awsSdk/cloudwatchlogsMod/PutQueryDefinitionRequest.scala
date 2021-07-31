package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutQueryDefinitionRequest extends StObject {
  
  /**
    * Use this parameter to include specific log groups as part of your query definition. If you are updating a query definition and you omit this parameter, then the updated definition will contain no log groups.
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.undefined
  
  /**
    * A name for the query definition. If you are saving a lot of query definitions, we recommend that you name them so that you can easily find the ones you want by using the first part of the name as a filter in the queryDefinitionNamePrefix parameter of DescribeQueryDefinitions.
    */
  var name: QueryDefinitionName
  
  /**
    * If you are updating a query definition, use this parameter to specify the ID of the query definition that you want to update. You can use DescribeQueryDefinitions to retrieve the IDs of your saved query definitions. If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID for the new query definition and include it in the response to this operation.
    */
  var queryDefinitionId: js.UndefOr[QueryId] = js.undefined
  
  /**
    * The query string to use for this definition. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: QueryDefinitionString
}
object PutQueryDefinitionRequest {
  
  @scala.inline
  def apply(name: QueryDefinitionName, queryString: QueryDefinitionString): PutQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutQueryDefinitionRequest]
  }
  
  @scala.inline
  implicit class PutQueryDefinitionRequestMutableBuilder[Self <: PutQueryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupNames(value: LogGroupNames): Self = StObject.set(x, "logGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNamesUndefined: Self = StObject.set(x, "logGroupNames", js.undefined)
    
    @scala.inline
    def setLogGroupNamesVarargs(value: LogGroupName*): Self = StObject.set(x, "logGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setName(value: QueryDefinitionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryDefinitionId(value: QueryId): Self = StObject.set(x, "queryDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryDefinitionIdUndefined: Self = StObject.set(x, "queryDefinitionId", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryDefinitionString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
