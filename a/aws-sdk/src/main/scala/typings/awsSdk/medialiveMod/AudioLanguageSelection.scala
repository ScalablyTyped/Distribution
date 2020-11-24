package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioLanguageSelection extends js.Object {
  
  /**
    * Selects a specific three-letter language code from within an audio source.
    */
  var LanguageCode: string = js.native
  
  /**
    * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can't find one with the same language.
    */
  var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.native
}
object AudioLanguageSelection {
  
  @scala.inline
  def apply(LanguageCode: string): AudioLanguageSelection = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioLanguageSelection]
  }
  
  @scala.inline
  implicit class AudioLanguageSelectionOps[Self <: AudioLanguageSelection] (val x: Self) extends AnyVal {
    
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
    def setLanguageCode(value: string): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageSelectionPolicy(value: AudioLanguageSelectionPolicy): Self = this.set("LanguageSelectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageSelectionPolicy: Self = this.set("LanguageSelectionPolicy", js.undefined)
  }
}
