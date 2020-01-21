package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ID specifying the EFS resource that you want to create a tag for. 
    */
  var ResourceId: typings.awsSdk.efsMod.ResourceId = js.native
  /**
    * 
    */
  var Tags: typings.awsSdk.efsMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

