package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCCertificate extends StObject {
  
  val expires: EpochTimeStamp
  
  def getFingerprints(): Array[RTCDtlsFingerprint]
}
object RTCCertificate {
  
  inline def apply(expires: EpochTimeStamp, getFingerprints: () => Array[RTCDtlsFingerprint]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getFingerprints = js.Any.fromFunction0(getFingerprints))
    __obj.asInstanceOf[RTCCertificate]
  }
  
  extension [Self <: RTCCertificate](x: Self) {
    
    inline def setExpires(value: EpochTimeStamp): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setGetFingerprints(value: () => Array[RTCDtlsFingerprint]): Self = StObject.set(x, "getFingerprints", js.Any.fromFunction0(value))
  }
}
