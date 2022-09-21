package typings.vegaLite8ozrbXDH

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite8ozrbXDH.indexDDotTsMod.SelectionCompiler
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleDTsMod extends Shortcut {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/toggle.d.ts", JSImport.Default)
  @js.native
  val default: SelectionCompiler[point] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/toggle.d.ts", "TOGGLE")
  @js.native
  val TOGGLE: /* "_toggle" */ String = js.native
  
  type _To = SelectionCompiler[point]
  
  /* This means you don't have to write `default`, but can instead just say `toggleDTsMod.foo` */
  override def _to: SelectionCompiler[point] = default
}
