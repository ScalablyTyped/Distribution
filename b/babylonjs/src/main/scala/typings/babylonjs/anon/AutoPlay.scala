package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPlay extends StObject {
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var clickToPlay: js.UndefOr[Boolean] = js.undefined
  
  var crossEyeMode: js.UndefOr[Boolean] = js.undefined
  
  var faceForward: js.UndefOr[Boolean] = js.undefined
  
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  var halfDomeMode: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var useDirectMapping: js.UndefOr[Boolean] = js.undefined
}
object AutoPlay {
  
  inline def apply(): AutoPlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPlay]
  }
  
  extension [Self <: AutoPlay](x: Self) {
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setClickToPlay(value: Boolean): Self = StObject.set(x, "clickToPlay", value.asInstanceOf[js.Any])
    
    inline def setClickToPlayUndefined: Self = StObject.set(x, "clickToPlay", js.undefined)
    
    inline def setCrossEyeMode(value: Boolean): Self = StObject.set(x, "crossEyeMode", value.asInstanceOf[js.Any])
    
    inline def setCrossEyeModeUndefined: Self = StObject.set(x, "crossEyeMode", js.undefined)
    
    inline def setFaceForward(value: Boolean): Self = StObject.set(x, "faceForward", value.asInstanceOf[js.Any])
    
    inline def setFaceForwardUndefined: Self = StObject.set(x, "faceForward", js.undefined)
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setHalfDomeMode(value: Boolean): Self = StObject.set(x, "halfDomeMode", value.asInstanceOf[js.Any])
    
    inline def setHalfDomeModeUndefined: Self = StObject.set(x, "halfDomeMode", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUseDirectMapping(value: Boolean): Self = StObject.set(x, "useDirectMapping", value.asInstanceOf[js.Any])
    
    inline def setUseDirectMappingUndefined: Self = StObject.set(x, "useDirectMapping", js.undefined)
  }
}
