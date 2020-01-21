package typings.awsSdkClientS3Browser.typesReplicationRuleAndOperatorMod

import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicationRuleAndOperator extends ReplicationRuleAndOperator {
  /**
    * _TagSet shape
    */
  @JSName("Tags")
  var Tags_UnmarshalledReplicationRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
}

object UnmarshalledReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[UnmarshalledTag] = null): UnmarshalledReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationRuleAndOperator]
  }
}

