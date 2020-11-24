package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILookupFieldExpression extends js.Object {
  
  /** Specifies that lookup id value will be used. */
  def Id(): INumberFieldExpression = js.native
  
  /** Specifies that lookup value will be used and this value is of type Boolean */
  def ValueAsBoolean(): IBooleanFieldExpression = js.native
  
  /** Specifies that lookup value will be used and this value is of type Date */
  def ValueAsDate(): IDateTimeFieldExpression = js.native
  
  /** Specifies that lookup value will be used and this value is of type DateTime */
  def ValueAsDateTime(): IDateTimeFieldExpression = js.native
  
  /** Specifies that lookup value will be used and this value is of type Number */
  def ValueAsNumber(): INumberFieldExpression = js.native
  
  /** Specifies that lookup value will be used and this value is of type Text */
  def ValueAsText(): ITextFieldExpression = js.native
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
  implicit class ILookupFieldExpressionOps[Self <: ILookupFieldExpression] (val x: Self) extends AnyVal {
    
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
    def setId(value: () => INumberFieldExpression): Self = this.set("Id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsBoolean(value: () => IBooleanFieldExpression): Self = this.set("ValueAsBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsDate(value: () => IDateTimeFieldExpression): Self = this.set("ValueAsDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsDateTime(value: () => IDateTimeFieldExpression): Self = this.set("ValueAsDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsNumber(value: () => INumberFieldExpression): Self = this.set("ValueAsNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsText(value: () => ITextFieldExpression): Self = this.set("ValueAsText", js.Any.fromFunction0(value))
  }
}
