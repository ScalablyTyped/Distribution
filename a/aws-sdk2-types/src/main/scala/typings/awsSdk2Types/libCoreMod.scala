package typings.awsSdk2Types

import typings.awsSdk2Types.libConfigMod.APIVersions
import typings.awsSdk2Types.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import typings.awsSdk2Types.libCredentialsCredentialProviderChainMod.provider
import typings.awsSdk2Types.libCredentialsEc2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import typings.awsSdk2Types.libCredentialsEcsCredentialsMod.ECSCredentialsOptions
import typings.awsSdk2Types.libCredentialsMod.CredentialsOptions
import typings.awsSdk2Types.libCredentialsProcessCredentialsMod.ProcessCredentialsOptions
import typings.awsSdk2Types.libCredentialsRemoteCredentialsMod.RemoteCredentialsOptions
import typings.awsSdk2Types.libCredentialsSamlCredentialsMod.SAMLCredentialsParams
import typings.awsSdk2Types.libCredentialsSharedIniFileCredentialsMod.SharedIniFileCredentialsOptions
import typings.awsSdk2Types.libMetadataServiceMod.MetadataServiceOptions
import typings.awsSdk2Types.libServiceMod.ServiceConfigurationOptions
import typings.awsSdk2Types.libTokenMod.TokenOptions
import typings.awsSdk2Types.libTokenSsoTokenProviderMod.SSOTokenProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMod {
  
  @JSImport("aws-sdk2-types/lib/core", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  open class Config ()
    extends typings.awsSdk2Types.libConfigMod.Config {
    def this(options: typings.awsSdk2Types.libConfigBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
  }
  
  /* note: abstract class */ @JSImport("aws-sdk2-types/lib/core", "ConfigurationOptions")
  @js.native
  open class ConfigurationOptions ()
    extends typings.awsSdk2Types.libConfigBaseMod.ConfigurationOptions
  
  @JSImport("aws-sdk2-types/lib/core", "CredentialProviderChain")
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  open class CredentialProviderChain ()
    extends typings.awsSdk2Types.libCredentialsCredentialProviderChainMod.CredentialProviderChain {
    def this(providers: js.Array[provider]) = this()
  }
  /* static members */
  object CredentialProviderChain {
    
    @JSImport("aws-sdk2-types/lib/core", "CredentialProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk2-types/lib/core", "CredentialProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[provider] = js.native
    inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk2-types/lib/core", "Credentials")
  @js.native
  open class Credentials protected ()
    extends typings.awsSdk2Types.libCredentialsMod.Credentials {
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
    
    @JSImport("aws-sdk2-types/lib/core", "Credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk2-types/lib/core", "Credentials.expiryWindow")
    @js.native
    def expiryWindow: Double = js.native
    inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk2-types/lib/core", "EC2MetadataCredentials")
  @js.native
  /**
    * Creates credentials from the metadata service on an EC2 instance.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class EC2MetadataCredentials ()
    extends typings.awsSdk2Types.libCredentialsEc2MetadataCredentialsMod.EC2MetadataCredentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "ECSCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class ECSCredentials ()
    extends typings.awsSdk2Types.libCredentialsEcsCredentialsMod.ECSCredentials {
    def this(options: ECSCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "Endpoint")
  @js.native
  open class Endpoint protected ()
    extends typings.awsSdk2Types.libEndpointMod.Endpoint {
    /**
      * Constructs a new endpoint given an endpoint URL.
      */
    def this(url: String) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "EnvironmentCredentials")
  @js.native
  open class EnvironmentCredentials protected ()
    extends typings.awsSdk2Types.libCredentialsEnvironmentCredentialsMod.EnvironmentCredentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
  
  object EventListeners {
    
    object Core {
      
      @JSImport("aws-sdk2-types/lib/core", "EventListeners.Core")
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
  
  @JSImport("aws-sdk2-types/lib/core", "FileSystemCredentials")
  @js.native
  open class FileSystemCredentials protected ()
    extends typings.awsSdk2Types.libCredentialsFileSystemCredentialsMod.FileSystemCredentials {
    /**
      * Creates a new FileSystemCredentials object from a filename.
      * @param {string} filename - The path on disk to the JSON file to load.
      */
    def this(filename: String) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends typings.awsSdk2Types.libHttpRequestMod.HttpRequest {
    /**
      * Constructs HttpRequest object with provided endpoint and region
      */
    def this(endpoint: typings.awsSdk2Types.libEndpointMod.Endpoint, region: String) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "HttpResponse")
  @js.native
  open class HttpResponse ()
    extends typings.awsSdk2Types.libHttpResponseMod.HttpResponse
  
  @JSImport("aws-sdk2-types/lib/core", "IniLoader")
  @js.native
  open class IniLoader ()
    extends typings.awsSdk2Types.libSharedIniIniLoaderMod.IniLoader
  
  @JSImport("aws-sdk2-types/lib/core", "MetadataService")
  @js.native
  /**
    * Creates a new MetadataService object with a given set of options.
    */
  open class MetadataService ()
    extends typings.awsSdk2Types.libMetadataServiceMod.MetadataService {
    def this(options: MetadataServiceOptions) = this()
  }
  /* static members */
  object MetadataService {
    
    @JSImport("aws-sdk2-types/lib/core", "MetadataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 169.254.169.254
      */
    @JSImport("aws-sdk2-types/lib/core", "MetadataService.host")
    @js.native
    def host: String = js.native
    inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk2-types/lib/core", "ProcessCredentials")
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  open class ProcessCredentials ()
    extends typings.awsSdk2Types.libCredentialsProcessCredentialsMod.ProcessCredentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "RemoteCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class RemoteCredentials ()
    extends typings.awsSdk2Types.libCredentialsRemoteCredentialsMod.RemoteCredentials {
    def this(options: RemoteCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "Request")
  @js.native
  open class Request[D, E] protected ()
    extends typings.awsSdk2Types.libRequestMod.Request[D, E] {
    /**
      * Creates a request for an operation on a given service with a set of input parameters.
      *
      * @param {AWS.Service} service - The service to perform the operation on.
      * @param {string} operation - The operation to perform on the service.
      * @param {object} params - Parameters to send to the operation.
      */
    def this(service: typings.awsSdk2Types.libServiceMod.Service, operation: String) = this()
    def this(service: typings.awsSdk2Types.libServiceMod.Service, operation: String, params: Any) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "Response")
  @js.native
  open class Response[D, E] ()
    extends typings.awsSdk2Types.libResponseMod.Response[D, E]
  
  @JSImport("aws-sdk2-types/lib/core", "SAMLCredentials")
  @js.native
  open class SAMLCredentials protected ()
    extends typings.awsSdk2Types.libCredentialsSamlCredentialsMod.SAMLCredentials {
    /**
    		 * Creates a new credentials object.
    		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
    		 */
    def this(params: SAMLCredentialsParams) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "SSOTokenProvider")
  @js.native
  /**
    * Creates a new SSOTokenProvider object.
    */
  open class SSOTokenProvider ()
    extends typings.awsSdk2Types.libTokenSsoTokenProviderMod.SSOTokenProvider {
    def this(options: SSOTokenProviderOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "Service")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class Service ()
    extends typings.awsSdk2Types.libServiceMod.Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "SharedIniFileCredentials")
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  open class SharedIniFileCredentials ()
    extends typings.awsSdk2Types.libCredentialsSharedIniFileCredentialsMod.SharedIniFileCredentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "StaticTokenProvider")
  @js.native
  /**
    * Creates a new StaticTokenProvider object.
    */
  open class StaticTokenProvider ()
    extends typings.awsSdk2Types.libTokenStaticTokenProviderMod.StaticTokenProvider {
    def this(options: TokenOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "Token")
  @js.native
  open class Token protected ()
    extends typings.awsSdk2Types.libTokenMod.Token {
    /**
      * Creates a Token object with a given set of token information as an options hash.
      *
      * @param {object} options - An option hash containing a set of token information.
      */
    def this(options: TokenOptions) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("aws-sdk2-types/lib/core", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk2-types/lib/core", "Token.expiryWindow")
    @js.native
    def expiryWindow: Double = js.native
    inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk2-types/lib/core", "TokenFileWebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  open class TokenFileWebIdentityCredentials ()
    extends typings.awsSdk2Types.libCredentialsTokenFileWebIdentityCredentialsMod.TokenFileWebIdentityCredentials {
    def this(clientConfig: typings.awsSdk2Types.libConfigBaseMod.ConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk2-types/lib/core", "TokenProviderChain")
  @js.native
  /**
    * Creates a new TokenProviderChain with a default set of providers specified by defaultProviders.
    */
  open class TokenProviderChain ()
    extends typings.awsSdk2Types.libTokenTokenProviderChainMod.TokenProviderChain {
    def this(providers: js.Array[typings.awsSdk2Types.libTokenTokenProviderChainMod.provider]) = this()
  }
  /* static members */
  object TokenProviderChain {
    
    @JSImport("aws-sdk2-types/lib/core", "TokenProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk2-types/lib/core", "TokenProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[typings.awsSdk2Types.libTokenTokenProviderChainMod.provider] = js.native
    inline def defaultProviders_=(x: js.Array[typings.awsSdk2Types.libTokenTokenProviderChainMod.provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
}
