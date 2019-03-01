package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldExpression extends js.Object {
  /** Checks whether the value of the field begins with the specified substring */
  def BeginsWith(value: java.lang.String): IExpression
  /** Checks whether the value of the field contains the specified substring */
  def Contains(value: java.lang.String): IExpression
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: java.lang.String): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[java.lang.String]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: java.lang.String): IExpression
}

object ITextFieldExpression {
  @scala.inline
  def apply(
    BeginsWith: js.Function1[java.lang.String, IExpression],
    Contains: js.Function1[java.lang.String, IExpression],
    EqualTo: js.Function1[java.lang.String, IExpression],
    In: js.Function1[js.Array[java.lang.String], IExpression],
    IsNotNull: js.Function0[IExpression],
    IsNull: js.Function0[IExpression],
    NotEqualTo: js.Function1[java.lang.String, IExpression]
  ): ITextFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BeginsWith")(BeginsWith)
    __obj.updateDynamic("Contains")(Contains)
    __obj.updateDynamic("EqualTo")(EqualTo)
    __obj.updateDynamic("In")(In)
    __obj.updateDynamic("IsNotNull")(IsNotNull)
    __obj.updateDynamic("IsNull")(IsNull)
    __obj.updateDynamic("NotEqualTo")(NotEqualTo)
    __obj.asInstanceOf[ITextFieldExpression]
  }
}

