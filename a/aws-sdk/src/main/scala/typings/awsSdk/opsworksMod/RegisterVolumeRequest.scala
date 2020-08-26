package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterVolumeRequest extends js.Object {
  /**
    * The Amazon EBS volume ID.
    */
  var Ec2VolumeId: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object RegisterVolumeRequest {
  @scala.inline
  def apply(StackId: String): RegisterVolumeRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterVolumeRequest]
  }
  @scala.inline
  implicit class RegisterVolumeRequestOps[Self <: RegisterVolumeRequest] (val x: Self) extends AnyVal {
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
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEc2VolumeId(value: String): Self = this.set("Ec2VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2VolumeId: Self = this.set("Ec2VolumeId", js.undefined)
  }
  
}

