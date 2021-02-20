package typings.awsSdkMiddlewareUserAgent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/configurations", "resolveUserAgentConfig")
  @js.native
  def resolveUserAgentConfig[T](input: T with PreviouslyResolved with UserAgentInputConfig): T with UserAgentResolvedConfig = js.native
  
  @js.native
  trait PreviouslyResolved extends StObject {
    
    var defaultUserAgent: String = js.native
    
    var runtime: String = js.native
  }
  object PreviouslyResolved {
    
    @scala.inline
    def apply(defaultUserAgent: String, runtime: String): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(defaultUserAgent = defaultUserAgent.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit class PreviouslyResolvedMutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserAgentInputConfig extends StObject {
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String] = js.native
  }
  object UserAgentInputConfig {
    
    @scala.inline
    def apply(): UserAgentInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentInputConfig]
    }
    
    @scala.inline
    implicit class UserAgentInputConfigMutableBuilder[Self <: UserAgentInputConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    }
  }
  
  @js.native
  trait UserAgentResolvedConfig extends StObject {
    
    var customUserAgent: js.UndefOr[String] = js.native
    
    var defaultUserAgent: String = js.native
    
    var runtime: String = js.native
  }
  object UserAgentResolvedConfig {
    
    @scala.inline
    def apply(defaultUserAgent: String, runtime: String): UserAgentResolvedConfig = {
      val __obj = js.Dynamic.literal(defaultUserAgent = defaultUserAgent.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentResolvedConfig]
    }
    
    @scala.inline
    implicit class UserAgentResolvedConfigMutableBuilder[Self <: UserAgentResolvedConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      @scala.inline
      def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
