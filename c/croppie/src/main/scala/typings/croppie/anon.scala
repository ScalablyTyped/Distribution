package typings.croppie

import typings.croppie.croppieStrings.base64
import typings.croppie.croppieStrings.blob
import typings.croppie.croppieStrings.canvas
import typings.croppie.croppieStrings.html
import typings.croppie.croppieStrings.original
import typings.croppie.croppieStrings.rawcanvas
import typings.croppie.croppieStrings.viewport
import typings.croppie.mod.CropType
import typings.croppie.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Orientation extends StObject {
    
    var orientation: js.UndefOr[Double] = js.undefined
    
    var points: js.UndefOr[js.Array[Double]] = js.undefined
    
    var url: String
    
    var useCanvas: js.UndefOr[Boolean] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object Orientation {
    
    inline def apply(url: String): Orientation = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Orientation]
    }
    
    extension [Self <: Orientation](x: Self) {
      
      inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUseCanvas(value: Boolean): Self = StObject.set(x, "useCanvas", value.asInstanceOf[js.Any])
      
      inline def setUseCanvasUndefined: Self = StObject.set(x, "useCanvas", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'base64' | 'canvas'} */
  trait ResultOptionstypebase64ca extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Format] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[viewport | original | Height] = js.undefined
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] & (base64 | canvas)
  }
  object ResultOptionstypebase64ca {
    
    inline def apply(`type`: js.UndefOr[typings.croppie.mod.Type] & (base64 | canvas)): ResultOptionstypebase64ca = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstypebase64ca]
    }
    
    extension [Self <: ResultOptionstypebase64ca](x: Self) {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: js.UndefOr[typings.croppie.mod.Type] & (base64 | canvas)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'blob'} */
  trait ResultOptionstypeblob extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Format] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[viewport | original | Height] = js.undefined
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] & blob
  }
  object ResultOptionstypeblob {
    
    inline def apply(`type`: js.UndefOr[typings.croppie.mod.Type] & blob): ResultOptionstypeblob = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstypeblob]
    }
    
    extension [Self <: ResultOptionstypeblob](x: Self) {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: js.UndefOr[typings.croppie.mod.Type] & blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'html'} */
  trait ResultOptionstypehtml extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Format] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[viewport | original | Height] = js.undefined
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] & html
  }
  object ResultOptionstypehtml {
    
    inline def apply(`type`: js.UndefOr[typings.croppie.mod.Type] & html): ResultOptionstypehtml = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstypehtml]
    }
    
    extension [Self <: ResultOptionstypehtml](x: Self) {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: js.UndefOr[typings.croppie.mod.Type] & html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'rawcanvas'} */
  trait ResultOptionstyperawcanva extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Format] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[viewport | original | Height] = js.undefined
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] & rawcanvas
  }
  object ResultOptionstyperawcanva {
    
    inline def apply(`type`: js.UndefOr[typings.croppie.mod.Type] & rawcanvas): ResultOptionstyperawcanva = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstyperawcanva]
    }
    
    extension [Self <: ResultOptionstyperawcanva](x: Self) {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: js.UndefOr[typings.croppie.mod.Type] & rawcanvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var height: Double
    
    var `type`: js.UndefOr[CropType] = js.undefined
    
    var width: Double
  }
  object Type {
    
    inline def apply(height: Double, width: Double): Type = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: CropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
