package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResult extends js.Object {
  /**
    *  A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsSdk.cloudfrontMod.Tags = js.native
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(Tags: Tags): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

