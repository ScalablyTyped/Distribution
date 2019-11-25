package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleAndOperatorMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicationRuleAndOperator extends _ReplicationRuleAndOperator {
  /**
    * _TagSet shape
    */
  @JSName("Tags")
  var Tags__UnmarshalledReplicationRuleAndOperator: js.UndefOr[js.Array[_UnmarshalledTag]] = js.undefined
}

object _UnmarshalledReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_UnmarshalledTag] = null): _UnmarshalledReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledReplicationRuleAndOperator]
  }
}

