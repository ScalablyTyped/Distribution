package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The number of items that should show up on one page
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * A token for requesting another page of certificates if the NextToken response element indicates that more certificates are available. Use the value of the returned NextToken element in your request until the token comes back as null. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListCertificatesRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesRequest]
  }
  @scala.inline
  implicit class ListCertificatesRequestOps[Self <: ListCertificatesRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: PageLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

