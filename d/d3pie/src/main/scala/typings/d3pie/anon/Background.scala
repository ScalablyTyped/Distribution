package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var background: js.UndefOr[String] = js.native
  var segmentStroke: js.UndefOr[String] = js.native
  var segments: js.UndefOr[js.Array[String]] = js.native
}

object Background {
  @scala.inline
  def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setSegmentStroke(value: String): Self = this.set("segmentStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentStroke: Self = this.set("segmentStroke", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: String*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[String]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
  }
  
}

