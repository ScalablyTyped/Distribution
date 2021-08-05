package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterThingResponse extends StObject {
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  
  /**
    * ARNs for the generated resources.
    */
  var resourceArns: js.UndefOr[ResourceArns] = js.undefined
}
object RegisterThingResponse {
  
  inline def apply(): RegisterThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterThingResponse]
  }
  
  extension [Self <: RegisterThingResponse](x: Self) {
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    inline def setResourceArns(value: ResourceArns): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
  }
}
