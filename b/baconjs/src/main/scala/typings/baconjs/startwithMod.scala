package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/startwith", JSImport.Namespace)
@js.native
object startwithMod extends js.Object {
  def startWithE[V](src: EventStream[V], seed: V): EventStream[V] = js.native
  def startWithP[V](src: Property[V], seed: V): Property[V] = js.native
}

