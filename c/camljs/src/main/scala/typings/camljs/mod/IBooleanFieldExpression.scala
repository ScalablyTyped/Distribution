package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Boolean): IExpression
  /** Checks whether the value of the field is False */
  def IsFalse(): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is True */
  def IsTrue(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Boolean): IExpression
}

object IBooleanFieldExpression {
  @scala.inline
  def apply(
    EqualTo: Boolean => IExpression,
    IsFalse: () => IExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    IsTrue: () => IExpression,
    NotEqualTo: Boolean => IExpression
  ): IBooleanFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), IsFalse = js.Any.fromFunction0(IsFalse), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), IsTrue = js.Any.fromFunction0(IsTrue), NotEqualTo = js.Any.fromFunction1(NotEqualTo))
  
    __obj.asInstanceOf[IBooleanFieldExpression]
  }
}

