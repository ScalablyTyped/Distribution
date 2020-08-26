package typings.cordovaPluginCanvascamera

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var dHeight: Double = js.native
  var dWidth: Double = js.native
  var dx: Double = js.native
  var dy: Double = js.native
  var element: HTMLCanvasElement = js.native
  var image: HTMLImageElement = js.native
  var sHeight: Double = js.native
  var sWidth: Double = js.native
  var sx: Double = js.native
  var sy: Double = js.native
  def initialize(): Frame = js.native
  def recycle(): Unit = js.native
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
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDHeight(value: Double): Self = this.set("dHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDWidth(value: Double): Self = this.set("dWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: HTMLCanvasElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialize(value: () => Frame): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def setRecycle(value: () => Unit): Self = this.set("recycle", js.Any.fromFunction0(value))
    @scala.inline
    def setSHeight(value: Double): Self = this.set("sHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSWidth(value: Double): Self = this.set("sWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSx(value: Double): Self = this.set("sx", value.asInstanceOf[js.Any])
    @scala.inline
    def setSy(value: Double): Self = this.set("sy", value.asInstanceOf[js.Any])
  }
  
}

