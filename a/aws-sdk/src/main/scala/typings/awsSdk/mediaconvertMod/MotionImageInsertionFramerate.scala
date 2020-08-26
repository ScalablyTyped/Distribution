package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionImageInsertionFramerate extends js.Object {
  /**
    * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 1.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max17895697] = js.native
  /**
    * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 24.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483640] = js.native
}

object MotionImageInsertionFramerate {
  @scala.inline
  def apply(): MotionImageInsertionFramerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionImageInsertionFramerate]
  }
  @scala.inline
  implicit class MotionImageInsertionFramerateOps[Self <: MotionImageInsertionFramerate] (val x: Self) extends AnyVal {
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
    def setFramerateDenominator(value: integerMin1Max17895697): Self = this.set("FramerateDenominator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateDenominator: Self = this.set("FramerateDenominator", js.undefined)
    @scala.inline
    def setFramerateNumerator(value: integerMin1Max2147483640): Self = this.set("FramerateNumerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateNumerator: Self = this.set("FramerateNumerator", js.undefined)
  }
  
}

