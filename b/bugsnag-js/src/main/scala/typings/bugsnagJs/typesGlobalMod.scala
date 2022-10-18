package typings.bugsnagJs

import typings.bugsnagJs.typesClientMod.Client
import typings.bugsnagJs.typesClientMod.IPlugin
import typings.bugsnagJs.typesCommonMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalMod {
  
  // two ways to call the exported function: apiKey or config object
  inline def apply(apiKeyOrOpts: String): Client = ^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = (^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def apply(apiKeyOrOpts: IConfig): Client = ^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = (^.asInstanceOf[js.Dynamic].apply(apiKeyOrOpts.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @JSImport("bugsnag-js/types/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
