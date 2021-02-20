package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCertificatesResult extends StObject {
  
  var Certificate: js.UndefOr[typings.awsSdk.rdsMod.Certificate] = js.native
}
object ModifyCertificatesResult {
  
  @scala.inline
  def apply(): ModifyCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesResult]
  }
  
  @scala.inline
  implicit class ModifyCertificatesResultMutableBuilder[Self <: ModifyCertificatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
