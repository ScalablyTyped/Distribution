package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsInput extends js.Object {
  /**
    * The name of the load balancer. You can specify a maximum of one load balancer name.
    */
  var LoadBalancerNames: typings.awsSdk.elbMod.LoadBalancerNames = js.native
  /**
    * The list of tag keys to remove.
    */
  var Tags: TagKeyList = js.native
}

object RemoveTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagKeyList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
}

