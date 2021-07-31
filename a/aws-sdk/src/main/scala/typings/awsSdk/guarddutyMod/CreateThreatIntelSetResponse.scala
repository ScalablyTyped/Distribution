package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThreatIntelSetResponse extends StObject {
  
  /**
    * The ID of the ThreatIntelSet resource.
    */
  var ThreatIntelSetId: String
}
object CreateThreatIntelSetResponse {
  
  @scala.inline
  def apply(ThreatIntelSetId: String): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
  
  @scala.inline
  implicit class CreateThreatIntelSetResponseMutableBuilder[Self <: CreateThreatIntelSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreatIntelSetId(value: String): Self = StObject.set(x, "ThreatIntelSetId", value.asInstanceOf[js.Any])
  }
}
