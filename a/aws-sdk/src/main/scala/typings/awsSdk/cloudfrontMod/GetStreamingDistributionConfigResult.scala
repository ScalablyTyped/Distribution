package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamingDistributionConfigResult extends js.Object {
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL. 
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistributionConfig] = js.native
}

object GetStreamingDistributionConfigResult {
  @scala.inline
  def apply(ETag: String = null, StreamingDistributionConfig: StreamingDistributionConfig = null): GetStreamingDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (StreamingDistributionConfig != null) __obj.updateDynamic("StreamingDistributionConfig")(StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionConfigResult]
  }
}

