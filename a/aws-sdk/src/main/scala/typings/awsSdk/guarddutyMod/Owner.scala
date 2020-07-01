package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Owner extends js.Object {
  /**
    * The canonical user ID of the bucket owner. For information about locating your canonical user ID see Finding Your Account Canonical User ID. 
    */
  var Id: js.UndefOr[String] = js.native
}

object Owner {
  @scala.inline
  def apply(Id: String = null): Owner = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

