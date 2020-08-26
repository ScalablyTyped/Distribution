package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IamInstanceProfile extends js.Object {
  /**
    * The profile ARN of the EC2 instance.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The profile ID of the EC2 instance.
    */
  var Id: js.UndefOr[String] = js.native
}

object IamInstanceProfile {
  @scala.inline
  def apply(): IamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfile]
  }
  @scala.inline
  implicit class IamInstanceProfileOps[Self <: IamInstanceProfile] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

