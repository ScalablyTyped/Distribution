package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationFsxWindowsResponse extends js.Object {
  /**
    * The time that the FSx for Windows location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the FSx for Windows location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the FSx for Windows file system.
    */
  var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.native
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: js.UndefOr[SmbUser] = js.native
}

object DescribeLocationFsxWindowsResponse {
  @scala.inline
  def apply(): DescribeLocationFsxWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationFsxWindowsResponse]
  }
  @scala.inline
  implicit class DescribeLocationFsxWindowsResponseOps[Self <: DescribeLocationFsxWindowsResponse] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDomain(value: SmbDomain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = this.set("SecurityGroupArns", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = this.set("SecurityGroupArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupArns: Self = this.set("SecurityGroupArns", js.undefined)
    @scala.inline
    def setUser(value: SmbUser): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

