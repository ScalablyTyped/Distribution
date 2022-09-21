package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelStepsOutput extends StObject {
  
  /**
    * A list of CancelStepsInfo, which shows the status of specified cancel requests for each StepID specified.
    */
  var CancelStepsInfoList: js.UndefOr[typings.awsSdk.emrMod.CancelStepsInfoList] = js.undefined
}
object CancelStepsOutput {
  
  inline def apply(): CancelStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsOutput]
  }
  
  extension [Self <: CancelStepsOutput](x: Self) {
    
    inline def setCancelStepsInfoList(value: CancelStepsInfoList): Self = StObject.set(x, "CancelStepsInfoList", value.asInstanceOf[js.Any])
    
    inline def setCancelStepsInfoListUndefined: Self = StObject.set(x, "CancelStepsInfoList", js.undefined)
    
    inline def setCancelStepsInfoListVarargs(value: CancelStepsInfo*): Self = StObject.set(x, "CancelStepsInfoList", js.Array(value*))
  }
}
