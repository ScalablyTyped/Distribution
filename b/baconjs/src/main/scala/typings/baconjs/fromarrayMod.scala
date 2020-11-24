package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/fromarray", JSImport.Namespace)
@js.native
object fromarrayMod extends js.Object {
  
  def default[T](values: js.Array[T | Event[T]]): EventStream[T] = js.native
}
