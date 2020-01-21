package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionRequest extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsSdk.cloudfrontMod.DistributionConfig = js.native
}

object CreateDistributionRequest {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig): CreateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDistributionRequest]
  }
}

