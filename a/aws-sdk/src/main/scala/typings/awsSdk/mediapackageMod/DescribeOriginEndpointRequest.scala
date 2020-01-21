package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOriginEndpointRequest extends js.Object {
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: string = js.native
}

object DescribeOriginEndpointRequest {
  @scala.inline
  def apply(Id: string): DescribeOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeOriginEndpointRequest]
  }
}

