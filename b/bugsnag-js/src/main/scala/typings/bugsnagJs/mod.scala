package typings.bugsnagJs

import typings.bugsnagJs.clientMod.Client
import typings.bugsnagJs.clientMod.IPlugin
import typings.bugsnagJs.commonMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // two ways to call the exported function: apiKey or config object
  def default(apiKeyOrOpts: String): Client = js.native
  def default(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = js.native
  def default(apiKeyOrOpts: IConfig): Client = js.native
  def default(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = js.native
  @js.native
  object Bugsnag extends js.Object {
    @js.native
    class Client ()
      extends typings.bugsnagJs.clientMod.Client
    
    @js.native
    class default ()
      extends typings.bugsnagJs.clientMod.Client
    
  }
  
}

