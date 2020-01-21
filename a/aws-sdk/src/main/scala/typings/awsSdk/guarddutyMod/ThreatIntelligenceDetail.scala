package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatIntelligenceDetail extends js.Object {
  /**
    * The name of the threat intelligence list that triggered the finding.
    */
  var ThreatListName: js.UndefOr[String] = js.native
  /**
    * A list of names of the threats in the threat intelligence list that triggered the finding.
    */
  var ThreatNames: js.UndefOr[typings.awsSdk.guarddutyMod.ThreatNames] = js.native
}

object ThreatIntelligenceDetail {
  @scala.inline
  def apply(ThreatListName: String = null, ThreatNames: ThreatNames = null): ThreatIntelligenceDetail = {
    val __obj = js.Dynamic.literal()
    if (ThreatListName != null) __obj.updateDynamic("ThreatListName")(ThreatListName.asInstanceOf[js.Any])
    if (ThreatNames != null) __obj.updateDynamic("ThreatNames")(ThreatNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatIntelligenceDetail]
  }
}

