package typings.baconjs

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fromesobservable", JSImport.Namespace)
@js.native
object fromesobservableMod extends js.Object {
  def default[V](_observable: js.Any): EventStream[V] = js.native
}

