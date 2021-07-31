package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookupFieldExpression extends StObject {
  
  /** Specifies that lookup id value will be used. */
  def Id(): INumberFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Boolean */
  def ValueAsBoolean(): IBooleanFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Date */
  def ValueAsDate(): IDateTimeFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type DateTime */
  def ValueAsDateTime(): IDateTimeFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Number */
  def ValueAsNumber(): INumberFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Text */
  def ValueAsText(): ITextFieldExpression
}
object ILookupFieldExpression {
  
  @scala.inline
  def apply(
    Id: () => INumberFieldExpression,
    ValueAsBoolean: () => IBooleanFieldExpression,
    ValueAsDate: () => IDateTimeFieldExpression,
    ValueAsDateTime: () => IDateTimeFieldExpression,
    ValueAsNumber: () => INumberFieldExpression,
    ValueAsText: () => ITextFieldExpression
  ): ILookupFieldExpression = {
    val __obj = js.Dynamic.literal(Id = js.Any.fromFunction0(Id), ValueAsBoolean = js.Any.fromFunction0(ValueAsBoolean), ValueAsDate = js.Any.fromFunction0(ValueAsDate), ValueAsDateTime = js.Any.fromFunction0(ValueAsDateTime), ValueAsNumber = js.Any.fromFunction0(ValueAsNumber), ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[ILookupFieldExpression]
  }
  
  @scala.inline
  implicit class ILookupFieldExpressionMutableBuilder[Self <: ILookupFieldExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: () => INumberFieldExpression): Self = StObject.set(x, "Id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsBoolean(value: () => IBooleanFieldExpression): Self = StObject.set(x, "ValueAsBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsDate(value: () => IDateTimeFieldExpression): Self = StObject.set(x, "ValueAsDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsDateTime(value: () => IDateTimeFieldExpression): Self = StObject.set(x, "ValueAsDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsNumber(value: () => INumberFieldExpression): Self = StObject.set(x, "ValueAsNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsText(value: () => ITextFieldExpression): Self = StObject.set(x, "ValueAsText", js.Any.fromFunction0(value))
  }
}
