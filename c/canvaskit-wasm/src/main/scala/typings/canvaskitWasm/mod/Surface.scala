package typings.canvaskitWasm.mod

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Surface
  extends StObject
     with EmbindObject[Surface] {
  
  /**
    * Clean up the surface and any extra memory.
    * [Deprecated]: In the future, calls to delete() will be sufficient to clean up the memory.
    */
  def dispose(): Unit = js.native
  
  /**
    * A convenient way to draw exactly once on the canvas associated with this surface.
    * This requires an environment where a global function called requestAnimationFrame is
    * available (e.g. on the web, not on Node). Users do not need to flush the surface,
    * or delete/dispose of it as that is taken care of automatically with this wrapper.
    *
    * Node users should call getCanvas() and work with that canvas directly.
    */
  def drawOnce(drawFrame: js.Function1[/* _ */ Canvas, Unit]): Unit = js.native
  
  /**
    * Make sure any queued draws are sent to the screen or the GPU.
    */
  def flush(): Unit = js.native
  
  /**
    * Return a canvas that is backed by this surface. Any draws to the canvas will (eventually)
    * show up on the surface. The returned canvas is owned by the surface and does NOT need to
    * be cleaned up by the client.
    */
  def getCanvas(): Canvas = js.native
  
  /**
    * Returns the height of this surface in pixels.
    */
  def height(): Double = js.native
  
  /**
    * Returns the ImageInfo associated with this surface.
    */
  def imageInfo(): ImageInfo = js.native
  
  /**
    * Creates an Image from the provided texture and info. The Image will own the texture;
    * when the image is deleted, the texture will be cleaned up.
    * @param tex
    * @param info - describes the content of the texture.
    */
  def makeImageFromTexture(tex: WebGLTexture, info: ImageInfo): Image | Null = js.native
  
  /**
    * Returns a texture-backed image based on the content in src. It uses RGBA_8888, unpremul
    * and SRGB - for more control, use makeImageFromTexture.
    *
    * The underlying texture for this image will be created immediately from src, so
    * it can be disposed of after this call. This image will *only* be usable for this
    * surface (because WebGL textures are not transferable to other WebGL contexts).
    * For an image that can be used across multiple surfaces, at the cost of being lazily
    * loaded, see MakeLazyImageFromTextureSource.
    *
    * Not available for software-backed surfaces.
    * @param src
    * @param info - If provided, will be used to determine the width/height/format of the
    *               source image. If not, sensible defaults will be used.
    * @param srcIsPremul - set to true if the src data has premultiplied alpha. Otherwise, it will
    *               be assumed to be Unpremultiplied. Note: if this is true and info specifies
    *               Unpremul, Skia will not convert the src pixels first.
    */
  def makeImageFromTextureSource(src: TextureSource): Image | Null = js.native
  def makeImageFromTextureSource(src: TextureSource, info: Unit, srcIsPremul: Boolean): Image | Null = js.native
  def makeImageFromTextureSource(src: TextureSource, info: ImageInfo): Image | Null = js.native
  def makeImageFromTextureSource(src: TextureSource, info: ImageInfo, srcIsPremul: Boolean): Image | Null = js.native
  def makeImageFromTextureSource(src: TextureSource, info: PartialImageInfo): Image | Null = js.native
  def makeImageFromTextureSource(src: TextureSource, info: PartialImageInfo, srcIsPremul: Boolean): Image | Null = js.native
  
  /**
    * Returns current contents of the surface as an Image. This image will be optimized to be
    * drawn to another surface of the same type. For example, if this surface is backed by the
    * GPU, the returned Image will be backed by a GPU texture.
    */
  def makeImageSnapshot(): Image = js.native
  def makeImageSnapshot(bounds: InputIRect): Image = js.native
  
  /**
    * Returns a compatible Surface, haring the same raster or GPU properties of the original.
    * The pixels are not shared.
    * @param info - width, height, etc of the Surface.
    */
  def makeSurface(info: ImageInfo): Surface = js.native
  
  /**
    * Returns if this Surface is a GPU-backed surface or not.
    */
  def reportBackendTypeIsGPU(): Boolean = js.native
  
  /**
    * A convenient way to draw multiple frames on the canvas associated with this surface.
    * This requires an environment where a global function called requestAnimationFrame is
    * available (e.g. on the web, not on Node). Users do not need to flush the surface,
    * as that is taken care of automatically with this wrapper.
    *
    * Users should probably call surface.requestAnimationFrame in the callback function to
    * draw multiple frames, e.g. of an animation.
    *
    * Node users should call getCanvas() and work with that canvas directly.
    */
  def requestAnimationFrame(drawFrame: js.Function1[/* _ */ Canvas, Unit]): Unit = js.native
  
  /**
    * If this surface is GPU-backed, return the sample count of the surface.
    */
  def sampleCnt(): Double = js.native
  
  /**
    * Updates the underlying GPU texture of the image to be the contents of the provided
    * TextureSource. Has no effect on CPU backend or if img was not created with either
    * makeImageFromTextureSource or makeImageFromTexture.
    * If the provided TextureSource is of different dimensions than the Image, the contents
    * will be deformed (e.g. squished). The ColorType, AlphaType, and ColorSpace of src should
    * match the original settings used to create the Image or it may draw strange.
    *
    * @param img - A texture-backed Image.
    * @param src - A valid texture source of any dimensions.
    * @param srcIsPremul - set to true if the src data has premultiplied alpha. Otherwise, it will
    *               be assumed to be Unpremultiplied. Note: if this is true and the image was
    *               created with Unpremul, Skia will not convert.
    */
  def updateTextureFromSource(img: Image, src: TextureSource): Unit = js.native
  def updateTextureFromSource(img: Image, src: TextureSource, srcIsPremul: Boolean): Unit = js.native
  
  /**
    * Returns the width of this surface in pixels.
    */
  def width(): Double = js.native
}
