package typings.awsSdk

import typings.awsSdk.libConfigMod.APIVersions
import typings.awsSdk.libConfigMod.GlobalConfigInstance
import typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import typings.awsSdk.libCoreMod.Config
import typings.awsSdk.libCredentialsChainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typings.awsSdk.libCredentialsCognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typings.awsSdk.libCredentialsCredentialProviderChainMod.provider
import typings.awsSdk.libCredentialsEc2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import typings.awsSdk.libCredentialsEcsCredentialsMod.ECSCredentialsOptions
import typings.awsSdk.libCredentialsMod.CredentialsOptions
import typings.awsSdk.libCredentialsProcessCredentialsMod.ProcessCredentialsOptions
import typings.awsSdk.libCredentialsRemoteCredentialsMod.RemoteCredentialsOptions
import typings.awsSdk.libCredentialsSamlCredentialsMod.SAMLCredentialsParams
import typings.awsSdk.libCredentialsSharedIniFileCredentialsMod.SharedIniFileCredentialsOptions
import typings.awsSdk.libCredentialsSsoCredentialsMod.SsoCredentialsOptions
import typings.awsSdk.libCredentialsTemporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import typings.awsSdk.libCredentialsWebIdentityCredentialsMod.WebIdentityCredentials.WebIdentityCredentialsOptions
import typings.awsSdk.libMetadataServiceMod.MetadataServiceOptions
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  @JSImport("aws-sdk/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-sdk/global", "ChainableTemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    */
  open class ChainableTemporaryCredentials ()
    extends typings.awsSdk.libCoreMod.ChainableTemporaryCredentials {
    def this(options: ChainableTemporaryCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "CognitoIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    */
  open class CognitoIdentityCredentials ()
    extends typings.awsSdk.libCoreMod.CognitoIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(
      options: CognitoIdentityOptions,
      clientConfig: typings.awsSdk.libConfigBaseMod.ConfigurationOptions
    ) = this()
  }
  
  @JSImport("aws-sdk/global", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  open class Config_ () extends Config {
    def this(options: typings.awsSdk.libConfigBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
  }
  
  /* note: abstract class */ @JSImport("aws-sdk/global", "ConfigurationOptions")
  @js.native
  open class ConfigurationOptions ()
    extends typings.awsSdk.libCoreMod.ConfigurationOptions
  
  @JSImport("aws-sdk/global", "CredentialProviderChain")
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  open class CredentialProviderChain ()
    extends typings.awsSdk.libCoreMod.CredentialProviderChain {
    def this(providers: js.Array[provider]) = this()
  }
  /* static members */
  object CredentialProviderChain {
    
    @JSImport("aws-sdk/global", "CredentialProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/global", "CredentialProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[provider] = js.native
    inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/global", "Credentials")
  @js.native
  open class Credentials protected ()
    extends typings.awsSdk.libCoreMod.Credentials {
    /**
      * Creates a Credentials object with a given set of credential information as an options hash.
      *
      * @param {object} options - An option hash containing a set of credential information.
      */
    def this(options: CredentialsOptions) = this()
    /**
      * Creates a Credentials object with a given set of credential information as positional arguments.
      *
      * @param {string} accessKeyId - The AWS access key ID.
      * @param {string} secretAccessKey - The AWS secret access key.
      * @param {string} sessionToken - The optional AWS session token.
      */
    def this(accessKeyId: String, secretAccessKey: String) = this()
    def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
  }
  /* static members */
  object Credentials {
    
    @JSImport("aws-sdk/global", "Credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/global", "Credentials.expiryWindow")
    @js.native
    def expiryWindow: Double = js.native
    inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/global", "EC2MetadataCredentials")
  @js.native
  /**
    * Creates credentials from the metadata service on an EC2 instance.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class EC2MetadataCredentials ()
    extends typings.awsSdk.libCoreMod.EC2MetadataCredentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "ECSCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class ECSCredentials ()
    extends typings.awsSdk.libCoreMod.ECSCredentials {
    def this(options: ECSCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "Endpoint")
  @js.native
  open class Endpoint protected ()
    extends typings.awsSdk.libCoreMod.Endpoint {
    /**
      * Constructs a new endpoint given an endpoint URL.
      */
    def this(url: String) = this()
  }
  
  @JSImport("aws-sdk/global", "EnvironmentCredentials")
  @js.native
  open class EnvironmentCredentials protected ()
    extends typings.awsSdk.libCoreMod.EnvironmentCredentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
  
  object EventListeners {
    
    object Core {
      
      @JSImport("aws-sdk/global", "EventListeners.Core")
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
  
  @JSImport("aws-sdk/global", "FileSystemCredentials")
  @js.native
  open class FileSystemCredentials protected ()
    extends typings.awsSdk.libCoreMod.FileSystemCredentials {
    /**
      * Creates a new FileSystemCredentials object from a filename.
      * @param {string} filename - The path on disk to the JSON file to load.
      */
    def this(filename: String) = this()
  }
  
  @JSImport("aws-sdk/global", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends typings.awsSdk.libCoreMod.HttpRequest {
    /**
      * Constructs HttpRequest object with provided endpoint and region
      */
    def this(endpoint: typings.awsSdk.libEndpointMod.Endpoint, region: String) = this()
  }
  
  @JSImport("aws-sdk/global", "HttpResponse")
  @js.native
  open class HttpResponse ()
    extends typings.awsSdk.libCoreMod.HttpResponse
  
  @JSImport("aws-sdk/global", "IniLoader")
  @js.native
  open class IniLoader ()
    extends typings.awsSdk.libCoreMod.IniLoader
  
  @JSImport("aws-sdk/global", "MetadataService")
  @js.native
  /**
    * Creates a new MetadataService object with a given set of options.
    */
  open class MetadataService ()
    extends typings.awsSdk.libCoreMod.MetadataService {
    def this(options: MetadataServiceOptions) = this()
  }
  /* static members */
  object MetadataService {
    
    @JSImport("aws-sdk/global", "MetadataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 169.254.169.254
      */
    @JSImport("aws-sdk/global", "MetadataService.host")
    @js.native
    def host: String = js.native
    inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/global", "ProcessCredentials")
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  open class ProcessCredentials ()
    extends typings.awsSdk.libCoreMod.ProcessCredentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "RemoteCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class RemoteCredentials ()
    extends typings.awsSdk.libCoreMod.RemoteCredentials {
    def this(options: RemoteCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "Request")
  @js.native
  open class Request[D, E] protected ()
    extends typings.awsSdk.libCoreMod.Request[D, E] {
    /**
      * Creates a request for an operation on a given service with a set of input parameters.
      *
      * @param {AWS.Service} service - The service to perform the operation on.
      * @param {string} operation - The operation to perform on the service.
      * @param {object} params - Parameters to send to the operation.
      */
    def this(service: typings.awsSdk.libServiceMod.Service, operation: String) = this()
    def this(service: typings.awsSdk.libServiceMod.Service, operation: String, params: Any) = this()
  }
  
  @JSImport("aws-sdk/global", "Response")
  @js.native
  open class Response[D, E] ()
    extends typings.awsSdk.libCoreMod.Response[D, E]
  
  @JSImport("aws-sdk/global", "SAMLCredentials")
  @js.native
  open class SAMLCredentials protected ()
    extends typings.awsSdk.libCoreMod.SAMLCredentials {
    /**
    		 * Creates a new credentials object.
    		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
    		 */
    def this(params: SAMLCredentialsParams) = this()
  }
  
  @JSImport("aws-sdk/global", "Service")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class Service ()
    extends typings.awsSdk.libCoreMod.Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "SharedIniFileCredentials")
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  open class SharedIniFileCredentials ()
    extends typings.awsSdk.libCoreMod.SharedIniFileCredentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "SsoCredentials")
  @js.native
  /**
    * Creates a new SsoCredentials object.
    */
  open class SsoCredentials ()
    extends typings.awsSdk.libCoreMod.SsoCredentials {
    def this(options: SsoCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "TemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  open class TemporaryCredentials ()
    extends typings.awsSdk.libCoreMod.TemporaryCredentials {
    /**
      * Creates a new temporary credentials object.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
      */
    def this(options: TemporaryCredentialsOptions) = this()
    def this(
      options: TemporaryCredentialsOptions,
      masterCredentials: typings.awsSdk.libCredentialsMod.Credentials
    ) = this()
  }
  
  @JSImport("aws-sdk/global", "TokenFileWebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  open class TokenFileWebIdentityCredentials ()
    extends typings.awsSdk.libCoreMod.TokenFileWebIdentityCredentials {
    def this(clientConfig: typings.awsSdk.libConfigBaseMod.ConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "WebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  open class WebIdentityCredentials ()
    extends typings.awsSdk.libCoreMod.WebIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuraion.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
      */
    def this(options: WebIdentityCredentialsOptions) = this()
    def this(
      options: WebIdentityCredentialsOptions,
      clientConfig: typings.awsSdk.libConfigBaseMod.ConfigurationOptions
    ) = this()
  }
  
  @JSImport("aws-sdk/global", "config")
  @js.native
  def config: GlobalConfigInstance = js.native
  inline def config_=(x: GlobalConfigInstance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
}
