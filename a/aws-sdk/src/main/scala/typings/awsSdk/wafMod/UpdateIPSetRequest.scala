package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIPSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The IPSetId of the IPSet that you want to update. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
  /**
    * An array of IPSetUpdate objects that you want to insert into or delete from an IPSet. For more information, see the applicable data types:    IPSetUpdate: Contains Action and IPSetDescriptor     IPSetDescriptor: Contains Type and Value    You can insert a maximum of 1000 addresses in a single request.
    */
  var Updates: IPSetUpdates = js.native
}

object UpdateIPSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, IPSetId: ResourceId, Updates: IPSetUpdates): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
}

