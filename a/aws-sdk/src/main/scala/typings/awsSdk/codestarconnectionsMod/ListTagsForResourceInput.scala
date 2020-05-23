package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to get information about tags, if any.
    */
  var ResourceArn: AmazonResourceName = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceArn: AmazonResourceName): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

