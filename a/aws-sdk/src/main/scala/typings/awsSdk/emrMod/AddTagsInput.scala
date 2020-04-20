package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsInput extends js.Object {
  /**
    * The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
    */
  var ResourceId: typings.awsSdk.emrMod.ResourceId = js.native
  /**
    * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs that consist of a required key string with a maximum of 128 characters, and an optional value string with a maximum of 256 characters.
    */
  var Tags: TagList = js.native
}

object AddTagsInput {
  @scala.inline
  def apply(ResourceId: ResourceId, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
}

