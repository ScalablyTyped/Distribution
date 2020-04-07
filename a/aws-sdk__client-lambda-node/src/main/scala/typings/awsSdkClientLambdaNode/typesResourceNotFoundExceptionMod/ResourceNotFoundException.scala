package typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod

import typings.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteFunctionConcurrencyExceptionsUnionMod.DeleteFunctionConcurrencyExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.getAliasExceptionsUnionMod.GetAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.getEventSourceMappingExceptionsUnionMod.GetEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.getFunctionConfigurationExceptionsUnionMod.GetFunctionConfigurationExceptionsUnion
import typings.awsSdkClientLambdaNode.getFunctionExceptionsUnionMod.GetFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.getPolicyExceptionsUnionMod.GetPolicyExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkClientLambdaNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientLambdaNode.listEventSourceMappingsExceptionsUnionMod.ListEventSourceMappingsExceptionsUnion
import typings.awsSdkClientLambdaNode.listTagsExceptionsUnionMod.ListTagsExceptionsUnion
import typings.awsSdkClientLambdaNode.listVersionsByFunctionExceptionsUnionMod.ListVersionsByFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.putFunctionConcurrencyExceptionsUnionMod.PutFunctionConcurrencyExceptionsUnion
import typings.awsSdkClientLambdaNode.removePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientLambdaNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientLambdaNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceNotFoundException
  extends ServiceException[ResourceNotFoundExceptionDetails]
     with AddPermissionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateEventSourceMappingExceptionsUnion
     with CreateFunctionExceptionsUnion
     with DeleteEventSourceMappingExceptionsUnion
     with DeleteFunctionConcurrencyExceptionsUnion
     with DeleteFunctionExceptionsUnion
     with GetAliasExceptionsUnion
     with GetEventSourceMappingExceptionsUnion
     with GetFunctionConfigurationExceptionsUnion
     with GetFunctionExceptionsUnion
     with GetPolicyExceptionsUnion
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion
     with ListAliasesExceptionsUnion
     with ListEventSourceMappingsExceptionsUnion
     with ListTagsExceptionsUnion
     with ListVersionsByFunctionExceptionsUnion
     with PublishVersionExceptionsUnion
     with PutFunctionConcurrencyExceptionsUnion
     with RemovePermissionExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_ResourceNotFoundException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException
}

object ResourceNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException,
    stack: String = null
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
}

