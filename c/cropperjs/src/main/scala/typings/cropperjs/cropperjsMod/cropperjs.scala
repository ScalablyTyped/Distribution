package typings.cropperjs.cropperjsMod

import typings.cropperjs.Anon_NaturalHeight
import typings.cropperjs.cropperjsStrings.crop
import typings.cropperjs.cropperjsStrings.move
import typings.cropperjs.cropperjsStrings.none
import typings.std.HTMLCanvasElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cropperjs extends js.Object {
  /**
    * Clear the crop box.
    */
  def clear(): Unit = js.native
  /**
    * Show the crop box manually.
    */
  def crop(): Unit = js.native
  /**
    * Destroy the cropper and remove the instance from the image.
    */
  def destroy(): Unit = js.native
  /**
    * Disable (freeze) the cropper
    */
  def disable(): Unit = js.native
  /**
    * Enable (unfreeze) the cropper.
    */
  def enable(): Unit = js.native
  /**
    * Output the canvas (image wrapper) position and size data.
    */
  def getCanvasData(): CanvasData with Anon_NaturalHeight = js.native
  /**
    * Output the container size data.
    */
  def getContainerData(): ContainerData = js.native
  /**
    * Output the crop box position and size data.
    */
  def getCropBoxData(): CropBoxData = js.native
  /**
    * Get a canvas drawn the cropped image.
    */
  def getCroppedCanvas(): HTMLCanvasElement = js.native
  def getCroppedCanvas(options: CroppedCanvasOptions): HTMLCanvasElement = js.native
  /**
    * Output the cropped area position and size data (base on the original image).
    */
  def getData(): Data = js.native
  def getData(rounded: Boolean): Data = js.native
  /**
    * Output the image position, size and other related data.
    */
  def getImageData(): ImageData = js.native
  /**
    * Move the canvas (image wrapper) with relative offsets.
    * @param offsetX Moving size (px) in the horizontal direction.
    * @param offsetY Moving size (px) in the vertical direction.
    * If not present, its default value is offsetX.
    */
  def move(offsetX: Double): Unit = js.native
  def move(offsetX: Double, offsetY: Double): Unit = js.native
  /**
    * Move the canvas (image wrapper) to an absolute point.
    * @param x The left value of the canvas
    * @param y The top value of the canvas
    * If not present, its default value is x.
    */
  def moveTo(x: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  /**
    * Replace the image's src and rebuild the cropper.
    * @param url A new image url
    * @param hasSameSize If the new image has the same size with the old one, then it will not rebuilt the cropper and only update the urls of all related images. (Default: false)
    */
  def replace(url: String): Unit = js.native
  def replace(url: String, hasSameSize: Boolean): Unit = js.native
  /**
    * Clear the crop box.
    */
  def reset(): Unit = js.native
  /**
    * Rotate the canvas (image wrapper) with a relative degree.
    * Rotate right: requires a positive number (degree > 0)
    * Rotate left: requires a negative number (degree < 0)
    */
  def rotate(degree: Double): Unit = js.native
  /**
    * Rotate the canvas (image wrapper) to an absolute degree.
    * Rotate right: requires a positive number (degree > 0)
    * Rotate left: requires a negative number (degree < 0)
    */
  def rotateTo(degree: Double): Unit = js.native
  /**
    * Scale the image.
    */
  def scale(scaleX: Double): Unit = js.native
  def scale(scaleX: Double, scaleY: Double): Unit = js.native
  /**
    * Scale the abscissa of the image.
    */
  def scaleX(scaleX: Double): Unit = js.native
  /**
    * Scale the ordinate of the image.
    */
  def scaleY(scaleY: Double): Unit = js.native
  /**
    * Change the aspect ratio of the crop box.
    */
  def setAspectRatio(aspectRatio: Double): Unit = js.native
  /**
    * Change the canvas (image wrapper) position and size with new data.
    */
  def setCanvasData(data: Partial[CanvasData]): Unit = js.native
  /**
    * Change the crop box position and size with new data.
    */
  def setCropBoxData(data: Partial[CropBoxData]): Unit = js.native
  /**
    * Change the cropped area position and size with new data (base on the original image).
    */
  def setData(data: Partial[Data]): Unit = js.native
  /**
    * Change the drag mode.
    */
  def setDragMode(): Unit = js.native
  @JSName("setDragMode")
  def setDragMode_crop(mode: crop): Unit = js.native
  @JSName("setDragMode")
  def setDragMode_move(mode: move): Unit = js.native
  @JSName("setDragMode")
  def setDragMode_none(mode: none): Unit = js.native
  /**
    * Zoom the canvas (image wrapper) with a relative ratio.
    * Zoom in: requires a positive number (ratio > 0)
    * Zoom out: requires a negative number (ratio < 0)
    */
  def zoom(ratio: Double): Unit = js.native
  /**
    * Zoom the canvas (image wrapper) to an absolute ratio.
    * Zoom in: requires a positive number (ratio > 0)
    * Zoom out: requires a negative number (ratio < 0)
    */
  def zoomTo(ratio: Double): Unit = js.native
}

