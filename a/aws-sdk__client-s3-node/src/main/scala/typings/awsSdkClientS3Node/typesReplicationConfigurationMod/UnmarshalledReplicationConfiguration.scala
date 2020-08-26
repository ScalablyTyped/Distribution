package typings.awsSdkClientS3Node.typesReplicationConfigurationMod

import typings.awsSdkClientS3Node.typesReplicationRuleMod.UnmarshalledReplicationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicationConfiguration extends ReplicationConfiguration {
  /**
    * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledReplicationConfiguration: js.Array[UnmarshalledReplicationRule] = js.native
}

object UnmarshalledReplicationConfiguration {
  @scala.inline
  def apply(Role: String, Rules: js.Array[UnmarshalledReplicationRule]): UnmarshalledReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledReplicationConfigurationOps[Self <: UnmarshalledReplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRulesVarargs(value: UnmarshalledReplicationRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[UnmarshalledReplicationRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

