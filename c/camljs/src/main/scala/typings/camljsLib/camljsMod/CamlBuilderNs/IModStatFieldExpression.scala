package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModStatFieldExpression extends js.Object {
  /** Checks whether the value of the field is Approved - same as ModStatId.EqualTo(0) */
  def IsApproved(): IExpression
  /** Checks whether the value of the field is Pending - same as ModStatId.EqualTo(2) */
  def IsPending(): IExpression
  /** Checks whether the value of the field is Rejected - same as ModStatId.EqualTo(1) */
  def IsRejected(): IExpression
  /** Represents moderation status ID. */
  def ModStatId(): INumberFieldExpression
  /** Represents moderation status as localized text. In most cases it is better to use ModStatId in the queries instead of ValueAsText. */
  def ValueAsText(): ITextFieldExpression
}

object IModStatFieldExpression {
  @scala.inline
  def apply(
    IsApproved: js.Function0[IExpression],
    IsPending: js.Function0[IExpression],
    IsRejected: js.Function0[IExpression],
    ModStatId: js.Function0[INumberFieldExpression],
    ValueAsText: js.Function0[ITextFieldExpression]
  ): IModStatFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsApproved")(IsApproved)
    __obj.updateDynamic("IsPending")(IsPending)
    __obj.updateDynamic("IsRejected")(IsRejected)
    __obj.updateDynamic("ModStatId")(ModStatId)
    __obj.updateDynamic("ValueAsText")(ValueAsText)
    __obj.asInstanceOf[IModStatFieldExpression]
  }
}

