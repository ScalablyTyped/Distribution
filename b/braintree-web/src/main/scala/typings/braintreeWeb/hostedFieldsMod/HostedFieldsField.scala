package typings.braintreeWeb.hostedFieldsMod

import typings.braintreeWeb.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFieldsField extends js.Object {
  
  var formatInput: js.UndefOr[Boolean] = js.native
  
  var maskInput: js.UndefOr[Boolean | HostedFieldsFieldMaskInput] = js.native
  
  var maxCardLength: js.UndefOr[Double] = js.native
  
  var maxlength: js.UndefOr[Double] = js.native
  
  var minlength: js.UndefOr[Double] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefill: js.UndefOr[String] = js.native
  
  var rejectUnsupportedCards: js.UndefOr[Boolean] = js.native
  
  var select: js.UndefOr[Boolean | Options] = js.native
  
  var selector: String = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object HostedFieldsField {
  
  @scala.inline
  def apply(selector: String): HostedFieldsField = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsField]
  }
  
  @scala.inline
  implicit class HostedFieldsFieldOps[Self <: HostedFieldsField] (val x: Self) extends AnyVal {
    
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatInput(value: Boolean): Self = this.set("formatInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatInput: Self = this.set("formatInput", js.undefined)
    
    @scala.inline
    def setMaskInput(value: Boolean | HostedFieldsFieldMaskInput): Self = this.set("maskInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskInput: Self = this.set("maskInput", js.undefined)
    
    @scala.inline
    def setMaxCardLength(value: Double): Self = this.set("maxCardLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCardLength: Self = this.set("maxCardLength", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    
    @scala.inline
    def setMinlength(value: Double): Self = this.set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefill(value: String): Self = this.set("prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefill: Self = this.set("prefill", js.undefined)
    
    @scala.inline
    def setRejectUnsupportedCards(value: Boolean): Self = this.set("rejectUnsupportedCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnsupportedCards: Self = this.set("rejectUnsupportedCards", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean | Options): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
