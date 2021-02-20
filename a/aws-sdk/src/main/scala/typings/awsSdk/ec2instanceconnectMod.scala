package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2instanceconnectMod {
  
  @JSImport("aws-sdk/clients/ec2instanceconnect", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends EC2InstanceConnect {
    def this(options: ClientConfiguration) = this()
  }
  
  type AvailabilityZone = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.apiVersion] = js.native
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
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  @js.native
  trait EC2InstanceConnect extends Service {
    
    @JSName("config")
    var config_EC2InstanceConnect: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
      */
    def sendSSHPublicKey(): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    def sendSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    /**
      * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
      */
    def sendSSHPublicKey(params: SendSSHPublicKeyRequest): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    def sendSSHPublicKey(
      params: SendSSHPublicKeyRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]
    ): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  }
  
  type InstanceId = String
  
  type InstanceOSUser = String
  
  type RequestId = String
  
  type SSHPublicKey = String
  
  @js.native
  trait SendSSHPublicKeyRequest extends StObject {
    
    /**
      * The availability zone the EC2 instance was launched in.
      */
    var AvailabilityZone: typings.awsSdk.ec2instanceconnectMod.AvailabilityZone = js.native
    
    /**
      * The EC2 instance you wish to publish the SSH key to.
      */
    var InstanceId: typings.awsSdk.ec2instanceconnectMod.InstanceId = js.native
    
    /**
      * The OS user on the EC2 instance whom the key may be used to authenticate as.
      */
    var InstanceOSUser: typings.awsSdk.ec2instanceconnectMod.InstanceOSUser = js.native
    
    /**
      * The public key to be published to the instance. To use it after publication you must have the matching private key.
      */
    var SSHPublicKey: typings.awsSdk.ec2instanceconnectMod.SSHPublicKey = js.native
  }
  object SendSSHPublicKeyRequest {
    
    @scala.inline
    def apply(
      AvailabilityZone: AvailabilityZone,
      InstanceId: InstanceId,
      InstanceOSUser: InstanceOSUser,
      SSHPublicKey: SSHPublicKey
    ): SendSSHPublicKeyRequest = {
      val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], InstanceOSUser = InstanceOSUser.asInstanceOf[js.Any], SSHPublicKey = SSHPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendSSHPublicKeyRequest]
    }
    
    @scala.inline
    implicit class SendSSHPublicKeyRequestMutableBuilder[Self <: SendSSHPublicKeyRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOSUser(value: InstanceOSUser): Self = StObject.set(x, "InstanceOSUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendSSHPublicKeyResponse extends StObject {
    
    /**
      * The request ID as logged by EC2 Connect. Please provide this when contacting AWS Support.
      */
    var RequestId: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.RequestId] = js.native
    
    /**
      * Indicates request success.
      */
    var Success: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.Success] = js.native
  }
  object SendSSHPublicKeyResponse {
    
    @scala.inline
    def apply(): SendSSHPublicKeyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendSSHPublicKeyResponse]
    }
    
    @scala.inline
    implicit class SendSSHPublicKeyResponseMutableBuilder[Self <: SendSSHPublicKeyResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      @scala.inline
      def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    }
  }
  
  type Success = Boolean
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-04-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
