package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroup extends js.Object {
  
  /**
    * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
    */
  var Name: js.UndefOr[stringMax32] = js.native
  
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typings.awsSdk.medialiveMod.OutputGroupSettings = js.native
  
  var Outputs: listOfOutput = js.native
}
object OutputGroup {
  
  @scala.inline
  def apply(OutputGroupSettings: OutputGroupSettings, Outputs: listOfOutput): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
  
  @scala.inline
  implicit class OutputGroupOps[Self <: OutputGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputGroupSettings(value: OutputGroupSettings): Self = this.set("OutputGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: listOfOutput): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: stringMax32): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
