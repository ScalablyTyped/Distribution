package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkloadOutput extends StObject {
  
  var Workload: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Workload] = js.undefined
}
object GetWorkloadOutput {
  
  inline def apply(): GetWorkloadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkloadOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkloadOutput] (val x: Self) extends AnyVal {
    
    inline def setWorkload(value: Workload): Self = StObject.set(x, "Workload", value.asInstanceOf[js.Any])
    
    inline def setWorkloadUndefined: Self = StObject.set(x, "Workload", js.undefined)
  }
}
