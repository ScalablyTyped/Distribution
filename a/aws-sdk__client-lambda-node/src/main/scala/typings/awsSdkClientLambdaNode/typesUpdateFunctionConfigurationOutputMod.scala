package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.`nodejs4Dot3-edge`
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore1Dot0
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot0
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot1
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.go1Dotx
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.java8
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs4Dot3
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs6Dot10
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs8Dot10
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python2Dot7
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python3Dot6
import typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.UnmarshalledDeadLetterConfig
import typings.awsSdkClientLambdaNode.typesEnvironmentResponseMod.UnmarshalledEnvironmentResponse
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesTracingConfigResponseMod.UnmarshalledTracingConfigResponse
import typings.awsSdkClientLambdaNode.typesVpcConfigResponseMod.UnmarshalledVpcConfigResponse
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateFunctionConfigurationOutputMod {
  
  trait UpdateFunctionConfigurationOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The SHA256 hash of the function's deployment package.</p>
      */
    var CodeSha256: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The size of the function's deployment package in bytes.</p>
      */
    var CodeSize: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The function's dead letter queue.</p>
      */
    var DeadLetterConfig: js.UndefOr[UnmarshalledDeadLetterConfig] = js.undefined
    
    /**
      * <p>The function's description.</p>
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The function's environment variables.</p>
      */
    var Environment: js.UndefOr[UnmarshalledEnvironmentResponse] = js.undefined
    
    /**
      * <p>The function's Amazon Resource Name.</p>
      */
    var FunctionArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the function.</p>
      */
    var FunctionName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The function Lambda calls to begin executing your function.</p>
      */
    var Handler: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The KMS key used to encrypt the function's environment variables. Only returned if you've configured a customer managed CMK.</p>
      */
    var KMSKeyArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ssTZD).</p>
      */
    var LastModified: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ARN of the master function.</p>
      */
    var MasterArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The memory allocated to the function</p>
      */
    var MemorySize: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The function's execution role.</p>
      */
    var Role: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The runtime environment for the Lambda function.</p>
      */
    var Runtime: js.UndefOr[
        nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
      ] = js.undefined
    
    /**
      * <p>The amount of time that Lambda allows a function to run before terminating it.</p>
      */
    var Timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The function's AWS X-Ray tracing configuration.</p>
      */
    var TracingConfig: js.UndefOr[UnmarshalledTracingConfigResponse] = js.undefined
    
    /**
      * <p>The version of the Lambda function.</p>
      */
    var Version: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The function's networking configuration.</p>
      */
    var VpcConfig: js.UndefOr[UnmarshalledVpcConfigResponse] = js.undefined
  }
  object UpdateFunctionConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateFunctionConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateFunctionConfigurationOutput]
    }
    
    extension [Self <: UpdateFunctionConfigurationOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCodeSha256(value: String): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
      
      inline def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
      
      inline def setCodeSize(value: Double): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
      
      inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
      
      inline def setDeadLetterConfig(value: UnmarshalledDeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
      
      inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setEnvironment(value: UnmarshalledEnvironmentResponse): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
      
      inline def setFunctionArn(value: String): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
      
      inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
      
      inline def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
      
      inline def setKMSKeyArn(value: String): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
      
      inline def setLastModified(value: String): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      inline def setMasterArn(value: String): Self = StObject.set(x, "MasterArn", value.asInstanceOf[js.Any])
      
      inline def setMasterArnUndefined: Self = StObject.set(x, "MasterArn", js.undefined)
      
      inline def setMemorySize(value: Double): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
      
      inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
      
      inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
      
      inline def setRuntime(
        value: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
      ): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
      
      inline def setTracingConfig(value: UnmarshalledTracingConfigResponse): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
      
      inline def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
      
      inline def setVpcConfig(value: UnmarshalledVpcConfigResponse): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
      
      inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
    }
  }
}
