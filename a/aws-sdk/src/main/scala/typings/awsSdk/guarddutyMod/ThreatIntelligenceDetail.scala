package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatIntelligenceDetail extends StObject {
  
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
  def apply(): ThreatIntelligenceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelligenceDetail]
  }
  
  @scala.inline
  implicit class ThreatIntelligenceDetailMutableBuilder[Self <: ThreatIntelligenceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreatListName(value: String): Self = StObject.set(x, "ThreatListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatListNameUndefined: Self = StObject.set(x, "ThreatListName", js.undefined)
    
    @scala.inline
    def setThreatNames(value: ThreatNames): Self = StObject.set(x, "ThreatNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatNamesUndefined: Self = StObject.set(x, "ThreatNames", js.undefined)
    
    @scala.inline
    def setThreatNamesVarargs(value: String*): Self = StObject.set(x, "ThreatNames", js.Array(value :_*))
  }
}
