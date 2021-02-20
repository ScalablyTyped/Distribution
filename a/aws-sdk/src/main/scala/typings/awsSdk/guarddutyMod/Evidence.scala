package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Evidence extends StObject {
  
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
  implicit class EvidenceMutableBuilder[Self <: Evidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreatIntelligenceDetails(value: ThreatIntelligenceDetails): Self = StObject.set(x, "ThreatIntelligenceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelligenceDetailsUndefined: Self = StObject.set(x, "ThreatIntelligenceDetails", js.undefined)
    
    @scala.inline
    def setThreatIntelligenceDetailsVarargs(value: ThreatIntelligenceDetail*): Self = StObject.set(x, "ThreatIntelligenceDetails", js.Array(value :_*))
  }
}
