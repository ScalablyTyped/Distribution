package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "fromArray")
@js.native
object fromArray extends js.Object {
  
  def apply[T](values: js.Array[T | typings.baconjs.eventMod.Event[T]]): typings.baconjs.observableMod.EventStream[T] = js.native
}
