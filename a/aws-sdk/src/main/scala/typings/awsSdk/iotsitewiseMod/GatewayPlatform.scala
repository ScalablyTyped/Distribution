package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayPlatform extends StObject {
  
  /**
    * A gateway that runs on AWS IoT Greengrass.
    */
  var greengrass: Greengrass
}
object GatewayPlatform {
  
  inline def apply(greengrass: Greengrass): GatewayPlatform = {
    val __obj = js.Dynamic.literal(greengrass = greengrass.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayPlatform]
  }
  
  extension [Self <: GatewayPlatform](x: Self) {
    
    inline def setGreengrass(value: Greengrass): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
  }
}
