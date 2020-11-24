package typings.awsSdk.pricingMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pricing extends Service {
  
  var config: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
    */
  def describeServices(): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
    */
  def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(
    params: DescribeServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  
  /**
    * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
    */
  def getAttributeValues(): Request[GetAttributeValuesResponse, AWSError] = js.native
  def getAttributeValues(callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeValuesResponse, Unit]): Request[GetAttributeValuesResponse, AWSError] = js.native
  /**
    * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
    */
  def getAttributeValues(params: GetAttributeValuesRequest): Request[GetAttributeValuesResponse, AWSError] = js.native
  def getAttributeValues(
    params: GetAttributeValuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeValuesResponse, Unit]
  ): Request[GetAttributeValuesResponse, AWSError] = js.native
  
  /**
    * Returns a list of all products that match the filter criteria.
    */
  def getProducts(): Request[GetProductsResponse, AWSError] = js.native
  def getProducts(callback: js.Function2[/* err */ AWSError, /* data */ GetProductsResponse, Unit]): Request[GetProductsResponse, AWSError] = js.native
  /**
    * Returns a list of all products that match the filter criteria.
    */
  def getProducts(params: GetProductsRequest): Request[GetProductsResponse, AWSError] = js.native
  def getProducts(
    params: GetProductsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProductsResponse, Unit]
  ): Request[GetProductsResponse, AWSError] = js.native
}
