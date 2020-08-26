package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionOriginItem extends js.Object {
  /**
    * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A unique identifier for the origin or origin group.
    */
  var Id: js.UndefOr[NonEmptyString] = js.native
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
    */
  var OriginPath: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionOriginItem {
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginItemOps[Self <: AwsCloudFrontDistributionOriginItem] (val x: Self) extends AnyVal {
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
    def setDomainName(value: NonEmptyString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setOriginPath(value: NonEmptyString): Self = this.set("OriginPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginPath: Self = this.set("OriginPath", js.undefined)
  }
  
}

