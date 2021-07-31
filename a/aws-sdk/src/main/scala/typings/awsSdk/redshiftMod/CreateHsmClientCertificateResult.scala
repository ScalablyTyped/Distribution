package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmClientCertificateResult extends StObject {
  
  var HsmClientCertificate: js.UndefOr[typings.awsSdk.redshiftMod.HsmClientCertificate] = js.undefined
}
object CreateHsmClientCertificateResult {
  
  @scala.inline
  def apply(): CreateHsmClientCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmClientCertificateResult]
  }
  
  @scala.inline
  implicit class CreateHsmClientCertificateResultMutableBuilder[Self <: CreateHsmClientCertificateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificate(value: HsmClientCertificate): Self = StObject.set(x, "HsmClientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmClientCertificateUndefined: Self = StObject.set(x, "HsmClientCertificate", js.undefined)
  }
}
