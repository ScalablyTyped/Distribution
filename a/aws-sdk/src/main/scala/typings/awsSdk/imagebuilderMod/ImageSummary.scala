package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The output resources produced when creating this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.native
  /**
    * The owner of the image.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the image.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.native
  /**
    * The tags of the image.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The version of the image.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object ImageSummary {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    name: ResourceName = null,
    outputResources: OutputResources = null,
    owner: NonEmptyString = null,
    platform: Platform = null,
    state: ImageState = null,
    tags: TagMap = null,
    version: VersionNumber = null
  ): ImageSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputResources != null) __obj.updateDynamic("outputResources")(outputResources.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSummary]
  }
}

