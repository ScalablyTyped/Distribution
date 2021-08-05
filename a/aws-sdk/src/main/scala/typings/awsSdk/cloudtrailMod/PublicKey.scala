package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  /**
    * The fingerprint of the public key.
    */
  var Fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The ending time of validity of the public key.
    */
  var ValidityEndTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The starting time of validity of the public key.
    */
  var ValidityStartTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The DER encoded public key value in PKCS#1 format.
    */
  var Value: js.UndefOr[ByteBuffer] = js.undefined
}
object PublicKey {
  
  inline def apply(): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKey]
  }
  
  extension [Self <: PublicKey](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "Fingerprint", js.undefined)
    
    inline def setValidityEndTime(value: Date): Self = StObject.set(x, "ValidityEndTime", value.asInstanceOf[js.Any])
    
    inline def setValidityEndTimeUndefined: Self = StObject.set(x, "ValidityEndTime", js.undefined)
    
    inline def setValidityStartTime(value: Date): Self = StObject.set(x, "ValidityStartTime", value.asInstanceOf[js.Any])
    
    inline def setValidityStartTimeUndefined: Self = StObject.set(x, "ValidityStartTime", js.undefined)
    
    inline def setValue(value: ByteBuffer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
