package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the container.
    */
  var Resource: ContainerARN = js.native
  /**
    * A comma-separated list of keys for tags that you want to remove from the container. For example, if your container has two tags (customer:CompanyA and priority:High) and you want to remove one of the tags (priority:High), you specify the key for the tag that you want to remove (priority).
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(Resource: ContainerARN, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
}

