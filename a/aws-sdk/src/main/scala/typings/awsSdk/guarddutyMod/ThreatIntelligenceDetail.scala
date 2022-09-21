package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatIntelligenceDetail extends StObject {
  
  /**
    * The name of the threat intelligence list that triggered the finding.
    */
  var ThreatListName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of names of the threats in the threat intelligence list that triggered the finding.
    */
  var ThreatNames: js.UndefOr[typings.awsSdk.guarddutyMod.ThreatNames] = js.undefined
}
object ThreatIntelligenceDetail {
  
  inline def apply(): ThreatIntelligenceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelligenceDetail]
  }
  
  extension [Self <: ThreatIntelligenceDetail](x: Self) {
    
    inline def setThreatListName(value: String): Self = StObject.set(x, "ThreatListName", value.asInstanceOf[js.Any])
    
    inline def setThreatListNameUndefined: Self = StObject.set(x, "ThreatListName", js.undefined)
    
    inline def setThreatNames(value: ThreatNames): Self = StObject.set(x, "ThreatNames", value.asInstanceOf[js.Any])
    
    inline def setThreatNamesUndefined: Self = StObject.set(x, "ThreatNames", js.undefined)
    
    inline def setThreatNamesVarargs(value: String*): Self = StObject.set(x, "ThreatNames", js.Array(value*))
  }
}
