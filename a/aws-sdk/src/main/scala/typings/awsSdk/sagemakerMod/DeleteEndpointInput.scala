package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointInput extends js.Object {
  /**
    * The name of the endpoint that you want to delete.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
}

object DeleteEndpointInput {
  @scala.inline
  def apply(EndpointName: EndpointName): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEndpointInput]
  }
}

