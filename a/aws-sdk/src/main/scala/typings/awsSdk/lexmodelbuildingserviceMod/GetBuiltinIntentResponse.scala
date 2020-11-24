package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBuiltinIntentResponse extends js.Object {
  
  /**
    * The unique identifier for a built-in intent.
    */
  var signature: js.UndefOr[BuiltinIntentSignature] = js.native
  
  /**
    * An array of BuiltinIntentSlot objects, one entry for each slot type in the intent.
    */
  var slots: js.UndefOr[BuiltinIntentSlotList] = js.native
  
  /**
    * A list of locales that the intent supports.
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}
object GetBuiltinIntentResponse {
  
  @scala.inline
  def apply(): GetBuiltinIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentResponse]
  }
  
  @scala.inline
  implicit class GetBuiltinIntentResponseOps[Self <: GetBuiltinIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSignature(value: BuiltinIntentSignature): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: BuiltinIntentSlot*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: BuiltinIntentSlotList): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setSupportedLocalesVarargs(value: Locale*): Self = this.set("supportedLocales", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLocales(value: LocaleList): Self = this.set("supportedLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLocales: Self = this.set("supportedLocales", js.undefined)
  }
}
