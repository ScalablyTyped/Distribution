package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDeliveryStatusResourceTypeEventConfiguration extends StObject {
  
  var Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration] = js.undefined
}
object MessageDeliveryStatusResourceTypeEventConfiguration {
  
  inline def apply(): MessageDeliveryStatusResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageDeliveryStatusResourceTypeEventConfiguration]
  }
  
  extension [Self <: MessageDeliveryStatusResourceTypeEventConfiguration](x: Self) {
    
    inline def setSidewalk(value: SidewalkResourceTypeEventConfiguration): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
