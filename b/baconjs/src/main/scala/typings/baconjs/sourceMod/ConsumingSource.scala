package typings.baconjs.sourceMod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/source", "ConsumingSource")
@js.native
class ConsumingSource[V] protected () extends Source[V, V] {
  def this(obs: default[V], sync: Boolean) = this()
  
  var queue: js.Array[Event[V]] = js.native
}
