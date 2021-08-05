package typings.awsSdkMiddlewareUserAgent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveUserAgentConfig[T](input: T & PreviouslyResolved & UserAgentInputConfig): T & UserAgentResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgentConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & UserAgentResolvedConfig]
  
  trait PreviouslyResolved extends StObject {
    
    var defaultUserAgent: String
    
    var runtime: String
  }
  object PreviouslyResolved {
    
    inline def apply(defaultUserAgent: String, runtime: String): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(defaultUserAgent = defaultUserAgent.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserAgentInputConfig extends StObject {
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String] = js.undefined
  }
  object UserAgentInputConfig {
    
    inline def apply(): UserAgentInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentInputConfig]
    }
    
    extension [Self <: UserAgentInputConfig](x: Self) {
      
      inline def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    }
  }
  
  trait UserAgentResolvedConfig extends StObject {
    
    var customUserAgent: js.UndefOr[String] = js.undefined
    
    var defaultUserAgent: String
    
    var runtime: String
  }
  object UserAgentResolvedConfig {
    
    inline def apply(defaultUserAgent: String, runtime: String): UserAgentResolvedConfig = {
      val __obj = js.Dynamic.literal(defaultUserAgent = defaultUserAgent.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentResolvedConfig]
    }
    
    extension [Self <: UserAgentResolvedConfig](x: Self) {
      
      inline def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
