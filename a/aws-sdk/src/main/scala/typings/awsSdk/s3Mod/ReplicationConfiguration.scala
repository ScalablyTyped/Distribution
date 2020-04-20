package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects. For more information, see How to Set Up Replication in the Amazon Simple Storage Service Developer Guide.
    */
  var Role: typings.awsSdk.s3Mod.Role = js.native
  /**
    * A container for one or more replication rules. A replication configuration must have at least one rule and can contain a maximum of 1,000 rules. 
    */
  var Rules: ReplicationRules = js.native
}

object ReplicationConfiguration {
  @scala.inline
  def apply(Role: Role, Rules: ReplicationRules): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfiguration]
  }
}

