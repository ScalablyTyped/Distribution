package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDevEndpointsRequest extends js.Object {
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: typings.awsSdk.glueMod.DevEndpointNames = js.native
}

object BatchGetDevEndpointsRequest {
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
}

