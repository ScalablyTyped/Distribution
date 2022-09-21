package typings.browserImageCompression

import typings.std.AbortSignal
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(image: File, options: Options): js.Promise[File] = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
    
    @JSImport("browser-image-compression", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canvasToFile(canvas: HTMLCanvasElement, fileType: String, fileName: String, fileLastModified: Double): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToFile")(canvas.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], fileLastModified.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
    inline def canvasToFile(
      canvas: HTMLCanvasElement,
      fileType: String,
      fileName: String,
      fileLastModified: Double,
      quality: Double
    ): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToFile")(canvas.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], fileLastModified.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
    
    inline def drawFileInCanvas(file: File): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("drawFileInCanvas")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]]]
    inline def drawFileInCanvas(file: File, options: Options): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawFileInCanvas")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]]]
    
    inline def drawImageInCanvas(img: HTMLImageElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("drawImageInCanvas")(img.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
    inline def drawImageInCanvas(img: HTMLImageElement, fileType: String): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageInCanvas")(img.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
    
    inline def getDataUrlFromFile(file: File): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataUrlFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def getExifOrientation(file: File): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExifOrientation")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    inline def getFilefromDataUrl(dataUrl: String, filename: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilefromDataUrl")(dataUrl.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
    inline def getFilefromDataUrl(dataUrl: String, filename: String, lastModified: Double): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilefromDataUrl")(dataUrl.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], lastModified.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
    
    inline def loadImage(src: String): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
  }
  
  trait Options extends StObject {
    
    /** @default false */
    var alwaysKeepResolution: js.UndefOr[Boolean] = js.undefined
    
    /** Default to be the exif orientation from the image file */
    var exifOrientation: js.UndefOr[Double] = js.undefined
    
    /** Default to be the original mime type from the image file */
    var fileType: js.UndefOr[String] = js.undefined
    
    /** @default 1.0 */
    var initialQuality: js.UndefOr[Double] = js.undefined
    
    /** @default 10 */
    var maxIteration: js.UndefOr[Double] = js.undefined
    
    /** @default Number.POSITIVE_INFINITY */
    var maxSizeMB: js.UndefOr[Double] = js.undefined
    
    /** @default undefined */
    var maxWidthOrHeight: js.UndefOr[Double] = js.undefined
    
    /** A function takes one progress argument (progress from 0 to 100) */
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
    
    /** @default undefined */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /** @default true */
    var useWebWorker: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlwaysKeepResolution(value: Boolean): Self = StObject.set(x, "alwaysKeepResolution", value.asInstanceOf[js.Any])
      
      inline def setAlwaysKeepResolutionUndefined: Self = StObject.set(x, "alwaysKeepResolution", js.undefined)
      
      inline def setExifOrientation(value: Double): Self = StObject.set(x, "exifOrientation", value.asInstanceOf[js.Any])
      
      inline def setExifOrientationUndefined: Self = StObject.set(x, "exifOrientation", js.undefined)
      
      inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setInitialQuality(value: Double): Self = StObject.set(x, "initialQuality", value.asInstanceOf[js.Any])
      
      inline def setInitialQualityUndefined: Self = StObject.set(x, "initialQuality", js.undefined)
      
      inline def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
      
      inline def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
      
      inline def setMaxSizeMB(value: Double): Self = StObject.set(x, "maxSizeMB", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeMBUndefined: Self = StObject.set(x, "maxSizeMB", js.undefined)
      
      inline def setMaxWidthOrHeight(value: Double): Self = StObject.set(x, "maxWidthOrHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthOrHeightUndefined: Self = StObject.set(x, "maxWidthOrHeight", js.undefined)
      
      inline def setOnProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setUseWebWorker(value: Boolean): Self = StObject.set(x, "useWebWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWebWorkerUndefined: Self = StObject.set(x, "useWebWorker", js.undefined)
    }
  }
}
