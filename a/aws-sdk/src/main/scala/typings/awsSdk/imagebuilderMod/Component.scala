package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The change description of the component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.native
  /**
    * The data of the component.
    */
  var data: js.UndefOr[ComponentData] = js.native
  /**
    * The date that the component was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The encryption status of the component.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.native
  /**
    * The KMS key identifier used to encrypt the component.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the component.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The owner of the component.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the component.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The tags associated with the component.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The type of the component denotes whether the component is used to build the image or only to test it.
    */
  var `type`: js.UndefOr[ComponentType] = js.native
  /**
    * The version of the component.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object Component {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    changeDescription: NonEmptyString = null,
    data: ComponentData = null,
    dateCreated: DateTime = null,
    description: NonEmptyString = null,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    kmsKeyId: NonEmptyString = null,
    name: ResourceName = null,
    owner: NonEmptyString = null,
    platform: Platform = null,
    tags: TagMap = null,
    `type`: ComponentType = null,
    version: VersionNumber = null
  ): Component = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (changeDescription != null) __obj.updateDynamic("changeDescription")(changeDescription.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
}

