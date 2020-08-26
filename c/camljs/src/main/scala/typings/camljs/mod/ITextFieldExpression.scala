package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldExpression extends js.Object {
  /** Checks whether the value of the field begins with the specified substring */
  def BeginsWith(value: String): IExpression = js.native
  /** Checks whether the value of the field contains the specified substring */
  def Contains(value: String): IExpression = js.native
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: String): IExpression = js.native
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[String]): IExpression = js.native
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: String): IExpression = js.native
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
  @scala.inline
  implicit class ITextFieldExpressionOps[Self <: ITextFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginsWith(value: String => IExpression): Self = this.set("BeginsWith", js.Any.fromFunction1(value))
    @scala.inline
    def setContains(value: String => IExpression): Self = this.set("Contains", js.Any.fromFunction1(value))
    @scala.inline
    def setEqualTo(value: String => IExpression): Self = this.set("EqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setIn(value: js.Array[String] => IExpression): Self = this.set("In", js.Any.fromFunction1(value))
    @scala.inline
    def setIsNotNull(value: () => IExpression): Self = this.set("IsNotNull", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNull(value: () => IExpression): Self = this.set("IsNull", js.Any.fromFunction0(value))
    @scala.inline
    def setNotEqualTo(value: String => IExpression): Self = this.set("NotEqualTo", js.Any.fromFunction1(value))
  }
  
}

