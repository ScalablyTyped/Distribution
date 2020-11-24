package typings.awsSdkClientS3Browser.typesReplicationConfigurationMod

import typings.awsSdkClientS3Browser.typesReplicationRuleMod.ReplicationRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationConfiguration extends js.Object {
  
  /**
    * <p>Amazon Resource Name (ARN) of an IAM role for Amazon S3 to assume when replicating the objects.</p>
    */
  var Role: String = js.native
  
  /**
    * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
    */
  var Rules: js.Array[ReplicationRule] | Iterable[ReplicationRule] = js.native
}
object ReplicationConfiguration {
  
  @scala.inline
  def apply(Role: String, Rules: js.Array[ReplicationRule] | Iterable[ReplicationRule]): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfiguration]
  }
  
  @scala.inline
  implicit class ReplicationConfigurationOps[Self <: ReplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setRole(value: String): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: ReplicationRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[ReplicationRule] | Iterable[ReplicationRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
