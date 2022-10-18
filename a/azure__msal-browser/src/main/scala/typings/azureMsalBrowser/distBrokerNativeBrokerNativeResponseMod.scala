package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrokerNativeBrokerNativeResponseMod {
  
  trait MATS extends StObject {
    
    var account_join_on_end: js.UndefOr[String] = js.undefined
    
    var account_join_on_start: js.UndefOr[String] = js.undefined
    
    var api_error_code: js.UndefOr[Double] = js.undefined
    
    var broker_version: js.UndefOr[String] = js.undefined
    
    var device_join: js.UndefOr[String] = js.undefined
    
    var http_event_count: js.UndefOr[Double] = js.undefined
    
    var http_status: js.UndefOr[Double] = js.undefined
    
    var is_cached: js.UndefOr[Double] = js.undefined
    
    var prompt_behavior: js.UndefOr[String] = js.undefined
    
    var silent_bi_sub_code: js.UndefOr[Double] = js.undefined
    
    var silent_code: js.UndefOr[Double] = js.undefined
    
    var silent_message: js.UndefOr[String] = js.undefined
    
    var silent_status: js.UndefOr[Double] = js.undefined
    
    var ui_visible: js.UndefOr[Boolean] = js.undefined
  }
  object MATS {
    
    inline def apply(): MATS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MATS]
    }
    
    extension [Self <: MATS](x: Self) {
      
      inline def setAccount_join_on_end(value: String): Self = StObject.set(x, "account_join_on_end", value.asInstanceOf[js.Any])
      
      inline def setAccount_join_on_endUndefined: Self = StObject.set(x, "account_join_on_end", js.undefined)
      
      inline def setAccount_join_on_start(value: String): Self = StObject.set(x, "account_join_on_start", value.asInstanceOf[js.Any])
      
      inline def setAccount_join_on_startUndefined: Self = StObject.set(x, "account_join_on_start", js.undefined)
      
      inline def setApi_error_code(value: Double): Self = StObject.set(x, "api_error_code", value.asInstanceOf[js.Any])
      
      inline def setApi_error_codeUndefined: Self = StObject.set(x, "api_error_code", js.undefined)
      
      inline def setBroker_version(value: String): Self = StObject.set(x, "broker_version", value.asInstanceOf[js.Any])
      
      inline def setBroker_versionUndefined: Self = StObject.set(x, "broker_version", js.undefined)
      
      inline def setDevice_join(value: String): Self = StObject.set(x, "device_join", value.asInstanceOf[js.Any])
      
      inline def setDevice_joinUndefined: Self = StObject.set(x, "device_join", js.undefined)
      
      inline def setHttp_event_count(value: Double): Self = StObject.set(x, "http_event_count", value.asInstanceOf[js.Any])
      
      inline def setHttp_event_countUndefined: Self = StObject.set(x, "http_event_count", js.undefined)
      
      inline def setHttp_status(value: Double): Self = StObject.set(x, "http_status", value.asInstanceOf[js.Any])
      
      inline def setHttp_statusUndefined: Self = StObject.set(x, "http_status", js.undefined)
      
      inline def setIs_cached(value: Double): Self = StObject.set(x, "is_cached", value.asInstanceOf[js.Any])
      
      inline def setIs_cachedUndefined: Self = StObject.set(x, "is_cached", js.undefined)
      
      inline def setPrompt_behavior(value: String): Self = StObject.set(x, "prompt_behavior", value.asInstanceOf[js.Any])
      
      inline def setPrompt_behaviorUndefined: Self = StObject.set(x, "prompt_behavior", js.undefined)
      
      inline def setSilent_bi_sub_code(value: Double): Self = StObject.set(x, "silent_bi_sub_code", value.asInstanceOf[js.Any])
      
      inline def setSilent_bi_sub_codeUndefined: Self = StObject.set(x, "silent_bi_sub_code", js.undefined)
      
      inline def setSilent_code(value: Double): Self = StObject.set(x, "silent_code", value.asInstanceOf[js.Any])
      
      inline def setSilent_codeUndefined: Self = StObject.set(x, "silent_code", js.undefined)
      
      inline def setSilent_message(value: String): Self = StObject.set(x, "silent_message", value.asInstanceOf[js.Any])
      
      inline def setSilent_messageUndefined: Self = StObject.set(x, "silent_message", js.undefined)
      
      inline def setSilent_status(value: Double): Self = StObject.set(x, "silent_status", value.asInstanceOf[js.Any])
      
      inline def setSilent_statusUndefined: Self = StObject.set(x, "silent_status", js.undefined)
      
      inline def setUi_visible(value: Boolean): Self = StObject.set(x, "ui_visible", value.asInstanceOf[js.Any])
      
      inline def setUi_visibleUndefined: Self = StObject.set(x, "ui_visible", js.undefined)
    }
  }
  
  trait NativeAccountInfo extends StObject {
    
    var id: String
    
    var properties: js.Object
    
    var userName: String
  }
  object NativeAccountInfo {
    
    inline def apply(id: String, properties: js.Object, userName: String): NativeAccountInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeAccountInfo]
    }
    
    extension [Self <: NativeAccountInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeResponse extends StObject {
    
    var access_token: String
    
    var account: NativeAccountInfo
    
    var client_info: String
    
    var expires_in: Double
    
    var extendedLifetimeToken: js.UndefOr[Boolean] = js.undefined
    
    var id_token: String
    
    var properties: NativeResponseProperties
    
    var scope: String
    
    var shr: js.UndefOr[String] = js.undefined
    
    var state: String
  }
  object NativeResponse {
    
    inline def apply(
      access_token: String,
      account: NativeAccountInfo,
      client_info: String,
      expires_in: Double,
      id_token: String,
      properties: NativeResponseProperties,
      scope: String,
      state: String
    ): NativeResponse = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], client_info = client_info.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeResponse]
    }
    
    extension [Self <: NativeResponse](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccount(value: NativeAccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setClient_info(value: String): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExtendedLifetimeToken(value: Boolean): Self = StObject.set(x, "extendedLifetimeToken", value.asInstanceOf[js.Any])
      
      inline def setExtendedLifetimeTokenUndefined: Self = StObject.set(x, "extendedLifetimeToken", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: NativeResponseProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setShr(value: String): Self = StObject.set(x, "shr", value.asInstanceOf[js.Any])
      
      inline def setShrUndefined: Self = StObject.set(x, "shr", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeResponseProperties extends StObject {
    
    var MATS: js.UndefOr[String] = js.undefined
  }
  object NativeResponseProperties {
    
    inline def apply(): NativeResponseProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeResponseProperties]
    }
    
    extension [Self <: NativeResponseProperties](x: Self) {
      
      inline def setMATS(value: String): Self = StObject.set(x, "MATS", value.asInstanceOf[js.Any])
      
      inline def setMATSUndefined: Self = StObject.set(x, "MATS", js.undefined)
    }
  }
}
