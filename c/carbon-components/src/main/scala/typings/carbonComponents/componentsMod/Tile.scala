package typings.carbonComponents.componentsMod

import typings.carbonComponents.tileMod.TileOptions
import typings.carbonComponents.tileMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "Tile")
@js.native
open class Tile protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: TileOptions) = this()
}
object Tile {
  
  @JSImport("carbon-components/globals/js/components", "Tile")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "Tile.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
