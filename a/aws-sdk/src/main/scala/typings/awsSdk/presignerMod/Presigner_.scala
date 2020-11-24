package typings.awsSdk.presignerMod

import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.pollyMod.SynthesizeSpeechInput
import typings.awsSdk.presignerMod.Presigner.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/polly/presigner", "Presigner")
@js.native
/**
  * Creates a presigner object with a set of configuration options.
  */
class Presigner_ () extends js.Object {
  def this(options: PresignerOptions) = this()
  
  /**
    * Generate a signed URL.
    */
  def getSynthesizeSpeechUrl(params: SynthesizeSpeechInput): String = js.native
  /**
    * Generate a signed URL.
    */
  def getSynthesizeSpeechUrl(params: SynthesizeSpeechInput, callback: js.Function2[/* err */ AWSError, /* url */ String, Unit]): Unit = js.native
  /**
    * Generate a signed URL.
    */
  def getSynthesizeSpeechUrl(
    params: SynthesizeSpeechInput,
    error: Double,
    callback: js.Function2[/* err */ AWSError, /* url */ String, Unit]
  ): Unit = js.native
  def getSynthesizeSpeechUrl(params: SynthesizeSpeechInput, expires: Double): String = js.native
}
