package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  /** an optional colormap ID or colormap object (from colors/colormap.js). This will be applied during rendering to convert the image to pseudocolor */
  var colormap: js.UndefOr[Any] = js.undefined
  
  /** true if the image is flipped horizontally. Default is false */
  var hflip: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not the image is inverted. */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /** whether or not to render this image as a label map (i.e. skip modality and VOI LUT pipelines and use only a color lookup table) */
  var labelmap: js.UndefOr[Boolean] = js.undefined
  
  /** the modality LUT to apply or undefined if none */
  var modalityLUT: js.UndefOr[LUT] = js.undefined
  
  /** true if the image smooth / interpolation should be used when zoomed in on the image or false if pixel replication should be used. */
  var pixelReplication: js.UndefOr[Boolean] = js.undefined
  
  /** the rotation of the image (90 degree increments). Default is 0 */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The scale applied to the image. A scale of 1.0 will display no zoom (one image pixel takes up one screen pixel).
    * A scale of 2.0 will be double zoom and a scale of .5 will be zoomed out by 2x
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * An object with properties x and y which describe the translation to apply in the pixel coordinate system.
    * Note that the image is initially displayed centered in the enabled element with a x and y translation of 0 and 0 respectively.
    */
  var translation: js.UndefOr[vec2] = js.undefined
  
  /** true if the image is flipped vertically. Default is false */
  var vflip: js.UndefOr[Boolean] = js.undefined
  
  /** an object with properties windowWidth and windowCenter. */
  var voi: js.UndefOr[VOI] = js.undefined
  
  /** the modality LUT to apply or undefined if none */
  var voiLUT: js.UndefOr[LUT] = js.undefined
}
object Viewport {
  
  inline def apply(): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setColormap(value: Any): Self = StObject.set(x, "colormap", value.asInstanceOf[js.Any])
    
    inline def setColormapUndefined: Self = StObject.set(x, "colormap", js.undefined)
    
    inline def setHflip(value: Boolean): Self = StObject.set(x, "hflip", value.asInstanceOf[js.Any])
    
    inline def setHflipUndefined: Self = StObject.set(x, "hflip", js.undefined)
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setLabelmap(value: Boolean): Self = StObject.set(x, "labelmap", value.asInstanceOf[js.Any])
    
    inline def setLabelmapUndefined: Self = StObject.set(x, "labelmap", js.undefined)
    
    inline def setModalityLUT(value: LUT): Self = StObject.set(x, "modalityLUT", value.asInstanceOf[js.Any])
    
    inline def setModalityLUTUndefined: Self = StObject.set(x, "modalityLUT", js.undefined)
    
    inline def setPixelReplication(value: Boolean): Self = StObject.set(x, "pixelReplication", value.asInstanceOf[js.Any])
    
    inline def setPixelReplicationUndefined: Self = StObject.set(x, "pixelReplication", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTranslation(value: vec2): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def setVflip(value: Boolean): Self = StObject.set(x, "vflip", value.asInstanceOf[js.Any])
    
    inline def setVflipUndefined: Self = StObject.set(x, "vflip", js.undefined)
    
    inline def setVoi(value: VOI): Self = StObject.set(x, "voi", value.asInstanceOf[js.Any])
    
    inline def setVoiLUT(value: LUT): Self = StObject.set(x, "voiLUT", value.asInstanceOf[js.Any])
    
    inline def setVoiLUTUndefined: Self = StObject.set(x, "voiLUT", js.undefined)
    
    inline def setVoiUndefined: Self = StObject.set(x, "voi", js.undefined)
  }
}
