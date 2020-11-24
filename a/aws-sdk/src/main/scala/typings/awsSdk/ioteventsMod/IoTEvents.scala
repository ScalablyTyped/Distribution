package typings.awsSdk.ioteventsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTEvents extends Service {
  
  @JSName("config")
  var config_IoTEvents: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a detector model.
    */
  def createDetectorModel(): Request[CreateDetectorModelResponse, AWSError] = js.native
  def createDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorModelResponse, Unit]): Request[CreateDetectorModelResponse, AWSError] = js.native
  /**
    * Creates a detector model.
    */
  def createDetectorModel(params: CreateDetectorModelRequest): Request[CreateDetectorModelResponse, AWSError] = js.native
  def createDetectorModel(
    params: CreateDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorModelResponse, Unit]
  ): Request[CreateDetectorModelResponse, AWSError] = js.native
  
  /**
    * Creates an input.
    */
  def createInput(): Request[CreateInputResponse, AWSError] = js.native
  def createInput(callback: js.Function2[/* err */ AWSError, /* data */ CreateInputResponse, Unit]): Request[CreateInputResponse, AWSError] = js.native
  /**
    * Creates an input.
    */
  def createInput(params: CreateInputRequest): Request[CreateInputResponse, AWSError] = js.native
  def createInput(
    params: CreateInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInputResponse, Unit]
  ): Request[CreateInputResponse, AWSError] = js.native
  
  /**
    * Deletes a detector model. Any active instances of the detector model are also deleted.
    */
  def deleteDetectorModel(): Request[DeleteDetectorModelResponse, AWSError] = js.native
  def deleteDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorModelResponse, Unit]): Request[DeleteDetectorModelResponse, AWSError] = js.native
  /**
    * Deletes a detector model. Any active instances of the detector model are also deleted.
    */
  def deleteDetectorModel(params: DeleteDetectorModelRequest): Request[DeleteDetectorModelResponse, AWSError] = js.native
  def deleteDetectorModel(
    params: DeleteDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorModelResponse, Unit]
  ): Request[DeleteDetectorModelResponse, AWSError] = js.native
  
  /**
    * Deletes an input.
    */
  def deleteInput(): Request[DeleteInputResponse, AWSError] = js.native
  def deleteInput(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputResponse, Unit]): Request[DeleteInputResponse, AWSError] = js.native
  /**
    * Deletes an input.
    */
  def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse, AWSError] = js.native
  def deleteInput(
    params: DeleteInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputResponse, Unit]
  ): Request[DeleteInputResponse, AWSError] = js.native
  
  /**
    * Describes a detector model. If the version parameter is not specified, information about the latest version is returned.
    */
  def describeDetectorModel(): Request[DescribeDetectorModelResponse, AWSError] = js.native
  def describeDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorModelResponse, Unit]): Request[DescribeDetectorModelResponse, AWSError] = js.native
  /**
    * Describes a detector model. If the version parameter is not specified, information about the latest version is returned.
    */
  def describeDetectorModel(params: DescribeDetectorModelRequest): Request[DescribeDetectorModelResponse, AWSError] = js.native
  def describeDetectorModel(
    params: DescribeDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorModelResponse, Unit]
  ): Request[DescribeDetectorModelResponse, AWSError] = js.native
  
  /**
    * Describes an input.
    */
  def describeInput(): Request[DescribeInputResponse, AWSError] = js.native
  def describeInput(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Describes an input.
    */
  def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse, AWSError] = js.native
  def describeInput(
    params: DescribeInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  
  /**
    * Retrieves the current settings of the AWS IoT Events logging options.
    */
  def describeLoggingOptions(): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Events logging options.
    */
  def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(
    params: DescribeLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]
  ): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of a detector model. Only the metadata associated with each detector model version is returned.
    */
  def listDetectorModelVersions(): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  def listDetectorModelVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelVersionsResponse, Unit]): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of a detector model. Only the metadata associated with each detector model version is returned.
    */
  def listDetectorModelVersions(params: ListDetectorModelVersionsRequest): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  def listDetectorModelVersions(
    params: ListDetectorModelVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelVersionsResponse, Unit]
  ): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
    */
  def listDetectorModels(): Request[ListDetectorModelsResponse, AWSError] = js.native
  def listDetectorModels(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelsResponse, Unit]): Request[ListDetectorModelsResponse, AWSError] = js.native
  /**
    * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
    */
  def listDetectorModels(params: ListDetectorModelsRequest): Request[ListDetectorModelsResponse, AWSError] = js.native
  def listDetectorModels(
    params: ListDetectorModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelsResponse, Unit]
  ): Request[ListDetectorModelsResponse, AWSError] = js.native
  
  /**
    * Lists the inputs you have created.
    */
  def listInputs(): Request[ListInputsResponse, AWSError] = js.native
  def listInputs(callback: js.Function2[/* err */ AWSError, /* data */ ListInputsResponse, Unit]): Request[ListInputsResponse, AWSError] = js.native
  /**
    * Lists the inputs you have created.
    */
  def listInputs(params: ListInputsRequest): Request[ListInputsResponse, AWSError] = js.native
  def listInputs(
    params: ListInputsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInputsResponse, Unit]
  ): Request[ListInputsResponse, AWSError] = js.native
  
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sets or updates the AWS IoT Events logging options. If you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. If you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
    */
  def putLoggingOptions(): Request[js.Object, AWSError] = js.native
  def putLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Events logging options. If you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. If you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object, AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created as new inputs arrive.
    */
  def updateDetectorModel(): Request[UpdateDetectorModelResponse, AWSError] = js.native
  def updateDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorModelResponse, Unit]): Request[UpdateDetectorModelResponse, AWSError] = js.native
  /**
    * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created as new inputs arrive.
    */
  def updateDetectorModel(params: UpdateDetectorModelRequest): Request[UpdateDetectorModelResponse, AWSError] = js.native
  def updateDetectorModel(
    params: UpdateDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorModelResponse, Unit]
  ): Request[UpdateDetectorModelResponse, AWSError] = js.native
  
  /**
    * Updates an input.
    */
  def updateInput(): Request[UpdateInputResponse, AWSError] = js.native
  def updateInput(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputResponse, Unit]): Request[UpdateInputResponse, AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse, AWSError] = js.native
  def updateInput(
    params: UpdateInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputResponse, Unit]
  ): Request[UpdateInputResponse, AWSError] = js.native
}
