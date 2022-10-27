package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressureObserverOptions extends StObject {
  
  var sampleRate: js.UndefOr[Double] = js.undefined
}
object PressureObserverOptions {
  
  inline def apply(): PressureObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressureObserverOptions]
  }
  
  extension [Self <: PressureObserverOptions](x: Self) {
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
