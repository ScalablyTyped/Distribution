package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeStatusRequest extends js.Object {
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}

object GetUpgradeStatusRequest {
  @scala.inline
  def apply(DomainName: DomainName): GetUpgradeStatusRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeStatusRequest]
  }
}

