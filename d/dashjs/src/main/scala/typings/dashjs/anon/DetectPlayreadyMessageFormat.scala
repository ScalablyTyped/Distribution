package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectPlayreadyMessageFormat extends StObject {
  
  var detectPlayreadyMessageFormat: js.UndefOr[Boolean] = js.undefined
  
  var ignoreEmeEncryptedEvent: js.UndefOr[Boolean] = js.undefined
  
  var keepProtectionMediaKeys: js.UndefOr[Boolean] = js.undefined
}
object DetectPlayreadyMessageFormat {
  
  inline def apply(): DetectPlayreadyMessageFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectPlayreadyMessageFormat]
  }
  
  extension [Self <: DetectPlayreadyMessageFormat](x: Self) {
    
    inline def setDetectPlayreadyMessageFormat(value: Boolean): Self = StObject.set(x, "detectPlayreadyMessageFormat", value.asInstanceOf[js.Any])
    
    inline def setDetectPlayreadyMessageFormatUndefined: Self = StObject.set(x, "detectPlayreadyMessageFormat", js.undefined)
    
    inline def setIgnoreEmeEncryptedEvent(value: Boolean): Self = StObject.set(x, "ignoreEmeEncryptedEvent", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmeEncryptedEventUndefined: Self = StObject.set(x, "ignoreEmeEncryptedEvent", js.undefined)
    
    inline def setKeepProtectionMediaKeys(value: Boolean): Self = StObject.set(x, "keepProtectionMediaKeys", value.asInstanceOf[js.Any])
    
    inline def setKeepProtectionMediaKeysUndefined: Self = StObject.set(x, "keepProtectionMediaKeys", js.undefined)
  }
}
