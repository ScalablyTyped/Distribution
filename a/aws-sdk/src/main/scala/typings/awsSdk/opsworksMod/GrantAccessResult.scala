package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantAccessResult extends js.Object {
  /**
    * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
    */
  var TemporaryCredential: js.UndefOr[typings.awsSdk.opsworksMod.TemporaryCredential] = js.native
}

object GrantAccessResult {
  @scala.inline
  def apply(): GrantAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantAccessResult]
  }
  @scala.inline
  implicit class GrantAccessResultOps[Self <: GrantAccessResult] (val x: Self) extends AnyVal {
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
    def setTemporaryCredential(value: TemporaryCredential): Self = this.set("TemporaryCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporaryCredential: Self = this.set("TemporaryCredential", js.undefined)
  }
  
}

