package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkSurface
  extends StObject
     with EmbindObject[SkSurface] {
  
  /**
    * Call the given callback and save the result of that draw to a SkPicture with the
    * same dimensions as this surface. The SkPicture will be returned.
    * @param drawFrame - callback in which the client should draw something.
    */
  def captureFrameAsSkPicture(drawFrame: js.Function1[/* canvas */ SkCanvas, Unit]): SkPicture = js.native
  
  /**
    * Clean up the surface and any extra memory.
    * [Deprecated]: In the future, calls to delete() will be sufficient to clean up the memory.
    */
  def dispose(): Unit = js.native
  
  /**
    * Make sure any queued draws are sent to the screen or the GPU.
    */
  def flush(): Unit = js.native
  
  /**
    * Return a canvas that is backed by this surface. Any draws to the canvas will (eventually)
    * show up on the surface. The returned canvas is owned by the surface and does NOT need to
    * be cleaned up by the client.
    */
  def getCanvas(): SkCanvas = js.native
  
  /**
    * Returns the height of this surface in pixels.
    */
  def height(): Double = js.native
  
  /**
    * Returns the ImageInfo associated with this surface.
    */
  def imageInfo(): SkImageInfo = js.native
  
  /**
    * Returns current contents of the surface as an SkImage. This image will be optimized to be
    * drawn to another surface of the same type. For example, if this surface is backed by the
    * GPU, the returned SkImage will be backed by a GPU texture.
    */
  def makeImageSnapshot(): SkImage = js.native
  def makeImageSnapshot(bounds: InputIRect): SkImage = js.native
  
  /**
    * Returns a compatible SkSurface, haring the same raster or GPU properties of the original.
    * The pixels are not shared.
    * @param info - width, height, etc of the SkSurface.
    */
  def makeSurface(info: SkImageInfo): SkSurface = js.native
  
  /**
    * Returns if this Surface is a GPU-backed surface or not.
    */
  def reportBackendTypeIsGPU(): Boolean = js.native
  
  /**
    * If this surface is GPU-backed, return the sample count of the surface.
    */
  def sampleCnt(): Double = js.native
  
  /**
    * Returns the width of this surface in pixels.
    */
  def width(): Double = js.native
}
