package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLensesInput extends StObject {
  
  var LensAliases: typings.awsSdk.wellarchitectedMod.LensAliases
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object AssociateLensesInput {
  
  inline def apply(LensAliases: LensAliases, WorkloadId: WorkloadId): AssociateLensesInput = {
    val __obj = js.Dynamic.literal(LensAliases = LensAliases.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLensesInput]
  }
  
  extension [Self <: AssociateLensesInput](x: Self) {
    
    inline def setLensAliases(value: LensAliases): Self = StObject.set(x, "LensAliases", value.asInstanceOf[js.Any])
    
    inline def setLensAliasesVarargs(value: LensAlias*): Self = StObject.set(x, "LensAliases", js.Array(value*))
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
