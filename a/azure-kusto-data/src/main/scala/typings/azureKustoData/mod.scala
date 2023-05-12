package typings.azureKustoData

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.mod.DeviceCodeInfo
import typings.azureIdentity.mod.InteractiveBrowserCredentialInBrowserOptions
import typings.azureIdentity.mod.InteractiveBrowserCredentialNodeOptions
import typings.azureKustoData.typesSrcClientMod.default
import typings.azureKustoData.typesSrcKustoTrustedEndpointsMod.KustoTrustedEndpointsImpl
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("azure-kusto-data", "Client")
  @js.native
  open class Client protected () extends default {
    def this(kcsb: String) = this()
    def this(kcsb: typings.azureKustoData.typesSrcConnectionBuilderMod.default) = this()
  }
  
  @JSImport("azure-kusto-data", "ClientRequestProperties")
  @js.native
  open class ClientRequestProperties ()
    extends typings.azureKustoData.typesSrcClientRequestPropertiesMod.default {
    def this(options: Record[String, Any]) = this()
    def this(options: Unit, parameters: Record[String, Any]) = this()
    def this(options: Record[String, Any], parameters: Record[String, Any]) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String) = this()
    def this(options: Unit, parameters: Record[String, Any], clientRequestId: String) = this()
    def this(options: Record[String, Any], parameters: Unit, clientRequestId: String) = this()
    def this(options: Record[String, Any], parameters: Record[String, Any], clientRequestId: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String, user: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: Unit, user: String) = this()
    def this(options: Unit, parameters: Record[String, Any], clientRequestId: String, user: String) = this()
    def this(options: Unit, parameters: Record[String, Any], clientRequestId: Unit, user: String) = this()
    def this(options: Record[String, Any], parameters: Unit, clientRequestId: String, user: String) = this()
    def this(options: Record[String, Any], parameters: Unit, clientRequestId: Unit, user: String) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: String,
      user: String
    ) = this()
    def this(options: Record[String, Any], parameters: Record[String, Any], clientRequestId: Unit, user: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String, user: String, application: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String, user: Unit, application: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: Unit, user: String, application: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: Unit, user: Unit, application: String) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: String,
      user: String,
      application: String
    ) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: String,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: String,
      application: String
    ) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: String,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: String,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: Unit,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: Unit,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: String,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: String,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: Unit,
      application: String
    ) = this()
  }
  
  @JSImport("azure-kusto-data", "CloudSettings")
  @js.native
  val CloudSettings: typings.azureKustoData.typesSrcCloudSettingsMod.CloudSettings = js.native
  
  @JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
  @js.native
  open class KustoConnectionStringBuilder protected ()
    extends typings.azureKustoData.typesSrcConnectionBuilderMod.default {
    def this(connectionString: String) = this()
  }
  /* static members */
  object KustoConnectionStringBuilder {
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def withAadApplicationCertificateAuthentication(connectionString: String, aadAppId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(connectionString: String, aadAppId: String, applicationCertificatePrivateKey: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Boolean
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: String,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      authorityId: Unit,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Boolean
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: String,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Boolean,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: Unit,
      authorityId: Unit,
      applicationCertificateSendX5c: Unit,
      applicationCertificatePrivatePath: String
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateSendX5c.asInstanceOf[js.Any], applicationCertificatePrivatePath.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(connectionString: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(connectionString: String, authorityId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: Unit,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]
    ): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.withAadManagedIdentities")
    @js.native
    def withAadManagedIdentities: Any = js.native
    inline def withAadManagedIdentities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withAadManagedIdentities")(x.asInstanceOf[js.Any])
    
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(connectionString: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(connectionString: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withTokenCredential(connectionString: String, credential: TokenCredential): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenCredential")(connectionString.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    
    /**
      * Use InteractiveBrowserCredentialNodeOptions in Node.JS and InteractiveBrowserCredentialInBrowserOptions in browser
      * For browser cors issue: you need to visit your app registration and update the redirect URI you're using to the type spa (for "single page application").
      * See: https://github.com/Azure/azure-sdk-for-js/tree/main/sdk/identity/identity/test/manual/interactive-browser-credential
      */
    inline def withUserPrompt(connectionString: String): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: Unit, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialInBrowserOptions): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialInBrowserOptions, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialNodeOptions): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, options: InteractiveBrowserCredentialNodeOptions, timeoutMs: Double): typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typings.azureKustoData.typesSrcConnectionBuilderMod.KustoConnectionStringBuilder]
  }
  
  object KustoDataErrors {
    
    @JSImport("azure-kusto-data", "KustoDataErrors.KustoAuthenticationError")
    @js.native
    open class KustoAuthenticationError protected ()
      extends typings.azureKustoData.typesSrcErrorsMod.KustoAuthenticationError {
      def this(message: String, inner: js.Error, tokenProviderName: String, context: Record[String, Any]) = this()
      def this(message: String, inner: Unit, tokenProviderName: String, context: Record[String, Any]) = this()
    }
    
    @JSImport("azure-kusto-data", "KustoDataErrors.ThrottlingError")
    @js.native
    open class ThrottlingError protected ()
      extends typings.azureKustoData.typesSrcErrorsMod.ThrottlingError {
      def this(message: String) = this()
      def this(message: String, inner: js.Error) = this()
    }
  }
  
  @JSImport("azure-kusto-data", "MatchRule")
  @js.native
  open class MatchRule protected ()
    extends typings.azureKustoData.typesSrcKustoTrustedEndpointsMod.MatchRule {
    def this(
      /**
      * The suffix which the candidate must end with in order to match.
      */
    suffix: String,
      /**
      * Indicates whether the match must be exact (the candidate must
      * not have any prefix) or not.
      */
    exact: Boolean
    ) = this()
  }
  
  object TimeUtils {
    
    @JSImport("azure-kusto-data", "TimeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data", "TimeUtils.toMilliseconds")
    @js.native
    def toMilliseconds: js.Function3[/* hours */ Double, /* minutes */ Double, /* seconds */ Double, Double] = js.native
    inline def toMilliseconds(hours: Double, minutes: Double, seconds: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toMilliseconds")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def toMilliseconds_=(x: js.Function3[/* hours */ Double, /* minutes */ Double, /* seconds */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMilliseconds")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("azure-kusto-data", "kustoTrustedEndpoints")
  @js.native
  val kustoTrustedEndpoints: KustoTrustedEndpointsImpl = js.native
}
