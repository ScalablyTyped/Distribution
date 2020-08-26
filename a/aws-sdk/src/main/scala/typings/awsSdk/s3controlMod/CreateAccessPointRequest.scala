package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointRequest extends js.Object {
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  var Bucket: BucketName = js.native
  /**
    * The name you want to assign to this access point.
    */
  var Name: AccessPointName = js.native
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.native
  /**
    * If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object CreateAccessPointRequest {
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName, Name: AccessPointName): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
  @scala.inline
  implicit class CreateAccessPointRequestOps[Self <: CreateAccessPointRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AccessPointName): Self = this.set("Name", value.asInstanceOf[js.Any])
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

