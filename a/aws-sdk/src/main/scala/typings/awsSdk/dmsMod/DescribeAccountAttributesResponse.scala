package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResponse extends js.Object {
  /**
    * Account quota information.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.native
  /**
    * A unique AWS DMS identifier for an account in a particular AWS Region. The value of this identifier has the following format: c99999999999. DMS uses this identifier to name artifacts. For example, DMS uses this identifier to name the default Amazon S3 bucket for storing task assessment reports in a given AWS Region. The format of this S3 bucket name is the following: dms-AccountNumber-UniqueAccountIdentifier. Here is an example name for this default S3 bucket: dms-111122223333-c44445555666.  AWS DMS supports the UniqueAccountIdentifier parameter in versions 3.1.4 and later. 
    */
  var UniqueAccountIdentifier: js.UndefOr[String] = js.native
}

object DescribeAccountAttributesResponse {
  @scala.inline
  def apply(): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
  @scala.inline
  implicit class DescribeAccountAttributesResponseOps[Self <: DescribeAccountAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAccountQuotasVarargs(value: AccountQuota*): Self = this.set("AccountQuotas", js.Array(value :_*))
    @scala.inline
    def setAccountQuotas(value: AccountQuotaList): Self = this.set("AccountQuotas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountQuotas: Self = this.set("AccountQuotas", js.undefined)
    @scala.inline
    def setUniqueAccountIdentifier(value: String): Self = this.set("UniqueAccountIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueAccountIdentifier: Self = this.set("UniqueAccountIdentifier", js.undefined)
  }
  
}

