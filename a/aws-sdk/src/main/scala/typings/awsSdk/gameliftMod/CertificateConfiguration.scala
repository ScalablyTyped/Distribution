package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateConfiguration extends StObject {
  
  /**
    * Indicates whether a TLS/SSL certificate was generated for a fleet.     
    */
  var CertificateType: typings.awsSdk.gameliftMod.CertificateType = js.native
}
object CertificateConfiguration {
  
  @scala.inline
  def apply(CertificateType: CertificateType): CertificateConfiguration = {
    val __obj = js.Dynamic.literal(CertificateType = CertificateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateConfiguration]
  }
  
  @scala.inline
  implicit class CertificateConfigurationMutableBuilder[Self <: CertificateConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateType(value: CertificateType): Self = StObject.set(x, "CertificateType", value.asInstanceOf[js.Any])
  }
}
