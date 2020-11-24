package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroup extends js.Object {
  
  /**
    * Use automated encoding to have MediaConvert choose your encoding settings for you, based on characteristics of your input video.
    */
  var AutomatedEncodingSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AutomatedEncodingSettings] = js.native
  
  /**
    * Use Custom Group Name (CustomName) to specify a name for the output group. This value is displayed on the console and can make your job settings JSON more human-readable. It does not affect your outputs. Use up to twelve characters that are either letters, numbers, spaces, or underscores.
    */
  var CustomName: js.UndefOr[string] = js.native
  
  /**
    * Name of the output group
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * Output Group settings, including type
    */
  var OutputGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.OutputGroupSettings] = js.native
  
  /**
    * This object holds groups of encoding settings, one group of settings per output.
    */
  var Outputs: js.UndefOr[listOfOutput] = js.native
}
object OutputGroup {
  
  @scala.inline
  def apply(): OutputGroup = {
    val __obj = js.Dynamic.literal()
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
    def setAutomatedEncodingSettings(value: AutomatedEncodingSettings): Self = this.set("AutomatedEncodingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedEncodingSettings: Self = this.set("AutomatedEncodingSettings", js.undefined)
    
    @scala.inline
    def setCustomName(value: string): Self = this.set("CustomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomName: Self = this.set("CustomName", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOutputGroupSettings(value: OutputGroupSettings): Self = this.set("OutputGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputGroupSettings: Self = this.set("OutputGroupSettings", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: listOfOutput): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
  }
}
