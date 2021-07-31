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
  
  @scala.inline
  def apply(greengrass: Greengrass): GatewayPlatform = {
    val __obj = js.Dynamic.literal(greengrass = greengrass.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayPlatform]
  }
  
  @scala.inline
  implicit class GatewayPlatformMutableBuilder[Self <: GatewayPlatform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreengrass(value: Greengrass): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
  }
}
