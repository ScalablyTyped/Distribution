package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRuleAndOperator extends js.Object {
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * An array of tags containing key and value pairs.
    */
  var Tags: js.UndefOr[TagSet] = js.native
}

object ReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
}

