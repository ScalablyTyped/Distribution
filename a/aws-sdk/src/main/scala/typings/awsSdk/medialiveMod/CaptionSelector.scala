package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSelector extends js.Object {
  
  /**
    * When specified this field indicates the three letter language code of the caption track to extract from the source.
    */
  var LanguageCode: js.UndefOr[string] = js.native
  
  /**
    * Name identifier for a caption selector.  This name is used to associate this caption selector with one or more caption descriptions.  Names must be unique within an event.
    */
  var Name: stringMin1 = js.native
  
  /**
    * Caption selector settings.
    */
  var SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.native
}
object CaptionSelector {
  
  @scala.inline
  def apply(Name: stringMin1): CaptionSelector = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSelector]
  }
  
  @scala.inline
  implicit class CaptionSelectorOps[Self <: CaptionSelector] (val x: Self) extends AnyVal {
    
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
    def setLanguageCode(value: string): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setSelectorSettings(value: CaptionSelectorSettings): Self = this.set("SelectorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorSettings: Self = this.set("SelectorSettings", js.undefined)
  }
}
