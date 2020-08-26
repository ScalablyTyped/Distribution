package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlTranslation extends js.Object {
  /**
    * Specifies the replica ownership. For default and valid values, see PUT bucket replication in the Amazon Simple Storage Service API Reference.
    */
  var Owner: OwnerOverride = js.native
}

object AccessControlTranslation {
  @scala.inline
  def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlTranslation]
  }
  @scala.inline
  implicit class AccessControlTranslationOps[Self <: AccessControlTranslation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOwner(value: OwnerOverride): Self = this.set("Owner", value.asInstanceOf[js.Any])
  }
  
}

