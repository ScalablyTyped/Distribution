package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningJobRevocationRecord extends StObject {
  
  /**
    * A caller-supplied reason for revocation.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The time of revocation.
    */
  var revokedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identity of the revoker.
    */
  var revokedBy: js.UndefOr[String] = js.undefined
}
object SigningJobRevocationRecord {
  
  inline def apply(): SigningJobRevocationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningJobRevocationRecord]
  }
  
  extension [Self <: SigningJobRevocationRecord](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRevokedAt(value: js.Date): Self = StObject.set(x, "revokedAt", value.asInstanceOf[js.Any])
    
    inline def setRevokedAtUndefined: Self = StObject.set(x, "revokedAt", js.undefined)
    
    inline def setRevokedBy(value: String): Self = StObject.set(x, "revokedBy", value.asInstanceOf[js.Any])
    
    inline def setRevokedByUndefined: Self = StObject.set(x, "revokedBy", js.undefined)
  }
}
