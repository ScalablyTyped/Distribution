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
  var ResolvedImage: js.UndefOr[ContainerImage] = js.native
  /**
    * The image path you specified when you created the model.
    */
  var SpecifiedImage: js.UndefOr[ContainerImage] = js.native
}

object DeployedImage {
  @scala.inline
  def apply(): DeployedImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedImage]
  }
  @scala.inline
  implicit class DeployedImageOps[Self <: DeployedImage] (val x: Self) extends AnyVal {
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
    def setResolutionTime(value: Timestamp): Self = this.set("ResolutionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionTime: Self = this.set("ResolutionTime", js.undefined)
    @scala.inline
    def setResolvedImage(value: ContainerImage): Self = this.set("ResolvedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedImage: Self = this.set("ResolvedImage", js.undefined)
    @scala.inline
    def setSpecifiedImage(value: ContainerImage): Self = this.set("SpecifiedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecifiedImage: Self = this.set("SpecifiedImage", js.undefined)
  }
  
}

