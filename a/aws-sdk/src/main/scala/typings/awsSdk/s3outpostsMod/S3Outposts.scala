package typings.awsSdk.s3outpostsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Outposts extends Service {
  
  @JSName("config")
  var config_S3Outposts: ConfigBase with ClientConfiguration = js.native
  
  /**
    * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).  This action creates an endpoint and associates it with the specified Outpost.   Related actions include:    DeleteEndpoint     ListEndpoints   
    */
  def createEndpoint(): Request[CreateEndpointResult, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResult, Unit]): Request[CreateEndpointResult, AWSError] = js.native
  /**
    * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).  This action creates an endpoint and associates it with the specified Outpost.   Related actions include:    DeleteEndpoint     ListEndpoints   
    */
  def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResult, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResult, Unit]
  ): Request[CreateEndpointResult, AWSError] = js.native
  
  /**
    * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).  This action deletes an endpoint.   Related actions include:    CreateEndpoint     ListEndpoints   
    */
  def deleteEndpoint(): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).  This action deletes an endpoint.   Related actions include:    CreateEndpoint     ListEndpoints   
    */
  def deleteEndpoint(params: DeleteEndpointRequest): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).  This action lists endpoints associated with the Outpost.   Related actions include:    CreateEndpoint     DeleteEndpoint   
    */
  def listEndpoints(): Request[ListEndpointsResult, AWSError] = js.native
  def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResult, Unit]): Request[ListEndpointsResult, AWSError] = js.native
  /**
    * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).  This action lists endpoints associated with the Outpost.   Related actions include:    CreateEndpoint     DeleteEndpoint   
    */
  def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResult, AWSError] = js.native
  def listEndpoints(
    params: ListEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResult, Unit]
  ): Request[ListEndpointsResult, AWSError] = js.native
}
