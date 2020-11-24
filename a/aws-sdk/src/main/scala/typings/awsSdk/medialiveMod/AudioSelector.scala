package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSelector extends js.Object {
  
  /**
    * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.  Selector names should be unique per input.
    */
  var Name: stringMin1 = js.native
  
  /**
    * The audio selector settings.
    */
  var SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.native
}
object AudioSelector {
  
  @scala.inline
  def apply(Name: stringMin1): AudioSelector = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSelector]
  }
  
  @scala.inline
  implicit class AudioSelectorOps[Self <: AudioSelector] (val x: Self) extends AnyVal {
    
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
    def setName(value: stringMin1): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSettings(value: AudioSelectorSettings): Self = this.set("SelectorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorSettings: Self = this.set("SelectorSettings", js.undefined)
  }
}
