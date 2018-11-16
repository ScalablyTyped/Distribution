package typings
package blobDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blob-util", JSImport.Namespace)
@js.native
object blobDashUtilMod extends js.Object {
  def arrayBufferToBlob(arrayBuff: stdLib.ArrayBuffer): stdLib.Promise[stdLib.Blob] = js.native
  def arrayBufferToBlob(arrayBuff: stdLib.ArrayBuffer, `type`: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def base64StringToBlob(base64: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def base64StringToBlob(base64: java.lang.String, `type`: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def binaryStringToBlob(binary: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def binaryStringToBlob(binary: java.lang.String, `type`: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def blobToArrayBuffer(blob: stdLib.Blob): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def blobToBase64String(blob: stdLib.Blob): stdLib.Promise[java.lang.String] = js.native
  def blobToBinaryString(blob: stdLib.Blob): stdLib.Promise[java.lang.String] = js.native
  def blobToDataURL(blob: stdLib.Blob): stdLib.Promise[java.lang.String] = js.native
  def canvasToBlob(canvas: stdLib.HTMLCanvasElement): stdLib.Promise[stdLib.Blob] = js.native
  def canvasToBlob(canvas: stdLib.HTMLCanvasElement, `type`: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def canvasToBlob(canvas: stdLib.HTMLCanvasElement, `type`: java.lang.String, quality: scala.Double): stdLib.Promise[stdLib.Blob] = js.native
  def createBlob(parts: js.Array[_]): stdLib.Blob = js.native
  def createBlob(parts: js.Array[_], options: blobDashUtilLib.Anon_Type): stdLib.Blob = js.native
  def createObjectURL(blob: stdLib.Blob): java.lang.String = js.native
  def dataURLToBlob(dataURL: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def imgSrcToBlob(src: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def imgSrcToBlob(src: java.lang.String, `type`: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def imgSrcToBlob(src: java.lang.String, `type`: java.lang.String, crossOrigin: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def imgSrcToBlob(
    src: java.lang.String,
    `type`: java.lang.String,
    crossOrigin: java.lang.String,
    quality: scala.Double
  ): stdLib.Promise[stdLib.Blob] = js.native
  def imgSrcToDataURL(src: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def imgSrcToDataURL(src: java.lang.String, `type`: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def imgSrcToDataURL(src: java.lang.String, `type`: java.lang.String, crossOrigin: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def imgSrcToDataURL(
    src: java.lang.String,
    `type`: java.lang.String,
    crossOrigin: java.lang.String,
    quality: scala.Double
  ): stdLib.Promise[java.lang.String] = js.native
  def revokeObjectURL(url: java.lang.String): scala.Unit = js.native
}

