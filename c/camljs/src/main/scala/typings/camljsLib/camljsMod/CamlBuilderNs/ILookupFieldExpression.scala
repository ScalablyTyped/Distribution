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
    Id: js.Function0[INumberFieldExpression],
    ValueAsBoolean: js.Function0[IBooleanFieldExpression],
    ValueAsDate: js.Function0[IDateTimeFieldExpression],
    ValueAsDateTime: js.Function0[IDateTimeFieldExpression],
    ValueAsNumber: js.Function0[INumberFieldExpression],
    ValueAsText: js.Function0[ITextFieldExpression]
  ): ILookupFieldExpression = {
    val __obj = js.Dynamic.literal(Id = Id, ValueAsBoolean = ValueAsBoolean, ValueAsDate = ValueAsDate, ValueAsDateTime = ValueAsDateTime, ValueAsNumber = ValueAsNumber, ValueAsText = ValueAsText)
  
    __obj.asInstanceOf[ILookupFieldExpression]
  }
}

