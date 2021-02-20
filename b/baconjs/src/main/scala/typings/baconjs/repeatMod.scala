package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  @JSImport("baconjs/types/repeat", JSImport.Default)
  @js.native
  def default[V](
    generator: js.Function1[/* iteration */ Double, js.UndefOr[typings.baconjs.observableMod.default[V]]]
  ): EventStream[V] = js.native
}
