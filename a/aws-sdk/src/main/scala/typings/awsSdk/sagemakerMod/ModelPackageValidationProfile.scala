package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageValidationProfile extends js.Object {
  /**
    * The name of the profile for the model package.
    */
  var ProfileName: EntityName = js.native
  /**
    * The TransformJobDefinition object that describes the transform job used for the validation of the model package.
    */
  var TransformJobDefinition: typings.awsSdk.sagemakerMod.TransformJobDefinition = js.native
}

object ModelPackageValidationProfile {
  @scala.inline
  def apply(ProfileName: EntityName, TransformJobDefinition: TransformJobDefinition): ModelPackageValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName.asInstanceOf[js.Any], TransformJobDefinition = TransformJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageValidationProfile]
  }
  @scala.inline
  implicit class ModelPackageValidationProfileOps[Self <: ModelPackageValidationProfile] (val x: Self) extends AnyVal {
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
    def setProfileName(value: EntityName): Self = this.set("ProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformJobDefinition(value: TransformJobDefinition): Self = this.set("TransformJobDefinition", value.asInstanceOf[js.Any])
  }
  
}

