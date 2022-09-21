package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitiveDataOccurrencesAvailabilityRequest extends StObject {
  
  /**
    * The unique identifier for the finding.
    */
  var findingId: string
}
object GetSensitiveDataOccurrencesAvailabilityRequest {
  
  inline def apply(findingId: string): GetSensitiveDataOccurrencesAvailabilityRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSensitiveDataOccurrencesAvailabilityRequest]
  }
  
  extension [Self <: GetSensitiveDataOccurrencesAvailabilityRequest](x: Self) {
    
    inline def setFindingId(value: string): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
  }
}
