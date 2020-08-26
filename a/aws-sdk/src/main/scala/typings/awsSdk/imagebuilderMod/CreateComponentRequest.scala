package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComponentRequest extends js.Object {
  /**
    * The change description of the component. Describes what change has been made in this version, or what makes this version different from other versions of this component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.native
  /**
    * The idempotency token of the component.
    */
  var clientToken: ClientToken = js.native
  /**
    * The data of the component. Used to specify the data inline. Either data or uri can be used to specify the data within the component.
    */
  var data: js.UndefOr[InlineComponentData] = js.native
  /**
    * The description of the component. Describes the contents of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the KMS key that should be used to encrypt this component.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the component.
    */
  var name: ResourceName = js.native
  /**
    * The platform of the component.
    */
  var platform: Platform = js.native
  /**
    * The semantic version of the component. This version follows the semantic version syntax. For example, major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
    */
  var semanticVersion: VersionNumber = js.native
  /**
    *  The operating system (OS) version supported by the component. If the OS information is available, a prefix match is performed against the parent image OS version during image recipe creation. 
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.native
  /**
    * The tags of the component.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If you use S3, you can specify component content up to your service quota. Either data or uri can be used to specify the data within the component.
    */
  var uri: js.UndefOr[Uri] = js.native
}

object CreateComponentRequest {
  @scala.inline
  def apply(clientToken: ClientToken, name: ResourceName, platform: Platform, semanticVersion: VersionNumber): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentRequest]
  }
  @scala.inline
  implicit class CreateComponentRequestOps[Self <: CreateComponentRequest] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticVersion(value: VersionNumber): Self = this.set("semanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeDescription(value: NonEmptyString): Self = this.set("changeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeDescription: Self = this.set("changeDescription", js.undefined)
    @scala.inline
    def setData(value: InlineComponentData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setSupportedOsVersionsVarargs(value: OsVersion*): Self = this.set("supportedOsVersions", js.Array(value :_*))
    @scala.inline
    def setSupportedOsVersions(value: OsVersionList): Self = this.set("supportedOsVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOsVersions: Self = this.set("supportedOsVersions", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

