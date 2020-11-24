package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutQueryDefinitionRequest extends js.Object {
  
  /**
    * Use this parameter to include specific log groups as part of your query definition. If you are updating a query definition and you omit this parameter, then the updated definition will contain no log groups.
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.native
  
  /**
    * A name for the query definition. If you are saving a lot of query definitions, we recommend that you name them so that you can easily find the ones you want by using the first part of the name as a filter in the queryDefinitionNamePrefix parameter of DescribeQueryDefinitions.
    */
  var name: QueryDefinitionName = js.native
  
  /**
    * If you are updating a query definition, use this parameter to specify the ID of the query definition that you want to update. You can use DescribeQueryDefinitions to retrieve the IDs of your saved query definitions. If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID for the new query definition and include it in the response to this operation.
    */
  var queryDefinitionId: js.UndefOr[QueryId] = js.native
  
  /**
    * The query string to use for this definition. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: QueryDefinitionString = js.native
}
object PutQueryDefinitionRequest {
  
  @scala.inline
  def apply(name: QueryDefinitionName, queryString: QueryDefinitionString): PutQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutQueryDefinitionRequest]
  }
  
  @scala.inline
  implicit class PutQueryDefinitionRequestOps[Self <: PutQueryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: QueryDefinitionName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: QueryDefinitionString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNamesVarargs(value: LogGroupName*): Self = this.set("logGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setLogGroupNames(value: LogGroupNames): Self = this.set("logGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupNames: Self = this.set("logGroupNames", js.undefined)
    
    @scala.inline
    def setQueryDefinitionId(value: QueryId): Self = this.set("queryDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryDefinitionId: Self = this.set("queryDefinitionId", js.undefined)
  }
}
