package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStepOutput extends StObject {
  
  /**
    * The step details for the requested step identifier.
    */
  var Step: js.UndefOr[typings.awsSdk.emrMod.Step] = js.undefined
}
object DescribeStepOutput {
  
  inline def apply(): DescribeStepOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStepOutput]
  }
  
  extension [Self <: DescribeStepOutput](x: Self) {
    
    inline def setStep(value: Step): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "Step", js.undefined)
  }
}
