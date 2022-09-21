package typings.browserImageCompression

import typings.browserImageCompression.mod.Options
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object imageCompression {
    
    inline def apply(image: File, options: Options): js.Promise[File] = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
    
    @JSGlobal("imageCompression")
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
}
