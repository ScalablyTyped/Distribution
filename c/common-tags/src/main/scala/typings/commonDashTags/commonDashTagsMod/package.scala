package typings.commonDashTags

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonDashTagsMod {
  type JSTag = js.Function2[/* literals */ TemplateStringsArray, /* repeated */ js.Any, String]
  type PluginFunction = js.Function2[/* oldValue */ String, /* newValue */ String, TemplateTransformer[js.Any]]
}
