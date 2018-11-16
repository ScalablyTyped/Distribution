package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("catalog", JSImport.Namespace)
@js.native
object catalogModMembers extends js.Object {
  val DefaultResponsiveSizes: js.Array[ConfigResponsiveSize] = js.native
  val DefaultTheme: Theme = js.native
  def configure(config: Config): js.Any = js.native
  def configureJSXRoutes(config: Config): js.Any = js.native
  def configureRoutes(config: Config): js.Any = js.native
  def markdown(strings: stdLib.TemplateStringsArray, interpolations: js.Any*): reactLib.reactMod.Global.JSXNs.Element = js.native
  def pageLoader(f: java.lang.String): reactLib.reactMod.ReactNs.ComponentType[js.Object] = js.native
  def pageLoader(
    f: js.Function0[
      stdLib.Promise[catalogLib.Anon_Default | reactLib.reactMod.ReactNs.ComponentType[js.Object]]
    ]
  ): reactLib.reactMod.ReactNs.ComponentType[js.Object] = js.native
  def render(config: Config, element: reactLib.HTMLElement): scala.Unit = js.native
}

