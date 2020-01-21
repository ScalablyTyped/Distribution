package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  /**
    * The grantee.
    */
  var Grantee: js.UndefOr[typings.awsSdk.glacierMod.Grantee] = js.native
  /**
    * Specifies the permission given to the grantee. 
    */
  var Permission: js.UndefOr[typings.awsSdk.glacierMod.Permission] = js.native
}

object Grant {
  @scala.inline
  def apply(Grantee: Grantee = null, Permission: Permission = null): Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grant]
  }
}

