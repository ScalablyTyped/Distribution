package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPoint extends js.Object {
  /**
    * The name of the bucket associated with this access point.
    */
  var Bucket: BucketName = js.native
  /**
    * The name of this access point.
    */
  var Name: AccessPointName = js.native
  /**
    * Indicates whether this access point allows access from the public internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: typings.awsSdk.s3controlMod.NetworkOrigin = js.native
  /**
    * The virtual private cloud (VPC) configuration for this access point, if one exists.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object AccessPoint {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Name: AccessPointName,
    NetworkOrigin: NetworkOrigin,
    VpcConfiguration: VpcConfiguration = null
  ): AccessPoint = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkOrigin = NetworkOrigin.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoint]
  }
}

