package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadSummary extends StObject {
  
  var ImprovementStatus: js.UndefOr[WorkloadImprovementStatus] = js.undefined
  
  var Lenses: js.UndefOr[WorkloadLenses] = js.undefined
  
  var Owner: js.UndefOr[AwsAccountId] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.RiskCounts] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  var WorkloadArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadName] = js.undefined
}
object WorkloadSummary {
  
  inline def apply(): WorkloadSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkloadSummary] (val x: Self) extends AnyVal {
    
    inline def setImprovementStatus(value: WorkloadImprovementStatus): Self = StObject.set(x, "ImprovementStatus", value.asInstanceOf[js.Any])
    
    inline def setImprovementStatusUndefined: Self = StObject.set(x, "ImprovementStatus", js.undefined)
    
    inline def setLenses(value: WorkloadLenses): Self = StObject.set(x, "Lenses", value.asInstanceOf[js.Any])
    
    inline def setLensesUndefined: Self = StObject.set(x, "Lenses", js.undefined)
    
    inline def setLensesVarargs(value: LensAlias*): Self = StObject.set(x, "Lenses", js.Array(value*))
    
    inline def setOwner(value: AwsAccountId): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
    
    inline def setWorkloadArnUndefined: Self = StObject.set(x, "WorkloadArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
