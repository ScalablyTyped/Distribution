package typings.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait ExecutionArgs extends js.Object {
  
  var contextValue: js.UndefOr[js.Any] = js.native
  
  var document: js.Any = js.native
  
  var fieldResolver: js.UndefOr[js.Any] = js.native
  
  var operationName: js.UndefOr[String] = js.native
  
  var rootValue: js.UndefOr[js.Any] = js.native
  
  var schema: js.Any = js.native
  
  var typeResolver: js.UndefOr[js.Any] = js.native
  
  var variableValues: js.UndefOr[js.Any] = js.native
}
object ExecutionArgs {
  
  @scala.inline
  def apply(document: js.Any, schema: js.Any): ExecutionArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
  
  @scala.inline
  implicit class ExecutionArgsOps[Self <: ExecutionArgs] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: js.Any): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextValue(value: js.Any): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    
    @scala.inline
    def setFieldResolver(value: js.Any): Self = this.set("fieldResolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    
    @scala.inline
    def setTypeResolver(value: js.Any): Self = this.set("typeResolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeResolver: Self = this.set("typeResolver", js.undefined)
    
    @scala.inline
    def setVariableValues(value: js.Any): Self = this.set("variableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableValues: Self = this.set("variableValues", js.undefined)
  }
}
