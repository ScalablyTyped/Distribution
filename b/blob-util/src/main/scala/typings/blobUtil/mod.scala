package typings.blobUtil

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.BlobPropertyBag
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blob-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayBufferToBinaryString(buffer: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBinaryString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def arrayBufferToBlob(buffer: ArrayBuffer): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBlob")(buffer.asInstanceOf[js.Any]).asInstanceOf[Blob]
  @scala.inline
  def arrayBufferToBlob(buffer: ArrayBuffer, `type`: String): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBlob")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Blob]
  
  @scala.inline
  def base64StringToBlob(base64: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("base64StringToBlob")(base64.asInstanceOf[js.Any]).asInstanceOf[Blob]
  @scala.inline
  def base64StringToBlob(base64: String, `type`: String): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("base64StringToBlob")(base64.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Blob]
  
  @scala.inline
  def binaryStringToArrayBuffer(binary: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("binaryStringToArrayBuffer")(binary.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  @scala.inline
  def binaryStringToBlob(binary: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("binaryStringToBlob")(binary.asInstanceOf[js.Any]).asInstanceOf[Blob]
  @scala.inline
  def binaryStringToBlob(binary: String, `type`: String): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryStringToBlob")(binary.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Blob]
  
  @scala.inline
  def blobToArrayBuffer(blob: Blob): js.Promise[ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobToArrayBuffer")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer]]
  
  @scala.inline
  def blobToBase64String(blob: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobToBase64String")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def blobToBinaryString(blob: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobToBinaryString")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def blobToDataURL(blob: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobToDataURL")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def canvasToBlob(canvas: HTMLCanvasElement): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("canvasToBlob")(canvas.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToBlob")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: String, quality: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToBlob")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def canvasToBlob(canvas: HTMLCanvasElement, `type`: Unit, quality: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToBlob")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  @scala.inline
  def createBlob(parts: js.Array[js.Any]): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlob")(parts.asInstanceOf[js.Any]).asInstanceOf[Blob]
  @scala.inline
  def createBlob(parts: js.Array[js.Any], properties: String): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlob")(parts.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Blob]
  @scala.inline
  def createBlob(parts: js.Array[js.Any], properties: BlobPropertyBag): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlob")(parts.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Blob]
  
  @scala.inline
  def createObjectURL(blob: Blob): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(blob.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def dataURLToBlob(dataURL: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURLToBlob")(dataURL.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  @scala.inline
  def imgSrcToBlob(src: String): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: String): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: String, crossOrigin: Unit, quality: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: Unit, crossOrigin: String): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: Unit, crossOrigin: String, quality: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def imgSrcToBlob(src: String, `type`: Unit, crossOrigin: Unit, quality: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToBlob")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  @scala.inline
  def imgSrcToDataURL(src: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: String, quality: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: String, crossOrigin: Unit, quality: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: Unit, crossOrigin: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: Unit, crossOrigin: String, quality: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def imgSrcToDataURL(src: String, `type`: Unit, crossOrigin: Unit, quality: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("imgSrcToDataURL")(src.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def revokeObjectURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
