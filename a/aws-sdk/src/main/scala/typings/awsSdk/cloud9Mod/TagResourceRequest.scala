package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Cloud9 development environment to add tags to.
    */
  var ResourceARN: EnvironmentArn = js.native
  /**
    * The list of tags to add to the given AWS Cloud9 development environment.
    */
  var Tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: EnvironmentArn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

