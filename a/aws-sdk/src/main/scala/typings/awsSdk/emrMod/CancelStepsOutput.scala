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
  
  @scala.inline
  def apply(): CancelStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsOutput]
  }
  
  @scala.inline
  implicit class CancelStepsOutputMutableBuilder[Self <: CancelStepsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelStepsInfoList(value: CancelStepsInfoList): Self = StObject.set(x, "CancelStepsInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelStepsInfoListUndefined: Self = StObject.set(x, "CancelStepsInfoList", js.undefined)
    
    @scala.inline
    def setCancelStepsInfoListVarargs(value: CancelStepsInfo*): Self = StObject.set(x, "CancelStepsInfoList", js.Array(value :_*))
  }
}
