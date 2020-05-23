package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagInfoForResource extends js.Object {
  /**
    * 
    */
  var ResourceARN: js.UndefOr[ResourceArn] = js.native
  /**
    * 
    */
  var TagList: js.UndefOr[typings.awsSdk.wafregionalMod.TagList] = js.native
}

object TagInfoForResource {
  @scala.inline
  def apply(ResourceARN: ResourceArn = null, TagList: TagList = null): TagInfoForResource = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagInfoForResource]
  }
}

