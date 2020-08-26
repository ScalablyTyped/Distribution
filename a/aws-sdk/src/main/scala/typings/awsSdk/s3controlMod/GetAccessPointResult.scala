package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointResult extends js.Object {
  /**
    * The name of the bucket associated with the specified access point.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * The date and time when the specified access point was created.
    */
  var CreationDate: js.UndefOr[typings.awsSdk.s3controlMod.CreationDate] = js.native
  /**
    * The name of the specified access point.
    */
  var Name: js.UndefOr[AccessPointName] = js.native
  /**
    * Indicates whether this access point allows access from the public internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: js.UndefOr[typings.awsSdk.s3controlMod.NetworkOrigin] = js.native
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.native
  /**
    * Contains the virtual private cloud (VPC) configuration for the specified access point.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object GetAccessPointResult {
  @scala.inline
  def apply(): GetAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointResult]
  }
  @scala.inline
  implicit class GetAccessPointResultOps[Self <: GetAccessPointResult] (val x: Self) extends AnyVal {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setName(value: AccessPointName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNetworkOrigin(value: NetworkOrigin): Self = this.set("NetworkOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkOrigin: Self = this.set("NetworkOrigin", js.undefined)
    @scala.inline
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = this.set("PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccessBlockConfiguration: Self = this.set("PublicAccessBlockConfiguration", js.undefined)
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
  
}

