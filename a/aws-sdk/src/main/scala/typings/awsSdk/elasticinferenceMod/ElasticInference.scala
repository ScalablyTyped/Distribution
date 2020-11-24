package typings.awsSdk.elasticinferenceMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticInference extends Service {
  
  @JSName("config")
  var config_ElasticInference: ConfigBase with ClientConfiguration = js.native
  
  /**
    *  Describes the locations in which a given accelerator type or set of types is present in a given region. 
    */
  def describeAcceleratorOfferings(): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  def describeAcceleratorOfferings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorOfferingsResponse, Unit]): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  /**
    *  Describes the locations in which a given accelerator type or set of types is present in a given region. 
    */
  def describeAcceleratorOfferings(params: DescribeAcceleratorOfferingsRequest): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  def describeAcceleratorOfferings(
    params: DescribeAcceleratorOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorOfferingsResponse, Unit]
  ): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  
  /**
    *  Describes the accelerator types available in a given region, as well as their characteristics, such as memory and throughput. 
    */
  def describeAcceleratorTypes(): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  def describeAcceleratorTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorTypesResponse, Unit]): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  /**
    *  Describes the accelerator types available in a given region, as well as their characteristics, such as memory and throughput. 
    */
  def describeAcceleratorTypes(params: DescribeAcceleratorTypesRequest): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  def describeAcceleratorTypes(
    params: DescribeAcceleratorTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorTypesResponse, Unit]
  ): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  
  /**
    *  Describes information over a provided set of accelerators belonging to an account. 
    */
  def describeAccelerators(): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  def describeAccelerators(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorsResponse, Unit]): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  /**
    *  Describes information over a provided set of accelerators belonging to an account. 
    */
  def describeAccelerators(params: DescribeAcceleratorsRequest): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  def describeAccelerators(
    params: DescribeAcceleratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorsResponse, Unit]
  ): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  
  /**
    *  Returns all tags of an Elastic Inference Accelerator. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    *  Returns all tags of an Elastic Inference Accelerator. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    *  Adds the specified tags to an Elastic Inference Accelerator. 
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    *  Adds the specified tags to an Elastic Inference Accelerator. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    *  Removes the specified tags from an Elastic Inference Accelerator. 
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    *  Removes the specified tags from an Elastic Inference Accelerator. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
}
