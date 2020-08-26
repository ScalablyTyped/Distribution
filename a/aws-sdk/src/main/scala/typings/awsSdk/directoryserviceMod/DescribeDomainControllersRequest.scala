package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainControllersRequest extends js.Object {
  /**
    * Identifier of the directory for which to retrieve the domain controller information.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * A list of identifiers for the domain controllers whose information will be provided.
    */
  var DomainControllerIds: js.UndefOr[typings.awsSdk.directoryserviceMod.DomainControllerIds] = js.native
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeDomainControllers.NextToken value from a previous call to DescribeDomainControllers. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeDomainControllersRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DescribeDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainControllersRequest]
  }
  @scala.inline
  implicit class DescribeDomainControllersRequestOps[Self <: DescribeDomainControllersRequest] (val x: Self) extends AnyVal {
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
    def setDomainControllerIdsVarargs(value: DomainControllerId*): Self = this.set("DomainControllerIds", js.Array(value :_*))
    @scala.inline
    def setDomainControllerIds(value: DomainControllerIds): Self = this.set("DomainControllerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainControllerIds: Self = this.set("DomainControllerIds", js.undefined)
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

