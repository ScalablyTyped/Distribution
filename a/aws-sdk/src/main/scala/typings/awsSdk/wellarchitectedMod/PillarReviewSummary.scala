package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PillarReviewSummary extends StObject {
  
  var Notes: js.UndefOr[typings.awsSdk.wellarchitectedMod.Notes] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.wellarchitectedMod.PillarId] = js.undefined
  
  var PillarName: js.UndefOr[typings.awsSdk.wellarchitectedMod.PillarName] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.wellarchitectedMod.RiskCounts] = js.undefined
}
object PillarReviewSummary {
  
  inline def apply(): PillarReviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PillarReviewSummary]
  }
  
  extension [Self <: PillarReviewSummary](x: Self) {
    
    inline def setNotes(value: Notes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setPillarName(value: PillarName): Self = StObject.set(x, "PillarName", value.asInstanceOf[js.Any])
    
    inline def setPillarNameUndefined: Self = StObject.set(x, "PillarName", js.undefined)
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
  }
}
