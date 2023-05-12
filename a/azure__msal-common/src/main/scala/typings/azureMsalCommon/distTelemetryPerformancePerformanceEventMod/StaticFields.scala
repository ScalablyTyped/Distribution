package typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticFields extends StObject {
  
  /**
    *
    * Size of the access token
    *
    * @type {number}
    */
  var accessTokenSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Native broker fields
    */
  var allowNativeBroker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Application name as specified by the app.
    *
    * @type {?string}
    */
  var appName: js.UndefOr[String] = js.undefined
  
  /**
    * Application version as specified by the app.
    *
    * @type {?string}
    */
  var appVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Silent Token Cache Lookup Policy
    *
    * @type {?(number | undefined)}
    */
  var cacheLookupPolicy: js.UndefOr[Double] = js.undefined
  
  var extensionHandshakeTimedOut: js.UndefOr[Boolean] = js.undefined
  
  var extensionHandshakeTimeoutMs: js.UndefOr[Double] = js.undefined
  
  /**
    * The following are fields that may be emitted in native broker scenarios
    */
  var extensionId: js.UndefOr[String] = js.undefined
  
  var extensionInstalled: js.UndefOr[Boolean] = js.undefined
  
  var extensionVersion: js.UndefOr[String] = js.undefined
  
  var httpVerAuthority: js.UndefOr[String] = js.undefined
  
  var httpVerToken: js.UndefOr[String] = js.undefined
  
  /**
    * Size of the id token
    *
    * @type {number}
    */
  var idTokenSize: js.UndefOr[Double] = js.undefined
  
  var matsAccountJoinOnEnd: js.UndefOr[String] = js.undefined
  
  var matsAccountJoinOnStart: js.UndefOr[String] = js.undefined
  
  var matsApiErrorCode: js.UndefOr[Double] = js.undefined
  
  var matsBrokerVersion: js.UndefOr[String] = js.undefined
  
  var matsDeviceJoin: js.UndefOr[String] = js.undefined
  
  var matsHttpEventCount: js.UndefOr[Double] = js.undefined
  
  var matsHttpStatus: js.UndefOr[Double] = js.undefined
  
  var matsPromptBehavior: js.UndefOr[String] = js.undefined
  
  var matsSilentBiSubCode: js.UndefOr[Double] = js.undefined
  
  var matsSilentCode: js.UndefOr[Double] = js.undefined
  
  var matsSilentMessage: js.UndefOr[String] = js.undefined
  
  var matsSilentStatus: js.UndefOr[Double] = js.undefined
  
  var matsUiVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Size of the refresh token
    *
    * @type {number}
    */
  var refreshTokenSize: js.UndefOr[Double] = js.undefined
}
object StaticFields {
  
  inline def apply(): StaticFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticFields] (val x: Self) extends AnyVal {
    
    inline def setAccessTokenSize(value: Double): Self = StObject.set(x, "accessTokenSize", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenSizeUndefined: Self = StObject.set(x, "accessTokenSize", js.undefined)
    
    inline def setAllowNativeBroker(value: Boolean): Self = StObject.set(x, "allowNativeBroker", value.asInstanceOf[js.Any])
    
    inline def setAllowNativeBrokerUndefined: Self = StObject.set(x, "allowNativeBroker", js.undefined)
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setCacheLookupPolicy(value: Double): Self = StObject.set(x, "cacheLookupPolicy", value.asInstanceOf[js.Any])
    
    inline def setCacheLookupPolicyUndefined: Self = StObject.set(x, "cacheLookupPolicy", js.undefined)
    
    inline def setExtensionHandshakeTimedOut(value: Boolean): Self = StObject.set(x, "extensionHandshakeTimedOut", value.asInstanceOf[js.Any])
    
    inline def setExtensionHandshakeTimedOutUndefined: Self = StObject.set(x, "extensionHandshakeTimedOut", js.undefined)
    
    inline def setExtensionHandshakeTimeoutMs(value: Double): Self = StObject.set(x, "extensionHandshakeTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setExtensionHandshakeTimeoutMsUndefined: Self = StObject.set(x, "extensionHandshakeTimeoutMs", js.undefined)
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
    
    inline def setExtensionInstalled(value: Boolean): Self = StObject.set(x, "extensionInstalled", value.asInstanceOf[js.Any])
    
    inline def setExtensionInstalledUndefined: Self = StObject.set(x, "extensionInstalled", js.undefined)
    
    inline def setExtensionVersion(value: String): Self = StObject.set(x, "extensionVersion", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionUndefined: Self = StObject.set(x, "extensionVersion", js.undefined)
    
    inline def setHttpVerAuthority(value: String): Self = StObject.set(x, "httpVerAuthority", value.asInstanceOf[js.Any])
    
    inline def setHttpVerAuthorityUndefined: Self = StObject.set(x, "httpVerAuthority", js.undefined)
    
    inline def setHttpVerToken(value: String): Self = StObject.set(x, "httpVerToken", value.asInstanceOf[js.Any])
    
    inline def setHttpVerTokenUndefined: Self = StObject.set(x, "httpVerToken", js.undefined)
    
    inline def setIdTokenSize(value: Double): Self = StObject.set(x, "idTokenSize", value.asInstanceOf[js.Any])
    
    inline def setIdTokenSizeUndefined: Self = StObject.set(x, "idTokenSize", js.undefined)
    
    inline def setMatsAccountJoinOnEnd(value: String): Self = StObject.set(x, "matsAccountJoinOnEnd", value.asInstanceOf[js.Any])
    
    inline def setMatsAccountJoinOnEndUndefined: Self = StObject.set(x, "matsAccountJoinOnEnd", js.undefined)
    
    inline def setMatsAccountJoinOnStart(value: String): Self = StObject.set(x, "matsAccountJoinOnStart", value.asInstanceOf[js.Any])
    
    inline def setMatsAccountJoinOnStartUndefined: Self = StObject.set(x, "matsAccountJoinOnStart", js.undefined)
    
    inline def setMatsApiErrorCode(value: Double): Self = StObject.set(x, "matsApiErrorCode", value.asInstanceOf[js.Any])
    
    inline def setMatsApiErrorCodeUndefined: Self = StObject.set(x, "matsApiErrorCode", js.undefined)
    
    inline def setMatsBrokerVersion(value: String): Self = StObject.set(x, "matsBrokerVersion", value.asInstanceOf[js.Any])
    
    inline def setMatsBrokerVersionUndefined: Self = StObject.set(x, "matsBrokerVersion", js.undefined)
    
    inline def setMatsDeviceJoin(value: String): Self = StObject.set(x, "matsDeviceJoin", value.asInstanceOf[js.Any])
    
    inline def setMatsDeviceJoinUndefined: Self = StObject.set(x, "matsDeviceJoin", js.undefined)
    
    inline def setMatsHttpEventCount(value: Double): Self = StObject.set(x, "matsHttpEventCount", value.asInstanceOf[js.Any])
    
    inline def setMatsHttpEventCountUndefined: Self = StObject.set(x, "matsHttpEventCount", js.undefined)
    
    inline def setMatsHttpStatus(value: Double): Self = StObject.set(x, "matsHttpStatus", value.asInstanceOf[js.Any])
    
    inline def setMatsHttpStatusUndefined: Self = StObject.set(x, "matsHttpStatus", js.undefined)
    
    inline def setMatsPromptBehavior(value: String): Self = StObject.set(x, "matsPromptBehavior", value.asInstanceOf[js.Any])
    
    inline def setMatsPromptBehaviorUndefined: Self = StObject.set(x, "matsPromptBehavior", js.undefined)
    
    inline def setMatsSilentBiSubCode(value: Double): Self = StObject.set(x, "matsSilentBiSubCode", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentBiSubCodeUndefined: Self = StObject.set(x, "matsSilentBiSubCode", js.undefined)
    
    inline def setMatsSilentCode(value: Double): Self = StObject.set(x, "matsSilentCode", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentCodeUndefined: Self = StObject.set(x, "matsSilentCode", js.undefined)
    
    inline def setMatsSilentMessage(value: String): Self = StObject.set(x, "matsSilentMessage", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentMessageUndefined: Self = StObject.set(x, "matsSilentMessage", js.undefined)
    
    inline def setMatsSilentStatus(value: Double): Self = StObject.set(x, "matsSilentStatus", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentStatusUndefined: Self = StObject.set(x, "matsSilentStatus", js.undefined)
    
    inline def setMatsUiVisible(value: Boolean): Self = StObject.set(x, "matsUiVisible", value.asInstanceOf[js.Any])
    
    inline def setMatsUiVisibleUndefined: Self = StObject.set(x, "matsUiVisible", js.undefined)
    
    inline def setRefreshTokenSize(value: Double): Self = StObject.set(x, "refreshTokenSize", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenSizeUndefined: Self = StObject.set(x, "refreshTokenSize", js.undefined)
  }
}
