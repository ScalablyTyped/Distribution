package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBuiltinIntentResponse extends StObject {
  
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
  implicit class GetBuiltinIntentResponseMutableBuilder[Self <: GetBuiltinIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSlots(value: BuiltinIntentSlotList): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: BuiltinIntentSlot*): Self = StObject.set(x, "slots", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLocales(value: LocaleList): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    @scala.inline
    def setSupportedLocalesVarargs(value: Locale*): Self = StObject.set(x, "supportedLocales", js.Array(value :_*))
  }
}
