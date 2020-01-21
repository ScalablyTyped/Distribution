package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageRecipeSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image recipe.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image recipe was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The name of the image recipe.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The owner of the image recipe.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The parent image of the image recipe.
    */
  var parentImage: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the image recipe.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The tags of the image recipe.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object ImageRecipeSummary {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    name: ResourceName = null,
    owner: NonEmptyString = null,
    parentImage: NonEmptyString = null,
    platform: Platform = null,
    tags: TagMap = null
  ): ImageRecipeSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentImage != null) __obj.updateDynamic("parentImage")(parentImage.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRecipeSummary]
  }
}

