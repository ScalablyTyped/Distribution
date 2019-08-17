package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleFilterMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleAndOperatorMod._UnmarshalledReplicationRuleAndOperator
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicationRuleFilter extends _ReplicationRuleFilter {
  /**
    * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
    */
  @JSName("And")
  var And__UnmarshalledReplicationRuleFilter: js.UndefOr[_UnmarshalledReplicationRuleAndOperator] = js.undefined
  /**
    * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
    */
  @JSName("Tag")
  var Tag__UnmarshalledReplicationRuleFilter: js.UndefOr[_UnmarshalledTag] = js.undefined
}

object _UnmarshalledReplicationRuleFilter {
  @scala.inline
  def apply(
    And: _UnmarshalledReplicationRuleAndOperator = null,
    Prefix: String = null,
    Tag: _UnmarshalledTag = null
  ): _UnmarshalledReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[_UnmarshalledReplicationRuleFilter]
  }
}

