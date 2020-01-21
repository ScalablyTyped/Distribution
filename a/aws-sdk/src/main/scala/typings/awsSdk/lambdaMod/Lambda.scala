package typings.awsSdk.lambdaMod

import typings.awsSdk.AnonWaiter
import typings.awsSdk.awsSdkStrings.functionActive
import typings.awsSdk.awsSdkStrings.functionExists
import typings.awsSdk.awsSdkStrings.functionUpdated
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lambda extends Service {
  @JSName("config")
  var config_Lambda: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
    */
  def addLayerVersionPermission(): Request[AddLayerVersionPermissionResponse, AWSError] = js.native
  def addLayerVersionPermission(callback: js.Function2[/* err */ AWSError, /* data */ AddLayerVersionPermissionResponse, Unit]): Request[AddLayerVersionPermissionResponse, AWSError] = js.native
  /**
    * Adds permissions to the resource-based policy of a version of an AWS Lambda layer. Use this action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS accounts, or all accounts in an organization. To revoke permission, call RemoveLayerVersionPermission with the statement ID that you specified when you added it.
    */
  def addLayerVersionPermission(params: AddLayerVersionPermissionRequest): Request[AddLayerVersionPermissionResponse, AWSError] = js.native
  def addLayerVersionPermission(
    params: AddLayerVersionPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddLayerVersionPermissionResponse, Unit]
  ): Request[AddLayerVersionPermissionResponse, AWSError] = js.native
  /**
    * Grants an AWS service or another account permission to use a function. You can apply the policy at the function level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function. To grant permission to another account, specify the account ID as the Principal. For AWS services, the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the associated resource as the SourceArn or SourceAccount. If you grant permission to a service principal without specifying the source, other accounts could potentially configure resources in their account to invoke your Lambda function. This action adds a statement to a resource-based permissions policy for the function. For more information about function policies, see Lambda Function Policies. 
    */
  def addPermission(): Request[AddPermissionResponse, AWSError] = js.native
  def addPermission(callback: js.Function2[/* err */ AWSError, /* data */ AddPermissionResponse, Unit]): Request[AddPermissionResponse, AWSError] = js.native
  /**
    * Grants an AWS service or another account permission to use a function. You can apply the policy at the function level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function. To grant permission to another account, specify the account ID as the Principal. For AWS services, the principal is a domain-style identifier defined by the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services, you can also specify the ARN or owning account of the associated resource as the SourceArn or SourceAccount. If you grant permission to a service principal without specifying the source, other accounts could potentially configure resources in their account to invoke your Lambda function. This action adds a statement to a resource-based permissions policy for the function. For more information about function policies, see Lambda Function Policies. 
    */
  def addPermission(params: AddPermissionRequest): Request[AddPermissionResponse, AWSError] = js.native
  def addPermission(
    params: AddPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddPermissionResponse, Unit]
  ): Request[AddPermissionResponse, AWSError] = js.native
  /**
    * Creates an alias for a Lambda function version. Use aliases to provide clients with a function identifier that you can update to invoke a different version. You can also map an alias to split invocation requests between two versions. Use the RoutingConfig parameter to specify a second version and the percentage of invocation requests that it receives.
    */
  def createAlias(): Request[AliasConfiguration, AWSError] = js.native
  def createAlias(callback: js.Function2[/* err */ AWSError, /* data */ AliasConfiguration, Unit]): Request[AliasConfiguration, AWSError] = js.native
  /**
    * Creates an alias for a Lambda function version. Use aliases to provide clients with a function identifier that you can update to invoke a different version. You can also map an alias to split invocation requests between two versions. Use the RoutingConfig parameter to specify a second version and the percentage of invocation requests that it receives.
    */
  def createAlias(params: CreateAliasRequest): Request[AliasConfiguration, AWSError] = js.native
  def createAlias(
    params: CreateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AliasConfiguration, Unit]
  ): Request[AliasConfiguration, AWSError] = js.native
  /**
    * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon DynamoDB     Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS    The following error handling options are only available for stream sources (DynamoDB and Kinesis):    BisectBatchOnFunctionError - If the function returns an error, split the batch in two and retry.    DestinationConfig - Send discarded records to an Amazon SQS queue or Amazon SNS topic.    MaximumRecordAgeInSeconds - Discard records older than the specified age.    MaximumRetryAttempts - Discard records after the specified number of retries.  
    */
  def createEventSourceMapping(): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def createEventSourceMapping(callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source and triggers the function. For details about each event source type, see the following topics.    Using AWS Lambda with Amazon DynamoDB     Using AWS Lambda with Amazon Kinesis     Using AWS Lambda with Amazon SQS    The following error handling options are only available for stream sources (DynamoDB and Kinesis):    BisectBatchOnFunctionError - If the function returns an error, split the batch in two and retry.    DestinationConfig - Send discarded records to an Amazon SQS queue or Amazon SNS topic.    MaximumRecordAgeInSeconds - Discard records older than the specified age.    MaximumRetryAttempts - Discard records after the specified number of retries.  
    */
  def createEventSourceMapping(params: CreateEventSourceMappingRequest): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def createEventSourceMapping(
    params: CreateEventSourceMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]
  ): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Creates a Lambda function. To create a function, you need a deployment package and an execution role. The deployment package contains your function code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing. When you create a function, Lambda provisions an instance of the function and its supporting resources. If your function connects to a VPC, this process can take a minute or so. During this time, you can't invoke or modify the function. The State, StateReason, and StateReasonCode fields in the response from GetFunctionConfiguration indicate when the function is ready to invoke. For more information, see Function States. A function has an unpublished version, and can have published versions and aliases. The unpublished version changes when you update your function's code and configuration. A published version is a snapshot of your function code and configuration that can't be changed. An alias is a named resource that maps to a version, and can be changed to map to a different version. Use the Publish parameter to create version 1 of your function from its initial configuration. The other parameters let you configure version-specific and function-level settings. You can modify version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both the unpublished and published versions of the function, and include tags (TagResource) and per-function concurrency limits (PutFunctionConcurrency). If another account or an AWS service invokes your function, use AddPermission to grant permission by creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an alias. To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in the other service. For more information, see Invoking Functions.
    */
  def createFunction(): Request[FunctionConfiguration, AWSError] = js.native
  def createFunction(callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Creates a Lambda function. To create a function, you need a deployment package and an execution role. The deployment package contains your function code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing. When you create a function, Lambda provisions an instance of the function and its supporting resources. If your function connects to a VPC, this process can take a minute or so. During this time, you can't invoke or modify the function. The State, StateReason, and StateReasonCode fields in the response from GetFunctionConfiguration indicate when the function is ready to invoke. For more information, see Function States. A function has an unpublished version, and can have published versions and aliases. The unpublished version changes when you update your function's code and configuration. A published version is a snapshot of your function code and configuration that can't be changed. An alias is a named resource that maps to a version, and can be changed to map to a different version. Use the Publish parameter to create version 1 of your function from its initial configuration. The other parameters let you configure version-specific and function-level settings. You can modify version-specific settings later with UpdateFunctionConfiguration. Function-level settings apply to both the unpublished and published versions of the function, and include tags (TagResource) and per-function concurrency limits (PutFunctionConcurrency). If another account or an AWS service invokes your function, use AddPermission to grant permission by creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an alias. To invoke your function directly, use Invoke. To invoke your function in response to events in other AWS services, create an event source mapping (CreateEventSourceMapping), or configure a function trigger in the other service. For more information, see Invoking Functions.
    */
  def createFunction(params: CreateFunctionRequest): Request[FunctionConfiguration, AWSError] = js.native
  def createFunction(
    params: CreateFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Deletes a Lambda function alias.
    */
  def deleteAlias(): Request[js.Object, AWSError] = js.native
  def deleteAlias(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Lambda function alias.
    */
  def deleteAlias(params: DeleteAliasRequest): Request[js.Object, AWSError] = js.native
  def deleteAlias(params: DeleteAliasRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings. When you delete an event source mapping, it enters a Deleting state and might not be completely deleted for several seconds.
    */
  def deleteEventSourceMapping(): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def deleteEventSourceMapping(callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Deletes an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings. When you delete an event source mapping, it enters a Deleting state and might not be completely deleted for several seconds.
    */
  def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def deleteEventSourceMapping(
    params: DeleteEventSourceMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]
  ): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS services and resources that invoke your function directly, delete the trigger in the service where you originally configured it.
    */
  def deleteFunction(): Request[js.Object, AWSError] = js.native
  def deleteFunction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Lambda function. To delete a specific function version, use the Qualifier parameter. Otherwise, all versions and aliases are deleted. To delete Lambda event source mappings that invoke a function, use DeleteEventSourceMapping. For AWS services and resources that invoke your function directly, delete the trigger in the service where you originally configured it.
    */
  def deleteFunction(params: DeleteFunctionRequest): Request[js.Object, AWSError] = js.native
  def deleteFunction(
    params: DeleteFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes a concurrent execution limit from a function.
    */
  def deleteFunctionConcurrency(): Request[js.Object, AWSError] = js.native
  def deleteFunctionConcurrency(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a concurrent execution limit from a function.
    */
  def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): Request[js.Object, AWSError] = js.native
  def deleteFunctionConcurrency(
    params: DeleteFunctionConcurrencyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the configuration for asynchronous invocation for a function, version, or alias. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def deleteFunctionEventInvokeConfig(): Request[js.Object, AWSError] = js.native
  def deleteFunctionEventInvokeConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the configuration for asynchronous invocation for a function, version, or alias. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def deleteFunctionEventInvokeConfig(params: DeleteFunctionEventInvokeConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteFunctionEventInvokeConfig(
    params: DeleteFunctionEventInvokeConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a version of an AWS Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a copy of the version remains in Lambda until no functions refer to it.
    */
  def deleteLayerVersion(): Request[js.Object, AWSError] = js.native
  def deleteLayerVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a version of an AWS Lambda layer. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a copy of the version remains in Lambda until no functions refer to it.
    */
  def deleteLayerVersion(params: DeleteLayerVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteLayerVersion(
    params: DeleteLayerVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the provisioned concurrency configuration for a function.
    */
  def deleteProvisionedConcurrencyConfig(): Request[js.Object, AWSError] = js.native
  def deleteProvisionedConcurrencyConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the provisioned concurrency configuration for a function.
    */
  def deleteProvisionedConcurrencyConfig(params: DeleteProvisionedConcurrencyConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteProvisionedConcurrencyConfig(
    params: DeleteProvisionedConcurrencyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieves details about your account's limits and usage in an AWS Region.
    */
  def getAccountSettings(): Request[GetAccountSettingsResponse, AWSError] = js.native
  def getAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResponse, Unit]): Request[GetAccountSettingsResponse, AWSError] = js.native
  /**
    * Retrieves details about your account's limits and usage in an AWS Region.
    */
  def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse, AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResponse, Unit]
  ): Request[GetAccountSettingsResponse, AWSError] = js.native
  /**
    * Returns details about a Lambda function alias.
    */
  def getAlias(): Request[AliasConfiguration, AWSError] = js.native
  def getAlias(callback: js.Function2[/* err */ AWSError, /* data */ AliasConfiguration, Unit]): Request[AliasConfiguration, AWSError] = js.native
  /**
    * Returns details about a Lambda function alias.
    */
  def getAlias(params: GetAliasRequest): Request[AliasConfiguration, AWSError] = js.native
  def getAlias(
    params: GetAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AliasConfiguration, Unit]
  ): Request[AliasConfiguration, AWSError] = js.native
  /**
    * Returns details about an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
    */
  def getEventSourceMapping(): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def getEventSourceMapping(callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Returns details about an event source mapping. You can get the identifier of a mapping from the output of ListEventSourceMappings.
    */
  def getEventSourceMapping(params: GetEventSourceMappingRequest): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def getEventSourceMapping(
    params: GetEventSourceMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]
  ): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Returns information about the function or function version, with a link to download the deployment package that's valid for 10 minutes. If you specify a function version, only details that are specific to that version are returned.
    */
  def getFunction(): Request[GetFunctionResponse, AWSError] = js.native
  def getFunction(callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionResponse, Unit]): Request[GetFunctionResponse, AWSError] = js.native
  /**
    * Returns information about the function or function version, with a link to download the deployment package that's valid for 10 minutes. If you specify a function version, only details that are specific to that version are returned.
    */
  def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse, AWSError] = js.native
  def getFunction(
    params: GetFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionResponse, Unit]
  ): Request[GetFunctionResponse, AWSError] = js.native
  /**
    * Returns details about the concurrency configuration for a function. To set a concurrency limit for a function, use PutFunctionConcurrency.
    */
  def getFunctionConcurrency(): Request[GetFunctionConcurrencyResponse, AWSError] = js.native
  def getFunctionConcurrency(callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionConcurrencyResponse, Unit]): Request[GetFunctionConcurrencyResponse, AWSError] = js.native
  /**
    * Returns details about the concurrency configuration for a function. To set a concurrency limit for a function, use PutFunctionConcurrency.
    */
  def getFunctionConcurrency(params: GetFunctionConcurrencyRequest): Request[GetFunctionConcurrencyResponse, AWSError] = js.native
  def getFunctionConcurrency(
    params: GetFunctionConcurrencyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionConcurrencyResponse, Unit]
  ): Request[GetFunctionConcurrencyResponse, AWSError] = js.native
  /**
    * Returns the version-specific settings of a Lambda function or version. The output includes only options that can vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration. To get all of a function's details, including function-level settings, use GetFunction.
    */
  def getFunctionConfiguration(): Request[FunctionConfiguration, AWSError] = js.native
  def getFunctionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Returns the version-specific settings of a Lambda function or version. The output includes only options that can vary between versions of a function. To modify these settings, use UpdateFunctionConfiguration. To get all of a function's details, including function-level settings, use GetFunction.
    */
  def getFunctionConfiguration(params: GetFunctionConfigurationRequest): Request[FunctionConfiguration, AWSError] = js.native
  def getFunctionConfiguration(
    params: GetFunctionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Retrieves the configuration for asynchronous invocation for a function, version, or alias. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def getFunctionEventInvokeConfig(): Request[FunctionEventInvokeConfig, AWSError] = js.native
  def getFunctionEventInvokeConfig(callback: js.Function2[/* err */ AWSError, /* data */ FunctionEventInvokeConfig, Unit]): Request[FunctionEventInvokeConfig, AWSError] = js.native
  /**
    * Retrieves the configuration for asynchronous invocation for a function, version, or alias. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def getFunctionEventInvokeConfig(params: GetFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig, AWSError] = js.native
  def getFunctionEventInvokeConfig(
    params: GetFunctionEventInvokeConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionEventInvokeConfig, Unit]
  ): Request[FunctionEventInvokeConfig, AWSError] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersion(): Request[GetLayerVersionResponse, AWSError] = js.native
  def getLayerVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetLayerVersionResponse, Unit]): Request[GetLayerVersionResponse, AWSError] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersion(params: GetLayerVersionRequest): Request[GetLayerVersionResponse, AWSError] = js.native
  def getLayerVersion(
    params: GetLayerVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLayerVersionResponse, Unit]
  ): Request[GetLayerVersionResponse, AWSError] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersionByArn(): Request[GetLayerVersionResponse, AWSError] = js.native
  def getLayerVersionByArn(callback: js.Function2[/* err */ AWSError, /* data */ GetLayerVersionResponse, Unit]): Request[GetLayerVersionResponse, AWSError] = js.native
  /**
    * Returns information about a version of an AWS Lambda layer, with a link to download the layer archive that's valid for 10 minutes.
    */
  def getLayerVersionByArn(params: GetLayerVersionByArnRequest): Request[GetLayerVersionResponse, AWSError] = js.native
  def getLayerVersionByArn(
    params: GetLayerVersionByArnRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLayerVersionResponse, Unit]
  ): Request[GetLayerVersionResponse, AWSError] = js.native
  /**
    * Returns the permission policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
    */
  def getLayerVersionPolicy(): Request[GetLayerVersionPolicyResponse, AWSError] = js.native
  def getLayerVersionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetLayerVersionPolicyResponse, Unit]): Request[GetLayerVersionPolicyResponse, AWSError] = js.native
  /**
    * Returns the permission policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
    */
  def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): Request[GetLayerVersionPolicyResponse, AWSError] = js.native
  def getLayerVersionPolicy(
    params: GetLayerVersionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLayerVersionPolicyResponse, Unit]
  ): Request[GetLayerVersionPolicyResponse, AWSError] = js.native
  /**
    * Returns the resource-based IAM policy for a function, version, or alias.
    */
  def getPolicy(): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Returns the resource-based IAM policy for a function, version, or alias.
    */
  def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the provisioned concurrency configuration for a function's alias or version.
    */
  def getProvisionedConcurrencyConfig(): Request[GetProvisionedConcurrencyConfigResponse, AWSError] = js.native
  def getProvisionedConcurrencyConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ GetProvisionedConcurrencyConfigResponse, Unit]
  ): Request[GetProvisionedConcurrencyConfigResponse, AWSError] = js.native
  /**
    * Retrieves the provisioned concurrency configuration for a function's alias or version.
    */
  def getProvisionedConcurrencyConfig(params: GetProvisionedConcurrencyConfigRequest): Request[GetProvisionedConcurrencyConfigResponse, AWSError] = js.native
  def getProvisionedConcurrencyConfig(
    params: GetProvisionedConcurrencyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProvisionedConcurrencyConfigResponse, Unit]
  ): Request[GetProvisionedConcurrencyConfigResponse, AWSError] = js.native
  /**
    * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client, event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error, Lambda executes the function up to two more times. For more information, see Retry Behavior. For asynchronous invocation, Lambda adds events to a queue before sending them to your function. If your function does not have enough capacity to keep up with the queue, events may be lost. Occasionally, your function may receive the same event multiple times, even if no error occurs. To retain events that were not processed, configure your function with a dead-letter queue. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
    */
  def invoke(): Request[InvocationResponse, AWSError] = js.native
  def invoke(callback: js.Function2[/* err */ AWSError, /* data */ InvocationResponse, Unit]): Request[InvocationResponse, AWSError] = js.native
  /**
    * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or asynchronously. To invoke a function asynchronously, set InvocationType to Event. For synchronous invocation, details about the function response, including errors, are included in the response body and headers. For either invocation type, you can find more information in the execution log and trace. When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client, event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error, Lambda executes the function up to two more times. For more information, see Retry Behavior. For asynchronous invocation, Lambda adds events to a queue before sending them to your function. If your function does not have enough capacity to keep up with the queue, events may be lost. Occasionally, your function may receive the same event multiple times, even if no error occurs. To retain events that were not processed, configure your function with a dead-letter queue. The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that prevent your function from executing, such as permissions errors, limit errors, or issues with your function's code and configuration. For example, Lambda returns TooManyRequestsException if executing the function would cause you to exceed a concurrency limit at either the account level (ConcurrentInvocationLimitExceeded) or function level (ReservedFunctionConcurrentInvocationLimitExceeded). For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long connections with timeout or keep-alive settings. This operation requires permission for the lambda:InvokeFunction action.
    */
  def invoke(params: InvocationRequest): Request[InvocationResponse, AWSError] = js.native
  def invoke(
    params: InvocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InvocationResponse, Unit]
  ): Request[InvocationResponse, AWSError] = js.native
  /**
    *  For asynchronous function invocation, use Invoke.  Invokes a function asynchronously.
    */
  def invokeAsync(): Request[InvokeAsyncResponse, AWSError] = js.native
  def invokeAsync(callback: js.Function2[/* err */ AWSError, /* data */ InvokeAsyncResponse, Unit]): Request[InvokeAsyncResponse, AWSError] = js.native
  /**
    *  For asynchronous function invocation, use Invoke.  Invokes a function asynchronously.
    */
  def invokeAsync(params: InvokeAsyncRequest): Request[InvokeAsyncResponse, AWSError] = js.native
  def invokeAsync(
    params: InvokeAsyncRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InvokeAsyncResponse, Unit]
  ): Request[InvokeAsyncResponse, AWSError] = js.native
  /**
    * Returns a list of aliases for a Lambda function.
    */
  def listAliases(): Request[ListAliasesResponse, AWSError] = js.native
  def listAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListAliasesResponse, Unit]): Request[ListAliasesResponse, AWSError] = js.native
  /**
    * Returns a list of aliases for a Lambda function.
    */
  def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse, AWSError] = js.native
  def listAliases(
    params: ListAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAliasesResponse, Unit]
  ): Request[ListAliasesResponse, AWSError] = js.native
  /**
    * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
    */
  def listEventSourceMappings(): Request[ListEventSourceMappingsResponse, AWSError] = js.native
  def listEventSourceMappings(callback: js.Function2[/* err */ AWSError, /* data */ ListEventSourceMappingsResponse, Unit]): Request[ListEventSourceMappingsResponse, AWSError] = js.native
  /**
    * Lists event source mappings. Specify an EventSourceArn to only show event source mappings for a single event source.
    */
  def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse, AWSError] = js.native
  def listEventSourceMappings(
    params: ListEventSourceMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventSourceMappingsResponse, Unit]
  ): Request[ListEventSourceMappingsResponse, AWSError] = js.native
  /**
    * Retrieves a list of configurations for asynchronous invocation for a function. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def listFunctionEventInvokeConfigs(): Request[ListFunctionEventInvokeConfigsResponse, AWSError] = js.native
  def listFunctionEventInvokeConfigs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionEventInvokeConfigsResponse, Unit]
  ): Request[ListFunctionEventInvokeConfigsResponse, AWSError] = js.native
  /**
    * Retrieves a list of configurations for asynchronous invocation for a function. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def listFunctionEventInvokeConfigs(params: ListFunctionEventInvokeConfigsRequest): Request[ListFunctionEventInvokeConfigsResponse, AWSError] = js.native
  def listFunctionEventInvokeConfigs(
    params: ListFunctionEventInvokeConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionEventInvokeConfigsResponse, Unit]
  ): Request[ListFunctionEventInvokeConfigsResponse, AWSError] = js.native
  /**
    * Returns a list of Lambda functions, with the version-specific configuration of each. Set FunctionVersion to ALL to include all published versions of each function in addition to the unpublished version. To get more information about a function or version, use GetFunction.
    */
  def listFunctions(): Request[ListFunctionsResponse, AWSError] = js.native
  def listFunctions(callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionsResponse, Unit]): Request[ListFunctionsResponse, AWSError] = js.native
  /**
    * Returns a list of Lambda functions, with the version-specific configuration of each. Set FunctionVersion to ALL to include all published versions of each function in addition to the unpublished version. To get more information about a function or version, use GetFunction.
    */
  def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse, AWSError] = js.native
  def listFunctions(
    params: ListFunctionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionsResponse, Unit]
  ): Request[ListFunctionsResponse, AWSError] = js.native
  /**
    * Lists the versions of an AWS Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
    */
  def listLayerVersions(): Request[ListLayerVersionsResponse, AWSError] = js.native
  def listLayerVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListLayerVersionsResponse, Unit]): Request[ListLayerVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of an AWS Lambda layer. Versions that have been deleted aren't listed. Specify a runtime identifier to list only versions that indicate that they're compatible with that runtime.
    */
  def listLayerVersions(params: ListLayerVersionsRequest): Request[ListLayerVersionsResponse, AWSError] = js.native
  def listLayerVersions(
    params: ListLayerVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLayerVersionsResponse, Unit]
  ): Request[ListLayerVersionsResponse, AWSError] = js.native
  /**
    * Lists AWS Lambda layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
    */
  def listLayers(): Request[ListLayersResponse, AWSError] = js.native
  def listLayers(callback: js.Function2[/* err */ AWSError, /* data */ ListLayersResponse, Unit]): Request[ListLayersResponse, AWSError] = js.native
  /**
    * Lists AWS Lambda layers and shows information about the latest version of each. Specify a runtime identifier to list only layers that indicate that they're compatible with that runtime.
    */
  def listLayers(params: ListLayersRequest): Request[ListLayersResponse, AWSError] = js.native
  def listLayers(
    params: ListLayersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLayersResponse, Unit]
  ): Request[ListLayersResponse, AWSError] = js.native
  /**
    * Retrieves a list of provisioned concurrency configurations for a function.
    */
  def listProvisionedConcurrencyConfigs(): Request[ListProvisionedConcurrencyConfigsResponse, AWSError] = js.native
  def listProvisionedConcurrencyConfigs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisionedConcurrencyConfigsResponse, Unit]
  ): Request[ListProvisionedConcurrencyConfigsResponse, AWSError] = js.native
  /**
    * Retrieves a list of provisioned concurrency configurations for a function.
    */
  def listProvisionedConcurrencyConfigs(params: ListProvisionedConcurrencyConfigsRequest): Request[ListProvisionedConcurrencyConfigsResponse, AWSError] = js.native
  def listProvisionedConcurrencyConfigs(
    params: ListProvisionedConcurrencyConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProvisionedConcurrencyConfigsResponse, Unit]
  ): Request[ListProvisionedConcurrencyConfigsResponse, AWSError] = js.native
  /**
    * Returns a function's tags. You can also view tags with GetFunction.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Returns a function's tags. You can also view tags with GetFunction.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Returns a list of versions, with the version-specific configuration of each. 
    */
  def listVersionsByFunction(): Request[ListVersionsByFunctionResponse, AWSError] = js.native
  def listVersionsByFunction(callback: js.Function2[/* err */ AWSError, /* data */ ListVersionsByFunctionResponse, Unit]): Request[ListVersionsByFunctionResponse, AWSError] = js.native
  /**
    * Returns a list of versions, with the version-specific configuration of each. 
    */
  def listVersionsByFunction(params: ListVersionsByFunctionRequest): Request[ListVersionsByFunctionResponse, AWSError] = js.native
  def listVersionsByFunction(
    params: ListVersionsByFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVersionsByFunctionResponse, Unit]
  ): Request[ListVersionsByFunctionResponse, AWSError] = js.native
  /**
    * Creates an AWS Lambda layer from a ZIP archive. Each time you call PublishLayerVersion with the same layer name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
    */
  def publishLayerVersion(): Request[PublishLayerVersionResponse, AWSError] = js.native
  def publishLayerVersion(callback: js.Function2[/* err */ AWSError, /* data */ PublishLayerVersionResponse, Unit]): Request[PublishLayerVersionResponse, AWSError] = js.native
  /**
    * Creates an AWS Lambda layer from a ZIP archive. Each time you call PublishLayerVersion with the same layer name, a new version is created. Add layers to your function with CreateFunction or UpdateFunctionConfiguration.
    */
  def publishLayerVersion(params: PublishLayerVersionRequest): Request[PublishLayerVersionResponse, AWSError] = js.native
  def publishLayerVersion(
    params: PublishLayerVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishLayerVersionResponse, Unit]
  ): Request[PublishLayerVersionResponse, AWSError] = js.native
  /**
    * Creates a version from the current code and configuration of a function. Use versions to create a snapshot of your function code and configuration that doesn't change. AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before publishing a version. Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.
    */
  def publishVersion(): Request[FunctionConfiguration, AWSError] = js.native
  def publishVersion(callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Creates a version from the current code and configuration of a function. Use versions to create a snapshot of your function code and configuration that doesn't change. AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last version. Use UpdateFunctionCode or UpdateFunctionConfiguration to update the function before publishing a version. Clients can invoke versions directly or with an alias. To create an alias, use CreateAlias.
    */
  def publishVersion(params: PublishVersionRequest): Request[FunctionConfiguration, AWSError] = js.native
  def publishVersion(
    params: PublishVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency level. Concurrency settings apply to the function as a whole, including all published versions and the unpublished version. Reserving concurrency both ensures that your function has capacity to process the specified number of events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current setting for a function. Use GetAccountSettings to see your Regional concurrency limit. You can reserve concurrency for as many functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that aren't configured with a per-function limit. For more information, see Managing Concurrency.
    */
  def putFunctionConcurrency(): Request[Concurrency, AWSError] = js.native
  def putFunctionConcurrency(callback: js.Function2[/* err */ AWSError, /* data */ Concurrency, Unit]): Request[Concurrency, AWSError] = js.native
  /**
    * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency level. Concurrency settings apply to the function as a whole, including all published versions and the unpublished version. Reserving concurrency both ensures that your function has capacity to process the specified number of events simultaneously, and prevents it from scaling beyond that level. Use GetFunction to see the current setting for a function. Use GetAccountSettings to see your Regional concurrency limit. You can reserve concurrency for as many functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that aren't configured with a per-function limit. For more information, see Managing Concurrency.
    */
  def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): Request[Concurrency, AWSError] = js.native
  def putFunctionConcurrency(
    params: PutFunctionConcurrencyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Concurrency, Unit]
  ): Request[Concurrency, AWSError] = js.native
  /**
    * Configures options for asynchronous invocation on a function, version, or alias. By default, Lambda retries an asynchronous invocation twice if the function returns an error. It retains events in a queue for up to six hours. When an event fails all processing attempts or stays in the asynchronous invocation queue for too long, Lambda discards it. To retain discarded events, configure a dead-letter queue with UpdateFunctionConfiguration.
    */
  def putFunctionEventInvokeConfig(): Request[FunctionEventInvokeConfig, AWSError] = js.native
  def putFunctionEventInvokeConfig(callback: js.Function2[/* err */ AWSError, /* data */ FunctionEventInvokeConfig, Unit]): Request[FunctionEventInvokeConfig, AWSError] = js.native
  /**
    * Configures options for asynchronous invocation on a function, version, or alias. By default, Lambda retries an asynchronous invocation twice if the function returns an error. It retains events in a queue for up to six hours. When an event fails all processing attempts or stays in the asynchronous invocation queue for too long, Lambda discards it. To retain discarded events, configure a dead-letter queue with UpdateFunctionConfiguration.
    */
  def putFunctionEventInvokeConfig(params: PutFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig, AWSError] = js.native
  def putFunctionEventInvokeConfig(
    params: PutFunctionEventInvokeConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionEventInvokeConfig, Unit]
  ): Request[FunctionEventInvokeConfig, AWSError] = js.native
  /**
    * Adds a provisioned concurrency configuration to a function's alias or version.
    */
  def putProvisionedConcurrencyConfig(): Request[PutProvisionedConcurrencyConfigResponse, AWSError] = js.native
  def putProvisionedConcurrencyConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ PutProvisionedConcurrencyConfigResponse, Unit]
  ): Request[PutProvisionedConcurrencyConfigResponse, AWSError] = js.native
  /**
    * Adds a provisioned concurrency configuration to a function's alias or version.
    */
  def putProvisionedConcurrencyConfig(params: PutProvisionedConcurrencyConfigRequest): Request[PutProvisionedConcurrencyConfigResponse, AWSError] = js.native
  def putProvisionedConcurrencyConfig(
    params: PutProvisionedConcurrencyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutProvisionedConcurrencyConfigResponse, Unit]
  ): Request[PutProvisionedConcurrencyConfigResponse, AWSError] = js.native
  /**
    * Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
    */
  def removeLayerVersionPermission(): Request[js.Object, AWSError] = js.native
  def removeLayerVersionPermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a statement from the permissions policy for a version of an AWS Lambda layer. For more information, see AddLayerVersionPermission.
    */
  def removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest): Request[js.Object, AWSError] = js.native
  def removeLayerVersionPermission(
    params: RemoveLayerVersionPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from the output of GetPolicy.
    */
  def removePermission(): Request[js.Object, AWSError] = js.native
  def removePermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from the output of GetPolicy.
    */
  def removePermission(params: RemovePermissionRequest): Request[js.Object, AWSError] = js.native
  def removePermission(
    params: RemovePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to a function.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to a function.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from a function.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from a function.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the configuration of a Lambda function alias.
    */
  def updateAlias(): Request[AliasConfiguration, AWSError] = js.native
  def updateAlias(callback: js.Function2[/* err */ AWSError, /* data */ AliasConfiguration, Unit]): Request[AliasConfiguration, AWSError] = js.native
  /**
    * Updates the configuration of a Lambda function alias.
    */
  def updateAlias(params: UpdateAliasRequest): Request[AliasConfiguration, AWSError] = js.native
  def updateAlias(
    params: UpdateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AliasConfiguration, Unit]
  ): Request[AliasConfiguration, AWSError] = js.native
  /**
    * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location. The following error handling options are only available for stream sources (DynamoDB and Kinesis):    BisectBatchOnFunctionError - If the function returns an error, split the batch in two and retry.    DestinationConfig - Send discarded records to an Amazon SQS queue or Amazon SNS topic.    MaximumRecordAgeInSeconds - Discard records older than the specified age.    MaximumRetryAttempts - Discard records after the specified number of retries.  
    */
  def updateEventSourceMapping(): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def updateEventSourceMapping(callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and resume later from the same location. The following error handling options are only available for stream sources (DynamoDB and Kinesis):    BisectBatchOnFunctionError - If the function returns an error, split the batch in two and retry.    DestinationConfig - Send discarded records to an Amazon SQS queue or Amazon SNS topic.    MaximumRecordAgeInSeconds - Discard records older than the specified age.    MaximumRetryAttempts - Discard records after the specified number of retries.  
    */
  def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): Request[EventSourceMappingConfiguration, AWSError] = js.native
  def updateEventSourceMapping(
    params: UpdateEventSourceMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EventSourceMappingConfiguration, Unit]
  ): Request[EventSourceMappingConfiguration, AWSError] = js.native
  /**
    * Updates a Lambda function's code. The function's code is locked when you publish a version. You can't modify the code of a published version, only the unpublished version.
    */
  def updateFunctionCode(): Request[FunctionConfiguration, AWSError] = js.native
  def updateFunctionCode(callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Updates a Lambda function's code. The function's code is locked when you publish a version. You can't modify the code of a published version, only the unpublished version.
    */
  def updateFunctionCode(params: UpdateFunctionCodeRequest): Request[FunctionConfiguration, AWSError] = js.native
  def updateFunctionCode(
    params: UpdateFunctionCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Modify the version-specific settings of a Lambda function. When you update a function, Lambda provisions an instance of the function and its supporting resources. If your function connects to a VPC, this process can take a minute. During this time, you can't modify the function, but you can still invoke it. The LastUpdateStatus, LastUpdateStatusReason, and LastUpdateStatusReasonCode fields in the response from GetFunctionConfiguration indicate when the update is complete and the function is processing events with the new configuration. For more information, see Function States. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
    */
  def updateFunctionConfiguration(): Request[FunctionConfiguration, AWSError] = js.native
  def updateFunctionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Modify the version-specific settings of a Lambda function. When you update a function, Lambda provisions an instance of the function and its supporting resources. If your function connects to a VPC, this process can take a minute. During this time, you can't modify the function, but you can still invoke it. The LastUpdateStatus, LastUpdateStatusReason, and LastUpdateStatusReasonCode fields in the response from GetFunctionConfiguration indicate when the update is complete and the function is processing events with the new configuration. For more information, see Function States. These settings can vary between versions of a function and are locked when you publish a version. You can't modify the configuration of a published version, only the unpublished version. To configure function concurrency, use PutFunctionConcurrency. To grant invoke permissions to an account or AWS service, use AddPermission.
    */
  def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): Request[FunctionConfiguration, AWSError] = js.native
  def updateFunctionConfiguration(
    params: UpdateFunctionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Updates the configuration for asynchronous invocation for a function, version, or alias. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def updateFunctionEventInvokeConfig(): Request[FunctionEventInvokeConfig, AWSError] = js.native
  def updateFunctionEventInvokeConfig(callback: js.Function2[/* err */ AWSError, /* data */ FunctionEventInvokeConfig, Unit]): Request[FunctionEventInvokeConfig, AWSError] = js.native
  /**
    * Updates the configuration for asynchronous invocation for a function, version, or alias. To configure options for asynchronous invocation, use PutFunctionEventInvokeConfig.
    */
  def updateFunctionEventInvokeConfig(params: UpdateFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig, AWSError] = js.native
  def updateFunctionEventInvokeConfig(
    params: UpdateFunctionEventInvokeConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionEventInvokeConfig, Unit]
  ): Request[FunctionEventInvokeConfig, AWSError] = js.native
  /**
    * Waits for the functionActive state by periodically calling the underlying Lambda.getFunctionConfigurationoperation every 5 seconds (at most 60 times). Waits for the function's State to be Active.
    */
  @JSName("waitFor")
  def waitFor_functionActive(state: functionActive): Request[FunctionConfiguration, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionActive(
    state: functionActive,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Waits for the functionActive state by periodically calling the underlying Lambda.getFunctionConfigurationoperation every 5 seconds (at most 60 times). Waits for the function's State to be Active.
    */
  @JSName("waitFor")
  def waitFor_functionActive(state: functionActive, params: GetFunctionConfigurationRequest with AnonWaiter): Request[FunctionConfiguration, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionActive(
    state: functionActive,
    params: GetFunctionConfigurationRequest with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Waits for the functionExists state by periodically calling the underlying Lambda.getFunctionoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_functionExists(state: functionExists): Request[GetFunctionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionExists(
    state: functionExists,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionResponse, Unit]
  ): Request[GetFunctionResponse, AWSError] = js.native
  /**
    * Waits for the functionExists state by periodically calling the underlying Lambda.getFunctionoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_functionExists(state: functionExists, params: GetFunctionRequest with AnonWaiter): Request[GetFunctionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionExists(
    state: functionExists,
    params: GetFunctionRequest with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionResponse, Unit]
  ): Request[GetFunctionResponse, AWSError] = js.native
  /**
    * Waits for the functionUpdated state by periodically calling the underlying Lambda.getFunctionConfigurationoperation every 5 seconds (at most 60 times). Waits for the function's LastUpdateStatus to be Successful.
    */
  @JSName("waitFor")
  def waitFor_functionUpdated(state: functionUpdated): Request[FunctionConfiguration, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionUpdated(
    state: functionUpdated,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
  /**
    * Waits for the functionUpdated state by periodically calling the underlying Lambda.getFunctionConfigurationoperation every 5 seconds (at most 60 times). Waits for the function's LastUpdateStatus to be Successful.
    */
  @JSName("waitFor")
  def waitFor_functionUpdated(state: functionUpdated, params: GetFunctionConfigurationRequest with AnonWaiter): Request[FunctionConfiguration, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_functionUpdated(
    state: functionUpdated,
    params: GetFunctionConfigurationRequest with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ FunctionConfiguration, Unit]
  ): Request[FunctionConfiguration, AWSError] = js.native
}

