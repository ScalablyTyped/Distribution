package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ami extends js.Object {
  /**
    *  The description of the EC2 AMI. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The AMI ID of the EC2 AMI. 
    */
  var image: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The name of the EC2 AMI. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The region of the EC2 AMI. 
    */
  var region: js.UndefOr[NonEmptyString] = js.native
  var state: js.UndefOr[ImageState] = js.native
}

object Ami {
  @scala.inline
  def apply(
    description: NonEmptyString = null,
    image: NonEmptyString = null,
    name: NonEmptyString = null,
    region: NonEmptyString = null,
    state: ImageState = null
  ): Ami = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ami]
  }
}

