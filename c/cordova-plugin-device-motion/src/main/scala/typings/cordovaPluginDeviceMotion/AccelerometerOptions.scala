package typings.cordovaPluginDeviceMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object with options for watchAcceleration */
@js.native
trait AccelerometerOptions extends js.Object {
  /** How often to retrieve the Acceleration in milliseconds. (Default: 10000) */
  var frequency: js.UndefOr[Double] = js.native
}

object AccelerometerOptions {
  @scala.inline
  def apply(): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerOptions]
  }
  @scala.inline
  implicit class AccelerometerOptionsOps[Self <: AccelerometerOptions] (val x: Self) extends AnyVal {
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
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
  }
  
}

