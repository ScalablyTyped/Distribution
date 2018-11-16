package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INumberFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: scala.Double): IExpression
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: scala.Double): IExpression
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: scala.Double): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[scala.Double]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: scala.Double): IExpression
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: scala.Double): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: scala.Double): IExpression
}

