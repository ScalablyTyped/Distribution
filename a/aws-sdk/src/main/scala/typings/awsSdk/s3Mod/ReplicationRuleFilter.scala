package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRuleFilter extends js.Object {
  /**
    * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter. For example:    If you specify both a Prefix and a Tag filter, wrap these filters in an And tag.   If you specify a filter based on multiple tags, wrap the Tag elements in an And tag.  
    */
  var And: js.UndefOr[ReplicationRuleAndOperator] = js.native
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * A container for specifying a tag key and value.  The rule applies only to objects that have the tag in their tag set.
    */
  var Tag: js.UndefOr[typings.awsSdk.s3Mod.Tag] = js.native
}

object ReplicationRuleFilter {
  @scala.inline
  def apply(And: ReplicationRuleAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): ReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRuleFilter]
  }
}

