package typings.azureKustoData

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.mod.DeviceCodeInfo
import typings.azureIdentity.mod.InteractiveBrowserCredentialInBrowserOptions
import typings.azureIdentity.mod.InteractiveBrowserCredentialNodeOptions
import typings.azureKustoData.typesSrcCloudSettingsMod.CloudInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcTokenProviderMod {
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "ApplicationCertificateTokenProvider")
  @js.native
  open class ApplicationCertificateTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String, appClientId: String) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: String) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: String, certPath: String) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: Unit, certPath: String) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: String, certPath: String, sendX5c: Boolean) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: String, certPath: Unit, sendX5c: Boolean) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: Unit, certPath: String, sendX5c: Boolean) = this()
    def this(kustoUri: String, appClientId: String, certPrivateKey: Unit, certPath: Unit, sendX5c: Boolean) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: String,
      sendX5c: Boolean,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: String,
      sendX5c: Unit,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: Unit,
      sendX5c: Boolean,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: Unit,
      sendX5c: Unit,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: String,
      sendX5c: Boolean,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: String,
      sendX5c: Unit,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: Unit,
      sendX5c: Boolean,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: Unit,
      sendX5c: Unit,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: String,
      sendX5c: Boolean,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: String,
      sendX5c: Boolean,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: String,
      sendX5c: Unit,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: String,
      sendX5c: Unit,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: Unit,
      sendX5c: Boolean,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: Unit,
      sendX5c: Boolean,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: Unit,
      sendX5c: Unit,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: String,
      certPath: Unit,
      sendX5c: Unit,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: String,
      sendX5c: Boolean,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: String,
      sendX5c: Boolean,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: String,
      sendX5c: Unit,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: String,
      sendX5c: Unit,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: Unit,
      sendX5c: Boolean,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: Unit,
      sendX5c: Boolean,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: Unit,
      sendX5c: Unit,
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certPrivateKey: Unit,
      certPath: Unit,
      sendX5c: Unit,
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    
    /* private */ var appClientId: Any = js.native
    
    /* private */ var certPath: Any = js.native
    
    /* private */ var certPrivateKey: Any = js.native
    
    /* private */ var sendX5c: Any = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "ApplicationKeyTokenProvider")
  @js.native
  open class ApplicationKeyTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String, appClientId: String, appKey: String, authorityId: String) = this()
    def this(kustoUri: String, appClientId: String, appKey: String, authorityId: String, timeoutMs: Double) = this()
    
    /* private */ var appClientId: Any = js.native
    
    /* private */ var appKey: Any = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "AzCliTokenProvider")
  @js.native
  open class AzCliTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, authorityId: String) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, authorityId: Unit, timeoutMs: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("azure-kusto-data/types/src/tokenProvider", "AzureIdentityProvider")
  @js.native
  open class AzureIdentityProvider protected () extends CloudSettingsTokenProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, authorityId: String) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, authorityId: Unit, timeoutMs: Double) = this()
    
    /* protected */ var authorityId: js.UndefOr[String] = js.native
    
    /* private */ var credential: Any = js.native
    
    def getCredential(): TokenCredential = js.native
    
    /* private */ var timeoutMs: Any = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "BasicTokenProvider")
  @js.native
  open class BasicTokenProvider protected () extends TokenProviderBase {
    def this(kustoUri: String, token: String) = this()
    
    var token: String = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "CallbackTokenProvider")
  @js.native
  open class CallbackTokenProvider protected () extends TokenProviderBase {
    def this(kustoUri: String, callback: js.Function0[js.Promise[String]]) = this()
    
    def callback(): js.Promise[String] = js.native
  }
  
  /* note: abstract class */ @JSImport("azure-kusto-data/types/src/tokenProvider", "CloudSettingsTokenProvider")
  @js.native
  open class CloudSettingsTokenProvider protected () extends TokenProviderBase {
    /* protected */ def this(kustoUri: String) = this()
    
    def acquireTokenWithCloudSettings(): js.Promise[TokenType | Null] = js.native
    
    def additionalCloudSettingsInit(): Unit = js.native
    
    /* protected */ var cloudInfo: CloudInfo = js.native
    
    def initClient(): Unit = js.native
    
    /* protected */ var initialized: Boolean = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "DeviceLoginTokenProvider")
  @js.native
  open class DeviceLoginTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit]) = this()
    def this(
      kustoUri: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit],
      authorityId: String
    ) = this()
    def this(kustoUri: String, deviceCodeCallback: Unit, authorityId: String) = this()
    def this(
      kustoUri: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit],
      authorityId: String,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeInfo, Unit],
      authorityId: Unit,
      timeoutMs: Double
    ) = this()
    def this(kustoUri: String, deviceCodeCallback: Unit, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, deviceCodeCallback: Unit, authorityId: Unit, timeoutMs: Double) = this()
    
    /* private */ var deviceCodeCallback: Any = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "MsiTokenProvider")
  @js.native
  open class MsiTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, clientId: String) = this()
    def this(kustoUri: String, clientId: String, authorityId: String) = this()
    def this(kustoUri: String, clientId: Unit, authorityId: String) = this()
    def this(kustoUri: String, clientId: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, clientId: String, authorityId: Unit, timeoutMs: Double) = this()
    def this(kustoUri: String, clientId: Unit, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, clientId: Unit, authorityId: Unit, timeoutMs: Double) = this()
    
    /* protected */ var clientId: js.UndefOr[String] = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "TokenCredentialProvider")
  @js.native
  open class TokenCredentialProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String, tokenCredential: TokenCredential) = this()
    def this(kustoUri: String, tokenCredential: TokenCredential, timeoutMs: Double) = this()
    
    /* private */ var tokenCredential: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("azure-kusto-data/types/src/tokenProvider", "TokenProviderBase")
  @js.native
  open class TokenProviderBase protected () extends StObject {
    /* protected */ def this(kustoUri: String) = this()
    
    def acquireToken(): js.Promise[TokenResponse] = js.native
    
    def context(): Record[String, Any] = js.native
    
    var kustoUri: String = js.native
    
    var scopes: js.Array[String] = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "UserPassTokenProvider")
  @js.native
  open class UserPassTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String, userName: String, password: String, authorityId: String) = this()
    def this(kustoUri: String, userName: String, password: String, authorityId: String, timeoutMs: Double) = this()
    
    var homeAccountId: js.UndefOr[String] = js.native
    
    var password: String = js.native
    
    var userName: String = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/tokenProvider", "UserPromptProvider")
  @js.native
  open class UserPromptProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, interactiveCredentialOptions: InteractiveBrowserCredentialInBrowserOptions) = this()
    def this(kustoUri: String, interactiveCredentialOptions: InteractiveBrowserCredentialNodeOptions) = this()
    def this(kustoUri: String, interactiveCredentialOptions: Unit, timeoutMs: Double) = this()
    def this(
      kustoUri: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialInBrowserOptions,
      timeoutMs: Double
    ) = this()
    def this(
      kustoUri: String,
      interactiveCredentialOptions: InteractiveBrowserCredentialNodeOptions,
      timeoutMs: Double
    ) = this()
    
    val MaxPort: /* 65536 */ Double = js.native
    
    val MinPort: /* 20000 */ Double = js.native
    
    /* private */ var getRandomPortInRange: Any = js.native
    
    /* private */ var interactiveCredentialOptions: Any = js.native
  }
  
  trait TokenResponse extends StObject {
    
    var accessToken: String
    
    var tokenType: String
  }
  object TokenResponse {
    
    inline def apply(accessToken: String, tokenType: String): TokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenType extends StObject {
    
    var accessToken: String
    
    var tokenType: String
  }
  object TokenType {
    
    inline def apply(accessToken: String, tokenType: String): TokenType = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenType] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
