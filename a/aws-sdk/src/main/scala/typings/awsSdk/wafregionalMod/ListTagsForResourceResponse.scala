package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * 
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * 
    */
  var TagInfoForResource: js.UndefOr[typings.awsSdk.wafregionalMod.TagInfoForResource] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, TagInfoForResource: TagInfoForResource = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (TagInfoForResource != null) __obj.updateDynamic("TagInfoForResource")(TagInfoForResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

