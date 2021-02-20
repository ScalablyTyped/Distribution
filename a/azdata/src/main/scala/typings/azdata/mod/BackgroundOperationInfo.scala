package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundOperationInfo extends StObject {
  
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
  implicit class BackgroundOperationInfoMutableBuilder[Self <: BackgroundOperationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: BackgroundOperation => Unit): Self = StObject.set(x, "operation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
