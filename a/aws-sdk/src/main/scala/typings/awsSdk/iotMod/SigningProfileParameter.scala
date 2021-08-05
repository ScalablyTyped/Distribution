package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningProfileParameter extends StObject {
  
  /**
    * Certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The location of the code-signing certificate on your device.
    */
  var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.undefined
  
  /**
    * The hardware platform of your device.
    */
  var platform: js.UndefOr[Platform] = js.undefined
}
object SigningProfileParameter {
  
  inline def apply(): SigningProfileParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfileParameter]
  }
  
  extension [Self <: SigningProfileParameter](x: Self) {
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificatePathOnDevice(value: CertificatePathOnDevice): Self = StObject.set(x, "certificatePathOnDevice", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathOnDeviceUndefined: Self = StObject.set(x, "certificatePathOnDevice", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
