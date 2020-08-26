package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesIamInstanceProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN).
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.native
}

object ScheduledInstancesIamInstanceProfile {
  @scala.inline
  def apply(): ScheduledInstancesIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesIamInstanceProfile]
  }
  @scala.inline
  implicit class ScheduledInstancesIamInstanceProfileOps[Self <: ScheduledInstancesIamInstanceProfile] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

