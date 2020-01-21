package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetSummary extends js.Object {
  /**
    * The IPSetId for an IPSet. You can use IPSetId in a GetIPSet request to get detailed information about an IPSet.
    */
  var IPSetId: ResourceId = js.native
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: ResourceName = js.native
}

object IPSetSummary {
  @scala.inline
  def apply(IPSetId: ResourceId, Name: ResourceName): IPSetSummary = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPSetSummary]
  }
}

