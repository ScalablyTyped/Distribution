package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: scala.Boolean): IExpression
  /** Checks whether the value of the field is False */
  def IsFalse(): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is True */
  def IsTrue(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: scala.Boolean): IExpression
}

