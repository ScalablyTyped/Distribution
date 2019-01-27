package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("catalog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DefaultResponsiveSizes: js.Array[catalogLib.catalogMod.ConfigResponsiveSize] = js.native
  val DefaultTheme: catalogLib.catalogMod.Theme = js.native
  def configure(config: catalogLib.catalogMod.Config): js.Any = js.native
  def configureJSXRoutes(config: catalogLib.catalogMod.Config): js.Any = js.native
  def configureRoutes(config: catalogLib.catalogMod.Config): js.Any = js.native
  def markdown(strings: stdLib.TemplateStringsArray, interpolations: js.Any*): reactLib.reactMod.Global.JSXNs.Element = js.native
  def pageLoader(f: java.lang.String): reactLib.reactMod.ReactNs.ComponentType[js.Object] = js.native
  def pageLoader(
    f: js.Function0[
      js.Promise[catalogLib.Anon_Default | reactLib.reactMod.ReactNs.ComponentType[js.Object]]
    ]
  ): reactLib.reactMod.ReactNs.ComponentType[js.Object] = js.native
  def render(config: catalogLib.catalogMod.Config, element: reactLib.HTMLElement): scala.Unit = js.native
}

