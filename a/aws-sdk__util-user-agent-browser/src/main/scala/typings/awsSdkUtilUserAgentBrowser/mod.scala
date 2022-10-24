package typings.awsSdkUtilUserAgentBrowser

import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.UserAgent
import typings.awsSdkUtilUserAgentBrowser.distTypesConfigurationsMod.DefaultUserAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-user-agent-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultUserAgent(param0: DefaultUserAgentOptions): Provider[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUserAgent")(param0.asInstanceOf[js.Any]).asInstanceOf[Provider[UserAgent]]
}
