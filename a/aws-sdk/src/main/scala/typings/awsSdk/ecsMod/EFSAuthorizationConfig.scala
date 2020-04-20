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
  def apply(accessPointId: String = null, iam: EFSAuthorizationConfigIAM = null): EFSAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    if (accessPointId != null) __obj.updateDynamic("accessPointId")(accessPointId.asInstanceOf[js.Any])
    if (iam != null) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    __obj.asInstanceOf[EFSAuthorizationConfig]
  }
}

