package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltinIntentMetadata extends StObject {
  
  /**
    * A unique identifier for the built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinIntentSignature] = js.native
  
  /**
    * A list of identifiers for the locales that the intent supports.
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}
object BuiltinIntentMetadata {
  
  @scala.inline
  def apply(): BuiltinIntentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinIntentMetadata]
  }
  
  @scala.inline
  implicit class BuiltinIntentMetadataMutableBuilder[Self <: BuiltinIntentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSupportedLocales(value: LocaleList): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    @scala.inline
    def setSupportedLocalesVarargs(value: Locale*): Self = StObject.set(x, "supportedLocales", js.Array(value :_*))
  }
}
