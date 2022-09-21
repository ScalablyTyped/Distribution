package typings.canvaskitWasm.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmulatedCanvas2D extends StObject {
  
  /**
    * Decodes an image with the given bytes.
    * @param bytes
    */
  def decodeImage(bytes: js.typedarray.ArrayBuffer): Image = js.native
  def decodeImage(bytes: js.typedarray.Uint8Array): Image = js.native
  
  /**
    * Cleans up all resources associated with this emulated canvas.
    */
  def dispose(): Unit = js.native
  
  /**
    * Returns an emulated canvas2d context if type == '2d', null otherwise.
    * @param type
    */
  def getContext(`type`: String): EmulatedCanvas2DContext | Null = js.native
  
  /**
    * Loads the given font with the given descriptors. Emulates new FontFace().
    * @param bytes
    * @param descriptors
    */
  def loadFont(bytes: js.typedarray.ArrayBuffer, descriptors: Record[String, String]): Unit = js.native
  def loadFont(bytes: js.typedarray.Uint8Array, descriptors: Record[String, String]): Unit = js.native
  
  /**
    * Returns an new emulated Path2D object.
    * @param str - an SVG string representing a path.
    */
  def makePath2D(): EmulatedPath2D = js.native
  def makePath2D(str: String): EmulatedPath2D = js.native
  
  /**
    * Returns the current canvas as a base64 encoded image string.
    * @param codec - image/png by default; image/jpeg also supported.
    * @param quality
    */
  def toDataURL(): String = js.native
  def toDataURL(codec: String): String = js.native
  def toDataURL(codec: String, quality: Double): String = js.native
  def toDataURL(codec: Unit, quality: Double): String = js.native
}
