package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainInformation extends js.Object {
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  var OwnerId: js.UndefOr[typings.awsSdk.esMod.OwnerId] = js.native
  var Region: js.UndefOr[typings.awsSdk.esMod.Region] = js.native
}

object DomainInformation {
  @scala.inline
  def apply(DomainName: DomainName, OwnerId: OwnerId = null, Region: Region = null): DomainInformation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInformation]
  }
}

