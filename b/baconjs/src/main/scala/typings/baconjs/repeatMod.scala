package typings.baconjs

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/repeat", JSImport.Namespace)
@js.native
object repeatMod extends js.Object {
  
  def default[V](
    generator: js.Function1[/* iteration */ Double, js.UndefOr[typings.baconjs.observableMod.default[V]]]
  ): EventStream[V] = js.native
}
