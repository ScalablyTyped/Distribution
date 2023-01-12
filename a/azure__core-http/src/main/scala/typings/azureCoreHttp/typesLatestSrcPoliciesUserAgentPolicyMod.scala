package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesUserAgentPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/userAgentPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/userAgentPolicy", "UserAgentPolicy")
  @js.native
  open class UserAgentPolicy_ protected () extends BaseRequestPolicy {
    def this(_nextPolicy: RequestPolicy, _options: RequestPolicyOptions, headerKey: String, headerValue: String) = this()
    
    @JSName("_options")
    val _options_UserAgentPolicy_ : RequestPolicyOptions = js.native
    
    /**
      * Adds the user agent header to the outgoing request.
      */
    def addUserAgentHeader(request: WebResourceLike): Unit = js.native
    
    /* protected */ var headerKey: String = js.native
    
    /* protected */ var headerValue: String = js.native
  }
  
  @JSImport("@azure/core-http/types/latest/src/policies/userAgentPolicy", "getDefaultUserAgentHeaderName")
  @js.native
  val getDefaultUserAgentHeaderName: js.Function0[String] = js.native
  
  inline def getDefaultUserAgentValue(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultUserAgentValue")().asInstanceOf[String]
  
  inline def userAgentPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def userAgentPolicy(userAgentData: TelemetryInfo): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")(userAgentData.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  trait TelemetryInfo extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TelemetryInfo {
    
    inline def apply(): TelemetryInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TelemetryInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TelemetryInfo] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait UserAgentOptions extends StObject {
    
    /**
      * String prefix to add to the user agent for outgoing requests.
      * Defaults to an empty string.
      */
    var userAgentPrefix: js.UndefOr[String] = js.undefined
  }
  object UserAgentOptions {
    
    inline def apply(): UserAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAgentOptions] (val x: Self) extends AnyVal {
      
      inline def setUserAgentPrefix(value: String): Self = StObject.set(x, "userAgentPrefix", value.asInstanceOf[js.Any])
      
      inline def setUserAgentPrefixUndefined: Self = StObject.set(x, "userAgentPrefix", js.undefined)
    }
  }
}
