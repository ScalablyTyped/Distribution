package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundOperationInfo extends js.Object {
  /**
    * Connection information
    */
  var connection: js.UndefOr[Connection] = js.undefined
  /**
    * Operation Description
    */
  var description: String
  /**
    * Operation Display Name
    */
  var displayName: String
  /**
    * True if the operation is cancelable
    */
  var isCancelable: Boolean
  /**
    * The operation id. A unique id will be assigned to it If not specified a
    */
  var operationId: js.UndefOr[String] = js.undefined
  /**
    * The actual operation to execute
    */
  def operation(operation: BackgroundOperation): Unit
}

object BackgroundOperationInfo {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    isCancelable: Boolean,
    operation: BackgroundOperation => Unit,
    connection: Connection = null,
    operationId: String = null
  ): BackgroundOperationInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], operation = js.Any.fromFunction1(operation))
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundOperationInfo]
  }
}

