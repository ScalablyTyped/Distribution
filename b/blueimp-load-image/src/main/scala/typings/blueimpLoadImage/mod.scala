package typings.blueimpLoadImage

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Event
import typings.std.File
import typings.std.FileReader
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("blueimp-load-image", JSImport.Namespace)
  @js.native
  val ^ : LoadImage = js.native
  
  type AspectRatio = Double
  
  trait BasicOptions extends StObject {
    
    var contain: js.UndefOr[Boolean] = js.undefined
    
    var cover: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var noRevoke: js.UndefOr[Boolean] = js.undefined
  }
  object BasicOptions {
    
    inline def apply(): BasicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicOptions]
    }
    
    extension [Self <: BasicOptions](x: Self) {
      
      inline def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setNoRevoke(value: Boolean): Self = StObject.set(x, "noRevoke", value.asInstanceOf[js.Any])
      
      inline def setNoRevokeUndefined: Self = StObject.set(x, "noRevoke", js.undefined)
    }
  }
  
  trait CanvasFalseOptions
    extends StObject
       with CanvasOptions {
    
    var canvas: js.UndefOr[`false`] = js.undefined
  }
  object CanvasFalseOptions {
    
    inline def apply(): CanvasFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasFalseOptions]
    }
    
    extension [Self <: CanvasFalseOptions](x: Self) {
      
      inline def setCanvas(value: `false`): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueimpLoadImage.mod.CanvasTrueOptions
    - typings.blueimpLoadImage.mod.CanvasFalseOptions
  */
  trait CanvasOptions extends StObject
  object CanvasOptions {
    
    inline def CanvasFalseOptions(): typings.blueimpLoadImage.mod.CanvasFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CanvasFalseOptions]
    }
    
    inline def CanvasTrueOptions(): typings.blueimpLoadImage.mod.CanvasTrueOptions = {
      val __obj = js.Dynamic.literal(canvas = true)
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CanvasTrueOptions]
    }
  }
  
  // Some options are only valid if 'canvas' is true.
  // In addition, if 'crop' is true or 'orientation' is set,
  // it automatically enables 'canvas' so in those cases,
  // 'canvas' cannot be false
  trait CanvasTrueOptions
    extends StObject
       with CanvasOptions {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var canvas: `true`
    
    var crop: js.UndefOr[Boolean] = js.undefined
    
    var downsamplingRatio: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var sourceHeight: js.UndefOr[Double] = js.undefined
    
    var sourceWidth: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object CanvasTrueOptions {
    
    inline def apply(): CanvasTrueOptions = {
      val __obj = js.Dynamic.literal(canvas = true)
      __obj.asInstanceOf[CanvasTrueOptions]
    }
    
    extension [Self <: CanvasTrueOptions](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCanvas(value: `true`): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setDownsamplingRatio(value: Double): Self = StObject.set(x, "downsamplingRatio", value.asInstanceOf[js.Any])
      
      inline def setDownsamplingRatioUndefined: Self = StObject.set(x, "downsamplingRatio", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setSourceHeight(value: Double): Self = StObject.set(x, "sourceHeight", value.asInstanceOf[js.Any])
      
      inline def setSourceHeightUndefined: Self = StObject.set(x, "sourceHeight", js.undefined)
      
      inline def setSourceWidth(value: Double): Self = StObject.set(x, "sourceWidth", value.asInstanceOf[js.Any])
      
      inline def setSourceWidthUndefined: Self = StObject.set(x, "sourceWidth", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait CropFalseOptions
    extends StObject
       with CropOptions {
    
    var crop: js.UndefOr[`false`] = js.undefined
  }
  object CropFalseOptions {
    
    inline def apply(): CropFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropFalseOptions]
    }
    
    extension [Self <: CropFalseOptions](x: Self) {
      
      inline def setCrop(value: `false`): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueimpLoadImage.mod.CropTrueOptions
    - typings.blueimpLoadImage.mod.CropFalseOptions
  */
  trait CropOptions extends StObject
  object CropOptions {
    
    inline def CropFalseOptions(): typings.blueimpLoadImage.mod.CropFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CropFalseOptions]
    }
    
    inline def CropTrueOptions(): typings.blueimpLoadImage.mod.CropTrueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CropTrueOptions]
    }
  }
  
  // Setting 'aspectRatio' automatically enables 'crop', so setting 'crop' to
  // 'false' in that case is not valid
  trait CropTrueOptions
    extends StObject
       with CropOptions {
    
    var aspectRatio: js.UndefOr[AspectRatio] = js.undefined
    
    var crop: js.UndefOr[`true`] = js.undefined
  }
  object CropTrueOptions {
    
    inline def apply(): CropTrueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropTrueOptions]
    }
    
    extension [Self <: CropTrueOptions](x: Self) {
      
      inline def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setCrop(value: `true`): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    }
  }
  
  type Exif = NumberDictionary[Double | String | js.Array[String]]
  
  trait ImageHead extends StObject {
    
    var imageHead: js.UndefOr[ArrayBuffer | Uint8Array] = js.undefined
  }
  object ImageHead {
    
    inline def apply(): ImageHead = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageHead]
    }
    
    extension [Self <: ImageHead](x: Self) {
      
      inline def setImageHead(value: ArrayBuffer | Uint8Array): Self = StObject.set(x, "imageHead", value.asInstanceOf[js.Any])
      
      inline def setImageHeadUndefined: Self = StObject.set(x, "imageHead", js.undefined)
    }
  }
  
  type Iptc = NumberDictionary[Double | String | js.Array[String]]
  
  // loadImage is implemented as a callable object.
  @js.native
  trait LoadImage extends StObject {
    
    def apply(file: String, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
    def apply(file: Blob, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
    def apply(file: File, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
    
    def blobSlice(): Blob = js.native
    def blobSlice(start: Double): Blob = js.native
    def blobSlice(start: Double, end: Double): Blob = js.native
    def blobSlice(start: Unit, end: Double): Blob = js.native
    
    def parseMetaData(file: String, callback: ParseMetaDataCallback): Unit = js.native
    def parseMetaData(file: String, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
    def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
    def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
    // Parses image meta data and calls the callback with the image head
    def parseMetaData(file: File, callback: ParseMetaDataCallback): Unit = js.native
    def parseMetaData(file: File, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
    def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
    def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  }
  
  type LoadImageCallback = js.Function2[
    /* eventOrImage */ Event | HTMLCanvasElement | HTMLImageElement, 
    /* data */ js.UndefOr[MetaData], 
    Unit
  ]
  
  type LoadImageOptions = BasicOptions & CanvasOptions & CropOptions & MetaOptions
  
  trait MetaData
    extends StObject
       with ImageHead {
    
    var exif: js.UndefOr[Exif] = js.undefined
    
    var iptc: js.UndefOr[Iptc] = js.undefined
    
    var originalHeight: js.UndefOr[Double] = js.undefined
    
    var originalWidth: js.UndefOr[Double] = js.undefined
  }
  object MetaData {
    
    inline def apply(): MetaData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetaData]
    }
    
    extension [Self <: MetaData](x: Self) {
      
      inline def setExif(value: Exif): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
      
      inline def setIptc(value: Iptc): Self = StObject.set(x, "iptc", value.asInstanceOf[js.Any])
      
      inline def setIptcUndefined: Self = StObject.set(x, "iptc", js.undefined)
      
      inline def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
      
      inline def setOriginalHeightUndefined: Self = StObject.set(x, "originalHeight", js.undefined)
      
      inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
      
      inline def setOriginalWidthUndefined: Self = StObject.set(x, "originalWidth", js.undefined)
    }
  }
  
  trait MetaFalseOptions
    extends StObject
       with MetaOptions {
    
    var meta: js.UndefOr[`false`] = js.undefined
  }
  object MetaFalseOptions {
    
    inline def apply(): MetaFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetaFalseOptions]
    }
    
    extension [Self <: MetaFalseOptions](x: Self) {
      
      inline def setMeta(value: `false`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueimpLoadImage.mod.MetaTrueOptions
    - typings.blueimpLoadImage.mod.MetaFalseOptions
  */
  trait MetaOptions extends StObject
  object MetaOptions {
    
    inline def MetaFalseOptions(): typings.blueimpLoadImage.mod.MetaFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.MetaFalseOptions]
    }
    
    inline def MetaTrueOptions(orientation: Orientation): typings.blueimpLoadImage.mod.MetaTrueOptions = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.MetaTrueOptions]
    }
  }
  
  // Setting 'orientation' automatically sets 'meta' to true
  // so setting it to false is not valid in that case
  trait MetaTrueOptions
    extends StObject
       with MetaOptions {
    
    var meta: js.UndefOr[`true`] = js.undefined
    
    var orientation: Orientation
  }
  object MetaTrueOptions {
    
    inline def apply(orientation: Orientation): MetaTrueOptions = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaTrueOptions]
    }
    
    extension [Self <: MetaTrueOptions](x: Self) {
      
      inline def setMeta(value: `true`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
  
  type Orientation = Double | Boolean
  
  type ParseMetaDataCallback = js.Function1[/* data */ ImageHead, Unit]
  
  trait ParseOptions extends StObject {
    
    // Disables creating the imageHead property.
    var disableImageHead: js.UndefOr[Boolean] = js.undefined
    
    // Defines the maximum number of bytes to parse.
    var maxMetaDataSize: js.UndefOr[Double] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setDisableImageHead(value: Boolean): Self = StObject.set(x, "disableImageHead", value.asInstanceOf[js.Any])
      
      inline def setDisableImageHeadUndefined: Self = StObject.set(x, "disableImageHead", js.undefined)
      
      inline def setMaxMetaDataSize(value: Double): Self = StObject.set(x, "maxMetaDataSize", value.asInstanceOf[js.Any])
      
      inline def setMaxMetaDataSizeUndefined: Self = StObject.set(x, "maxMetaDataSize", js.undefined)
    }
  }
  
  type _To = LoadImage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LoadImage = ^
}
