package typings.baconjs

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/try", JSImport.Namespace)
@js.native
object tryMod extends js.Object {
  def default[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, EventStream[Out]] = js.native
}

