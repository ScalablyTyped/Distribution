package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookupFieldExpression extends js.Object {
  /** Specifies that lookup id value will be used. */
  def Id(): INumberFieldExpression
  /** Specifies that lookup value will be used and this value is of type Boolean */
  def ValueAsBoolean(): IBooleanFieldExpression
  /** Specifies that lookup value will be used and this value is of type Date */
  def ValueAsDate(): IDateTimeFieldExpression
  /** Specifies that lookup value will be used and this value is of type DateTime */
  def ValueAsDateTime(): IDateTimeFieldExpression
  /** Specifies that lookup value will be used and this value is of type Number */
  def ValueAsNumber(): INumberFieldExpression
  /** Specifies that lookup value will be used and this value is of type Text */
  def ValueAsText(): ITextFieldExpression
}

object ILookupFieldExpression {
  @scala.inline
  def apply(
    Id: () => INumberFieldExpression,
    ValueAsBoolean: () => IBooleanFieldExpression,
    ValueAsDate: () => IDateTimeFieldExpression,
    ValueAsDateTime: () => IDateTimeFieldExpression,
    ValueAsNumber: () => INumberFieldExpression,
    ValueAsText: () => ITextFieldExpression
  ): ILookupFieldExpression = {
    val __obj = js.Dynamic.literal(Id = js.Any.fromFunction0(Id), ValueAsBoolean = js.Any.fromFunction0(ValueAsBoolean), ValueAsDate = js.Any.fromFunction0(ValueAsDate), ValueAsDateTime = js.Any.fromFunction0(ValueAsDateTime), ValueAsNumber = js.Any.fromFunction0(ValueAsNumber), ValueAsText = js.Any.fromFunction0(ValueAsText))
  
    __obj.asInstanceOf[ILookupFieldExpression]
  }
}

