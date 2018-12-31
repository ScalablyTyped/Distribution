package typings
package bugsnagDashJsLib.bugsnagDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js", JSImport.Namespace)
@js.native
object bugsnagDashJsModMembers extends js.Object {
  def default(apiKeyOrOpts: bugsnagDashJsLib.typesCommonMod.IConfig): bugsnagDashJsLib.typesClientMod.Client = js.native
  def default(
    apiKeyOrOpts: bugsnagDashJsLib.typesCommonMod.IConfig,
    plugins: js.Array[bugsnagDashJsLib.typesClientMod.IPlugin]
  ): bugsnagDashJsLib.typesClientMod.Client = js.native
  // two ways to call the exported function: apiKey or config object
  def default(apiKeyOrOpts: java.lang.String): bugsnagDashJsLib.typesClientMod.Client = js.native
  def default(apiKeyOrOpts: java.lang.String, plugins: js.Array[bugsnagDashJsLib.typesClientMod.IPlugin]): bugsnagDashJsLib.typesClientMod.Client = js.native
}

