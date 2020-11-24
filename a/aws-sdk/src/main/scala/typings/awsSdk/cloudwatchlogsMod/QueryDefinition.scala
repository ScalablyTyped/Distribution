package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDefinition extends js.Object {
  
  /**
    * The date that the query definition was most recently modified.
    */
  var lastModified: js.UndefOr[Timestamp] = js.native
  
  /**
    * If this query definition contains a list of log groups that it is limited to, that list appears here.
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.native
  
  /**
    * The name of the query definition.
    */
  var name: js.UndefOr[QueryDefinitionName] = js.native
  
  /**
    * The unique ID of the query definition.
    */
  var queryDefinitionId: js.UndefOr[QueryId] = js.native
  
  /**
    * The query string to use for this definition. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: js.UndefOr[QueryDefinitionString] = js.native
}
object QueryDefinition {
  
  @scala.inline
  def apply(): QueryDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDefinition]
  }
  
  @scala.inline
  implicit class QueryDefinitionOps[Self <: QueryDefinition] (val x: Self) extends AnyVal {
    
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
    def setLastModified(value: Timestamp): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLogGroupNamesVarargs(value: LogGroupName*): Self = this.set("logGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setLogGroupNames(value: LogGroupNames): Self = this.set("logGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupNames: Self = this.set("logGroupNames", js.undefined)
    
    @scala.inline
    def setName(value: QueryDefinitionName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQueryDefinitionId(value: QueryId): Self = this.set("queryDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryDefinitionId: Self = this.set("queryDefinitionId", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryDefinitionString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
  }
}
