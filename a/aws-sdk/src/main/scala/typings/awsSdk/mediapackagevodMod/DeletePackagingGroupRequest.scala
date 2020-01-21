package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePackagingGroupRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD PackagingGroup resource to delete.
    */
  var Id: string = js.native
}

object DeletePackagingGroupRequest {
  @scala.inline
  def apply(Id: string): DeletePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePackagingGroupRequest]
  }
}

