package typings
package camljsLib.CamlBuilderNs

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

