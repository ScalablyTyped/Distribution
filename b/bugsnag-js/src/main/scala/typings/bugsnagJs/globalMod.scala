package typings.bugsnagJs

import typings.bugsnagJs.clientMod.Client
import typings.bugsnagJs.clientMod.IPlugin
import typings.bugsnagJs.commonMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  // two ways to call the exported function: apiKey or config object
  inline def apply(apiKeyOrOpts: String): Client = ^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = (^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def apply(apiKeyOrOpts: IConfig): Client = ^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = (^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @JSImport("bugsnag-js/types/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
