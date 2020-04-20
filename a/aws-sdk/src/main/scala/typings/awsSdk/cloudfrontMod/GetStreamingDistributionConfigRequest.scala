package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamingDistributionConfigRequest extends js.Object {
  /**
    * The streaming distribution's ID.
    */
  var Id: String = js.native
}

object GetStreamingDistributionConfigRequest {
  @scala.inline
  def apply(Id: String): GetStreamingDistributionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionConfigRequest]
  }
}

