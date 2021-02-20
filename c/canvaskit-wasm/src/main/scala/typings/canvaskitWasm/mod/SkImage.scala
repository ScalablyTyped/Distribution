package typings.canvaskitWasm.mod

import typings.std.Float32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkImage extends EmbindObject[SkImage] {
  
  /**
    * Encodes this image's pixels to PNG and returns them. Must be built with the PNG codec.
    */
  def encodeToData(): SkData = js.native
  
  /**
    * Encodes this image's pixels to the specified format and returns them. Must be built with
    * the specified codec.
    * @param fmt
    * @param quality - a value from 0 to 100; 100 is the least lossy. May be ignored.
    */
  def encodeToDataWithFormat(fmt: EncodedImageFormat, quality: Double): SkData = js.native
  
  /**
    * Return the height in pixels of the image.
    */
  def height(): Double = js.native
  
  /**
    * Returns this image as a shader with the specified tiling.
    * @param tx - tile mode in the x direction.
    * @param ty - tile mode in the y direction.
    * @param localMatrix
    */
  def makeShader(tx: TileMode, ty: TileMode): SkShader = js.native
  def makeShader(tx: TileMode, ty: TileMode, localMatrix: InputMatrix): SkShader = js.native
  
  /**
    * Returns a TypedArray containing the pixels reading starting at (srcX, srcY) and does not
    * exceed the size indicated by imageInfo. See SkImage.h for more on the caveats.
    *
    * @param imageInfo - describes the destination format of the pixels.
    * @param srcX
    * @param srcY
    * @returns a Uint8Array if RGB_8888 was requested, Float32Array if RGBA_F32 was requested.
    */
  def readPixels(imageInfo: SkImageInfo, srcX: Double, srcY: Double): Uint8Array | Float32Array | Null = js.native
  
  /**
    * Return the width in pixels of the image.
    */
  def width(): Double = js.native
}
