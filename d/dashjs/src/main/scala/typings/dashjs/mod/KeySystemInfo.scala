package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySystemInfo extends StObject {
  
  var cdmData: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var initData: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var keyId: js.UndefOr[String] = js.undefined
  
  var ks: KeySystem
  
  var protData: js.UndefOr[ProtectionData] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
  
  var sessionType: js.UndefOr[String] = js.undefined
}
object KeySystemInfo {
  
  inline def apply(ks: KeySystem): KeySystemInfo = {
    val __obj = js.Dynamic.literal(ks = ks.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySystemInfo]
  }
  
  extension [Self <: KeySystemInfo](x: Self) {
    
    inline def setCdmData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "cdmData", value.asInstanceOf[js.Any])
    
    inline def setCdmDataUndefined: Self = StObject.set(x, "cdmData", js.undefined)
    
    inline def setInitData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    inline def setInitDataUndefined: Self = StObject.set(x, "initData", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setKs(value: KeySystem): Self = StObject.set(x, "ks", value.asInstanceOf[js.Any])
    
    inline def setProtData(value: ProtectionData): Self = StObject.set(x, "protData", value.asInstanceOf[js.Any])
    
    inline def setProtDataUndefined: Self = StObject.set(x, "protData", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSessionType(value: String): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
    
    inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
  }
}
