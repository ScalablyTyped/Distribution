package typings.cordovaPluginCanvascamera

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var dHeight: Double
  var dWidth: Double
  var dx: Double
  var dy: Double
  var element: HTMLCanvasElement
  var image: HTMLImageElement
  var sHeight: Double
  var sWidth: Double
  var sx: Double
  var sy: Double
  def initialize(): Frame
  def recycle(): Unit
}

object Frame {
  @scala.inline
  def apply(
    dHeight: Double,
    dWidth: Double,
    dx: Double,
    dy: Double,
    element: HTMLCanvasElement,
    image: HTMLImageElement,
    initialize: () => Frame,
    recycle: () => Unit,
    sHeight: Double,
    sWidth: Double,
    sx: Double,
    sy: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(dHeight = dHeight.asInstanceOf[js.Any], dWidth = dWidth.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], initialize = js.Any.fromFunction0(initialize), recycle = js.Any.fromFunction0(recycle), sHeight = sHeight.asInstanceOf[js.Any], sWidth = sWidth.asInstanceOf[js.Any], sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

