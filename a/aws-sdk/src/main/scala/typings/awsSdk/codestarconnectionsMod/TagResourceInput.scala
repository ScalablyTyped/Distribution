package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to add or update tags.
    */
  var ResourceArn: AmazonResourceName = js.native
  /**
    * The tags you want to modify or add to the resource.
    */
  var Tags: TagList = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: AmazonResourceName, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
}

