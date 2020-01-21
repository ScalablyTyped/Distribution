package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVolumeResult extends js.Object {
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typings.awsSdk.ec2Mod.ConversionTask] = js.native
}

object ImportVolumeResult {
  @scala.inline
  def apply(ConversionTask: ConversionTask = null): ImportVolumeResult = {
    val __obj = js.Dynamic.literal()
    if (ConversionTask != null) __obj.updateDynamic("ConversionTask")(ConversionTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVolumeResult]
  }
}

