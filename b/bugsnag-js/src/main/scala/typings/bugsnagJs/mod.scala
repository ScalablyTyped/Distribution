package typings.bugsnagJs

import typings.bugsnagJs.typesClientMod.Client
import typings.bugsnagJs.typesClientMod.IPlugin
import typings.bugsnagJs.typesCommonMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bugsnag-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // two ways to call the exported function: apiKey or config object
  inline def default(apiKeyOrOpts: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(apiKeyOrOpts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def default(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(apiKeyOrOpts.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def default(apiKeyOrOpts: IConfig): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(apiKeyOrOpts.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def default(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(apiKeyOrOpts.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  object Bugsnag {
    
    @JSImport("bugsnag-js", "Bugsnag.default")
    @js.native
    open class default ()
      extends typings.bugsnagJs.typesClientMod.default
    
    @JSImport("bugsnag-js", "Bugsnag.Client")
    @js.native
    open class Client ()
      extends typings.bugsnagJs.typesClientMod.Client
  }
}
