package typings
package cropperjsLib.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cropperjs extends js.Object {
  /**
    * Clear the crop box.
    */
  def clear(): scala.Unit = js.native
  /**
    * Show the crop box manually.
    */
  def crop(): scala.Unit = js.native
  /**
    * Destroy the cropper and remove the instance from the image.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Disable (freeze) the cropper
    */
  def disable(): scala.Unit = js.native
  /**
    * Enable (unfreeze) the cropper.
    */
  def enable(): scala.Unit = js.native
  /**
    * Output the canvas (image wrapper) position and size data.
    */
  def getCanvasData(): cropperjsLib.cropperjsMod.cropperjsNs.CanvasData with cropperjsLib.Anon_NaturalHeight = js.native
  /**
    * Output the container size data.
    */
  def getContainerData(): cropperjsLib.cropperjsMod.cropperjsNs.ContainerData = js.native
  /**
    * Output the crop box position and size data.
    */
  def getCropBoxData(): cropperjsLib.cropperjsMod.cropperjsNs.CropBoxData = js.native
  /**
    * Get a canvas drawn the cropped image.
    */
  def getCroppedCanvas(): stdLib.HTMLCanvasElement = js.native
  def getCroppedCanvas(options: cropperjsLib.cropperjsMod.cropperjsNs.CroppedCanvasOptions): stdLib.HTMLCanvasElement = js.native
  /**
    * Output the cropped area position and size data (base on the original image).
    */
  def getData(): cropperjsLib.cropperjsMod.cropperjsNs.Data = js.native
  def getData(rounded: scala.Boolean): cropperjsLib.cropperjsMod.cropperjsNs.Data = js.native
  /**
    * Output the image position, size and other related data.
    */
  def getImageData(): cropperjsLib.cropperjsMod.cropperjsNs.ImageData = js.native
  /**
    * Move the canvas (image wrapper) with relative offsets.
    * @param offsetX Moving size (px) in the horizontal direction.
    * @param offsetY Moving size (px) in the vertical direction.
    * If not present, its default value is offsetX.
    */
  def move(offsetX: scala.Double): scala.Unit = js.native
  def move(offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  /**
    * Move the canvas (image wrapper) to an absolute point.
    * @param x The left value of the canvas
    * @param y The top value of the canvas
    * If not present, its default value is x.
    */
  def moveTo(x: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Replace the image's src and rebuild the cropper.
    * @param url A new image url
    * @param hasSameSize If the new image has the same size with the old one, then it will not rebuilt the cropper and only update the urls of all related images. (Default: false)
    */
  def replace(url: java.lang.String): scala.Unit = js.native
  def replace(url: java.lang.String, hasSameSize: scala.Boolean): scala.Unit = js.native
  /**
    * Clear the crop box.
    */
  def reset(): scala.Unit = js.native
  /**
    * Rotate the canvas (image wrapper) with a relative degree.
    * Rotate right: requires a positive number (degree > 0)
    * Rotate left: requires a negative number (degree < 0)
    */
  def rotate(degree: scala.Double): scala.Unit = js.native
  /**
    * Rotate the canvas (image wrapper) to an absolute degree.
    * Rotate right: requires a positive number (degree > 0)
    * Rotate left: requires a negative number (degree < 0)
    */
  def rotateTo(degree: scala.Double): scala.Unit = js.native
  /**
    * Scale the image.
    */
  def scale(scaleX: scala.Double): scala.Unit = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double): scala.Unit = js.native
  /**
    * Scale the abscissa of the image.
    */
  def scaleX(scaleX: scala.Double): scala.Unit = js.native
  /**
    * Scale the ordinate of the image.
    */
  def scaleY(scaleY: scala.Double): scala.Unit = js.native
  /**
    * Change the aspect ratio of the crop box.
    */
  def setAspectRatio(aspectRatio: scala.Double): scala.Unit = js.native
  /**
    * Change the canvas (image wrapper) position and size with new data.
    */
  def setCanvasData(data: stdLib.Partial[cropperjsLib.cropperjsMod.cropperjsNs.CanvasData]): scala.Unit = js.native
  /**
    * Change the crop box position and size with new data.
    */
  def setCropBoxData(data: stdLib.Partial[cropperjsLib.cropperjsMod.cropperjsNs.CropBoxData]): scala.Unit = js.native
  /**
    * Change the cropped area position and size with new data (base on the original image).
    */
  def setData(data: stdLib.Partial[cropperjsLib.cropperjsMod.cropperjsNs.Data]): scala.Unit = js.native
  /**
    * Change the drag mode.
    */
  def setDragMode(): scala.Unit = js.native
  @JSName("setDragMode")
  def setDragMode_crop(mode: cropperjsLib.cropperjsLibStrings.crop): scala.Unit = js.native
  @JSName("setDragMode")
  def setDragMode_move(mode: cropperjsLib.cropperjsLibStrings.move): scala.Unit = js.native
  @JSName("setDragMode")
  def setDragMode_none(mode: cropperjsLib.cropperjsLibStrings.none): scala.Unit = js.native
  /**
    * Zoom the canvas (image wrapper) with a relative ratio.
    * Zoom in: requires a positive number (ratio > 0)
    * Zoom out: requires a negative number (ratio < 0)
    */
  def zoom(ratio: scala.Double): scala.Unit = js.native
  /**
    * Zoom the canvas (image wrapper) to an absolute ratio.
    * Zoom in: requires a positive number (ratio > 0)
    * Zoom out: requires a negative number (ratio < 0)
    */
  def zoomTo(ratio: scala.Double): scala.Unit = js.native
}

