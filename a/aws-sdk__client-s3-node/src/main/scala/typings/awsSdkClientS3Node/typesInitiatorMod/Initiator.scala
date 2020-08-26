package typings.awsSdkClientS3Node.typesInitiatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initiator extends js.Object {
  /**
    * <p>Name of the Principal.</p>
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * <p>If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.</p>
    */
  var ID: js.UndefOr[String] = js.native
}

object Initiator {
  @scala.inline
  def apply(): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initiator]
  }
  @scala.inline
  implicit class InitiatorOps[Self <: Initiator] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
  }
  
}

