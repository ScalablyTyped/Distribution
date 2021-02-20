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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Orientation extends StObject {
    
    var orientation: js.UndefOr[Double] = js.native
    
    var points: js.UndefOr[js.Array[Double]] = js.native
    
    var url: String = js.native
    
    var useCanvas: js.UndefOr[Boolean] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
  }
  object Orientation {
    
    @scala.inline
    def apply(url: String): Orientation = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Orientation]
    }
    
    @scala.inline
    implicit class OrientationMutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCanvas(value: Boolean): Self = StObject.set(x, "useCanvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCanvasUndefined: Self = StObject.set(x, "useCanvas", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'base64' | 'canvas'} */
  @js.native
  trait ResultOptionstypebase64ca extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[viewport | original | Height] = js.native
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] with (base64 | canvas) = js.native
  }
  object ResultOptionstypebase64ca {
    
    @scala.inline
    def apply(`type`: js.UndefOr[typings.croppie.mod.Type] with (base64 | canvas)): ResultOptionstypebase64ca = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstypebase64ca]
    }
    
    @scala.inline
    implicit class ResultOptionstypebase64caMutableBuilder[Self <: ResultOptionstypebase64ca] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: js.UndefOr[typings.croppie.mod.Type] with (base64 | canvas)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'blob'} */
  @js.native
  trait ResultOptionstypeblob extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[viewport | original | Height] = js.native
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] with blob = js.native
  }
  object ResultOptionstypeblob {
    
    @scala.inline
    def apply(`type`: js.UndefOr[typings.croppie.mod.Type] with blob): ResultOptionstypeblob = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstypeblob]
    }
    
    @scala.inline
    implicit class ResultOptionstypeblobMutableBuilder[Self <: ResultOptionstypeblob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: js.UndefOr[typings.croppie.mod.Type] with blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'html'} */
  @js.native
  trait ResultOptionstypehtml extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[viewport | original | Height] = js.native
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] with html = js.native
  }
  object ResultOptionstypehtml {
    
    @scala.inline
    def apply(`type`: js.UndefOr[typings.croppie.mod.Type] with html): ResultOptionstypehtml = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstypehtml]
    }
    
    @scala.inline
    implicit class ResultOptionstypehtmlMutableBuilder[Self <: ResultOptionstypehtml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: js.UndefOr[typings.croppie.mod.Type] with html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined croppie.croppie.ResultOptions & {  type :'rawcanvas'} */
  @js.native
  trait ResultOptionstyperawcanva extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[viewport | original | Height] = js.native
    
    var `type`: js.UndefOr[typings.croppie.mod.Type] with rawcanvas = js.native
  }
  object ResultOptionstyperawcanva {
    
    @scala.inline
    def apply(`type`: js.UndefOr[typings.croppie.mod.Type] with rawcanvas): ResultOptionstyperawcanva = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultOptionstyperawcanva]
    }
    
    @scala.inline
    implicit class ResultOptionstyperawcanvaMutableBuilder[Self <: ResultOptionstyperawcanva] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: js.UndefOr[typings.croppie.mod.Type] with rawcanvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var height: Double = js.native
    
    var `type`: js.UndefOr[CropType] = js.native
    
    var width: Double = js.native
  }
  object Type {
    
    @scala.inline
    def apply(height: Double, width: Double): Type = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
