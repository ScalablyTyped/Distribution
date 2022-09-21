package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image
  extends StObject
     with EmbindObject[Image] {
  
  /**
    * Encodes this image's pixels to the specified format and returns them. Must be built with
    * the specified codec. If the options are unspecified, sensible defaults will be
    * chosen.
    * @param fmt - PNG is the default value.
    * @param quality - a value from 0 to 100; 100 is the least lossy. May be ignored.
    */
  def encodeToBytes(): js.typedarray.Uint8Array | Null = js.native
  def encodeToBytes(fmt: Unit, quality: Double): js.typedarray.Uint8Array | Null = js.native
  def encodeToBytes(fmt: EncodedImageFormat): js.typedarray.Uint8Array | Null = js.native
  def encodeToBytes(fmt: EncodedImageFormat, quality: Double): js.typedarray.Uint8Array | Null = js.native
  
  /**
    * Returns the color space associated with this object.
    * It is the user's responsibility to call delete() on this after it has been used.
    */
  def getColorSpace(): ColorSpace = js.native
  
  /**
    * Returns the width, height, colorType and alphaType associated with this image.
    * Colorspace is separate so as to not accidentally leak that memory.
    */
  def getImageInfo(): PartialImageInfo = js.native
  
  /**
    * Return the height in pixels of the image.
    */
  def height(): Double = js.native
  
  /**
    * Returns an Image with the same "base" pixels as the this image, but with mipmap levels
    * automatically generated and attached.
    */
  def makeCopyWithDefaultMipmaps(): Image = js.native
  
  /**
    * Returns this image as a shader with the specified tiling. It will use cubic sampling.
    * @param tx - tile mode in the x direction.
    * @param ty - tile mode in the y direction.
    * @param B - See CubicResampler in SkSamplingOptions.h for more information
    * @param C - See CubicResampler in SkSamplingOptions.h for more information
    * @param localMatrix
    */
  def makeShaderCubic(tx: TileMode, ty: TileMode, B: Double, C: Double): Shader = js.native
  def makeShaderCubic(tx: TileMode, ty: TileMode, B: Double, C: Double, localMatrix: InputMatrix): Shader = js.native
  
  /**
    * Returns this image as a shader with the specified tiling. It will use cubic sampling.
    * @param tx - tile mode in the x direction.
    * @param ty - tile mode in the y direction.
    * @param fm - The filter mode.
    * @param mm - The mipmap mode. Note: for settings other than None, the image must have mipmaps
    *             calculated with makeCopyWithDefaultMipmaps;
    * @param localMatrix
    */
  def makeShaderOptions(tx: TileMode, ty: TileMode, fm: FilterMode, mm: MipmapMode): Shader = js.native
  def makeShaderOptions(tx: TileMode, ty: TileMode, fm: FilterMode, mm: MipmapMode, localMatrix: InputMatrix): Shader = js.native
  
  /**
    * Returns a TypedArray containing the pixels reading starting at (srcX, srcY) and does not
    * exceed the size indicated by imageInfo. See SkImage.h for more on the caveats.
    *
    * If dest is not provided, we allocate memory equal to the provided height * the provided
    * bytesPerRow to fill the data with.
    *
    * @param srcX
    * @param srcY
    * @param imageInfo - describes the destination format of the pixels.
    * @param dest - If provided, the pixels will be copied into the allocated buffer allowing
    *        access to the pixels without allocating a new TypedArray.
    * @param bytesPerRow - number of bytes per row. Must be provided if dest is set. This
    *        depends on destination ColorType. For example, it must be at least 4 * width for
    *        the 8888 color type.
    * @returns a TypedArray appropriate for the specified ColorType. Note that 16 bit floats are
    *          not supported in JS, so that colorType corresponds to raw bytes Uint8Array.
    */
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo, dest: Unit, bytesPerRow: Double): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo, dest: MallocObj): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo, dest: MallocObj, bytesPerRow: Double): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  
  /**
    * Return the width in pixels of the image.
    */
  def width(): Double = js.native
}
