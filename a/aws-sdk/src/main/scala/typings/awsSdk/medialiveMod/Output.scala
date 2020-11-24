package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * The names of the AudioDescriptions used as audio sources for this output.
    */
  var AudioDescriptionNames: js.UndefOr[listOfString] = js.native
  
  /**
    * The names of the CaptionDescriptions used as caption sources for this output.
    */
  var CaptionDescriptionNames: js.UndefOr[listOfString] = js.native
  
  /**
    * The name used to identify an output.
    */
  var OutputName: js.UndefOr[stringMin1Max255] = js.native
  
  /**
    * Output type-specific settings.
    */
  var OutputSettings: typings.awsSdk.medialiveMod.OutputSettings = js.native
  
  /**
    * The name of the VideoDescription used as the source for this output.
    */
  var VideoDescriptionName: js.UndefOr[string] = js.native
}
object Output {
  
  @scala.inline
  def apply(OutputSettings: OutputSettings): Output = {
    val __obj = js.Dynamic.literal(OutputSettings = OutputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setOutputSettings(value: OutputSettings): Self = this.set("OutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDescriptionNamesVarargs(value: string*): Self = this.set("AudioDescriptionNames", js.Array(value :_*))
    
    @scala.inline
    def setAudioDescriptionNames(value: listOfString): Self = this.set("AudioDescriptionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioDescriptionNames: Self = this.set("AudioDescriptionNames", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionNamesVarargs(value: string*): Self = this.set("CaptionDescriptionNames", js.Array(value :_*))
    
    @scala.inline
    def setCaptionDescriptionNames(value: listOfString): Self = this.set("CaptionDescriptionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionDescriptionNames: Self = this.set("CaptionDescriptionNames", js.undefined)
    
    @scala.inline
    def setOutputName(value: stringMin1Max255): Self = this.set("OutputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputName: Self = this.set("OutputName", js.undefined)
    
    @scala.inline
    def setVideoDescriptionName(value: string): Self = this.set("VideoDescriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDescriptionName: Self = this.set("VideoDescriptionName", js.undefined)
  }
}
