package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRoleToDBInstanceMessage extends js.Object {
  /**
    * The name of the DB instance to associate the IAM role with.
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The name of the feature for the DB instance that the IAM role is to be associated with. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with the DB instance, for example arn:aws:iam::123456789012:role/AccessRole. 
    */
  var RoleArn: String = js.native
}

object AddRoleToDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, FeatureName: String, RoleArn: String): AddRoleToDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddRoleToDBInstanceMessage]
  }
}

