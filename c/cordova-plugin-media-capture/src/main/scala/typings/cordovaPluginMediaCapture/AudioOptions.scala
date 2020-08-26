package typings.cordovaPluginMediaCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates audio capture configuration options. */
@js.native
trait AudioOptions extends js.Object {
  /** The maximum duration of a audio clip, in seconds. */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The maximum number of audio clips the device's user can capture in a single
    * capture operation. The value must be greater than or equal to 1.
    */
  var limit: js.UndefOr[Double] = js.native
}

object AudioOptions {
  @scala.inline
  def apply(): AudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioOptions]
  }
  @scala.inline
  implicit class AudioOptionsOps[Self <: AudioOptions] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

