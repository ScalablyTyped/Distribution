package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployedImage extends js.Object {
  /**
    * The date and time when the image path for the model resolved to the ResolvedImage 
    */
  var ResolutionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The specific digest path of the image hosted in this ProductionVariant.
    */
  var ResolvedImage: js.UndefOr[Image] = js.native
  /**
    * The image path you specified when you created the model.
    */
  var SpecifiedImage: js.UndefOr[Image] = js.native
}

object DeployedImage {
  @scala.inline
  def apply(ResolutionTime: Timestamp = null, ResolvedImage: Image = null, SpecifiedImage: Image = null): DeployedImage = {
    val __obj = js.Dynamic.literal()
    if (ResolutionTime != null) __obj.updateDynamic("ResolutionTime")(ResolutionTime.asInstanceOf[js.Any])
    if (ResolvedImage != null) __obj.updateDynamic("ResolvedImage")(ResolvedImage.asInstanceOf[js.Any])
    if (SpecifiedImage != null) __obj.updateDynamic("SpecifiedImage")(SpecifiedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployedImage]
  }
}

