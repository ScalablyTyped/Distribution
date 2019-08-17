package typings.commonDashTags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonDashTagsMod {
  import typings.std.TemplateStringsArray

  type JSTag = js.Function2[/* literals */ TemplateStringsArray, /* repeated */ js.Any, String]
  type PluginFunction = js.Function2[/* oldValue */ String, /* newValue */ String, TemplateTransformer[js.Any]]
}
