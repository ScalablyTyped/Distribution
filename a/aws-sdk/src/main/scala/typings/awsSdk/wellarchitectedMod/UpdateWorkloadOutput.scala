package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkloadOutput extends StObject {
  
  var Workload: js.UndefOr[typings.awsSdk.wellarchitectedMod.Workload] = js.undefined
}
object UpdateWorkloadOutput {
  
  inline def apply(): UpdateWorkloadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkloadOutput]
  }
  
  extension [Self <: UpdateWorkloadOutput](x: Self) {
    
    inline def setWorkload(value: Workload): Self = StObject.set(x, "Workload", value.asInstanceOf[js.Any])
    
    inline def setWorkloadUndefined: Self = StObject.set(x, "Workload", js.undefined)
  }
}
