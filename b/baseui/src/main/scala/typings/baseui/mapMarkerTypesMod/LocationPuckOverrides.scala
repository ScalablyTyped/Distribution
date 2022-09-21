package typings.baseui.mapMarkerTypesMod

import typings.baseui.overridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPuckOverrides extends StObject {
  
  var ConsumerLocationPuckCore: js.UndefOr[Override[Any]] = js.undefined
  
  var EarnerLocationPuckCore: js.UndefOr[Override[Any]] = js.undefined
  
  var LocationPuckApproximation: js.UndefOr[Override[Any]] = js.undefined
  
  var Root: js.UndefOr[Override[Any]] = js.undefined
}
object LocationPuckOverrides {
  
  inline def apply(): LocationPuckOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPuckOverrides]
  }
  
  extension [Self <: LocationPuckOverrides](x: Self) {
    
    inline def setConsumerLocationPuckCore(value: Override[Any]): Self = StObject.set(x, "ConsumerLocationPuckCore", value.asInstanceOf[js.Any])
    
    inline def setConsumerLocationPuckCoreUndefined: Self = StObject.set(x, "ConsumerLocationPuckCore", js.undefined)
    
    inline def setEarnerLocationPuckCore(value: Override[Any]): Self = StObject.set(x, "EarnerLocationPuckCore", value.asInstanceOf[js.Any])
    
    inline def setEarnerLocationPuckCoreUndefined: Self = StObject.set(x, "EarnerLocationPuckCore", js.undefined)
    
    inline def setLocationPuckApproximation(value: Override[Any]): Self = StObject.set(x, "LocationPuckApproximation", value.asInstanceOf[js.Any])
    
    inline def setLocationPuckApproximationUndefined: Self = StObject.set(x, "LocationPuckApproximation", js.undefined)
    
    inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
