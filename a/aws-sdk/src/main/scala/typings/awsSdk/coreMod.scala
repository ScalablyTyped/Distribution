package typings.awsSdk

import typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typings.awsSdk.configMod.APIVersions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import typings.awsSdk.credentialProviderChainMod.provider
import typings.awsSdk.credentialsMod.CredentialsOptions
import typings.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import typings.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import typings.awsSdk.metadataServiceMod.MetadataServiceOptions
import typings.awsSdk.processCredentialsMod.ProcessCredentialsOptions
import typings.awsSdk.remoteCredentialsMod.RemoteCredentialsOptions
import typings.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.awsSdk.sharedIniFileCredentialsMod.SharedIniFileCredentialsOptions
import typings.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import typings.awsSdk.webIdentityCredentialsMod.WebIdentityCredentials.WebIdentityCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("aws-sdk/lib/core", "ChainableTemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    */
  class ChainableTemporaryCredentials ()
    extends typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials {
    def this(options: ChainableTemporaryCredentialsOptions) = this()
  }
  // Needed to expose interfaces on the class
  object ChainableTemporaryCredentials
  
  @JSImport("aws-sdk/lib/core", "CognitoIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    */
  class CognitoIdentityCredentials ()
    extends typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(options: CognitoIdentityOptions, clientConfig: typings.awsSdk.configBaseMod.ConfigurationOptions) = this()
  }
  // Needed to expose interfaces on the class
  object CognitoIdentityCredentials
  
  @JSImport("aws-sdk/lib/core", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  class Config ()
    extends typings.awsSdk.configMod.Config {
    def this(options: typings.awsSdk.configBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "ConfigurationOptions")
  @js.native
  abstract class ConfigurationOptions ()
    extends typings.awsSdk.configBaseMod.ConfigurationOptions
  
  @JSImport("aws-sdk/lib/core", "CredentialProviderChain")
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  class CredentialProviderChain ()
    extends typings.awsSdk.credentialProviderChainMod.CredentialProviderChain {
    def this(providers: js.Array[provider]) = this()
  }
  /* static members */
  object CredentialProviderChain {
    
    @JSImport("aws-sdk/lib/core", "CredentialProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/core", "CredentialProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[provider] = js.native
    inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/lib/core", "Credentials")
  @js.native
  class Credentials protected ()
    extends typings.awsSdk.credentialsMod.Credentials {
    /**
      * Creates a Credentials object with a given set of credential information as an options hash.
      *
      * @param {object} options - An option hash containing a set of credential information.
      */
    def this(options: CredentialsOptions) = this()
    /**
      * Creates a Credentials object with a given set of credential information as positional arguments.
      *          *
      * @param {string} accessKeyId - The AWS access key ID.
      * @param {string} secretAccessKey - The AWS secret access key.
      * @param {string} sessionToken - The optional AWS session token.
      */
    def this(accessKeyId: String, secretAccessKey: String) = this()
    def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
  }
  /* static members */
  object Credentials {
    
    @JSImport("aws-sdk/lib/core", "Credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/core", "Credentials.expiryWindow")
    @js.native
    def expiryWindow: Double = js.native
    inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/lib/core", "EC2MetadataCredentials")
  @js.native
  /**
  		 * Creates credentials from the metadata service on an EC2 instance.
  		 * @param {object} options - Override the default (1s) timeout period.
  		 */
  class EC2MetadataCredentials ()
    extends typings.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "ECSCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class ECSCredentials ()
    extends typings.awsSdk.ecsCredentialsMod.ECSCredentials {
    def this(options: ECSCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.awsSdk.endpointMod.Endpoint {
    /**
      * Constructs a new endpoint given an endpoint URL.
      */
    def this(url: String) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "EnvironmentCredentials")
  @js.native
  class EnvironmentCredentials protected ()
    extends typings.awsSdk.environmentCredentialsMod.EnvironmentCredentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
  
  object EventListeners {
    
    object Core {
      
      @JSImport("aws-sdk/lib/core", "EventListeners.Core")
      @js.native
      val ^ : js.Any = js.native
      
      inline def HTTP_DATA(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HTTP_DATA")().asInstanceOf[Unit]
      
      inline def SEND(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SEND")().asInstanceOf[Unit]
      
      inline def VALIDATE_CREDENTIALS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("VALIDATE_CREDENTIALS")().asInstanceOf[Unit]
      
      inline def VALIDATE_PARAMETERS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("VALIDATE_PARAMETERS")().asInstanceOf[Unit]
      
      inline def VALIDATE_REGION(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("VALIDATE_REGION")().asInstanceOf[Unit]
      
      inline def removeListener(eventName: String, eventListener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
  
  @JSImport("aws-sdk/lib/core", "FileSystemCredentials")
  @js.native
  class FileSystemCredentials protected ()
    extends typings.awsSdk.fileSystemCredentialsMod.FileSystemCredentials {
    /**
      * Creates a new FileSystemCredentials object from a filename.
      * @param {string} filename - The path on disk to the JSON file to load.
      */
    def this(filename: String) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "HttpRequest")
  @js.native
  class HttpRequest protected ()
    extends typings.awsSdk.httpRequestMod.HttpRequest {
    /**
      * Constructs HttpRequest object with provided endpoint and region
      */
    def this(endpoint: typings.awsSdk.endpointMod.Endpoint, region: String) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "HttpResponse")
  @js.native
  class HttpResponse ()
    extends typings.awsSdk.httpResponseMod.HttpResponse
  
  @JSImport("aws-sdk/lib/core", "IniLoader")
  @js.native
  class IniLoader ()
    extends typings.awsSdk.iniLoaderMod.IniLoader
  
  @JSImport("aws-sdk/lib/core", "MetadataService")
  @js.native
  /**
    * Creates a new MetadataService object with a given set of options.
    */
  class MetadataService ()
    extends typings.awsSdk.metadataServiceMod.MetadataService {
    def this(options: MetadataServiceOptions) = this()
  }
  /* static members */
  object MetadataService {
    
    @JSImport("aws-sdk/lib/core", "MetadataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 169.254.169.254
      */
    @JSImport("aws-sdk/lib/core", "MetadataService.host")
    @js.native
    def host: String = js.native
    inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/lib/core", "ProcessCredentials")
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  class ProcessCredentials ()
    extends typings.awsSdk.processCredentialsMod.ProcessCredentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "RemoteCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class RemoteCredentials ()
    extends typings.awsSdk.remoteCredentialsMod.RemoteCredentials {
    def this(options: RemoteCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "Request")
  @js.native
  class Request[D, E] protected ()
    extends typings.awsSdk.requestMod.Request[D, E] {
    /**
      * Creates a request for an operation on a given service with a set of input parameters.
      *
      * @param {AWS.Service} service - The service to perform the operation on.
      * @param {string} operation - The operation to perform on the service.
      * @param {object} params - Parameters to send to the operation.
      */
    def this(service: typings.awsSdk.serviceMod.Service, operation: String) = this()
    def this(service: typings.awsSdk.serviceMod.Service, operation: String, params: js.Any) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "Response")
  @js.native
  class Response[D, E] ()
    extends typings.awsSdk.responseMod.Response[D, E]
  
  @JSImport("aws-sdk/lib/core", "SAMLCredentials")
  @js.native
  class SAMLCredentials protected ()
    extends typings.awsSdk.samlCredentialsMod.SAMLCredentials {
    /**
    		 * Creates a new credentials object.
    		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
    		 */
    def this(params: SAMLCredentialsParams) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "Service")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class Service ()
    extends typings.awsSdk.serviceMod.Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "SharedIniFileCredentials")
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  class SharedIniFileCredentials ()
    extends typings.awsSdk.sharedIniFileCredentialsMod.SharedIniFileCredentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "TemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class TemporaryCredentials ()
    extends typings.awsSdk.temporaryCredentialsMod.TemporaryCredentials {
    /**
      * Creates a new temporary credentials object.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
      */
    def this(options: TemporaryCredentialsOptions) = this()
    def this(options: TemporaryCredentialsOptions, masterCredentials: typings.awsSdk.credentialsMod.Credentials) = this()
  }
  // Needed to expose interfaces on the class
  object TemporaryCredentials
  
  @JSImport("aws-sdk/lib/core", "TokenFileWebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  class TokenFileWebIdentityCredentials ()
    extends typings.awsSdk.tokenFileWebIdentityCredentialsMod.TokenFileWebIdentityCredentials {
    def this(clientConfig: typings.awsSdk.configBaseMod.ConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk/lib/core", "WebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class WebIdentityCredentials ()
    extends typings.awsSdk.webIdentityCredentialsMod.WebIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuraion.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
      */
    def this(options: WebIdentityCredentialsOptions) = this()
    def this(
      options: WebIdentityCredentialsOptions,
      clientConfig: typings.awsSdk.configBaseMod.ConfigurationOptions
    ) = this()
  }
  // Needed to expose interfaces on the class
  object WebIdentityCredentials
}
