package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringOutput extends js.Object {
  /**
    * The Amazon S3 storage location where the results of a monitoring job are saved.
    */
  var S3Output: MonitoringS3Output = js.native
}

object MonitoringOutput {
  @scala.inline
  def apply(S3Output: MonitoringS3Output): MonitoringOutput = {
    val __obj = js.Dynamic.literal(S3Output = S3Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutput]
  }
}

