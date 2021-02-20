package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.AutoJoinPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastOptions extends StObject {
  
  var autoJoinPolicy: AutoJoinPolicy = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var receiverApplicationId: js.UndefOr[String] = js.native
  
  var resumeSavedSession: js.UndefOr[Boolean] = js.native
}
object CastOptions {
  
  @scala.inline
  def apply(autoJoinPolicy: AutoJoinPolicy): CastOptions = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastOptions]
  }
  
  @scala.inline
  implicit class CastOptionsMutableBuilder[Self <: CastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoJoinPolicy(value: AutoJoinPolicy): Self = StObject.set(x, "autoJoinPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setReceiverApplicationId(value: String): Self = StObject.set(x, "receiverApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverApplicationIdUndefined: Self = StObject.set(x, "receiverApplicationId", js.undefined)
    
    @scala.inline
    def setResumeSavedSession(value: Boolean): Self = StObject.set(x, "resumeSavedSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeSavedSessionUndefined: Self = StObject.set(x, "resumeSavedSession", js.undefined)
  }
}
