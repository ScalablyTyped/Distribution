package typings.blobUtil

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.BlobPropertyBag
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blob-util", "arrayBufferToBinaryString")
  @js.native
  def arrayBufferToBinaryString(buffer: ArrayBuffer): String = js.native
  
  @JSImport("blob-util", "arrayBufferToBlob")
  @js.native
  def arrayBufferToBlob(buffer: ArrayBuffer): Blob = js.native
  @JSImport("blob-util", "arrayBufferToBlob")
  @js.native
  def arrayBufferToBlob(buffer: ArrayBuffer, `type`: String): Blob = js.native
  
  @JSImport("blob-util", "base64StringToBlob")
  @js.native
  def base64StringToBlob(base64: String): Blob = js.native
  @JSImport("blob-util", "base64StringToBlob")
  @js.native
  def base64StringToBlob(base64: String, `type`: String): Blob = js.native
  
  @JSImport("blob-util", "binaryStringToArrayBuffer")
  @js.native
  def binaryStringToArrayBuffer(binary: String): ArrayBuffer = js.native
  
  @JSImport("blob-util", "binaryStringToBlob")
  @js.native
  def binaryStringToBlob(binary: String): Blob = js.native
  @JSImport("blob-util", "binaryStringToBlob")
  @js.native
  def binaryStringToBlob(binary: String, `type`: String): Blob = js.native
  
  @JSImport("blob-util", "blobToArrayBuffer")
  @js.native
  def blobToArrayBuffer(blob: Blob): js.Promise[ArrayBuffer] = js.native
  
  @JSImport("blob-util", "blobToBase64String")
  @js.native
  def blobToBase64String(blob: Blob): js.Promise[String] = js.native
  
  @JSImport("blob-util", "blobToBinaryString")
  @js.native
  def blobToBinaryString(blob: Blob): js.Promise[String] = js.native
  
  @JSImport("blob-util", "blobToDataURL")
  @js.native
  def blobToDataURL(blob: Blob): js.Promise[String] = js.native
  
  @JSImport("blob-util", "canvasToBlob")
  @js.native
  def canvasToBlob(canvas: HTMLCanvasElement): js.Promise[Blob] = js.native
  @JSImport("blob-util", "canvasToBlob")
  @js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: js.UndefOr[scala.Nothing], quality: Double): js.Promise[Blob] = js.native
  @JSImport("blob-util", "canvasToBlob")
  @js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String): js.Promise[Blob] = js.native
  @JSImport("blob-util", "canvasToBlob")
  @js.native
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String, quality: Double): js.Promise[Blob] = js.native
  
  @JSImport("blob-util", "createBlob")
  @js.native
  def createBlob(parts: js.Array[_]): Blob = js.native
  @JSImport("blob-util", "createBlob")
  @js.native
  def createBlob(parts: js.Array[_], properties: String): Blob = js.native
  @JSImport("blob-util", "createBlob")
  @js.native
  def createBlob(parts: js.Array[_], properties: BlobPropertyBag): Blob = js.native
  
  @JSImport("blob-util", "createObjectURL")
  @js.native
  def createObjectURL(blob: Blob): String = js.native
  
  @JSImport("blob-util", "dataURLToBlob")
  @js.native
  def dataURLToBlob(dataURL: String): Blob = js.native
  
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(
    src: String,
    `type`: js.UndefOr[scala.Nothing],
    crossOrigin: js.UndefOr[scala.Nothing],
    quality: Double
  ): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String, `type`: String): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: js.UndefOr[scala.Nothing], quality: Double): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String): js.Promise[Blob] = js.native
  @JSImport("blob-util", "imgSrcToBlob")
  @js.native
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[Blob] = js.native
  
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(
    src: String,
    `type`: js.UndefOr[scala.Nothing],
    crossOrigin: js.UndefOr[scala.Nothing],
    quality: Double
  ): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String, `type`: js.UndefOr[scala.Nothing], crossOrigin: String, quality: Double): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String, `type`: String): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: js.UndefOr[scala.Nothing], quality: Double): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String): js.Promise[String] = js.native
  @JSImport("blob-util", "imgSrcToDataURL")
  @js.native
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[String] = js.native
  
  @JSImport("blob-util", "revokeObjectURL")
  @js.native
  def revokeObjectURL(url: String): Unit = js.native
}
