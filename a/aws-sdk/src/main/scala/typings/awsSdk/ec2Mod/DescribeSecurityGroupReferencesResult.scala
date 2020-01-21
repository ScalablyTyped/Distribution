package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityGroupReferencesResult extends js.Object {
  /**
    * Information about the VPCs with the referencing security groups.
    */
  var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.native
}

object DescribeSecurityGroupReferencesResult {
  @scala.inline
  def apply(SecurityGroupReferenceSet: SecurityGroupReferences = null): DescribeSecurityGroupReferencesResult = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupReferenceSet != null) __obj.updateDynamic("SecurityGroupReferenceSet")(SecurityGroupReferenceSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityGroupReferencesResult]
  }
}

