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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("blueimp-load-image", JSImport.Namespace)
  @js.native
  val ^ : LoadImage = js.native
  
  type AspectRatio = Double
  
  @js.native
  trait BasicOptions extends StObject {
    
    var contain: js.UndefOr[Boolean] = js.native
    
    var cover: js.UndefOr[Boolean] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var noRevoke: js.UndefOr[Boolean] = js.native
  }
  object BasicOptions {
    
    @scala.inline
    def apply(): BasicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicOptions]
    }
    
    @scala.inline
    implicit class BasicOptionsMutableBuilder[Self <: BasicOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      @scala.inline
      def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setNoRevoke(value: Boolean): Self = StObject.set(x, "noRevoke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRevokeUndefined: Self = StObject.set(x, "noRevoke", js.undefined)
    }
  }
  
  @js.native
  trait CanvasFalseOptions extends CanvasOptions {
    
    var canvas: js.UndefOr[`false`] = js.native
  }
  object CanvasFalseOptions {
    
    @scala.inline
    def apply(): CanvasFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasFalseOptions]
    }
    
    @scala.inline
    implicit class CanvasFalseOptionsMutableBuilder[Self <: CanvasFalseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanvas(value: `false`): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueimpLoadImage.mod.CanvasTrueOptions
    - typings.blueimpLoadImage.mod.CanvasFalseOptions
  */
  trait CanvasOptions extends StObject
  object CanvasOptions {
    
    @scala.inline
    def CanvasFalseOptions(): typings.blueimpLoadImage.mod.CanvasFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CanvasFalseOptions]
    }
    
    @scala.inline
    def CanvasTrueOptions(canvas: `true`): typings.blueimpLoadImage.mod.CanvasTrueOptions = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CanvasTrueOptions]
    }
  }
  
  // Some options are only valid if 'canvas' is true.
  // In addition, if 'crop' is true or 'orientation' is set,
  // it automatically enables 'canvas' so in those cases,
  // 'canvas' cannot be false
  @js.native
  trait CanvasTrueOptions extends CanvasOptions {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var canvas: `true` = js.native
    
    var crop: js.UndefOr[Boolean] = js.native
    
    var downsamplingRatio: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var orientation: js.UndefOr[Orientation] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var sourceHeight: js.UndefOr[Double] = js.native
    
    var sourceWidth: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object CanvasTrueOptions {
    
    @scala.inline
    def apply(canvas: `true`): CanvasTrueOptions = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasTrueOptions]
    }
    
    @scala.inline
    implicit class CanvasTrueOptionsMutableBuilder[Self <: CanvasTrueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setCanvas(value: `true`): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setDownsamplingRatio(value: Double): Self = StObject.set(x, "downsamplingRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownsamplingRatioUndefined: Self = StObject.set(x, "downsamplingRatio", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setSourceHeight(value: Double): Self = StObject.set(x, "sourceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceHeightUndefined: Self = StObject.set(x, "sourceHeight", js.undefined)
      
      @scala.inline
      def setSourceWidth(value: Double): Self = StObject.set(x, "sourceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceWidthUndefined: Self = StObject.set(x, "sourceWidth", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait CropFalseOptions extends CropOptions {
    
    var crop: js.UndefOr[`false`] = js.native
  }
  object CropFalseOptions {
    
    @scala.inline
    def apply(): CropFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropFalseOptions]
    }
    
    @scala.inline
    implicit class CropFalseOptionsMutableBuilder[Self <: CropFalseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrop(value: `false`): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueimpLoadImage.mod.CropTrueOptions
    - typings.blueimpLoadImage.mod.CropFalseOptions
  */
  trait CropOptions extends StObject
  object CropOptions {
    
    @scala.inline
    def CropFalseOptions(): typings.blueimpLoadImage.mod.CropFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CropFalseOptions]
    }
    
    @scala.inline
    def CropTrueOptions(): typings.blueimpLoadImage.mod.CropTrueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.CropTrueOptions]
    }
  }
  
  // Setting 'aspectRatio' automatically enables 'crop', so setting 'crop' to
  // 'false' in that case is not valid
  @js.native
  trait CropTrueOptions extends CropOptions {
    
    var aspectRatio: js.UndefOr[AspectRatio] = js.native
    
    var crop: js.UndefOr[`true`] = js.native
  }
  object CropTrueOptions {
    
    @scala.inline
    def apply(): CropTrueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropTrueOptions]
    }
    
    @scala.inline
    implicit class CropTrueOptionsMutableBuilder[Self <: CropTrueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setCrop(value: `true`): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    }
  }
  
  type Exif = NumberDictionary[Double | String | js.Array[String]]
  
  @js.native
  trait ImageHead extends StObject {
    
    var imageHead: js.UndefOr[ArrayBuffer | Uint8Array] = js.native
  }
  object ImageHead {
    
    @scala.inline
    def apply(): ImageHead = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageHead]
    }
    
    @scala.inline
    implicit class ImageHeadMutableBuilder[Self <: ImageHead] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageHead(value: ArrayBuffer | Uint8Array): Self = StObject.set(x, "imageHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageHeadUndefined: Self = StObject.set(x, "imageHead", js.undefined)
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
    def blobSlice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
    def blobSlice(start: Double): Blob = js.native
    def blobSlice(start: Double, end: Double): Blob = js.native
    
    def parseMetaData(file: String, callback: ParseMetaDataCallback): Unit = js.native
    def parseMetaData(file: String, callback: ParseMetaDataCallback, options: js.UndefOr[scala.Nothing], data: ImageHead): Unit = js.native
    def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
    def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: js.UndefOr[scala.Nothing], data: ImageHead): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
    def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
    // Parses image meta data and calls the callback with the image head
    def parseMetaData(file: File, callback: ParseMetaDataCallback): Unit = js.native
    def parseMetaData(file: File, callback: ParseMetaDataCallback, options: js.UndefOr[scala.Nothing], data: ImageHead): Unit = js.native
    def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
    def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  }
  
  type LoadImageCallback = js.Function2[
    /* eventOrImage */ Event | HTMLCanvasElement | HTMLImageElement, 
    /* data */ js.UndefOr[MetaData], 
    Unit
  ]
  
  type LoadImageOptions = BasicOptions with CanvasOptions with CropOptions with MetaOptions
  
  @js.native
  trait MetaData extends ImageHead {
    
    var exif: js.UndefOr[Exif] = js.native
    
    var iptc: js.UndefOr[Iptc] = js.native
    
    var originalHeight: js.UndefOr[Double] = js.native
    
    var originalWidth: js.UndefOr[Double] = js.native
  }
  object MetaData {
    
    @scala.inline
    def apply(): MetaData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetaData]
    }
    
    @scala.inline
    implicit class MetaDataMutableBuilder[Self <: MetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExif(value: Exif): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
      
      @scala.inline
      def setIptc(value: Iptc): Self = StObject.set(x, "iptc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIptcUndefined: Self = StObject.set(x, "iptc", js.undefined)
      
      @scala.inline
      def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalHeightUndefined: Self = StObject.set(x, "originalHeight", js.undefined)
      
      @scala.inline
      def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalWidthUndefined: Self = StObject.set(x, "originalWidth", js.undefined)
    }
  }
  
  @js.native
  trait MetaFalseOptions extends MetaOptions {
    
    var meta: js.UndefOr[`false`] = js.native
  }
  object MetaFalseOptions {
    
    @scala.inline
    def apply(): MetaFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetaFalseOptions]
    }
    
    @scala.inline
    implicit class MetaFalseOptionsMutableBuilder[Self <: MetaFalseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: `false`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueimpLoadImage.mod.MetaTrueOptions
    - typings.blueimpLoadImage.mod.MetaFalseOptions
  */
  trait MetaOptions extends StObject
  object MetaOptions {
    
    @scala.inline
    def MetaFalseOptions(): typings.blueimpLoadImage.mod.MetaFalseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.MetaFalseOptions]
    }
    
    @scala.inline
    def MetaTrueOptions(orientation: Orientation): typings.blueimpLoadImage.mod.MetaTrueOptions = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.blueimpLoadImage.mod.MetaTrueOptions]
    }
  }
  
  // Setting 'orientation' automatically sets 'meta' to true
  // so setting it to false is not valid in that case
  @js.native
  trait MetaTrueOptions extends MetaOptions {
    
    var meta: js.UndefOr[`true`] = js.native
    
    var orientation: Orientation = js.native
  }
  object MetaTrueOptions {
    
    @scala.inline
    def apply(orientation: Orientation): MetaTrueOptions = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaTrueOptions]
    }
    
    @scala.inline
    implicit class MetaTrueOptionsMutableBuilder[Self <: MetaTrueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: `true`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
  
  type Orientation = Double | Boolean
  
  type ParseMetaDataCallback = js.Function1[/* data */ ImageHead, Unit]
  
  @js.native
  trait ParseOptions extends StObject {
    
    // Disables creating the imageHead property.
    var disableImageHead: js.UndefOr[Boolean] = js.native
    
    // Defines the maximum number of bytes to parse.
    var maxMetaDataSize: js.UndefOr[Double] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableImageHead(value: Boolean): Self = StObject.set(x, "disableImageHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableImageHeadUndefined: Self = StObject.set(x, "disableImageHead", js.undefined)
      
      @scala.inline
      def setMaxMetaDataSize(value: Double): Self = StObject.set(x, "maxMetaDataSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMetaDataSizeUndefined: Self = StObject.set(x, "maxMetaDataSize", js.undefined)
    }
  }
  
  type _To = LoadImage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LoadImage = ^
}
