package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Double): IExpression
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: Double): IExpression
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: Double): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[Double]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: Double): IExpression
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: Double): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Double): IExpression
}

object INumberFieldExpression {
  @scala.inline
  def apply(
    EqualTo: Double => IExpression,
    GreaterThan: Double => IExpression,
    GreaterThanOrEqualTo: Double => IExpression,
    In: js.Array[Double] => IExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    LessThan: Double => IExpression,
    LessThanOrEqualTo: Double => IExpression,
    NotEqualTo: Double => IExpression
  ): INumberFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), GreaterThan = js.Any.fromFunction1(GreaterThan), GreaterThanOrEqualTo = js.Any.fromFunction1(GreaterThanOrEqualTo), In = js.Any.fromFunction1(In), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), LessThan = js.Any.fromFunction1(LessThan), LessThanOrEqualTo = js.Any.fromFunction1(LessThanOrEqualTo), NotEqualTo = js.Any.fromFunction1(NotEqualTo))
  
    __obj.asInstanceOf[INumberFieldExpression]
  }
}

