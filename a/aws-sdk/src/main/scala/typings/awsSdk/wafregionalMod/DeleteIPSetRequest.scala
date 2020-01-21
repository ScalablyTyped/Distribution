package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIPSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The IPSetId of the IPSet that you want to delete. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
}

object DeleteIPSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, IPSetId: ResourceId): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
}

