package typings.catalog.catalogMod

import typings.catalog.Anon_Default
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Global.JSXNs.Element
import typings.std.HTMLElement
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("catalog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DefaultResponsiveSizes: js.Array[ConfigResponsiveSize] = js.native
  val DefaultTheme: Theme = js.native
  def configure(config: Config): js.Any = js.native
  def configureJSXRoutes(config: Config): js.Any = js.native
  def configureRoutes(config: Config): js.Any = js.native
  def markdown(strings: TemplateStringsArray, interpolations: js.Any*): Element = js.native
  def pageLoader(f: String): ComponentType[js.Object] = js.native
  def pageLoader(f: js.Function0[js.Promise[Anon_Default | ComponentType[js.Object]]]): ComponentType[js.Object] = js.native
  def render(config: Config, element: HTMLElement): Unit = js.native
}

