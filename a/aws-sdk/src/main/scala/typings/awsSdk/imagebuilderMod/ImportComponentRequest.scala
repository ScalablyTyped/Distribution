package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportComponentRequest extends js.Object {
  /**
    *  The change description of the component. Describes what change has been made in this version. In other words what makes this version different from other versions of this component. 
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The idempotency token of the component. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The data of the component. 
    */
  var data: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The description of the component. Describes the contents of the component. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The format of the resource that you wish to import as a component. 
    */
  var format: ComponentFormat = js.native
  /**
    *  The ID of the KMS key that should be used to encrypt this component. 
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The name of the component. 
    */
  var name: ResourceName = js.native
  /**
    *  The platform of the component. 
    */
  var platform: Platform = js.native
  /**
    *  The semantic version of the component. This version to follow the semantic version syntax. i.e. major.minor.patch. This could be versioned like software 2.0.1 or date like 2019.12.01. 
    */
  var semanticVersion: VersionNumber = js.native
  /**
    *  The tags of the component. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  The type of the component denotes whether the component is used to build the image or only to test it. 
    */
  var `type`: ComponentType = js.native
  /**
    *  The uri of the component. 
    */
  var uri: js.UndefOr[Uri] = js.native
}

object ImportComponentRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    format: ComponentFormat,
    name: ResourceName,
    platform: Platform,
    semanticVersion: VersionNumber,
    `type`: ComponentType,
    changeDescription: NonEmptyString = null,
    data: NonEmptyString = null,
    description: NonEmptyString = null,
    kmsKeyId: NonEmptyString = null,
    tags: TagMap = null,
    uri: Uri = null
  ): ImportComponentRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (changeDescription != null) __obj.updateDynamic("changeDescription")(changeDescription.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportComponentRequest]
  }
}

