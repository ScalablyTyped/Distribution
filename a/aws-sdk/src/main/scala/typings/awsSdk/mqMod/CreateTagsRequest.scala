package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: string = js.native
  /**
    * The key-value pair for the resource tag.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(ResourceArn: string, Tags: mapOfString = null): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

