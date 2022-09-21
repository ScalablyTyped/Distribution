package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEngineOptions extends StObject {
  
  /**
    * defines whether to adapt to the device's viewport characteristics (default: false)
    */
  var adaptToDeviceRatio: js.UndefOr[Boolean] = js.undefined
}
object NativeEngineOptions {
  
  inline def apply(): NativeEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeEngineOptions]
  }
  
  extension [Self <: NativeEngineOptions](x: Self) {
    
    inline def setAdaptToDeviceRatio(value: Boolean): Self = StObject.set(x, "adaptToDeviceRatio", value.asInstanceOf[js.Any])
    
    inline def setAdaptToDeviceRatioUndefined: Self = StObject.set(x, "adaptToDeviceRatio", js.undefined)
  }
}
