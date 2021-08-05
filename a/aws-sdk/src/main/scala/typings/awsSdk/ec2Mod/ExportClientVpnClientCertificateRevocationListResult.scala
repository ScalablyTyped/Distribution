package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportClientVpnClientCertificateRevocationListResult extends StObject {
  
  /**
    * Information about the client certificate revocation list.
    */
  var CertificateRevocationList: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the client certificate revocation list.
    */
  var Status: js.UndefOr[ClientCertificateRevocationListStatus] = js.undefined
}
object ExportClientVpnClientCertificateRevocationListResult {
  
  inline def apply(): ExportClientVpnClientCertificateRevocationListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientCertificateRevocationListResult]
  }
  
  extension [Self <: ExportClientVpnClientCertificateRevocationListResult](x: Self) {
    
    inline def setCertificateRevocationList(value: String): Self = StObject.set(x, "CertificateRevocationList", value.asInstanceOf[js.Any])
    
    inline def setCertificateRevocationListUndefined: Self = StObject.set(x, "CertificateRevocationList", js.undefined)
    
    inline def setStatus(value: ClientCertificateRevocationListStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
