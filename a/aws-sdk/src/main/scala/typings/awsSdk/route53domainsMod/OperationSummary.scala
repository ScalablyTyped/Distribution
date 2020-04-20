package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationSummary extends js.Object {
  /**
    * Identifier returned to track the requested action.
    */
  var OperationId: typings.awsSdk.route53domainsMod.OperationId = js.native
  /**
    * The current status of the requested operation in the system.
    */
  var Status: OperationStatus = js.native
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: Timestamp = js.native
  /**
    * Type of the action requested.
    */
  var Type: OperationType = js.native
}

object OperationSummary {
  @scala.inline
  def apply(OperationId: OperationId, Status: OperationStatus, SubmittedDate: Timestamp, Type: OperationType): OperationSummary = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubmittedDate = SubmittedDate.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationSummary]
  }
}

