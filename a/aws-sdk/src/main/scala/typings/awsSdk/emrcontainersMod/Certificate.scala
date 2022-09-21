package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The ARN of the certificate generated for managed endpoint.
    */
  var certificateArn: js.UndefOr[ACMCertArn] = js.undefined
  
  /**
    * The base64 encoded PEM certificate data generated for managed endpoint.
    */
  var certificateData: js.UndefOr[Base64Encoded] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  extension [Self <: Certificate](x: Self) {
    
    inline def setCertificateArn(value: ACMCertArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateData(value: Base64Encoded): Self = StObject.set(x, "certificateData", value.asInstanceOf[js.Any])
    
    inline def setCertificateDataUndefined: Self = StObject.set(x, "certificateData", js.undefined)
  }
}
