package typings.browserImageCompression

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(image: Blob, options: Options): js.Promise[File | Blob] = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Blob]]
  @scala.inline
  def apply(image: File, options: Options): js.Promise[File | Blob] = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Blob]]
  
  @JSImport("browser-image-compression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canvasToFile(canvas: HTMLCanvasElement, fileType: String, fileName: String, fileLastModified: Double): js.Promise[File | Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToFile")(canvas.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], fileLastModified.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Blob]]
  @scala.inline
  def canvasToFile(
    canvas: HTMLCanvasElement,
    fileType: String,
    fileName: String,
    fileLastModified: Double,
    quality: Double
  ): js.Promise[File | Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToFile")(canvas.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], fileLastModified.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Blob]]
  
  @scala.inline
  def drawFileInCanvas(file: Blob): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("drawFileInCanvas")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]]]
  @scala.inline
  def drawFileInCanvas(file: File): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("drawFileInCanvas")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]]]
  
  @scala.inline
  def drawImageInCanvas(img: HTMLImageElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("drawImageInCanvas")(img.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  @scala.inline
  def getDataUrlFromFile(file: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataUrlFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def getDataUrlFromFile(file: File): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataUrlFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def getExifOrientation(file: Blob): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExifOrientation")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def getExifOrientation(file: File): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExifOrientation")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def getFilefromDataUrl(dataUrl: String, filename: String): js.Promise[File | Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilefromDataUrl")(dataUrl.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Blob]]
  @scala.inline
  def getFilefromDataUrl(dataUrl: String, filename: String, lastModified: Double): js.Promise[File | Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilefromDataUrl")(dataUrl.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], lastModified.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Blob]]
  
  @scala.inline
  def loadImage(src: String): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
  
  trait Options extends StObject {
    
    /** Default to be the exif orientation from the image file */
    var exifOrientation: js.UndefOr[Double] = js.undefined
    
    /** Default to be the original mime type from the image file */
    var fileType: js.UndefOr[String] = js.undefined
    
    /** @default 10 */
    var maxIteration: js.UndefOr[Double] = js.undefined
    
    /** @default Number.POSITIVE_INFINITY */
    var maxSizeMB: js.UndefOr[Double] = js.undefined
    
    /** @default undefined */
    var maxWidthOrHeight: js.UndefOr[Double] = js.undefined
    
    /** A function takes one progress argument (progress from 0 to 100) */
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
    
    /** @default false */
    var useWebWorker: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExifOrientation(value: Double): Self = StObject.set(x, "exifOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExifOrientationUndefined: Self = StObject.set(x, "exifOrientation", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
      
      @scala.inline
      def setMaxSizeMB(value: Double): Self = StObject.set(x, "maxSizeMB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeMBUndefined: Self = StObject.set(x, "maxSizeMB", js.undefined)
      
      @scala.inline
      def setMaxWidthOrHeight(value: Double): Self = StObject.set(x, "maxWidthOrHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthOrHeightUndefined: Self = StObject.set(x, "maxWidthOrHeight", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setUseWebWorker(value: Boolean): Self = StObject.set(x, "useWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWebWorkerUndefined: Self = StObject.set(x, "useWebWorker", js.undefined)
    }
  }
}
