package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAmi extends js.Object {
  /**
    * THe ID of the image used to create the custom AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ImageId] = js.native
  /**
    * The type of virtualization used to create the custom AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VirtualizationType] = js.native
}

object CustomAmi {
  @scala.inline
  def apply(): CustomAmi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAmi]
  }
  @scala.inline
  implicit class CustomAmiOps[Self <: CustomAmi] (val x: Self) extends AnyVal {
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
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = this.set("VirtualizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationType: Self = this.set("VirtualizationType", js.undefined)
  }
  
}

