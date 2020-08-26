package typings.decodeGif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultType extends js.Object {
  /** Each frame of the gif. */
  var frames: js.Array[FrameType] = js.native
  /** The height of the gif. */
  var height: Double = js.native
  /** The width of the gif. */
  var width: Double = js.native
}

object ResultType {
  @scala.inline
  def apply(frames: js.Array[FrameType], height: Double, width: Double): ResultType = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultType]
  }
  @scala.inline
  implicit class ResultTypeOps[Self <: ResultType] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: FrameType*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[FrameType]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

