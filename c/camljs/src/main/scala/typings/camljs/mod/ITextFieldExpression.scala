package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextFieldExpression extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ITextFieldExpression](x: Self) {
    
    inline def setBeginsWith(value: String => IExpression): Self = StObject.set(x, "BeginsWith", js.Any.fromFunction1(value))
    
    inline def setContains(value: String => IExpression): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    inline def setEqualTo(value: String => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setIn(value: js.Array[String] => IExpression): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
    
    inline def setIsNotNull(value: () => IExpression): Self = StObject.set(x, "IsNotNull", js.Any.fromFunction0(value))
    
    inline def setIsNull(value: () => IExpression): Self = StObject.set(x, "IsNull", js.Any.fromFunction0(value))
    
    inline def setNotEqualTo(value: String => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
  }
}
