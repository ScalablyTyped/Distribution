package typings.baconjs

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/silence", JSImport.Namespace)
@js.native
object silenceMod extends js.Object {
  def default[V](duration: Double): EventStream[V] = js.native
}

