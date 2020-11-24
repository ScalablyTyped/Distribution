package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterOutput extends js.Object {
  
  /**
    * The number of steps that can be executed concurrently.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
}
object ModifyClusterOutput {
  
  @scala.inline
  def apply(): ModifyClusterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterOutput]
  }
  
  @scala.inline
  implicit class ModifyClusterOutputOps[Self <: ModifyClusterOutput] (val x: Self) extends AnyVal {
    
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
    def setStepConcurrencyLevel(value: Integer): Self = this.set("StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepConcurrencyLevel: Self = this.set("StepConcurrencyLevel", js.undefined)
  }
}
