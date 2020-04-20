package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster or arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot. ElastiCache resources are cluster and snapshot. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var ResourceName: String = js.native
  /**
    * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value.
    */
  var Tags: TagList = js.native
}

object AddTagsToResourceMessage {
  @scala.inline
  def apply(ResourceName: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
}

