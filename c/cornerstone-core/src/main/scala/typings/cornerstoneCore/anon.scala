package typings.cornerstoneCore

import typings.cornerstoneCore.cornerstoneCoreStrings.webgl
import typings.cornerstoneCore.mod.LUT
import typings.cornerstoneCore.mod.VOI
import typings.cornerstoneCore.mod.Viewport
import typings.cornerstoneCore.mod.vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: Any
    
    var key: Any
  }
  object Id {
    
    inline def apply(id: Any, key: Any): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Opacity extends StObject {
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var viewport: js.UndefOr[Viewport] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Opacity {
    
    inline def apply(): Opacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opacity]
    }
    
    extension [Self <: Opacity](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait Renderer extends StObject {
    
    var renderer: js.UndefOr[webgl] = js.undefined
  }
  object Renderer {
    
    inline def apply(): Renderer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Renderer]
    }
    
    extension [Self <: Renderer](x: Self) {
      
      inline def setRenderer(value: webgl): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  /* Inlined std.Required<cornerstone-core.cornerstone-core.Viewport> */
  trait RequiredViewport extends StObject {
    
    var colormap: Any
    
    var hflip: Boolean
    
    var invert: Boolean
    
    var labelmap: Boolean
    
    var modalityLUT: LUT
    
    var pixelReplication: Boolean
    
    var rotation: Double
    
    var scale: Double
    
    var translation: vec2
    
    var vflip: Boolean
    
    var voi: VOI
    
    var voiLUT: LUT
  }
  object RequiredViewport {
    
    inline def apply(
      colormap: Any,
      hflip: Boolean,
      invert: Boolean,
      labelmap: Boolean,
      modalityLUT: LUT,
      pixelReplication: Boolean,
      rotation: Double,
      scale: Double,
      translation: vec2,
      vflip: Boolean,
      voi: VOI,
      voiLUT: LUT
    ): RequiredViewport = {
      val __obj = js.Dynamic.literal(colormap = colormap.asInstanceOf[js.Any], hflip = hflip.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], labelmap = labelmap.asInstanceOf[js.Any], modalityLUT = modalityLUT.asInstanceOf[js.Any], pixelReplication = pixelReplication.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any], vflip = vflip.asInstanceOf[js.Any], voi = voi.asInstanceOf[js.Any], voiLUT = voiLUT.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredViewport]
    }
    
    extension [Self <: RequiredViewport](x: Self) {
      
      inline def setColormap(value: Any): Self = StObject.set(x, "colormap", value.asInstanceOf[js.Any])
      
      inline def setHflip(value: Boolean): Self = StObject.set(x, "hflip", value.asInstanceOf[js.Any])
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setLabelmap(value: Boolean): Self = StObject.set(x, "labelmap", value.asInstanceOf[js.Any])
      
      inline def setModalityLUT(value: LUT): Self = StObject.set(x, "modalityLUT", value.asInstanceOf[js.Any])
      
      inline def setPixelReplication(value: Boolean): Self = StObject.set(x, "pixelReplication", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTranslation(value: vec2): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setVflip(value: Boolean): Self = StObject.set(x, "vflip", value.asInstanceOf[js.Any])
      
      inline def setVoi(value: VOI): Self = StObject.set(x, "voi", value.asInstanceOf[js.Any])
      
      inline def setVoiLUT(value: LUT): Self = StObject.set(x, "voiLUT", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Any
    
    var y: Any
  }
  object X {
    
    inline def apply(x: Any, y: Any): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
