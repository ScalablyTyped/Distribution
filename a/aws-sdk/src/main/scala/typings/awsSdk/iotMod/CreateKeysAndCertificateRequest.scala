package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeysAndCertificateRequest extends StObject {
  
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}
object CreateKeysAndCertificateRequest {
  
  @scala.inline
  def apply(): CreateKeysAndCertificateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeysAndCertificateRequest]
  }
  
  @scala.inline
  implicit class CreateKeysAndCertificateRequestMutableBuilder[Self <: CreateKeysAndCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAsActive(value: SetAsActive): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
  }
}
