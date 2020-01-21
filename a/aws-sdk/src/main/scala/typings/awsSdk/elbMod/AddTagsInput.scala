package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsInput extends js.Object {
  /**
    * The name of the load balancer. You can specify one load balancer only.
    */
  var LoadBalancerNames: typings.awsSdk.elbMod.LoadBalancerNames = js.native
  /**
    * The tags.
    */
  var Tags: TagList = js.native
}

object AddTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsInput]
  }
}

