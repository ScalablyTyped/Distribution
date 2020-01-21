package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNamespaceRequest extends js.Object {
  /**
    * The ID of the namespace that you want to delete.
    */
  var Id: ResourceId = js.native
}

object DeleteNamespaceRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNamespaceRequest]
  }
}

