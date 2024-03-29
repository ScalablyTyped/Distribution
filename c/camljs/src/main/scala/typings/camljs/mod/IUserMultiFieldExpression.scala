package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserMultiFieldExpression extends StObject {
  
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: Any): IExpression
  
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: Any): IExpression
  
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): IUserFieldExpression
  
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression
  
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression
  
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: Any): IExpression
  
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: Any): IExpression
}
object IUserMultiFieldExpression {
  
  inline def apply(
    EqualTo: Any => IExpression,
    Includes: Any => IExpression,
    IncludesSuchItemThat: () => IUserFieldExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    NotEqualTo: Any => IExpression,
    NotIncludes: Any => IExpression
  ): IUserMultiFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), Includes = js.Any.fromFunction1(Includes), IncludesSuchItemThat = js.Any.fromFunction0(IncludesSuchItemThat), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), NotEqualTo = js.Any.fromFunction1(NotEqualTo), NotIncludes = js.Any.fromFunction1(NotIncludes))
    __obj.asInstanceOf[IUserMultiFieldExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUserMultiFieldExpression] (val x: Self) extends AnyVal {
    
    inline def setEqualTo(value: Any => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setIncludes(value: Any => IExpression): Self = StObject.set(x, "Includes", js.Any.fromFunction1(value))
    
    inline def setIncludesSuchItemThat(value: () => IUserFieldExpression): Self = StObject.set(x, "IncludesSuchItemThat", js.Any.fromFunction0(value))
    
    inline def setIsNotNull(value: () => IExpression): Self = StObject.set(x, "IsNotNull", js.Any.fromFunction0(value))
    
    inline def setIsNull(value: () => IExpression): Self = StObject.set(x, "IsNull", js.Any.fromFunction0(value))
    
    inline def setNotEqualTo(value: Any => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
    
    inline def setNotIncludes(value: Any => IExpression): Self = StObject.set(x, "NotIncludes", js.Any.fromFunction1(value))
  }
}
