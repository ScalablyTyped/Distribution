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
  def apply(): ImageRecipeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRecipeSummary]
  }
  @scala.inline
  implicit class ImageRecipeSummaryOps[Self <: ImageRecipeSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: ImageBuilderArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDateCreated(value: DateTime): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: NonEmptyString): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setParentImage(value: NonEmptyString): Self = this.set("parentImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentImage: Self = this.set("parentImage", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

