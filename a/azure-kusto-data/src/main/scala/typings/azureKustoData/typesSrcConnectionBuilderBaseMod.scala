package typings.azureKustoData

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.mod.DeviceCodeInfo
import typings.azureIdentity.mod.InteractiveBrowserCredentialInBrowserOptions
import typings.azureIdentity.mod.InteractiveBrowserCredentialNodeOptions
import typings.azureKustoData.typesSrcClientDetailsMod.ClientDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcConnectionBuilderBaseMod {
  
  /* note: abstract class */ @JSImport("azure-kusto-data/types/src/connectionBuilderBase", JSImport.Default)
  @js.native
  open class default protected () extends KustoConnectionStringBuilderBase {
    def this(connectionString: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("azure-kusto-data/types/src/connectionBuilderBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "default.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "default.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def fromExisting(other: KustoConnectionStringBuilderBase): KustoConnectionStringBuilderBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExisting")(other.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilderBase]
  }
  
  @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "KeywordMapping")
  @js.native
  val KeywordMapping: KeywordMappingRecordType = js.native
  
  /* note: abstract class */ @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "KustoConnectionStringBuilderBase")
  @js.native
  open class KustoConnectionStringBuilderBase protected () extends StObject {
    def this(connectionString: String) = this()
    
    var aadFederatedSecurity: js.UndefOr[Boolean] = js.native
    
    var aadUserId: js.UndefOr[String] = js.native
    
    var accessToken: js.UndefOr[String] = js.native
    
    var applicationCertificatePath: js.UndefOr[String] = js.native
    
    var applicationCertificatePrivateKey: js.UndefOr[String] = js.native
    
    var applicationCertificateSendX5c: js.UndefOr[Boolean] = js.native
    
    var applicationClientId: js.UndefOr[String] = js.native
    
    var applicationKey: js.UndefOr[String] = js.native
    
    var applicationNameForTracing: String | Null = js.native
    
    var authorityId: String = js.native
    
    def clientDetails(): ClientDetails = js.native
    
    var dataSource: js.UndefOr[String] = js.native
    
    var deviceCodeCallback: js.UndefOr[js.Function1[/* response */ DeviceCodeInfo, Unit]] = js.native
    
    var initialCatalog: js.UndefOr[String] = js.native
    
    var interactiveCredentialOptions: js.UndefOr[
        InteractiveBrowserCredentialNodeOptions | InteractiveBrowserCredentialInBrowserOptions
      ] = js.native
    
    var msiClientId: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    /**
      * Sets the connector details for tracing purposes.
      *
      * @param name  The name of the connector
      * @param version  The version of the connector
      * @param appName? The name of the containing application
      * @param appVersion?? The version of the containing application
      * @param sendUser Whether to send the username
      * @param overrideUser?? Override the username ( if sendUser is True )
      * @param additionalFields? Additional fields to add to the header
      */
    def setConnectorDetails(name: String, version: String): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: String): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: String, appVersion: String): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: String, appVersion: String, sendUser: Boolean): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: String,
      sendUser: Boolean,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: String,
      sendUser: Boolean,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: String,
      sendUser: Boolean,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: String,
      sendUser: Unit,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: String,
      sendUser: Unit,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: String,
      sendUser: Unit,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: String, appVersion: Unit, sendUser: Boolean): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: Unit,
      sendUser: Boolean,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: Unit,
      sendUser: Boolean,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: Unit,
      sendUser: Boolean,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: Unit,
      sendUser: Unit,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: Unit,
      sendUser: Unit,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: String,
      appVersion: Unit,
      sendUser: Unit,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: Unit, appVersion: String): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: Unit, appVersion: String, sendUser: Boolean): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: String,
      sendUser: Boolean,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: String,
      sendUser: Boolean,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: String,
      sendUser: Boolean,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: String,
      sendUser: Unit,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: String,
      sendUser: Unit,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: String,
      sendUser: Unit,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(name: String, version: String, appName: Unit, appVersion: Unit, sendUser: Boolean): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: Unit,
      sendUser: Boolean,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: Unit,
      sendUser: Boolean,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: Unit,
      sendUser: Boolean,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: Unit,
      sendUser: Unit,
      overrideUser: String
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: Unit,
      sendUser: Unit,
      overrideUser: String,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    def setConnectorDetails(
      name: String,
      version: String,
      appName: Unit,
      appVersion: Unit,
      sendUser: Unit,
      overrideUser: Unit,
      additionalFields: js.Array[js.Tuple2[String, String]]
    ): Unit = js.native
    
    var timeoutMs: js.UndefOr[Double] = js.native
    
    def toString(removeSecrets: Boolean): String = js.native
    
    var tokenCredential: js.UndefOr[TokenCredential] = js.native
    
    var tokenProvider: js.UndefOr[js.Function0[js.Promise[String]]] = js.native
    
    var useAzLoginAuth: js.UndefOr[Boolean] = js.native
    
    var useDeviceCodeAuth: js.UndefOr[Boolean] = js.native
    
    var useManagedIdentityAuth: js.UndefOr[Boolean] = js.native
    
    var useUserPromptAuth: js.UndefOr[Boolean] = js.native
    
    var userNameForTracing: String | Null = js.native
  }
  /* static members */
  object KustoConnectionStringBuilderBase {
    
    @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "KustoConnectionStringBuilderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "KustoConnectionStringBuilderBase.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/types/src/connectionBuilderBase", "KustoConnectionStringBuilderBase.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def fromExisting(other: KustoConnectionStringBuilderBase): KustoConnectionStringBuilderBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExisting")(other.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilderBase]
  }
  
  /* Inlined azure-kusto-data.azure-kusto-data/types/src/typeUtilts.KeyOfType<azure-kusto-data.azure-kusto-data/types/src/connectionBuilderBase.KustoConnectionStringBuilderBase, string | boolean | undefined> */
  /* Rewritten from type alias, can be one of: 
    - typings.azureKustoData.azureKustoDataStrings.msiClientId
    - typings.azureKustoData.azureKustoDataStrings.initialCatalog
    - typings.azureKustoData.azureKustoDataStrings.SecretReplacement
    - typings.azureKustoData.azureKustoDataStrings.timeoutMs
    - typings.azureKustoData.azureKustoDataStrings.accessToken
    - typings.azureKustoData.azureKustoDataStrings.clientDetails
    - typings.azureKustoData.azureKustoDataStrings.applicationCertificatePrivateKey
    - typings.azureKustoData.azureKustoDataStrings.useUserPromptAuth
    - typings.azureKustoData.azureKustoDataStrings.useAzLoginAuth
    - typings.azureKustoData.azureKustoDataStrings.userNameForTracing
    - typings.azureKustoData.azureKustoDataStrings.authorityId
    - typings.azureKustoData.azureKustoDataStrings.setConnectorDetails
    - typings.azureKustoData.azureKustoDataStrings.applicationCertificateSendX5c
    - typings.azureKustoData.azureKustoDataStrings.applicationCertificatePath
    - typings.azureKustoData.azureKustoDataStrings.applicationClientId
    - typings.azureKustoData.azureKustoDataStrings.tokenProvider
    - typings.azureKustoData.azureKustoDataStrings.fromExisting
    - typings.azureKustoData.azureKustoDataStrings.interactiveCredentialOptions
    - typings.azureKustoData.azureKustoDataStrings.password
    - typings.azureKustoData.azureKustoDataStrings.aadFederatedSecurity
    - typings.azureKustoData.azureKustoDataStrings.applicationNameForTracing
    - typings.azureKustoData.azureKustoDataStrings.DefaultDatabaseName
    - typings.azureKustoData.azureKustoDataStrings.dataSource
    - typings.azureKustoData.azureKustoDataStrings.aadUserId
    - typings.azureKustoData.azureKustoDataStrings.toString
    - typings.azureKustoData.azureKustoDataStrings.constructor
    - typings.azureKustoData.azureKustoDataStrings.applicationKey
    - typings.azureKustoData.azureKustoDataStrings.tokenCredential
    - typings.azureKustoData.azureKustoDataStrings.useManagedIdentityAuth
    - typings.azureKustoData.azureKustoDataStrings.deviceCodeCallback
    - typings.azureKustoData.azureKustoDataStrings.useDeviceCodeAuth
  */
  trait KcsbMappedKeys extends StObject
  object KcsbMappedKeys {
    
    inline def DefaultDatabaseName: typings.azureKustoData.azureKustoDataStrings.DefaultDatabaseName = "DefaultDatabaseName".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.DefaultDatabaseName]
    
    inline def SecretReplacement: typings.azureKustoData.azureKustoDataStrings.SecretReplacement = "SecretReplacement".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.SecretReplacement]
    
    inline def aadFederatedSecurity: typings.azureKustoData.azureKustoDataStrings.aadFederatedSecurity = "aadFederatedSecurity".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.aadFederatedSecurity]
    
    inline def aadUserId: typings.azureKustoData.azureKustoDataStrings.aadUserId = "aadUserId".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.aadUserId]
    
    inline def accessToken: typings.azureKustoData.azureKustoDataStrings.accessToken = "accessToken".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.accessToken]
    
    inline def applicationCertificatePath: typings.azureKustoData.azureKustoDataStrings.applicationCertificatePath = "applicationCertificatePath".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.applicationCertificatePath]
    
    inline def applicationCertificatePrivateKey: typings.azureKustoData.azureKustoDataStrings.applicationCertificatePrivateKey = "applicationCertificatePrivateKey".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.applicationCertificatePrivateKey]
    
    inline def applicationCertificateSendX5c: typings.azureKustoData.azureKustoDataStrings.applicationCertificateSendX5c = "applicationCertificateSendX5c".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.applicationCertificateSendX5c]
    
    inline def applicationClientId: typings.azureKustoData.azureKustoDataStrings.applicationClientId = "applicationClientId".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.applicationClientId]
    
    inline def applicationKey: typings.azureKustoData.azureKustoDataStrings.applicationKey = "applicationKey".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.applicationKey]
    
    inline def applicationNameForTracing: typings.azureKustoData.azureKustoDataStrings.applicationNameForTracing = "applicationNameForTracing".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.applicationNameForTracing]
    
    inline def authorityId: typings.azureKustoData.azureKustoDataStrings.authorityId = "authorityId".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.authorityId]
    
    inline def clientDetails: typings.azureKustoData.azureKustoDataStrings.clientDetails = "clientDetails".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.clientDetails]
    
    inline def constructor: typings.azureKustoData.azureKustoDataStrings.constructor = "constructor".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.constructor]
    
    inline def dataSource: typings.azureKustoData.azureKustoDataStrings.dataSource = "dataSource".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.dataSource]
    
    inline def deviceCodeCallback: typings.azureKustoData.azureKustoDataStrings.deviceCodeCallback = "deviceCodeCallback".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.deviceCodeCallback]
    
    inline def fromExisting: typings.azureKustoData.azureKustoDataStrings.fromExisting = "fromExisting".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.fromExisting]
    
    inline def initialCatalog: typings.azureKustoData.azureKustoDataStrings.initialCatalog = "initialCatalog".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.initialCatalog]
    
    inline def interactiveCredentialOptions: typings.azureKustoData.azureKustoDataStrings.interactiveCredentialOptions = "interactiveCredentialOptions".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.interactiveCredentialOptions]
    
    inline def msiClientId: typings.azureKustoData.azureKustoDataStrings.msiClientId = "msiClientId".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.msiClientId]
    
    inline def password: typings.azureKustoData.azureKustoDataStrings.password = "password".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.password]
    
    inline def setConnectorDetails: typings.azureKustoData.azureKustoDataStrings.setConnectorDetails = "setConnectorDetails".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.setConnectorDetails]
    
    inline def timeoutMs: typings.azureKustoData.azureKustoDataStrings.timeoutMs = "timeoutMs".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.timeoutMs]
    
    inline def tokenCredential: typings.azureKustoData.azureKustoDataStrings.tokenCredential = "tokenCredential".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.tokenCredential]
    
    inline def tokenProvider: typings.azureKustoData.azureKustoDataStrings.tokenProvider = "tokenProvider".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.tokenProvider]
    
    inline def useAzLoginAuth: typings.azureKustoData.azureKustoDataStrings.useAzLoginAuth = "useAzLoginAuth".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.useAzLoginAuth]
    
    inline def useDeviceCodeAuth: typings.azureKustoData.azureKustoDataStrings.useDeviceCodeAuth = "useDeviceCodeAuth".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.useDeviceCodeAuth]
    
    inline def useManagedIdentityAuth: typings.azureKustoData.azureKustoDataStrings.useManagedIdentityAuth = "useManagedIdentityAuth".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.useManagedIdentityAuth]
    
    inline def useUserPromptAuth: typings.azureKustoData.azureKustoDataStrings.useUserPromptAuth = "useUserPromptAuth".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.useUserPromptAuth]
    
    inline def userNameForTracing: typings.azureKustoData.azureKustoDataStrings.userNameForTracing = "userNameForTracing".asInstanceOf[typings.azureKustoData.azureKustoDataStrings.userNameForTracing]
  }
  
  /* Inlined std.Partial<std.Record<azure-kusto-data.azure-kusto-data/types/src/connectionBuilderBase.KcsbMappedKeys, azure-kusto-data.azure-kusto-data/types/src/connectionBuilderBase.MappingType>> */
  trait KeywordMappingRecordType extends StObject {
    
    var DefaultDatabaseName: js.UndefOr[MappingType] = js.undefined
    
    var SecretReplacement: js.UndefOr[MappingType] = js.undefined
    
    var aadFederatedSecurity: js.UndefOr[MappingType] = js.undefined
    
    var aadUserId: js.UndefOr[MappingType] = js.undefined
    
    var accessToken: js.UndefOr[MappingType] = js.undefined
    
    var applicationCertificatePath: js.UndefOr[MappingType] = js.undefined
    
    var applicationCertificatePrivateKey: js.UndefOr[MappingType] = js.undefined
    
    var applicationCertificateSendX5c: js.UndefOr[MappingType] = js.undefined
    
    var applicationClientId: js.UndefOr[MappingType] = js.undefined
    
    var applicationKey: js.UndefOr[MappingType] = js.undefined
    
    var applicationNameForTracing: js.UndefOr[MappingType] = js.undefined
    
    var authorityId: js.UndefOr[MappingType] = js.undefined
    
    var clientDetails: js.UndefOr[MappingType] = js.undefined
    
    var constructor: js.UndefOr[MappingType] = js.undefined
    
    var dataSource: js.UndefOr[MappingType] = js.undefined
    
    var deviceCodeCallback: js.UndefOr[MappingType] = js.undefined
    
    var fromExisting: js.UndefOr[MappingType] = js.undefined
    
    var initialCatalog: js.UndefOr[MappingType] = js.undefined
    
    var interactiveCredentialOptions: js.UndefOr[MappingType] = js.undefined
    
    var msiClientId: js.UndefOr[MappingType] = js.undefined
    
    var password: js.UndefOr[MappingType] = js.undefined
    
    var setConnectorDetails: js.UndefOr[MappingType] = js.undefined
    
    var timeoutMs: js.UndefOr[MappingType] = js.undefined
    
    @JSName("toString")
    var toString_FKeywordMappingRecordType: js.UndefOr[MappingType] = js.undefined
    
    var tokenCredential: js.UndefOr[MappingType] = js.undefined
    
    var tokenProvider: js.UndefOr[MappingType] = js.undefined
    
    var useAzLoginAuth: js.UndefOr[MappingType] = js.undefined
    
    var useDeviceCodeAuth: js.UndefOr[MappingType] = js.undefined
    
    var useManagedIdentityAuth: js.UndefOr[MappingType] = js.undefined
    
    var useUserPromptAuth: js.UndefOr[MappingType] = js.undefined
    
    var userNameForTracing: js.UndefOr[MappingType] = js.undefined
  }
  object KeywordMappingRecordType {
    
    inline def apply(): KeywordMappingRecordType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeywordMappingRecordType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeywordMappingRecordType] (val x: Self) extends AnyVal {
      
      inline def setAadFederatedSecurity(value: MappingType): Self = StObject.set(x, "aadFederatedSecurity", value.asInstanceOf[js.Any])
      
      inline def setAadFederatedSecurityUndefined: Self = StObject.set(x, "aadFederatedSecurity", js.undefined)
      
      inline def setAadUserId(value: MappingType): Self = StObject.set(x, "aadUserId", value.asInstanceOf[js.Any])
      
      inline def setAadUserIdUndefined: Self = StObject.set(x, "aadUserId", js.undefined)
      
      inline def setAccessToken(value: MappingType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setApplicationCertificatePath(value: MappingType): Self = StObject.set(x, "applicationCertificatePath", value.asInstanceOf[js.Any])
      
      inline def setApplicationCertificatePathUndefined: Self = StObject.set(x, "applicationCertificatePath", js.undefined)
      
      inline def setApplicationCertificatePrivateKey(value: MappingType): Self = StObject.set(x, "applicationCertificatePrivateKey", value.asInstanceOf[js.Any])
      
      inline def setApplicationCertificatePrivateKeyUndefined: Self = StObject.set(x, "applicationCertificatePrivateKey", js.undefined)
      
      inline def setApplicationCertificateSendX5c(value: MappingType): Self = StObject.set(x, "applicationCertificateSendX5c", value.asInstanceOf[js.Any])
      
      inline def setApplicationCertificateSendX5cUndefined: Self = StObject.set(x, "applicationCertificateSendX5c", js.undefined)
      
      inline def setApplicationClientId(value: MappingType): Self = StObject.set(x, "applicationClientId", value.asInstanceOf[js.Any])
      
      inline def setApplicationClientIdUndefined: Self = StObject.set(x, "applicationClientId", js.undefined)
      
      inline def setApplicationKey(value: MappingType): Self = StObject.set(x, "applicationKey", value.asInstanceOf[js.Any])
      
      inline def setApplicationKeyUndefined: Self = StObject.set(x, "applicationKey", js.undefined)
      
      inline def setApplicationNameForTracing(value: MappingType): Self = StObject.set(x, "applicationNameForTracing", value.asInstanceOf[js.Any])
      
      inline def setApplicationNameForTracingUndefined: Self = StObject.set(x, "applicationNameForTracing", js.undefined)
      
      inline def setAuthorityId(value: MappingType): Self = StObject.set(x, "authorityId", value.asInstanceOf[js.Any])
      
      inline def setAuthorityIdUndefined: Self = StObject.set(x, "authorityId", js.undefined)
      
      inline def setClientDetails(value: MappingType): Self = StObject.set(x, "clientDetails", value.asInstanceOf[js.Any])
      
      inline def setClientDetailsUndefined: Self = StObject.set(x, "clientDetails", js.undefined)
      
      inline def setConstructor(value: MappingType): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setDataSource(value: MappingType): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDefaultDatabaseName(value: MappingType): Self = StObject.set(x, "DefaultDatabaseName", value.asInstanceOf[js.Any])
      
      inline def setDefaultDatabaseNameUndefined: Self = StObject.set(x, "DefaultDatabaseName", js.undefined)
      
      inline def setDeviceCodeCallback(value: MappingType): Self = StObject.set(x, "deviceCodeCallback", value.asInstanceOf[js.Any])
      
      inline def setDeviceCodeCallbackUndefined: Self = StObject.set(x, "deviceCodeCallback", js.undefined)
      
      inline def setFromExisting(value: MappingType): Self = StObject.set(x, "fromExisting", value.asInstanceOf[js.Any])
      
      inline def setFromExistingUndefined: Self = StObject.set(x, "fromExisting", js.undefined)
      
      inline def setInitialCatalog(value: MappingType): Self = StObject.set(x, "initialCatalog", value.asInstanceOf[js.Any])
      
      inline def setInitialCatalogUndefined: Self = StObject.set(x, "initialCatalog", js.undefined)
      
      inline def setInteractiveCredentialOptions(value: MappingType): Self = StObject.set(x, "interactiveCredentialOptions", value.asInstanceOf[js.Any])
      
      inline def setInteractiveCredentialOptionsUndefined: Self = StObject.set(x, "interactiveCredentialOptions", js.undefined)
      
      inline def setMsiClientId(value: MappingType): Self = StObject.set(x, "msiClientId", value.asInstanceOf[js.Any])
      
      inline def setMsiClientIdUndefined: Self = StObject.set(x, "msiClientId", js.undefined)
      
      inline def setPassword(value: MappingType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setSecretReplacement(value: MappingType): Self = StObject.set(x, "SecretReplacement", value.asInstanceOf[js.Any])
      
      inline def setSecretReplacementUndefined: Self = StObject.set(x, "SecretReplacement", js.undefined)
      
      inline def setSetConnectorDetails(value: MappingType): Self = StObject.set(x, "setConnectorDetails", value.asInstanceOf[js.Any])
      
      inline def setSetConnectorDetailsUndefined: Self = StObject.set(x, "setConnectorDetails", js.undefined)
      
      inline def setTimeoutMs(value: MappingType): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
      
      inline def setToString_(value: MappingType): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setTokenCredential(value: MappingType): Self = StObject.set(x, "tokenCredential", value.asInstanceOf[js.Any])
      
      inline def setTokenCredentialUndefined: Self = StObject.set(x, "tokenCredential", js.undefined)
      
      inline def setTokenProvider(value: MappingType): Self = StObject.set(x, "tokenProvider", value.asInstanceOf[js.Any])
      
      inline def setTokenProviderUndefined: Self = StObject.set(x, "tokenProvider", js.undefined)
      
      inline def setUseAzLoginAuth(value: MappingType): Self = StObject.set(x, "useAzLoginAuth", value.asInstanceOf[js.Any])
      
      inline def setUseAzLoginAuthUndefined: Self = StObject.set(x, "useAzLoginAuth", js.undefined)
      
      inline def setUseDeviceCodeAuth(value: MappingType): Self = StObject.set(x, "useDeviceCodeAuth", value.asInstanceOf[js.Any])
      
      inline def setUseDeviceCodeAuthUndefined: Self = StObject.set(x, "useDeviceCodeAuth", js.undefined)
      
      inline def setUseManagedIdentityAuth(value: MappingType): Self = StObject.set(x, "useManagedIdentityAuth", value.asInstanceOf[js.Any])
      
      inline def setUseManagedIdentityAuthUndefined: Self = StObject.set(x, "useManagedIdentityAuth", js.undefined)
      
      inline def setUseUserPromptAuth(value: MappingType): Self = StObject.set(x, "useUserPromptAuth", value.asInstanceOf[js.Any])
      
      inline def setUseUserPromptAuthUndefined: Self = StObject.set(x, "useUserPromptAuth", js.undefined)
      
      inline def setUserNameForTracing(value: MappingType): Self = StObject.set(x, "userNameForTracing", value.asInstanceOf[js.Any])
      
      inline def setUserNameForTracingUndefined: Self = StObject.set(x, "userNameForTracing", js.undefined)
    }
  }
  
  trait MappingType extends StObject {
    
    var isBool: js.UndefOr[Boolean] = js.undefined
    
    var isSecret: js.UndefOr[Boolean] = js.undefined
    
    var mappedTo: String
    
    var validNames: js.Array[String]
  }
  object MappingType {
    
    inline def apply(mappedTo: String, validNames: js.Array[String]): MappingType = {
      val __obj = js.Dynamic.literal(mappedTo = mappedTo.asInstanceOf[js.Any], validNames = validNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappingType] (val x: Self) extends AnyVal {
      
      inline def setIsBool(value: Boolean): Self = StObject.set(x, "isBool", value.asInstanceOf[js.Any])
      
      inline def setIsBoolUndefined: Self = StObject.set(x, "isBool", js.undefined)
      
      inline def setIsSecret(value: Boolean): Self = StObject.set(x, "isSecret", value.asInstanceOf[js.Any])
      
      inline def setIsSecretUndefined: Self = StObject.set(x, "isSecret", js.undefined)
      
      inline def setMappedTo(value: String): Self = StObject.set(x, "mappedTo", value.asInstanceOf[js.Any])
      
      inline def setValidNames(value: js.Array[String]): Self = StObject.set(x, "validNames", value.asInstanceOf[js.Any])
      
      inline def setValidNamesVarargs(value: String*): Self = StObject.set(x, "validNames", js.Array(value*))
    }
  }
}
