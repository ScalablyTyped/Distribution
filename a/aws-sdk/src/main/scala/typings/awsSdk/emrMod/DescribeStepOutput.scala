package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStepOutput extends StObject {
  
  /**
    * The step details for the requested step identifier.
    */
  var Step: js.UndefOr[typings.awsSdk.emrMod.Step] = js.native
}
object DescribeStepOutput {
  
  @scala.inline
  def apply(): DescribeStepOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStepOutput]
  }
  
  @scala.inline
  implicit class DescribeStepOutputMutableBuilder[Self <: DescribeStepOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "Step", js.undefined)
  }
}
