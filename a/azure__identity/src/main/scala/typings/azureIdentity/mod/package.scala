package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.mod.^
import typings.azureLogger.mod.AzureLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AggregateAuthenticationErrorName: /* "AggregateAuthenticationError" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("AggregateAuthenticationErrorName").asInstanceOf[/* "AggregateAuthenticationError" */ String]

inline def AuthenticationErrorName: /* "AuthenticationError" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("AuthenticationErrorName").asInstanceOf[/* "AuthenticationError" */ String]

inline def CredentialUnavailableErrorName: /* "CredentialUnavailableError" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("CredentialUnavailableErrorName").asInstanceOf[/* "CredentialUnavailableError" */ String]

inline def deserializeAuthenticationRecord(serializedRecord: String): AuthenticationRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAuthenticationRecord")(serializedRecord.asInstanceOf[js.Any]).asInstanceOf[AuthenticationRecord]

inline def getDefaultAzureCredential(): TokenCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAzureCredential")().asInstanceOf[TokenCredential]

inline def logger: AzureLogger = ^.asInstanceOf[js.Dynamic].selectDynamic("logger").asInstanceOf[AzureLogger]

inline def serializeAuthenticationRecord(record: AuthenticationRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAuthenticationRecord")(record.asInstanceOf[js.Any]).asInstanceOf[String]

inline def useIdentityPlugin(plugin: IdentityPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIdentityPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]

type AuthorizationCodeCredentialOptions = MultiTenantTokenCredentialOptions

type ClientAssertionCredentialOptions = MultiTenantTokenCredentialOptions

type DeviceCodePromptCallback = js.Function1[/* deviceCodeInfo */ DeviceCodeInfo, Unit]

type EnvironmentCredentialOptions = MultiTenantTokenCredentialOptions

type IdentityPlugin = js.Function1[/* context */ Any, Unit]

type OnBehalfOfCredentialOptions = (OnBehalfOfCredentialSecretOptions & MultiTenantTokenCredentialOptions & CredentialPersistenceOptions) | (OnBehalfOfCredentialCertificateOptions & MultiTenantTokenCredentialOptions & CredentialPersistenceOptions)
