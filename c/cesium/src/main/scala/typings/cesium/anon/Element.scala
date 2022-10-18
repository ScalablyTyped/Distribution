package typings.cesium.anon

import typings.cesium.mod.JulianDate
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var clock: js.UndefOr[typings.cesium.mod.Clock] = js.undefined
  
  var element: js.UndefOr[HTMLVideoElement] = js.undefined
  
  var epoch: js.UndefOr[JulianDate] = js.undefined
  
  var tolerance: js.UndefOr[Double] = js.undefined
}
object Element {
  
  inline def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setClock(value: typings.cesium.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    inline def setElement(value: HTMLVideoElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEpoch(value: JulianDate): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
