package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.AutoJoinPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CastOptions extends StObject {
  
  var autoJoinPolicy: AutoJoinPolicy
  
  var language: js.UndefOr[String] = js.undefined
  
  var receiverApplicationId: js.UndefOr[String] = js.undefined
  
  var resumeSavedSession: js.UndefOr[Boolean] = js.undefined
}
object CastOptions {
  
  inline def apply(autoJoinPolicy: AutoJoinPolicy): CastOptions = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CastOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoJoinPolicy(value: AutoJoinPolicy): Self = StObject.set(x, "autoJoinPolicy", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReceiverApplicationId(value: String): Self = StObject.set(x, "receiverApplicationId", value.asInstanceOf[js.Any])
    
    inline def setReceiverApplicationIdUndefined: Self = StObject.set(x, "receiverApplicationId", js.undefined)
    
    inline def setResumeSavedSession(value: Boolean): Self = StObject.set(x, "resumeSavedSession", value.asInstanceOf[js.Any])
    
    inline def setResumeSavedSessionUndefined: Self = StObject.set(x, "resumeSavedSession", js.undefined)
  }
}
