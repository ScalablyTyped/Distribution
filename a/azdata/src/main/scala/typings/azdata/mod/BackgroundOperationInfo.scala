package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundOperationInfo extends js.Object {
  
  /**
    * Connection information
    */
  var connection: js.UndefOr[Connection] = js.native
  
  /**
    * Operation Description
    */
  var description: String = js.native
  
  /**
    * Operation Display Name
    */
  var displayName: String = js.native
  
  /**
    * True if the operation is cancelable
    */
  var isCancelable: Boolean = js.native
  
  /**
    * The actual operation to execute
    */
  def operation(operation: BackgroundOperation): Unit = js.native
  
  /**
    * The operation id. A unique id will be assigned to it If not specified a
    */
  var operationId: js.UndefOr[String] = js.native
}
object BackgroundOperationInfo {
  
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    isCancelable: Boolean,
    operation: BackgroundOperation => Unit
  ): BackgroundOperationInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], operation = js.Any.fromFunction1(operation))
    __obj.asInstanceOf[BackgroundOperationInfo]
  }
  
  @scala.inline
  implicit class BackgroundOperationInfoOps[Self <: BackgroundOperationInfo] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelable(value: Boolean): Self = this.set("isCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: BackgroundOperation => Unit): Self = this.set("operation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
  }
}
