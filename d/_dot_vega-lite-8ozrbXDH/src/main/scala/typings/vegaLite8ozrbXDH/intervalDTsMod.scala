package typings.vegaLite8ozrbXDH

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite8ozrbXDH.indexDDotTsMod.SelectionCompiler
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalDTsMod extends Shortcut {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/interval.d.ts", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/interval.d.ts", "BRUSH")
  @js.native
  val BRUSH: /* "_brush" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/interval.d.ts", "SCALE_TRIGGER")
  @js.native
  val SCALE_TRIGGER: /* "_scale_trigger" */ String = js.native
  
  type _To = SelectionCompiler[interval]
  
  /* This means you don't have to write `default`, but can instead just say `intervalDTsMod.foo` */
  override def _to: SelectionCompiler[interval] = default
}
