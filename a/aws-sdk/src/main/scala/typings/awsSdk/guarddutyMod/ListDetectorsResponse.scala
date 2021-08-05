package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectorsResponse extends StObject {
  
  /**
    * A list of detector IDs.
    */
  var DetectorIds: typings.awsSdk.guarddutyMod.DetectorIds
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDetectorsResponse {
  
  inline def apply(DetectorIds: DetectorIds): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal(DetectorIds = DetectorIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsResponse]
  }
  
  extension [Self <: ListDetectorsResponse](x: Self) {
    
    inline def setDetectorIds(value: DetectorIds): Self = StObject.set(x, "DetectorIds", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdsVarargs(value: DetectorId*): Self = StObject.set(x, "DetectorIds", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
