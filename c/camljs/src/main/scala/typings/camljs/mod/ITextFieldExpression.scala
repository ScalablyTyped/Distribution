package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldExpression extends js.Object {
  /** Checks whether the value of the field begins with the specified substring */
  def BeginsWith(value: String): IExpression
  /** Checks whether the value of the field contains the specified substring */
  def Contains(value: String): IExpression
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: String): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[String]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: String): IExpression
}

object ITextFieldExpression {
  @scala.inline
  def apply(
    BeginsWith: String => IExpression,
    Contains: String => IExpression,
    EqualTo: String => IExpression,
    In: js.Array[String] => IExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    NotEqualTo: String => IExpression
  ): ITextFieldExpression = {
    val __obj = js.Dynamic.literal(BeginsWith = js.Any.fromFunction1(BeginsWith), Contains = js.Any.fromFunction1(Contains), EqualTo = js.Any.fromFunction1(EqualTo), In = js.Any.fromFunction1(In), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), NotEqualTo = js.Any.fromFunction1(NotEqualTo))
    __obj.asInstanceOf[ITextFieldExpression]
  }
}

