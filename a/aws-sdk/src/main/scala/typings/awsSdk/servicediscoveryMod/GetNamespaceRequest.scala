package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamespaceRequest extends js.Object {
  /**
    * The ID of the namespace that you want to get information about.
    */
  var Id: ResourceId = js.native
}

object GetNamespaceRequest {
  @scala.inline
  def apply(Id: ResourceId): GetNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceRequest]
  }
}

