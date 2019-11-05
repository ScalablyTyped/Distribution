package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/later", JSImport.Namespace)
@js.native
object typesLaterMod extends js.Object {
  def default[V](delay: Double, value: V): EventStream[V] = js.native
}

