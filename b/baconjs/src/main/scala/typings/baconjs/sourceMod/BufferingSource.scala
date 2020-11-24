package typings.baconjs.sourceMod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/source", "BufferingSource")
@js.native
class BufferingSource[V] protected ()
  extends Source[V, js.Array[V]] {
  def this(obs: default[V]) = this()
  
  var queue: js.Array[V] = js.native
}
