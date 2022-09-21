package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUnderTest extends StObject {
  
  /**
    * Lists devices certificate ARN.
    */
  var certificateArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Lists devices thing ARN.
    */
  var thingArn: js.UndefOr[AmazonResourceName] = js.undefined
}
object DeviceUnderTest {
  
  inline def apply(): DeviceUnderTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceUnderTest]
  }
  
  extension [Self <: DeviceUnderTest](x: Self) {
    
    inline def setCertificateArn(value: AmazonResourceName): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setThingArn(value: AmazonResourceName): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
  }
}
