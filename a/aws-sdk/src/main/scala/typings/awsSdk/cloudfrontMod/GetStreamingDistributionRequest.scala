package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's ID.
    */
  var Id: String = js.native
}

object GetStreamingDistributionRequest {
  @scala.inline
  def apply(Id: String): GetStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStreamingDistributionRequest]
  }
}

