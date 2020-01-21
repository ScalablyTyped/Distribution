package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewActionDetail extends js.Object {
  /**
    * The unique identifier for the action.
    */
  var ActionId: js.UndefOr[EntityId] = js.native
  /**
    *  The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting results, and deciding which other actions will be necessary. 
    */
  var ActionName: js.UndefOr[String] = js.native
  /**
    *  The date when the action was completed.
    */
  var CompleteTime: js.UndefOr[Timestamp] = js.native
  /**
    *  Present only when the Results have a FAILED Status.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    *  A description of the outcome of the review.
    */
  var Result: js.UndefOr[String] = js.native
  /**
    *  The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED. 
    */
  var Status: js.UndefOr[ReviewActionStatus] = js.native
  /**
    *  The specific HITId or AssignmentID targeted by the action.
    */
  var TargetId: js.UndefOr[EntityId] = js.native
  /**
    *  The type of object in TargetId.
    */
  var TargetType: js.UndefOr[String] = js.native
}

object ReviewActionDetail {
  @scala.inline
  def apply(
    ActionId: EntityId = null,
    ActionName: String = null,
    CompleteTime: Timestamp = null,
    ErrorCode: String = null,
    Result: String = null,
    Status: ReviewActionStatus = null,
    TargetId: EntityId = null,
    TargetType: String = null
  ): ReviewActionDetail = {
    val __obj = js.Dynamic.literal()
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId.asInstanceOf[js.Any])
    if (ActionName != null) __obj.updateDynamic("ActionName")(ActionName.asInstanceOf[js.Any])
    if (CompleteTime != null) __obj.updateDynamic("CompleteTime")(CompleteTime.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewActionDetail]
  }
}

