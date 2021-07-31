package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * The names of the AudioDescriptions used as audio sources for this output.
    */
  var AudioDescriptionNames: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The names of the CaptionDescriptions used as caption sources for this output.
    */
  var CaptionDescriptionNames: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The name used to identify an output.
    */
  var OutputName: js.UndefOr[stringMin1Max255] = js.undefined
  
  /**
    * Output type-specific settings.
    */
  var OutputSettings: typings.awsSdk.medialiveMod.OutputSettings
  
  /**
    * The name of the VideoDescription used as the source for this output.
    */
  var VideoDescriptionName: js.UndefOr[string] = js.undefined
}
object Output {
  
  @scala.inline
  def apply(OutputSettings: OutputSettings): Output = {
    val __obj = js.Dynamic.literal(OutputSettings = OutputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDescriptionNames(value: listOfString): Self = StObject.set(x, "AudioDescriptionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDescriptionNamesUndefined: Self = StObject.set(x, "AudioDescriptionNames", js.undefined)
    
    @scala.inline
    def setAudioDescriptionNamesVarargs(value: string*): Self = StObject.set(x, "AudioDescriptionNames", js.Array(value :_*))
    
    @scala.inline
    def setCaptionDescriptionNames(value: listOfString): Self = StObject.set(x, "CaptionDescriptionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionDescriptionNamesUndefined: Self = StObject.set(x, "CaptionDescriptionNames", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionNamesVarargs(value: string*): Self = StObject.set(x, "CaptionDescriptionNames", js.Array(value :_*))
    
    @scala.inline
    def setOutputName(value: stringMin1Max255): Self = StObject.set(x, "OutputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputNameUndefined: Self = StObject.set(x, "OutputName", js.undefined)
    
    @scala.inline
    def setOutputSettings(value: OutputSettings): Self = StObject.set(x, "OutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptionName(value: string): Self = StObject.set(x, "VideoDescriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptionNameUndefined: Self = StObject.set(x, "VideoDescriptionName", js.undefined)
  }
}
