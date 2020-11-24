package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Voice extends js.Object {
  
  /**
    * Additional codes for languages available for the specified voice in addition to its default language.  For example, the default language for Aditi is Indian English (en-IN) because it was first used for that language. Since Aditi is bilingual and fluent in both Indian English and Hindi, this parameter would show the code hi-IN.
    */
  var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList] = js.native
  
  /**
    * Gender of the voice.
    */
  var Gender: js.UndefOr[typings.awsSdk.pollyMod.Gender] = js.native
  
  /**
    * Amazon Polly assigned voice ID. This is the ID that you specify when calling the SynthesizeSpeech operation.
    */
  var Id: js.UndefOr[VoiceId] = js.native
  
  /**
    * Language code of the voice.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.pollyMod.LanguageCode] = js.native
  
  /**
    * Human readable name of the language in English.
    */
  var LanguageName: js.UndefOr[typings.awsSdk.pollyMod.LanguageName] = js.native
  
  /**
    * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might display in your application.
    */
  var Name: js.UndefOr[VoiceName] = js.native
  
  /**
    * Specifies which engines (standard or neural) that are supported by a given voice.
    */
  var SupportedEngines: js.UndefOr[EngineList] = js.native
}
object Voice {
  
  @scala.inline
  def apply(): Voice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Voice]
  }
  
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
    
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
    def setAdditionalLanguageCodesVarargs(value: LanguageCode*): Self = this.set("AdditionalLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalLanguageCodes(value: LanguageCodeList): Self = this.set("AdditionalLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalLanguageCodes: Self = this.set("AdditionalLanguageCodes", js.undefined)
    
    @scala.inline
    def setGender(value: Gender): Self = this.set("Gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("Gender", js.undefined)
    
    @scala.inline
    def setId(value: VoiceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageName(value: LanguageName): Self = this.set("LanguageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageName: Self = this.set("LanguageName", js.undefined)
    
    @scala.inline
    def setName(value: VoiceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSupportedEnginesVarargs(value: Engine*): Self = this.set("SupportedEngines", js.Array(value :_*))
    
    @scala.inline
    def setSupportedEngines(value: EngineList): Self = this.set("SupportedEngines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedEngines: Self = this.set("SupportedEngines", js.undefined)
  }
}
