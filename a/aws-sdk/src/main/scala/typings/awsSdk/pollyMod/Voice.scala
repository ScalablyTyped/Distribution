package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AdditionalLanguageCodes: LanguageCodeList = null,
    Gender: Gender = null,
    Id: VoiceId = null,
    LanguageCode: LanguageCode = null,
    LanguageName: LanguageName = null,
    Name: VoiceName = null,
    SupportedEngines: EngineList = null
  ): Voice = {
    val __obj = js.Dynamic.literal()
    if (AdditionalLanguageCodes != null) __obj.updateDynamic("AdditionalLanguageCodes")(AdditionalLanguageCodes.asInstanceOf[js.Any])
    if (Gender != null) __obj.updateDynamic("Gender")(Gender.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageName != null) __obj.updateDynamic("LanguageName")(LanguageName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SupportedEngines != null) __obj.updateDynamic("SupportedEngines")(SupportedEngines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
}

