package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
  /**
    * The name of the domain that you want to stop the latest service software update on.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}

object CancelElasticsearchServiceSoftwareUpdateRequest {
  @scala.inline
  def apply(DomainName: DomainName): CancelElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
  }
}

