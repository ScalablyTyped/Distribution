package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemakerruntimeMod {
  
  @JSImport("aws-sdk/clients/sagemakerruntime", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends SageMakerRuntime {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  type BodyBlob = Buffer | Uint8Array | Blob | String
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.sagemakerruntimeMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type CustomAttributesHeader = String
  
  type EndpointName = String
  
  type Header = String
  
  trait InvokeEndpointInput extends StObject {
    
    /**
      * The desired MIME type of the inference in the response.
      */
    var Accept: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides input data, in the format specified in the ContentType request header. Amazon SageMaker passes all of the data in the body to the model.  For information about the format of the request body, see Common Data Formats-Inference.
      */
    var Body: BodyBlob
    
    /**
      * The MIME type of the input data in the request body.
      */
    var ContentType: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides additional information about a request for an inference submitted to a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to provide an ID that you can use to track a request or to provide other metadata that a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). This feature is currently supported in the AWS SDKs but not in the Amazon SageMaker Python SDK.
      */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    
    /**
      * The name of the endpoint that you specified when you created the endpoint using the CreateEndpoint API. 
      */
    var EndpointName: typings.awsSdk.sagemakerruntimeMod.EndpointName
    
    /**
      * The model to request for inference when invoking a multi-model endpoint. 
      */
    var TargetModel: js.UndefOr[TargetModelHeader] = js.undefined
    
    /**
      * Specify the production variant to send the inference request to when invoking an endpoint that is running two or more variants. Note that this parameter overrides the default behavior for the endpoint, which is to distribute the invocation traffic based on the variant weights.
      */
    var TargetVariant: js.UndefOr[TargetVariantHeader] = js.undefined
  }
  object InvokeEndpointInput {
    
    @scala.inline
    def apply(Body: BodyBlob, EndpointName: EndpointName): InvokeEndpointInput = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeEndpointInput]
    }
    
    @scala.inline
    implicit class InvokeEndpointInputMutableBuilder[Self <: InvokeEndpointInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: Header): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "Accept", js.undefined)
      
      @scala.inline
      def setBody(value: BodyBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: Header): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setCustomAttributes(value: CustomAttributesHeader): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributesUndefined: Self = StObject.set(x, "CustomAttributes", js.undefined)
      
      @scala.inline
      def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetModel(value: TargetModelHeader): Self = StObject.set(x, "TargetModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetModelUndefined: Self = StObject.set(x, "TargetModel", js.undefined)
      
      @scala.inline
      def setTargetVariant(value: TargetVariantHeader): Self = StObject.set(x, "TargetVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVariantUndefined: Self = StObject.set(x, "TargetVariant", js.undefined)
    }
  }
  
  trait InvokeEndpointOutput extends StObject {
    
    /**
      * Includes the inference provided by the model. For information about the format of the response body, see Common Data Formats-Inference.
      */
    var Body: BodyBlob
    
    /**
      * The MIME type of the inference returned in the response body.
      */
    var ContentType: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides additional information in the response about the inference returned by a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to return an ID received in the CustomAttributes header of a request or other metadata that a service endpoint was programmed to produce. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). If the customer wants the custom attribute returned, the model must set the custom attribute to be included on the way back.  This feature is currently supported in the AWS SDKs but not in the Amazon SageMaker Python SDK.
      */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    
    /**
      * Identifies the production variant that was invoked.
      */
    var InvokedProductionVariant: js.UndefOr[Header] = js.undefined
  }
  object InvokeEndpointOutput {
    
    @scala.inline
    def apply(Body: BodyBlob): InvokeEndpointOutput = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeEndpointOutput]
    }
    
    @scala.inline
    implicit class InvokeEndpointOutputMutableBuilder[Self <: InvokeEndpointOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: BodyBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: Header): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setCustomAttributes(value: CustomAttributesHeader): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributesUndefined: Self = StObject.set(x, "CustomAttributes", js.undefined)
      
      @scala.inline
      def setInvokedProductionVariant(value: Header): Self = StObject.set(x, "InvokedProductionVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokedProductionVariantUndefined: Self = StObject.set(x, "InvokedProductionVariant", js.undefined)
    }
  }
  
  @js.native
  trait SageMakerRuntime extends Service {
    
    @JSName("config")
    var config_SageMakerRuntime: ConfigBase & ClientConfiguration = js.native
    
    /**
      * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Calls to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference. A customer's model containers must respond to requests within 60 seconds. The model itself can have a maximum processing time of 60 seconds before responding to the /invocations. If your model is going to take 50-60 seconds of processing time, the SDK socket timeout should be set to be 70 seconds.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
      */
    def invokeEndpoint(): Request[InvokeEndpointOutput, AWSError] = js.native
    def invokeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ InvokeEndpointOutput, Unit]): Request[InvokeEndpointOutput, AWSError] = js.native
    /**
      * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Calls to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference. A customer's model containers must respond to requests within 60 seconds. The model itself can have a maximum processing time of 60 seconds before responding to the /invocations. If your model is going to take 50-60 seconds of processing time, the SDK socket timeout should be set to be 70 seconds.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
      */
    def invokeEndpoint(params: InvokeEndpointInput): Request[InvokeEndpointOutput, AWSError] = js.native
    def invokeEndpoint(
      params: InvokeEndpointInput,
      callback: js.Function2[/* err */ AWSError, /* data */ InvokeEndpointOutput, Unit]
    ): Request[InvokeEndpointOutput, AWSError] = js.native
  }
  
  type TargetModelHeader = String
  
  type TargetVariantHeader = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-05-13`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
