package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Evidence extends js.Object {
  
  /**
    * A list of threat intelligence details related to the evidence.
    */
  var ThreatIntelligenceDetails: js.UndefOr[typings.awsSdk.guarddutyMod.ThreatIntelligenceDetails] = js.native
}
object Evidence {
  
  @scala.inline
  def apply(): Evidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evidence]
  }
  
  @scala.inline
  implicit class EvidenceOps[Self <: Evidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThreatIntelligenceDetailsVarargs(value: ThreatIntelligenceDetail*): Self = this.set("ThreatIntelligenceDetails", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelligenceDetails(value: ThreatIntelligenceDetails): Self = this.set("ThreatIntelligenceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelligenceDetails: Self = this.set("ThreatIntelligenceDetails", js.undefined)
  }
}
