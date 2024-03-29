package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBooleanFieldExpression extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IBooleanFieldExpression] (val x: Self) extends AnyVal {
    
    inline def setEqualTo(value: Boolean => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setIsFalse(value: () => IExpression): Self = StObject.set(x, "IsFalse", js.Any.fromFunction0(value))
    
    inline def setIsNotNull(value: () => IExpression): Self = StObject.set(x, "IsNotNull", js.Any.fromFunction0(value))
    
    inline def setIsNull(value: () => IExpression): Self = StObject.set(x, "IsNull", js.Any.fromFunction0(value))
    
    inline def setIsTrue(value: () => IExpression): Self = StObject.set(x, "IsTrue", js.Any.fromFunction0(value))
    
    inline def setNotEqualTo(value: Boolean => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
  }
}
