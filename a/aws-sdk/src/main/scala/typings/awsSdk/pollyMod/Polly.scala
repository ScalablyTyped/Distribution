package typings.awsSdk.pollyMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.servicesPollyMod.PollyCustomizations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polly extends PollyCustomizations {
  
  @JSName("config")
  var config_Polly: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
    */
  def deleteLexicon(): Request[DeleteLexiconOutput, AWSError] = js.native
  def deleteLexicon(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLexiconOutput, Unit]): Request[DeleteLexiconOutput, AWSError] = js.native
  /**
    * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
    */
  def deleteLexicon(params: DeleteLexiconInput): Request[DeleteLexiconOutput, AWSError] = js.native
  def deleteLexicon(
    params: DeleteLexiconInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLexiconOutput, Unit]
  ): Request[DeleteLexiconOutput, AWSError] = js.native
  
  /**
    * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
    */
  def describeVoices(): Request[DescribeVoicesOutput, AWSError] = js.native
  def describeVoices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVoicesOutput, Unit]): Request[DescribeVoicesOutput, AWSError] = js.native
  /**
    * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
    */
  def describeVoices(params: DescribeVoicesInput): Request[DescribeVoicesOutput, AWSError] = js.native
  def describeVoices(
    params: DescribeVoicesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVoicesOutput, Unit]
  ): Request[DescribeVoicesOutput, AWSError] = js.native
  
  /**
    * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def getLexicon(): Request[GetLexiconOutput, AWSError] = js.native
  def getLexicon(callback: js.Function2[/* err */ AWSError, /* data */ GetLexiconOutput, Unit]): Request[GetLexiconOutput, AWSError] = js.native
  /**
    * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def getLexicon(params: GetLexiconInput): Request[GetLexiconOutput, AWSError] = js.native
  def getLexicon(
    params: GetLexiconInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLexiconOutput, Unit]
  ): Request[GetLexiconOutput, AWSError] = js.native
  
  /**
    * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
    */
  def getSpeechSynthesisTask(): Request[GetSpeechSynthesisTaskOutput, AWSError] = js.native
  def getSpeechSynthesisTask(callback: js.Function2[/* err */ AWSError, /* data */ GetSpeechSynthesisTaskOutput, Unit]): Request[GetSpeechSynthesisTaskOutput, AWSError] = js.native
  /**
    * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
    */
  def getSpeechSynthesisTask(params: GetSpeechSynthesisTaskInput): Request[GetSpeechSynthesisTaskOutput, AWSError] = js.native
  def getSpeechSynthesisTask(
    params: GetSpeechSynthesisTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSpeechSynthesisTaskOutput, Unit]
  ): Request[GetSpeechSynthesisTaskOutput, AWSError] = js.native
  
  /**
    * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def listLexicons(): Request[ListLexiconsOutput, AWSError] = js.native
  def listLexicons(callback: js.Function2[/* err */ AWSError, /* data */ ListLexiconsOutput, Unit]): Request[ListLexiconsOutput, AWSError] = js.native
  /**
    * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def listLexicons(params: ListLexiconsInput): Request[ListLexiconsOutput, AWSError] = js.native
  def listLexicons(
    params: ListLexiconsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLexiconsOutput, Unit]
  ): Request[ListLexiconsOutput, AWSError] = js.native
  
  /**
    * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
    */
  def listSpeechSynthesisTasks(): Request[ListSpeechSynthesisTasksOutput, AWSError] = js.native
  def listSpeechSynthesisTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListSpeechSynthesisTasksOutput, Unit]): Request[ListSpeechSynthesisTasksOutput, AWSError] = js.native
  /**
    * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
    */
  def listSpeechSynthesisTasks(params: ListSpeechSynthesisTasksInput): Request[ListSpeechSynthesisTasksOutput, AWSError] = js.native
  def listSpeechSynthesisTasks(
    params: ListSpeechSynthesisTasksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSpeechSynthesisTasksOutput, Unit]
  ): Request[ListSpeechSynthesisTasksOutput, AWSError] = js.native
  
  /**
    * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
    */
  def putLexicon(): Request[PutLexiconOutput, AWSError] = js.native
  def putLexicon(callback: js.Function2[/* err */ AWSError, /* data */ PutLexiconOutput, Unit]): Request[PutLexiconOutput, AWSError] = js.native
  /**
    * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
    */
  def putLexicon(params: PutLexiconInput): Request[PutLexiconOutput, AWSError] = js.native
  def putLexicon(
    params: PutLexiconInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLexiconOutput, Unit]
  ): Request[PutLexiconOutput, AWSError] = js.native
  
  /**
    * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
    */
  def startSpeechSynthesisTask(): Request[StartSpeechSynthesisTaskOutput, AWSError] = js.native
  def startSpeechSynthesisTask(callback: js.Function2[/* err */ AWSError, /* data */ StartSpeechSynthesisTaskOutput, Unit]): Request[StartSpeechSynthesisTaskOutput, AWSError] = js.native
  /**
    * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
    */
  def startSpeechSynthesisTask(params: StartSpeechSynthesisTaskInput): Request[StartSpeechSynthesisTaskOutput, AWSError] = js.native
  def startSpeechSynthesisTask(
    params: StartSpeechSynthesisTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSpeechSynthesisTaskOutput, Unit]
  ): Request[StartSpeechSynthesisTaskOutput, AWSError] = js.native
  
  /**
    * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
    */
  def synthesizeSpeech(): Request[SynthesizeSpeechOutput, AWSError] = js.native
  def synthesizeSpeech(callback: js.Function2[/* err */ AWSError, /* data */ SynthesizeSpeechOutput, Unit]): Request[SynthesizeSpeechOutput, AWSError] = js.native
  /**
    * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
    */
  def synthesizeSpeech(params: SynthesizeSpeechInput): Request[SynthesizeSpeechOutput, AWSError] = js.native
  def synthesizeSpeech(
    params: SynthesizeSpeechInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SynthesizeSpeechOutput, Unit]
  ): Request[SynthesizeSpeechOutput, AWSError] = js.native
}
