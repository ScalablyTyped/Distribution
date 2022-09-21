package typings.awsSdkUtilUserAgentBrowser

import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.UserAgent
import typings.awsSdkUtilUserAgentBrowser.configurationsMod.DefaultUserAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-user-agent-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultUserAgent(hasServiceIdClientVersion: DefaultUserAgentOptions): Provider[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUserAgent")(hasServiceIdClientVersion.asInstanceOf[js.Any]).asInstanceOf[Provider[UserAgent]]
}
