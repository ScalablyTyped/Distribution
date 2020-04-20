package typings.awsSdkClientS3Node.typesReplicationConfigurationMod

import typings.awsSdkClientS3Node.typesReplicationRuleMod.UnmarshalledReplicationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicationConfiguration extends ReplicationConfiguration {
  /**
    * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledReplicationConfiguration: js.Array[UnmarshalledReplicationRule]
}

object UnmarshalledReplicationConfiguration {
  @scala.inline
  def apply(Role: String, Rules: js.Array[UnmarshalledReplicationRule]): UnmarshalledReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationConfiguration]
  }
}

