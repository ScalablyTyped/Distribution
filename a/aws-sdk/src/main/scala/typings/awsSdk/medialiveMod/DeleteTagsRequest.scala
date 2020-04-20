package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsRequest extends js.Object {
  var ResourceArn: string = js.native
  /**
    * An array of tag keys to delete
    */
  var TagKeys: listOfString = js.native
}

object DeleteTagsRequest {
  @scala.inline
  def apply(ResourceArn: string, TagKeys: listOfString): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

