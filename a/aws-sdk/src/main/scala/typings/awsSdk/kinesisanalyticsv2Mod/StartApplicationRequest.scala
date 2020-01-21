package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartApplicationRequest extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
    */
  var RunConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.RunConfiguration = js.native
}

object StartApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, RunConfiguration: RunConfiguration): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RunConfiguration = RunConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartApplicationRequest]
  }
}

