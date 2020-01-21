package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and tags for an AWS Elemental MediaConvert resource.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.mediaconvertMod.ResourceTags] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(ResourceTags: ResourceTags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

