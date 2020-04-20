package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThreatIntelSetResponse extends js.Object {
  /**
    * The ID of the ThreatIntelSet resource.
    */
  var ThreatIntelSetId: String = js.native
}

object CreateThreatIntelSetResponse {
  @scala.inline
  def apply(ThreatIntelSetId: String): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
}

