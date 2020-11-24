package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStepOutput extends js.Object {
  
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
  implicit class DescribeStepOutputOps[Self <: DescribeStepOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStep(value: Step): Self = this.set("Step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("Step", js.undefined)
  }
}
