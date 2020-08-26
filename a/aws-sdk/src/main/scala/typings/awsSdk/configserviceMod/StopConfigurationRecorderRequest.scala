package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopConfigurationRecorderRequest extends js.Object {
  /**
    * The name of the recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorderName: RecorderName = js.native
}

object StopConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): StopConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopConfigurationRecorderRequest]
  }
  @scala.inline
  implicit class StopConfigurationRecorderRequestOps[Self <: StopConfigurationRecorderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationRecorderName(value: RecorderName): Self = this.set("ConfigurationRecorderName", value.asInstanceOf[js.Any])
  }
  
}

