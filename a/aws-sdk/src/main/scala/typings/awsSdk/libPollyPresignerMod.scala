package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.clientsPollyMod.SynthesizeSpeechInput
import typings.awsSdk.clientsPollyMod.^
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libPollyPresignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPollyPresignerMod {
  
  @JSImport("aws-sdk/lib/polly/presigner", "Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  open class Presigner () extends StObject {
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
  object Presigner {
    
    trait PresignerOptions extends StObject {
      
      /**
        * An optional map of parameters to bind to every request sent by this service object. 
        */
      var params: js.UndefOr[StringDictionary[Any]] = js.undefined
      
      /**
        * An optional pre-configured instance of the AWS.Polly service object to use for requests. The object may bound parameters used by the presigner.
        */
      var service: js.UndefOr[^] = js.undefined
    }
    object PresignerOptions {
      
      inline def apply(): PresignerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PresignerOptions]
      }
      
      extension [Self <: PresignerOptions](x: Self) {
        
        inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setService(value: ^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      }
    }
  }
}
