package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBooleanFieldExpression extends js.Object {
  
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Boolean): IExpression = js.native
  
  /** Checks whether the value of the field is False */
  def IsFalse(): IExpression = js.native
  
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  
  /** Checks whether the value of the field is True */
  def IsTrue(): IExpression = js.native
  
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Boolean): IExpression = js.native
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
  
  @scala.inline
  implicit class IBooleanFieldExpressionOps[Self <: IBooleanFieldExpression] (val x: Self) extends AnyVal {
    
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
    def setEqualTo(value: Boolean => IExpression): Self = this.set("EqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFalse(value: () => IExpression): Self = this.set("IsFalse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotNull(value: () => IExpression): Self = this.set("IsNotNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNull(value: () => IExpression): Self = this.set("IsNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTrue(value: () => IExpression): Self = this.set("IsTrue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotEqualTo(value: Boolean => IExpression): Self = this.set("NotEqualTo", js.Any.fromFunction1(value))
  }
}
