package typings.bugsnagDashJs

import typings.bugsnagDashJs.typesClientMod.Client
import typings.bugsnagDashJs.typesClientMod.IPlugin
import typings.bugsnagDashJs.typesCommonMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/global", JSImport.Namespace)
@js.native
object typesGlobalMod extends js.Object {
  // two ways to call the exported function: apiKey or config object
  def apply(apiKeyOrOpts: String): Client = js.native
  def apply(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = js.native
  def apply(apiKeyOrOpts: IConfig): Client = js.native
  def apply(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = js.native
}

