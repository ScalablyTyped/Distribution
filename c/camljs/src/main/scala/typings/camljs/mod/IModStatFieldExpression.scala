package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModStatFieldExpression extends StObject {
  
  /** Checks whether the value of the field is Approved - same as ModStatId.EqualTo(0) */
  def IsApproved(): IExpression
  
  /** Checks whether the value of the field is Pending - same as ModStatId.EqualTo(2) */
  def IsPending(): IExpression
  
  /** Checks whether the value of the field is Rejected - same as ModStatId.EqualTo(1) */
  def IsRejected(): IExpression
  
  /** Represents moderation status ID. */
  def ModStatId(): INumberFieldExpression
  
  /** Represents moderation status as localized text. In most cases it is better to use ModStatId in the queries instead of ValueAsText. */
  def ValueAsText(): ITextFieldExpression
}
object IModStatFieldExpression {
  
  inline def apply(
    IsApproved: () => IExpression,
    IsPending: () => IExpression,
    IsRejected: () => IExpression,
    ModStatId: () => INumberFieldExpression,
    ValueAsText: () => ITextFieldExpression
  ): IModStatFieldExpression = {
    val __obj = js.Dynamic.literal(IsApproved = js.Any.fromFunction0(IsApproved), IsPending = js.Any.fromFunction0(IsPending), IsRejected = js.Any.fromFunction0(IsRejected), ModStatId = js.Any.fromFunction0(ModStatId), ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[IModStatFieldExpression]
  }
  
  extension [Self <: IModStatFieldExpression](x: Self) {
    
    inline def setIsApproved(value: () => IExpression): Self = StObject.set(x, "IsApproved", js.Any.fromFunction0(value))
    
    inline def setIsPending(value: () => IExpression): Self = StObject.set(x, "IsPending", js.Any.fromFunction0(value))
    
    inline def setIsRejected(value: () => IExpression): Self = StObject.set(x, "IsRejected", js.Any.fromFunction0(value))
    
    inline def setModStatId(value: () => INumberFieldExpression): Self = StObject.set(x, "ModStatId", js.Any.fromFunction0(value))
    
    inline def setValueAsText(value: () => ITextFieldExpression): Self = StObject.set(x, "ValueAsText", js.Any.fromFunction0(value))
  }
}
