package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagOutput extends js.Object {
  /**
    * The ARN of the resource from which tags have been removed.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  /**
    * The keys of tags that have been removed.
    */
  var Keys: js.UndefOr[TagKeyList] = js.native
}

object UntagOutput {
  @scala.inline
  def apply(Arn: GroupArn = null, Keys: TagKeyList = null): UntagOutput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagOutput]
  }
}

