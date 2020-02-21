package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceAssociatedRole extends js.Object {
  /**
    * The name of the feature associated with the IAM)role.
    */
  var FeatureName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * Describes the state of the association between the IAM role and the DB instance. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB instance and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB instance.    INVALID - the IAM role ARN is associated with the DB instance, but the DB instance is unable to assume the IAM role in order to access other AWS services on your behalf.   
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}

object AwsRdsDbInstanceAssociatedRole {
  @scala.inline
  def apply(FeatureName: NonEmptyString = null, RoleArn: NonEmptyString = null, Status: NonEmptyString = null): AwsRdsDbInstanceAssociatedRole = {
    val __obj = js.Dynamic.literal()
    if (FeatureName != null) __obj.updateDynamic("FeatureName")(FeatureName.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRdsDbInstanceAssociatedRole]
  }
}

