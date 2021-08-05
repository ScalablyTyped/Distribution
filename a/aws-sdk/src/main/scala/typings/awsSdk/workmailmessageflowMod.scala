package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workmailmessageflowMod {
  
  @JSImport("aws-sdk/clients/workmailmessageflow", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends WorkMailMessageFlow {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.workmailmessageflowMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  trait GetRawMessageContentRequest extends StObject {
    
    /**
      * The identifier of the email message to retrieve.
      */
    var messageId: messageIdType
  }
  object GetRawMessageContentRequest {
    
    inline def apply(messageId: messageIdType): GetRawMessageContentRequest = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRawMessageContentRequest]
    }
    
    extension [Self <: GetRawMessageContentRequest](x: Self) {
      
      inline def setMessageId(value: messageIdType): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRawMessageContentResponse extends StObject {
    
    /**
      * The raw content of the email message, in MIME format.
      */
    var messageContent: messageContentBlob
  }
  object GetRawMessageContentResponse {
    
    inline def apply(messageContent: messageContentBlob): GetRawMessageContentResponse = {
      val __obj = js.Dynamic.literal(messageContent = messageContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRawMessageContentResponse]
    }
    
    extension [Self <: GetRawMessageContentResponse](x: Self) {
      
      inline def setMessageContent(value: messageContentBlob): Self = StObject.set(x, "messageContent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkMailMessageFlow extends Service {
    
    @JSName("config")
    var config_WorkMailMessageFlow: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Retrieves the raw content of an in-transit email message, in MIME format. 
      */
    def getRawMessageContent(): Request[GetRawMessageContentResponse, AWSError] = js.native
    def getRawMessageContent(callback: js.Function2[/* err */ AWSError, /* data */ GetRawMessageContentResponse, Unit]): Request[GetRawMessageContentResponse, AWSError] = js.native
    /**
      * Retrieves the raw content of an in-transit email message, in MIME format. 
      */
    def getRawMessageContent(params: GetRawMessageContentRequest): Request[GetRawMessageContentResponse, AWSError] = js.native
    def getRawMessageContent(
      params: GetRawMessageContentRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetRawMessageContentResponse, Unit]
    ): Request[GetRawMessageContentResponse, AWSError] = js.native
  }
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-05-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  
  type messageContentBlob = Buffer | Uint8Array | Blob | String | Readable
  
  type messageIdType = String
}
