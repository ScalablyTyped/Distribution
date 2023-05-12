package typings.azureKustoData

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.mod.DeviceCodeInfo
import typings.azureIdentity.mod.InteractiveBrowserCredentialInBrowserOptions
import typings.azureIdentity.mod.InteractiveBrowserCredentialNodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcConnectionBuilderDotbrowserMod {
  
  @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", JSImport.Default)
  @js.native
  open class default protected () extends KustoConnectionStringBuilder {
    def this(connectionString: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", "default.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", "default.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def withAadApplicationCertificateAuthentication(_connectionString: String, _aadAppId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(_connectionString: String, _aadAppId: String, _applicationCertificatePrivateKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(_connectionString: String, _aadAppId: String, _appKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _appKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(_connectionString: String, _aadAppId: String, _appKey: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _appKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(_connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(_connectionString: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      _connectionString: String,
      _authorityId: String,
      _deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      _connectionString: String,
      _authorityId: Unit,
      _deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadUserPasswordAuthentication(_connectionString: String, _userId: String, _password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(_connectionString.asInstanceOf[js.Any], _userId.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(_connectionString: String, _userId: String, _password: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(_connectionString.asInstanceOf[js.Any], _userId.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(_connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(_connectionString: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(_connectionString: String, _authorityId: String, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(_connectionString: String, _authorityId: Unit, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(_connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(_connectionString: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(_connectionString: String, _authorityId: String, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(_connectionString: String, _authorityId: Unit, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenCredential(connectionString: String, credential: TokenCredential): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenCredential")(connectionString.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String, _authorityId: String, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String, _authorityId: Unit, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserPrompt(
      connectionString: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialInBrowserOptions
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialInBrowserOptions,
      timeoutMs: Double
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, interactiveCredentialOptions: InteractiveBrowserCredentialNodeOptions): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialNodeOptions,
      timeoutMs: Double
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
  
  @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", "KustoConnectionStringBuilder")
  @js.native
  open class KustoConnectionStringBuilder protected ()
    extends typings.azureKustoData.typesSrcConnectionBuilderBaseMod.default {
    def this(connectionString: String) = this()
  }
  /* static members */
  object KustoConnectionStringBuilder {
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", "KustoConnectionStringBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", "KustoConnectionStringBuilder.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder.browser", "KustoConnectionStringBuilder.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def withAadApplicationCertificateAuthentication(_connectionString: String, _aadAppId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(_connectionString: String, _aadAppId: String, _applicationCertificatePrivateKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: String,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: String,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: String,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Boolean,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      _connectionString: String,
      _aadAppId: String,
      _applicationCertificatePrivateKey: Unit,
      _authorityId: Unit,
      _applicationCertificateSendX5c: Unit,
      _applicationCertificatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _applicationCertificatePrivateKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _applicationCertificateSendX5c.asInstanceOf[js.Any], _applicationCertificatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(_connectionString: String, _aadAppId: String, _appKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _appKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(_connectionString: String, _aadAppId: String, _appKey: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(_connectionString.asInstanceOf[js.Any], _aadAppId.asInstanceOf[js.Any], _appKey.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(_connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(_connectionString: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      _connectionString: String,
      _authorityId: String,
      _deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      _connectionString: String,
      _authorityId: Unit,
      _deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadUserPasswordAuthentication(_connectionString: String, _userId: String, _password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(_connectionString.asInstanceOf[js.Any], _userId.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(_connectionString: String, _userId: String, _password: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(_connectionString.asInstanceOf[js.Any], _userId.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(_connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(_connectionString: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(_connectionString: String, _authorityId: String, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(_connectionString: String, _authorityId: Unit, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(_connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(_connectionString: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(_connectionString: String, _authorityId: String, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(_connectionString: String, _authorityId: Unit, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(_connectionString.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenCredential(connectionString: String, credential: TokenCredential): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenCredential")(connectionString.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String, _authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String, _authorityId: String, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(_connectionString: String, _msiClientId: String, _authorityId: Unit, _timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(_connectionString.asInstanceOf[js.Any], _msiClientId.asInstanceOf[js.Any], _authorityId.asInstanceOf[js.Any], _timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserPrompt(
      connectionString: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialInBrowserOptions
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialInBrowserOptions,
      timeoutMs: Double
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, interactiveCredentialOptions: InteractiveBrowserCredentialNodeOptions): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialNodeOptions,
      timeoutMs: Double
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], interactiveCredentialOptions.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
}
