package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convert any .png file (or .gif, see below) to an ANSI image and display it as an element.
  */
@JSImport("blessed", "Widgets.OverlayImageElement")
@js.native
class OverlayImageElement () extends BoxElement {
  def this(options: OverlayImageOptions) = this()
  
  /**
    * clear the current image.
    */
  def clearImage(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * get the pixel to cell ratio for the terminal.
    */
  def getPixelRatio(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * get the size of an image file in pixels.
    */
  def imageSize(img: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSName("options")
  var options_OverlayImageElement: OverlayImageOptions = js.native
  
  /**
    * set the image in the box to a new path.
    */
  def setImage(img: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * get the size of the terminal in pixels.
    */
  def termSize(callback: js.Function0[Unit]): Unit = js.native
}
