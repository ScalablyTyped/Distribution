package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesHardwareTextureWrapperMod {
  
  trait HardwareTextureWrapper extends StObject {
    
    def release(): Unit
    
    def reset(): Unit
    
    def set(hardwareTexture: Any): Unit
    
    def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit
    
    var underlyingResource: Any
  }
  object HardwareTextureWrapper {
    
    inline def apply(
      release: () => Unit,
      reset: () => Unit,
      set: Any => Unit,
      setUsage: (Double, Boolean, Boolean, Double, Double) => Unit,
      underlyingResource: Any
    ): HardwareTextureWrapper = {
      val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), setUsage = js.Any.fromFunction5(setUsage), underlyingResource = underlyingResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[HardwareTextureWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HardwareTextureWrapper] (val x: Self) extends AnyVal {
      
      inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSet(value: Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUsage(value: (Double, Boolean, Boolean, Double, Double) => Unit): Self = StObject.set(x, "setUsage", js.Any.fromFunction5(value))
      
      inline def setUnderlyingResource(value: Any): Self = StObject.set(x, "underlyingResource", value.asInstanceOf[js.Any])
    }
  }
}
