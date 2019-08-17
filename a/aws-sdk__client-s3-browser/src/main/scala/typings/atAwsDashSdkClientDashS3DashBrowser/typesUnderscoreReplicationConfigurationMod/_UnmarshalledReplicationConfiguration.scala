package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleMod._UnmarshalledReplicationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicationConfiguration extends _ReplicationConfiguration {
  /**
    * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
    */
  @JSName("Rules")
  var Rules__UnmarshalledReplicationConfiguration: js.Array[_UnmarshalledReplicationRule]
}

object _UnmarshalledReplicationConfiguration {
  @scala.inline
  def apply(Role: String, Rules: js.Array[_UnmarshalledReplicationRule]): _UnmarshalledReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role, Rules = Rules)
  
    __obj.asInstanceOf[_UnmarshalledReplicationConfiguration]
  }
}

