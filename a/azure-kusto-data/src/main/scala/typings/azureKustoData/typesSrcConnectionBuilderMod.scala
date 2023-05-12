package typings.azureKustoData

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.mod.DeviceCodeInfo
import typings.azureIdentity.mod.InteractiveBrowserCredentialInBrowserOptions
import typings.azureIdentity.mod.InteractiveBrowserCredentialNodeOptions
import typings.azureKustoData.typesSrcConnectionBuilderBaseMod.KustoConnectionStringBuilderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcConnectionBuilderMod {
  
  @JSImport("azure-kusto-data/types/src/connectionBuilder", JSImport.Default)
  @js.native
  open class default protected () extends KustoConnectionStringBuilder {
    def this(connectionString: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "default.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "default.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def withAadApplicationCertificateAuthentication(connectionString: String, aadAppId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(connectionString: String, aadAppId: String, applicationCertificatePrivateKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: Unit,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "default.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities: Any = js.native
    inline def withAadManagedIdentities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withAadManagedIdentities")(x.asInstanceOf[js.Any])
    
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenCredential(connectionString: String, credential: TokenCredential): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenCredential")(connectionString.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    /**
      * Use InteractiveBrowserCredentialNodeOptions in Node.JS and InteractiveBrowserCredentialInBrowserOptions in browser
      * For browser cors issue: you need to visit your app registration and update the redirect URI you're using to the type spa (for "single page application").
      * See: https://github.com/Azure/azure-sdk-for-js/tree/main/sdk/identity/identity/test/manual/interactive-browser-credential
      */
    inline def withUserPrompt(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialInBrowserOptions): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialInBrowserOptions, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialNodeOptions): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialNodeOptions, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
  
  @JSImport("azure-kusto-data/types/src/connectionBuilder", "KustoConnectionStringBuilder")
  @js.native
  open class KustoConnectionStringBuilder protected () extends KustoConnectionStringBuilderBase {
    def this(connectionString: String) = this()
  }
  /* static members */
  object KustoConnectionStringBuilder {
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "KustoConnectionStringBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "KustoConnectionStringBuilder.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "KustoConnectionStringBuilder.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def withAadApplicationCertificateAuthentication(connectionString: String, aadAppId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(connectionString: String, aadAppId: String, applicationCertificatePrivateKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: Unit,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    @JSImport("azure-kusto-data/types/src/connectionBuilder", "KustoConnectionStringBuilder.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities: Any = js.native
    inline def withAadManagedIdentities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withAadManagedIdentities")(x.asInstanceOf[js.Any])
    
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenCredential(connectionString: String, credential: TokenCredential): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenCredential")(connectionString.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    /**
      * Use InteractiveBrowserCredentialNodeOptions in Node.JS and InteractiveBrowserCredentialInBrowserOptions in browser
      * For browser cors issue: you need to visit your app registration and update the redirect URI you're using to the type spa (for "single page application").
      * See: https://github.com/Azure/azure-sdk-for-js/tree/main/sdk/identity/identity/test/manual/interactive-browser-credential
      */
    inline def withUserPrompt(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialInBrowserOptions): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialInBrowserOptions, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialNodeOptions): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialNodeOptions, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
}
