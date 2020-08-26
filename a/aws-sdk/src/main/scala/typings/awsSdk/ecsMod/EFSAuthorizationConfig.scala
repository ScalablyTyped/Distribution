package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EFSAuthorizationConfig extends js.Object {
  /**
    * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the EFSVolumeConfiguration will be relative to the directory set for the access point. If an access point is used, transit encryption must be enabled in the EFSVolumeConfiguration. For more information, see Working with Amazon EFS Access Points in the Amazon Elastic File System User Guide.
    */
  var accessPointId: js.UndefOr[String] = js.native
  /**
    * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. If this parameter is omitted, the default value of DISABLED is used. For more information, see Using Amazon EFS Access Points in the Amazon Elastic Container Service Developer Guide.
    */
  var iam: js.UndefOr[EFSAuthorizationConfigIAM] = js.native
}

object EFSAuthorizationConfig {
  @scala.inline
  def apply(): EFSAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EFSAuthorizationConfig]
  }
  @scala.inline
  implicit class EFSAuthorizationConfigOps[Self <: EFSAuthorizationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPointId(value: String): Self = this.set("accessPointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPointId: Self = this.set("accessPointId", js.undefined)
    @scala.inline
    def setIam(value: EFSAuthorizationConfigIAM): Self = this.set("iam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIam: Self = this.set("iam", js.undefined)
  }
  
}

