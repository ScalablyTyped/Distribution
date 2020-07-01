package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixListAssociation extends js.Object {
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The owner of the resource.
    */
  var ResourceOwner: js.UndefOr[String] = js.native
}

object PrefixListAssociation {
  @scala.inline
  def apply(ResourceId: String = null, ResourceOwner: String = null): PrefixListAssociation = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceOwner != null) __obj.updateDynamic("ResourceOwner")(ResourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixListAssociation]
  }
}

