package typings
package camljsLib.camljsMod.CamlBuilderNs

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

object IBooleanFieldExpression {
  @scala.inline
  def apply(
    EqualTo: js.Function1[scala.Boolean, IExpression],
    IsFalse: js.Function0[IExpression],
    IsNotNull: js.Function0[IExpression],
    IsNull: js.Function0[IExpression],
    IsTrue: js.Function0[IExpression],
    NotEqualTo: js.Function1[scala.Boolean, IExpression]
  ): IBooleanFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualTo")(EqualTo)
    __obj.updateDynamic("IsFalse")(IsFalse)
    __obj.updateDynamic("IsNotNull")(IsNotNull)
    __obj.updateDynamic("IsNull")(IsNull)
    __obj.updateDynamic("IsTrue")(IsTrue)
    __obj.updateDynamic("NotEqualTo")(NotEqualTo)
    __obj.asInstanceOf[IBooleanFieldExpression]
  }
}

