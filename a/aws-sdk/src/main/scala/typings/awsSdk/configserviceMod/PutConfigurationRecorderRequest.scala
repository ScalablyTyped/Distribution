package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationRecorderRequest extends js.Object {
  /**
    * The configuration recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorder: typings.awsSdk.configserviceMod.ConfigurationRecorder = js.native
}

object PutConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorder: ConfigurationRecorder): PutConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorder = ConfigurationRecorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationRecorderRequest]
  }
}

