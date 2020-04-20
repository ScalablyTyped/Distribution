package typings.corejsUpgradeWebpackPlugin.mod

import typings.corejsUpgradeWebpackPlugin.corejsUpgradeWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var resolveFrom: String | `false`
}

object Options {
  @scala.inline
  def apply(resolveFrom: String | `false`): Options = {
    val __obj = js.Dynamic.literal(resolveFrom = resolveFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

