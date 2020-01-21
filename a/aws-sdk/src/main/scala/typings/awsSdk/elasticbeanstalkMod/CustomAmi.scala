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
  def apply(ImageId: ImageId = null, VirtualizationType: VirtualizationType = null): CustomAmi = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAmi]
  }
}

