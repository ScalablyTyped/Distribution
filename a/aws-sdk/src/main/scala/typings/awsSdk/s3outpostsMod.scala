package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outpostsMod {
  
  @JSImport("aws-sdk/clients/s3outposts", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends S3Outposts {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  type CidrBlock = String
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.s3outpostsMod.apiVersion] = js.undefined
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
  
  trait CreateEndpointRequest extends StObject {
    
    /**
      * The ID of the AWS Outpost. 
      */
    var OutpostId: typings.awsSdk.s3outpostsMod.OutpostId
    
    /**
      * The ID of the security group to use with the endpoint.
      */
    var SecurityGroupId: typings.awsSdk.s3outpostsMod.SecurityGroupId
    
    /**
      * The ID of the subnet in the selected VPC.
      */
    var SubnetId: typings.awsSdk.s3outpostsMod.SubnetId
  }
  object CreateEndpointRequest {
    
    @scala.inline
    def apply(OutpostId: OutpostId, SecurityGroupId: SecurityGroupId, SubnetId: SubnetId): CreateEndpointRequest = {
      val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any], SecurityGroupId = SecurityGroupId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateEndpointRequest]
    }
    
    @scala.inline
    implicit class CreateEndpointRequestMutableBuilder[Self <: CreateEndpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateEndpointResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint.
      */
    var EndpointArn: js.UndefOr[typings.awsSdk.s3outpostsMod.EndpointArn] = js.undefined
  }
  object CreateEndpointResult {
    
    @scala.inline
    def apply(): CreateEndpointResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEndpointResult]
    }
    
    @scala.inline
    implicit class CreateEndpointResultMutableBuilder[Self <: CreateEndpointResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    }
  }
  
  type CreationTime = Date
  
  trait DeleteEndpointRequest extends StObject {
    
    /**
      * The ID of the end point.
      */
    var EndpointId: typings.awsSdk.s3outpostsMod.EndpointId
    
    /**
      * The ID of the AWS Outpost. 
      */
    var OutpostId: typings.awsSdk.s3outpostsMod.OutpostId
  }
  object DeleteEndpointRequest {
    
    @scala.inline
    def apply(EndpointId: EndpointId, OutpostId: OutpostId): DeleteEndpointRequest = {
      val __obj = js.Dynamic.literal(EndpointId = EndpointId.asInstanceOf[js.Any], OutpostId = OutpostId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEndpointRequest]
    }
    
    @scala.inline
    implicit class DeleteEndpointRequestMutableBuilder[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointId(value: EndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Endpoint extends StObject {
    
    /**
      * The VPC CIDR committed by this endpoint.
      */
    var CidrBlock: js.UndefOr[typings.awsSdk.s3outpostsMod.CidrBlock] = js.undefined
    
    /**
      * The time the endpoint was created.
      */
    var CreationTime: js.UndefOr[typings.awsSdk.s3outpostsMod.CreationTime] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint.
      */
    var EndpointArn: js.UndefOr[typings.awsSdk.s3outpostsMod.EndpointArn] = js.undefined
    
    /**
      * The network interface of the endpoint.
      */
    var NetworkInterfaces: js.UndefOr[typings.awsSdk.s3outpostsMod.NetworkInterfaces] = js.undefined
    
    /**
      * The ID of the AWS Outpost.
      */
    var OutpostsId: js.UndefOr[OutpostId] = js.undefined
    
    /**
      * The status of the endpoint.
      */
    var Status: js.UndefOr[EndpointStatus] = js.undefined
  }
  object Endpoint {
    
    @scala.inline
    def apply(): Endpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: CidrBlock): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
      
      @scala.inline
      def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
      
      @scala.inline
      def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
      
      @scala.inline
      def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
      
      @scala.inline
      def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
      
      @scala.inline
      def setOutpostsId(value: OutpostId): Self = StObject.set(x, "OutpostsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostsIdUndefined: Self = StObject.set(x, "OutpostsId", js.undefined)
      
      @scala.inline
      def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type EndpointArn = String
  
  type EndpointId = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | String
  
  type Endpoints = js.Array[Endpoint]
  
  trait ListEndpointsRequest extends StObject {
    
    /**
      * The max number of endpoints that can be returned on the request.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.s3outpostsMod.MaxResults] = js.undefined
    
    /**
      * The next endpoint requested in the list.
      */
    var NextToken: js.UndefOr[typings.awsSdk.s3outpostsMod.NextToken] = js.undefined
  }
  object ListEndpointsRequest {
    
    @scala.inline
    def apply(): ListEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListEndpointsRequest]
    }
    
    @scala.inline
    implicit class ListEndpointsRequestMutableBuilder[Self <: ListEndpointsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListEndpointsResult extends StObject {
    
    /**
      * Returns an array of endpoints associated with AWS Outpost.
      */
    var Endpoints: js.UndefOr[typings.awsSdk.s3outpostsMod.Endpoints] = js.undefined
    
    /**
      * The next endpoint returned in the list.
      */
    var NextToken: js.UndefOr[typings.awsSdk.s3outpostsMod.NextToken] = js.undefined
  }
  object ListEndpointsResult {
    
    @scala.inline
    def apply(): ListEndpointsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListEndpointsResult]
    }
    
    @scala.inline
    implicit class ListEndpointsResultMutableBuilder[Self <: ListEndpointsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
      
      @scala.inline
      def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type MaxResults = Double
  
  trait NetworkInterface extends StObject {
    
    /**
      * The ID for the network interface.
      */
    var NetworkInterfaceId: js.UndefOr[typings.awsSdk.s3outpostsMod.NetworkInterfaceId] = js.undefined
  }
  object NetworkInterface {
    
    @scala.inline
    def apply(): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInterface]
    }
    
    @scala.inline
    implicit class NetworkInterfaceMutableBuilder[Self <: NetworkInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    }
  }
  
  type NetworkInterfaceId = String
  
  type NetworkInterfaces = js.Array[NetworkInterface]
  
  type NextToken = String
  
  type OutpostId = String
  
  @js.native
  trait S3Outposts extends Service {
    
    @JSName("config")
    var config_S3Outposts: ConfigBase & ClientConfiguration = js.native
    
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
  
  type SecurityGroupId = String
  
  type SubnetId = String
  
  trait _EndpointStatus extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
