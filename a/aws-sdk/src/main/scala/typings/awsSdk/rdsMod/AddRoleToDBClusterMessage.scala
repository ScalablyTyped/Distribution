package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRoleToDBClusterMessage extends js.Object {
  /**
    * The name of the DB cluster to associate the IAM role with.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The name of the feature for the DB cluster that the IAM role is to be associated with. For the list of supported feature names, see DBEngineVersion.
    */
  var FeatureName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example arn:aws:iam::123456789012:role/AuroraAccessRole.
    */
  var RoleArn: String = js.native
}

object AddRoleToDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, RoleArn: String, FeatureName: String = null): AddRoleToDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (FeatureName != null) __obj.updateDynamic("FeatureName")(FeatureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRoleToDBClusterMessage]
  }
}

