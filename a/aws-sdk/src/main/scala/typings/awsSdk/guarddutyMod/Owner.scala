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
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  @scala.inline
  implicit class OwnerOps[Self <: Owner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

