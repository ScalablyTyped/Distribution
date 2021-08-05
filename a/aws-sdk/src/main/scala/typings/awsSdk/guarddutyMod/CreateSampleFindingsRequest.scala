package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSampleFindingsRequest extends StObject {
  
  /**
    * The ID of the detector to create sample findings for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The types of sample findings to generate.
    */
  var FindingTypes: js.UndefOr[typings.awsSdk.guarddutyMod.FindingTypes] = js.undefined
}
object CreateSampleFindingsRequest {
  
  inline def apply(DetectorId: DetectorId): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  
  extension [Self <: CreateSampleFindingsRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFindingTypes(value: FindingTypes): Self = StObject.set(x, "FindingTypes", value.asInstanceOf[js.Any])
    
    inline def setFindingTypesUndefined: Self = StObject.set(x, "FindingTypes", js.undefined)
    
    inline def setFindingTypesVarargs(value: FindingType*): Self = StObject.set(x, "FindingTypes", js.Array(value :_*))
  }
}
