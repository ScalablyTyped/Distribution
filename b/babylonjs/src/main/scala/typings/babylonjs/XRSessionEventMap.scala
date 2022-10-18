package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSessionEventMap extends StObject {
  
  var end: XRSessionEvent
  
  var eyetrackingend: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XREyeTrackingEvent */ Any
  
  var eyetrackingstart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XREyeTrackingEvent */ Any
  
  var frameratechange: XRSessionEvent
  
  var inputsourceschange: XRInputSourceChangeEvent
  
  var select: XRInputSourceEvent
  
  var selectend: XRInputSourceEvent
  
  var selectstart: XRInputSourceEvent
  
  var squeeze: XRInputSourceEvent
  
  var squeezeend: XRInputSourceEvent
  
  var squeezestart: XRInputSourceEvent
  
  var visibilitychange: XRSessionEvent
}
object XRSessionEventMap {
  
  inline def apply(
    end: XRSessionEvent,
    eyetrackingend: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XREyeTrackingEvent */ Any,
    eyetrackingstart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XREyeTrackingEvent */ Any,
    frameratechange: XRSessionEvent,
    inputsourceschange: XRInputSourceChangeEvent,
    select: XRInputSourceEvent,
    selectend: XRInputSourceEvent,
    selectstart: XRInputSourceEvent,
    squeeze: XRInputSourceEvent,
    squeezeend: XRInputSourceEvent,
    squeezestart: XRInputSourceEvent,
    visibilitychange: XRSessionEvent
  ): XRSessionEventMap = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], eyetrackingend = eyetrackingend.asInstanceOf[js.Any], eyetrackingstart = eyetrackingstart.asInstanceOf[js.Any], frameratechange = frameratechange.asInstanceOf[js.Any], inputsourceschange = inputsourceschange.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectend = selectend.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], squeeze = squeeze.asInstanceOf[js.Any], squeezeend = squeezeend.asInstanceOf[js.Any], squeezestart = squeezestart.asInstanceOf[js.Any], visibilitychange = visibilitychange.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSessionEventMap]
  }
  
  extension [Self <: XRSessionEventMap](x: Self) {
    
    inline def setEnd(value: XRSessionEvent): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEyetrackingend(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XREyeTrackingEvent */ Any
    ): Self = StObject.set(x, "eyetrackingend", value.asInstanceOf[js.Any])
    
    inline def setEyetrackingstart(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XREyeTrackingEvent */ Any
    ): Self = StObject.set(x, "eyetrackingstart", value.asInstanceOf[js.Any])
    
    inline def setFrameratechange(value: XRSessionEvent): Self = StObject.set(x, "frameratechange", value.asInstanceOf[js.Any])
    
    inline def setInputsourceschange(value: XRInputSourceChangeEvent): Self = StObject.set(x, "inputsourceschange", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: XRInputSourceEvent): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectend(value: XRInputSourceEvent): Self = StObject.set(x, "selectend", value.asInstanceOf[js.Any])
    
    inline def setSelectstart(value: XRInputSourceEvent): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
    
    inline def setSqueeze(value: XRInputSourceEvent): Self = StObject.set(x, "squeeze", value.asInstanceOf[js.Any])
    
    inline def setSqueezeend(value: XRInputSourceEvent): Self = StObject.set(x, "squeezeend", value.asInstanceOf[js.Any])
    
    inline def setSqueezestart(value: XRInputSourceEvent): Self = StObject.set(x, "squeezestart", value.asInstanceOf[js.Any])
    
    inline def setVisibilitychange(value: XRSessionEvent): Self = StObject.set(x, "visibilitychange", value.asInstanceOf[js.Any])
  }
}
