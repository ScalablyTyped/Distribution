package typings.croppie

import typings.croppie.anon.Height
import typings.croppie.anon.Orientation
import typings.croppie.anon.ResultOptionstypebase64ca
import typings.croppie.anon.ResultOptionstypeblob
import typings.croppie.anon.ResultOptionstypehtml
import typings.croppie.anon.ResultOptionstyperawcanva
import typings.croppie.croppieInts.`-180`
import typings.croppie.croppieInts.`-270`
import typings.croppie.croppieInts.`-90`
import typings.croppie.croppieInts.`180`
import typings.croppie.croppieInts.`270`
import typings.croppie.croppieInts.`90`
import typings.croppie.croppieStrings.ctrl
import typings.croppie.croppieStrings.original
import typings.croppie.croppieStrings.viewport
import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("croppie", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Croppie {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: CroppieOptions) = this()
  }
  
  trait CropData extends StObject {
    
    var orientation: js.UndefOr[Double] = js.undefined
    
    var points: js.UndefOr[js.Array[Double]] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object CropData {
    
    inline def apply(): CropData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropData] (val x: Self) extends AnyVal {
      
      inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.croppie.croppieStrings.square
    - typings.croppie.croppieStrings.circle
  */
  trait CropType extends StObject
  object CropType {
    
    inline def circle: typings.croppie.croppieStrings.circle = "circle".asInstanceOf[typings.croppie.croppieStrings.circle]
    
    inline def square: typings.croppie.croppieStrings.square = "square".asInstanceOf[typings.croppie.croppieStrings.square]
  }
  
  @js.native
  trait Croppie extends StObject {
    
    def bind(options: Orientation): js.Promise[Unit] = js.native
    
    def destroy(): Unit = js.native
    
    def get(): CropData = js.native
    
    def result(): js.Promise[HTMLCanvasElement] = js.native
    def result(options: ResultOptionstypebase64ca): js.Promise[String] = js.native
    def result(options: ResultOptionstypeblob): js.Promise[Blob] = js.native
    def result(options: ResultOptionstypehtml): js.Promise[HTMLElement] = js.native
    def result(options: ResultOptionstyperawcanva): js.Promise[HTMLCanvasElement] = js.native
    def result(options: ResultOptions): js.Promise[HTMLCanvasElement] = js.native
    
    def rotate(degrees: `90` | `180` | `270` | `-90` | `-180` | `-270`): Unit = js.native
    
    def setZoom(zoom: Double): Unit = js.native
  }
  
  trait CroppieOptions extends StObject {
    
    var boundary: js.UndefOr[Height] = js.undefined
    
    var customClass: js.UndefOr[String] = js.undefined
    
    var enableExif: js.UndefOr[Boolean] = js.undefined
    
    var enableOrientation: js.UndefOr[Boolean] = js.undefined
    
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    var enableZoom: js.UndefOr[Boolean] = js.undefined
    
    var enforceBoundary: js.UndefOr[Boolean] = js.undefined
    
    /** @default 1.5 */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var mouseWheelZoom: js.UndefOr[Boolean | ctrl] = js.undefined
    
    var showZoomer: js.UndefOr[Boolean] = js.undefined
    
    var viewport: js.UndefOr[typings.croppie.anon.Type] = js.undefined
  }
  object CroppieOptions {
    
    inline def apply(): CroppieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CroppieOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CroppieOptions] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: Height): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setCustomClass(value: String): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
      
      inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
      
      inline def setEnableExif(value: Boolean): Self = StObject.set(x, "enableExif", value.asInstanceOf[js.Any])
      
      inline def setEnableExifUndefined: Self = StObject.set(x, "enableExif", js.undefined)
      
      inline def setEnableOrientation(value: Boolean): Self = StObject.set(x, "enableOrientation", value.asInstanceOf[js.Any])
      
      inline def setEnableOrientationUndefined: Self = StObject.set(x, "enableOrientation", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setEnableZoom(value: Boolean): Self = StObject.set(x, "enableZoom", value.asInstanceOf[js.Any])
      
      inline def setEnableZoomUndefined: Self = StObject.set(x, "enableZoom", js.undefined)
      
      inline def setEnforceBoundary(value: Boolean): Self = StObject.set(x, "enforceBoundary", value.asInstanceOf[js.Any])
      
      inline def setEnforceBoundaryUndefined: Self = StObject.set(x, "enforceBoundary", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setMouseWheelZoom(value: Boolean | ctrl): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
      
      inline def setShowZoomer(value: Boolean): Self = StObject.set(x, "showZoomer", value.asInstanceOf[js.Any])
      
      inline def setShowZoomerUndefined: Self = StObject.set(x, "showZoomer", js.undefined)
      
      inline def setViewport(value: typings.croppie.anon.Type): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.croppie.croppieStrings.jpeg
    - typings.croppie.croppieStrings.png
    - typings.croppie.croppieStrings.webp
  */
  trait Format extends StObject
  object Format {
    
    inline def jpeg: typings.croppie.croppieStrings.jpeg = "jpeg".asInstanceOf[typings.croppie.croppieStrings.jpeg]
    
    inline def png: typings.croppie.croppieStrings.png = "png".asInstanceOf[typings.croppie.croppieStrings.png]
    
    inline def webp: typings.croppie.croppieStrings.webp = "webp".asInstanceOf[typings.croppie.croppieStrings.webp]
  }
  
  trait ResultOptions extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Format] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[viewport | original | Height] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object ResultOptions {
    
    inline def apply(): ResultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultOptions] (val x: Self) extends AnyVal {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.croppie.croppieStrings.canvas
    - typings.croppie.croppieStrings.base64
    - typings.croppie.croppieStrings.html
    - typings.croppie.croppieStrings.blob
    - typings.croppie.croppieStrings.rawcanvas
  */
  trait Type extends StObject
  object Type {
    
    inline def base64: typings.croppie.croppieStrings.base64 = "base64".asInstanceOf[typings.croppie.croppieStrings.base64]
    
    inline def blob: typings.croppie.croppieStrings.blob = "blob".asInstanceOf[typings.croppie.croppieStrings.blob]
    
    inline def canvas: typings.croppie.croppieStrings.canvas = "canvas".asInstanceOf[typings.croppie.croppieStrings.canvas]
    
    inline def html: typings.croppie.croppieStrings.html = "html".asInstanceOf[typings.croppie.croppieStrings.html]
    
    inline def rawcanvas: typings.croppie.croppieStrings.rawcanvas = "rawcanvas".asInstanceOf[typings.croppie.croppieStrings.rawcanvas]
  }
}
