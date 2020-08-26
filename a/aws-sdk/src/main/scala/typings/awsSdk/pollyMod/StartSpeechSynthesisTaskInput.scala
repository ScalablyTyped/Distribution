package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSpeechSynthesisTaskInput extends js.Object {
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. Using a voice that is not supported for the engine selected will result in an error.
    */
  var Engine: js.UndefOr[typings.awsSdk.pollyMod.Engine] = js.native
  /**
    * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.native
  /**
    * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
    */
  var OutputFormat: typings.awsSdk.pollyMod.OutputFormat = js.native
  /**
    * Amazon S3 bucket name to which the output file will be saved.
    */
  var OutputS3BucketName: typings.awsSdk.pollyMod.OutputS3BucketName = js.native
  /**
    * The Amazon S3 key prefix for the output speech file.
    */
  var OutputS3KeyPrefix: js.UndefOr[typings.awsSdk.pollyMod.OutputS3KeyPrefix] = js.native
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and "24000". The default value for standard voices is "22050". The default value for neural voices is "24000". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[typings.awsSdk.pollyMod.SampleRate] = js.native
  /**
    * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
    */
  var SnsTopicArn: js.UndefOr[typings.awsSdk.pollyMod.SnsTopicArn] = js.native
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.native
  /**
    * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
    */
  var Text: typings.awsSdk.pollyMod.Text = js.native
  /**
    * Specifies whether the input text is plain text or SSML. The default value is plain text. 
    */
  var TextType: js.UndefOr[typings.awsSdk.pollyMod.TextType] = js.native
  /**
    * Voice ID to use for the synthesis. 
    */
  var VoiceId: typings.awsSdk.pollyMod.VoiceId = js.native
}

object StartSpeechSynthesisTaskInput {
  @scala.inline
  def apply(OutputFormat: OutputFormat, OutputS3BucketName: OutputS3BucketName, Text: Text, VoiceId: VoiceId): StartSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(OutputFormat = OutputFormat.asInstanceOf[js.Any], OutputS3BucketName = OutputS3BucketName.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VoiceId = VoiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSpeechSynthesisTaskInput]
  }
  @scala.inline
  implicit class StartSpeechSynthesisTaskInputOps[Self <: StartSpeechSynthesisTaskInput] (val x: Self) extends AnyVal {
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
    def setOutputFormat(value: OutputFormat): Self = this.set("OutputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputS3BucketName(value: OutputS3BucketName): Self = this.set("OutputS3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: Text): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceId(value: VoiceId): Self = this.set("VoiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngine(value: Engine): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setLexiconNamesVarargs(value: LexiconName*): Self = this.set("LexiconNames", js.Array(value :_*))
    @scala.inline
    def setLexiconNames(value: LexiconNameList): Self = this.set("LexiconNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexiconNames: Self = this.set("LexiconNames", js.undefined)
    @scala.inline
    def setOutputS3KeyPrefix(value: OutputS3KeyPrefix): Self = this.set("OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3KeyPrefix: Self = this.set("OutputS3KeyPrefix", js.undefined)
    @scala.inline
    def setSampleRate(value: SampleRate): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    @scala.inline
    def setSnsTopicArn(value: SnsTopicArn): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
    @scala.inline
    def setSpeechMarkTypesVarargs(value: SpeechMarkType*): Self = this.set("SpeechMarkTypes", js.Array(value :_*))
    @scala.inline
    def setSpeechMarkTypes(value: SpeechMarkTypeList): Self = this.set("SpeechMarkTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeechMarkTypes: Self = this.set("SpeechMarkTypes", js.undefined)
    @scala.inline
    def setTextType(value: TextType): Self = this.set("TextType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextType: Self = this.set("TextType", js.undefined)
  }
  
}

