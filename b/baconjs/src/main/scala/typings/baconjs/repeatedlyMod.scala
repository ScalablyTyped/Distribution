package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/repeatedly", JSImport.Namespace)
@js.native
object repeatedlyMod extends js.Object {
  
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = js.native
}
