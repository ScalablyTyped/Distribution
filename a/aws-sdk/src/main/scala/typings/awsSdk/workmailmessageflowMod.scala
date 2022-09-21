package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workmailmessageflowMod {
  
  @JSImport("aws-sdk/clients/workmailmessageflow", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends WorkMailMessageFlow {
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
  
  trait PutRawMessageContentRequest extends StObject {
    
    /**
      * Describes the raw message content of the updated email message.
      */
    var content: RawMessageContent
    
    /**
      * The identifier of the email message being updated.
      */
    var messageId: messageIdType
  }
  object PutRawMessageContentRequest {
    
    inline def apply(content: RawMessageContent, messageId: messageIdType): PutRawMessageContentRequest = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRawMessageContentRequest]
    }
    
    extension [Self <: PutRawMessageContentRequest](x: Self) {
      
      inline def setContent(value: RawMessageContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: messageIdType): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutRawMessageContentResponse extends StObject
  
  trait RawMessageContent extends StObject {
    
    /**
      * The S3 reference of an email message.
      */
    var s3Reference: S3Reference
  }
  object RawMessageContent {
    
    inline def apply(s3Reference: S3Reference): RawMessageContent = {
      val __obj = js.Dynamic.literal(s3Reference = s3Reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawMessageContent]
    }
    
    extension [Self <: RawMessageContent](x: Self) {
      
      inline def setS3Reference(value: S3Reference): Self = StObject.set(x, "s3Reference", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3Reference extends StObject {
    
    /**
      * The S3 bucket name.
      */
    var bucket: s3BucketIdType
    
    /**
      * The S3 key object name.
      */
    var key: s3KeyIdType
    
    /**
      * If you enable versioning for the bucket, you can specify the object version.
      */
    var objectVersion: js.UndefOr[s3VersionType] = js.undefined
  }
  object S3Reference {
    
    inline def apply(bucket: s3BucketIdType, key: s3KeyIdType): S3Reference = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Reference]
    }
    
    extension [Self <: S3Reference](x: Self) {
      
      inline def setBucket(value: s3BucketIdType): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setKey(value: s3KeyIdType): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setObjectVersion(value: s3VersionType): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
      
      inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
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
    
    /**
      * Updates the raw content of an in-transit email message, in MIME format. This example describes how to update in-transit email message. For more information and examples for using this API, see  Updating message content with AWS Lambda.  Updates to an in-transit message only appear when you call PutRawMessageContent from an AWS Lambda function configured with a synchronous  Run Lambda rule. If you call PutRawMessageContent on a delivered or sent message, the message remains unchanged, even though GetRawMessageContent returns an updated message.  
      */
    def putRawMessageContent(): Request[PutRawMessageContentResponse, AWSError] = js.native
    def putRawMessageContent(callback: js.Function2[/* err */ AWSError, /* data */ PutRawMessageContentResponse, Unit]): Request[PutRawMessageContentResponse, AWSError] = js.native
    /**
      * Updates the raw content of an in-transit email message, in MIME format. This example describes how to update in-transit email message. For more information and examples for using this API, see  Updating message content with AWS Lambda.  Updates to an in-transit message only appear when you call PutRawMessageContent from an AWS Lambda function configured with a synchronous  Run Lambda rule. If you call PutRawMessageContent on a delivered or sent message, the message remains unchanged, even though GetRawMessageContent returns an updated message.  
      */
    def putRawMessageContent(params: PutRawMessageContentRequest): Request[PutRawMessageContentResponse, AWSError] = js.native
    def putRawMessageContent(
      params: PutRawMessageContentRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ PutRawMessageContentResponse, Unit]
    ): Request[PutRawMessageContentResponse, AWSError] = js.native
  }
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-05-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  
  type messageContentBlob = Buffer | js.typedarray.Uint8Array | Blob | String | Readable
  
  type messageIdType = String
  
  type s3BucketIdType = String
  
  type s3KeyIdType = String
  
  type s3VersionType = String
}
