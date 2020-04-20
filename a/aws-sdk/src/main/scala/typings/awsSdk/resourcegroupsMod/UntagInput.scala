package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagInput extends js.Object {
  /**
    * The ARN of the resource from which to remove tags.
    */
  var Arn: GroupArn = js.native
  /**
    * The keys of the tags to be removed.
    */
  var Keys: TagKeyList = js.native
}

object UntagInput {
  @scala.inline
  def apply(Arn: GroupArn, Keys: TagKeyList): UntagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagInput]
  }
}

