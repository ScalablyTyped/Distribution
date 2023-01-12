package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateBasedAuthProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
    */
  var CertificateAuthorityArn: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.CertificateAuthorityArn] = js.undefined
  
  /**
    * The status of the certificate-based authentication properties.
    */
  var Status: js.UndefOr[CertificateBasedAuthStatusEnum] = js.undefined
}
object CertificateBasedAuthProperties {
  
  inline def apply(): CertificateBasedAuthProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateBasedAuthProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateBasedAuthProperties] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthorityArn(value: CertificateAuthorityArn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    inline def setStatus(value: CertificateBasedAuthStatusEnum): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
