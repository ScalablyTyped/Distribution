package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMerging extends StObject {
  
  /**
    * How the auto-merging process should resolve conflicts between different profiles. For example, if Profile A and Profile B have the same FirstName and LastName (and that is the matching criteria), which EmailAddress should be used? 
    */
  var ConflictResolution: js.UndefOr[typings.awsSdk.customerprofilesMod.ConflictResolution] = js.undefined
  
  /**
    * A list of matching attributes that represent matching criteria. If two profiles meet at least one of the requirements in the matching attributes list, they will be merged.
    */
  var Consolidation: js.UndefOr[typings.awsSdk.customerprofilesMod.Consolidation] = js.undefined
  
  /**
    * The flag that enables the auto-merging of duplicate profiles.
    */
  var Enabled: optionalBoolean
  
  /**
    * A number between 0 and 1 that represents the minimum confidence score required for profiles within a matching group to be merged during the auto-merge process. A higher score means higher similarity required to merge profiles. 
    */
  var MinAllowedConfidenceScoreForMerging: js.UndefOr[Double0To1] = js.undefined
}
object AutoMerging {
  
  inline def apply(Enabled: optionalBoolean): AutoMerging = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMerging]
  }
  
  extension [Self <: AutoMerging](x: Self) {
    
    inline def setConflictResolution(value: ConflictResolution): Self = StObject.set(x, "ConflictResolution", value.asInstanceOf[js.Any])
    
    inline def setConflictResolutionUndefined: Self = StObject.set(x, "ConflictResolution", js.undefined)
    
    inline def setConsolidation(value: Consolidation): Self = StObject.set(x, "Consolidation", value.asInstanceOf[js.Any])
    
    inline def setConsolidationUndefined: Self = StObject.set(x, "Consolidation", js.undefined)
    
    inline def setEnabled(value: optionalBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setMinAllowedConfidenceScoreForMerging(value: Double0To1): Self = StObject.set(x, "MinAllowedConfidenceScoreForMerging", value.asInstanceOf[js.Any])
    
    inline def setMinAllowedConfidenceScoreForMergingUndefined: Self = StObject.set(x, "MinAllowedConfidenceScoreForMerging", js.undefined)
  }
}
