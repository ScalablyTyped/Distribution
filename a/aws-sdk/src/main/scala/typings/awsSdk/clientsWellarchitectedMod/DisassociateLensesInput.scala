package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLensesInput extends StObject {
  
  var LensAliases: typings.awsSdk.clientsWellarchitectedMod.LensAliases
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object DisassociateLensesInput {
  
  inline def apply(LensAliases: LensAliases, WorkloadId: WorkloadId): DisassociateLensesInput = {
    val __obj = js.Dynamic.literal(LensAliases = LensAliases.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLensesInput]
  }
  
  extension [Self <: DisassociateLensesInput](x: Self) {
    
    inline def setLensAliases(value: LensAliases): Self = StObject.set(x, "LensAliases", value.asInstanceOf[js.Any])
    
    inline def setLensAliasesVarargs(value: LensAlias*): Self = StObject.set(x, "LensAliases", js.Array(value*))
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
