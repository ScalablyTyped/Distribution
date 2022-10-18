package typings.cypress

import typings.std.Blob
import typings.std.BlobPropertyBag
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCyBlobUtilMod {
  
  @js.native
  trait BlobUtilStatic extends StObject {
    
    def arrayBufferToBinaryString(buffer: js.typedarray.ArrayBuffer): String = js.native
    
    def arrayBufferToBlob(buffer: js.typedarray.ArrayBuffer): Blob = js.native
    def arrayBufferToBlob(buffer: js.typedarray.ArrayBuffer, `type`: String): Blob = js.native
    
    def base64StringToBlob(base64: String): Blob = js.native
    def base64StringToBlob(base64: String, `type`: String): Blob = js.native
    
    def binaryStringToArrayBuffer(binary: String): js.typedarray.ArrayBuffer = js.native
    
    def binaryStringToBlob(binary: String): Blob = js.native
    def binaryStringToBlob(binary: String, `type`: String): Blob = js.native
    
    def blobToArrayBuffer(blob: Blob): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def blobToBase64String(blob: Blob): js.Promise[String] = js.native
    
    def blobToBinaryString(blob: Blob): js.Promise[String] = js.native
    
    def blobToDataURL(blob: Blob): js.Promise[String] = js.native
    
    def canvasToBlob(canvas: HTMLCanvasElement): js.Promise[Blob] = js.native
    def canvasToBlob(canvas: HTMLCanvasElement, `type`: String): js.Promise[Blob] = js.native
    def canvasToBlob(canvas: HTMLCanvasElement, `type`: String, quality: Double): js.Promise[Blob] = js.native
    def canvasToBlob(canvas: HTMLCanvasElement, `type`: Unit, quality: Double): js.Promise[Blob] = js.native
    
    def createBlob(parts: js.Array[Any]): Blob = js.native
    def createBlob(parts: js.Array[Any], properties: String): Blob = js.native
    def createBlob(parts: js.Array[Any], properties: BlobPropertyBag): Blob = js.native
    
    def createObjectURL(blob: Blob): String = js.native
    
    def dataURLToBlob(dataURL: String): Blob = js.native
    
    def imgSrcToBlob(src: String): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: String): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: String, crossOrigin: String): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: String, crossOrigin: Unit, quality: Double): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: Unit, crossOrigin: String): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: Unit, crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
    def imgSrcToBlob(src: String, `type`: Unit, crossOrigin: Unit, quality: Double): js.Promise[Blob] = js.native
    
    def imgSrcToDataURL(src: String): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: String): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: String, crossOrigin: Unit, quality: Double): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: Unit, crossOrigin: String): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: Unit, crossOrigin: String, quality: Double): js.Promise[String] = js.native
    def imgSrcToDataURL(src: String, `type`: Unit, crossOrigin: Unit, quality: Double): js.Promise[String] = js.native
    
    def revokeObjectURL(url: String): Unit = js.native
  }
}
