package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  /**
    * The horizontal accuracy of the estimated position in meters.
    */
  var HorizontalAccuracy: js.UndefOr[typings.awsSdk.iotwirelessMod.HorizontalAccuracy] = js.undefined
  
  /**
    * The vertical accuracy of the estimated position in meters.
    */
  var VerticalAccuracy: js.UndefOr[typings.awsSdk.iotwirelessMod.VerticalAccuracy] = js.undefined
}
object Accuracy {
  
  inline def apply(): Accuracy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accuracy]
  }
  
  extension [Self <: Accuracy](x: Self) {
    
    inline def setHorizontalAccuracy(value: HorizontalAccuracy): Self = StObject.set(x, "HorizontalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAccuracyUndefined: Self = StObject.set(x, "HorizontalAccuracy", js.undefined)
    
    inline def setVerticalAccuracy(value: VerticalAccuracy): Self = StObject.set(x, "VerticalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setVerticalAccuracyUndefined: Self = StObject.set(x, "VerticalAccuracy", js.undefined)
  }
}
