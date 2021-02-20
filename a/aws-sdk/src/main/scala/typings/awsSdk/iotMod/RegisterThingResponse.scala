package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterThingResponse extends StObject {
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  
  /**
    * ARNs for the generated resources.
    */
  var resourceArns: js.UndefOr[ResourceArns] = js.native
}
object RegisterThingResponse {
  
  @scala.inline
  def apply(): RegisterThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterThingResponse]
  }
  
  @scala.inline
  implicit class RegisterThingResponseMutableBuilder[Self <: RegisterThingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
  }
}
