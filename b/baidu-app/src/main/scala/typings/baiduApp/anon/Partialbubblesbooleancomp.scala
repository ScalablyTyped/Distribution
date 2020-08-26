package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  bubbles :boolean,   composed :boolean,   capturePhase :boolean}> */
@js.native
trait Partialbubblesbooleancomp extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.native
  var capturePhase: js.UndefOr[Boolean] = js.native
  var composed: js.UndefOr[Boolean] = js.native
}

object Partialbubblesbooleancomp {
  @scala.inline
  def apply(): Partialbubblesbooleancomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialbubblesbooleancomp]
  }
  @scala.inline
  implicit class PartialbubblesbooleancompOps[Self <: Partialbubblesbooleancomp] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    @scala.inline
    def setCapturePhase(value: Boolean): Self = this.set("capturePhase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapturePhase: Self = this.set("capturePhase", js.undefined)
    @scala.inline
    def setComposed(value: Boolean): Self = this.set("composed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposed: Self = this.set("composed", js.undefined)
  }
  
}

