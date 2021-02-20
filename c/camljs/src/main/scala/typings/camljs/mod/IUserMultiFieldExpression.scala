package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserMultiFieldExpression extends StObject {
  
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: js.Any): IExpression = js.native
  
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: js.Any): IExpression = js.native
  
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): IUserFieldExpression = js.native
  
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression = js.native
  
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression = js.native
  
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: js.Any): IExpression = js.native
  
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: js.Any): IExpression = js.native
}
object IUserMultiFieldExpression {
  
  @scala.inline
  def apply(
    EqualTo: js.Any => IExpression,
    Includes: js.Any => IExpression,
    IncludesSuchItemThat: () => IUserFieldExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    NotEqualTo: js.Any => IExpression,
    NotIncludes: js.Any => IExpression
  ): IUserMultiFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), Includes = js.Any.fromFunction1(Includes), IncludesSuchItemThat = js.Any.fromFunction0(IncludesSuchItemThat), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), NotEqualTo = js.Any.fromFunction1(NotEqualTo), NotIncludes = js.Any.fromFunction1(NotIncludes))
    __obj.asInstanceOf[IUserMultiFieldExpression]
  }
  
  @scala.inline
  implicit class IUserMultiFieldExpressionMutableBuilder[Self <: IUserMultiFieldExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqualTo(value: js.Any => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludes(value: js.Any => IExpression): Self = StObject.set(x, "Includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludesSuchItemThat(value: () => IUserFieldExpression): Self = StObject.set(x, "IncludesSuchItemThat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotNull(value: () => IExpression): Self = StObject.set(x, "IsNotNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNull(value: () => IExpression): Self = StObject.set(x, "IsNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotEqualTo(value: js.Any => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotIncludes(value: js.Any => IExpression): Self = StObject.set(x, "NotIncludes", js.Any.fromFunction1(value))
  }
}
