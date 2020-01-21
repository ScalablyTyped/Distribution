package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointInput extends js.Object {
  /**
    * EndpointArn of endpoint to delete.
    */
  var EndpointArn: String = js.native
}

object DeleteEndpointInput {
  @scala.inline
  def apply(EndpointArn: String): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEndpointInput]
  }
}

