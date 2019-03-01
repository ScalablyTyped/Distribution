package typings
package camljsLib.camljsMod.CamlBuilderNs

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

object INumberFieldExpression {
  @scala.inline
  def apply(
    EqualTo: js.Function1[scala.Double, IExpression],
    GreaterThan: js.Function1[scala.Double, IExpression],
    GreaterThanOrEqualTo: js.Function1[scala.Double, IExpression],
    In: js.Function1[js.Array[scala.Double], IExpression],
    IsNotNull: js.Function0[IExpression],
    IsNull: js.Function0[IExpression],
    LessThan: js.Function1[scala.Double, IExpression],
    LessThanOrEqualTo: js.Function1[scala.Double, IExpression],
    NotEqualTo: js.Function1[scala.Double, IExpression]
  ): INumberFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualTo")(EqualTo)
    __obj.updateDynamic("GreaterThan")(GreaterThan)
    __obj.updateDynamic("GreaterThanOrEqualTo")(GreaterThanOrEqualTo)
    __obj.updateDynamic("In")(In)
    __obj.updateDynamic("IsNotNull")(IsNotNull)
    __obj.updateDynamic("IsNull")(IsNull)
    __obj.updateDynamic("LessThan")(LessThan)
    __obj.updateDynamic("LessThanOrEqualTo")(LessThanOrEqualTo)
    __obj.updateDynamic("NotEqualTo")(NotEqualTo)
    __obj.asInstanceOf[INumberFieldExpression]
  }
}

