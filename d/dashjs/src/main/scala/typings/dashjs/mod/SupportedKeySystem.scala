package typings.dashjs.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedKeySystem extends StObject {
  
  var cdmData: ArrayBuffer | Null
  
  var initData: ArrayBuffer
  
  var ks: KeySystem
  
  var sessionId: String | Null
}
object SupportedKeySystem {
  
  @scala.inline
  def apply(initData: ArrayBuffer, ks: KeySystem): SupportedKeySystem = {
    val __obj = js.Dynamic.literal(initData = initData.asInstanceOf[js.Any], ks = ks.asInstanceOf[js.Any], cdmData = null, sessionId = null)
    __obj.asInstanceOf[SupportedKeySystem]
  }
  
  @scala.inline
  implicit class SupportedKeySystemMutableBuilder[Self <: SupportedKeySystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdmData(value: ArrayBuffer): Self = StObject.set(x, "cdmData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdmDataNull: Self = StObject.set(x, "cdmData", null)
    
    @scala.inline
    def setInitData(value: ArrayBuffer): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKs(value: KeySystem): Self = StObject.set(x, "ks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
  }
}
