package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/holdwhen", JSImport.Namespace)
@js.native
object typesHoldwhenMod extends js.Object {
  def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = js.native
}

