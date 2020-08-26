package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRecipeRequest extends js.Object {
  /**
    * The block device mappings of the image recipe. 
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.native
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    * The components of the image recipe. 
    */
  var components: ComponentConfigurationList = js.native
  /**
    *  The description of the image recipe. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The name of the image recipe. 
    */
  var name: ResourceName = js.native
  /**
    * The parent image of the image recipe. The value of the string can be the ARN of the parent image or an AMI ID. The format for the ARN follows this example: arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x. The ARN ends with /20xx.x.x, which communicates to EC2 Image Builder that you want to use the latest AMI created in 20xx (year). You can provide the specific version that you want to use, or you can use a wildcard in all of the fields. If you enter an AMI ID for the string value, you must have access to the AMI, and the AMI must be in the same Region in which you are using Image Builder. 
    */
  var parentImage: NonEmptyString = js.native
  /**
    * The semantic version of the image recipe. 
    */
  var semanticVersion: VersionNumber = js.native
  /**
    *  The tags of the image recipe. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The working directory to be used during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.native
}

object CreateImageRecipeRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    components: ComponentConfigurationList,
    name: ResourceName,
    parentImage: NonEmptyString,
    semanticVersion: VersionNumber
  ): CreateImageRecipeRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentImage = parentImage.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRecipeRequest]
  }
  @scala.inline
  implicit class CreateImageRecipeRequestOps[Self <: CreateImageRecipeRequest] (val x: Self) extends AnyVal {
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentsVarargs(value: ComponentConfiguration*): Self = this.set("components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: ComponentConfigurationList): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentImage(value: NonEmptyString): Self = this.set("parentImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticVersion(value: VersionNumber): Self = this.set("semanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = this.set("blockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = this.set("blockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("blockDeviceMappings", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setWorkingDirectory(value: NonEmptyString): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
  
}

