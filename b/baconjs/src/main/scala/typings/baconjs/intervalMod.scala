package typings.baconjs

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/interval", JSImport.Namespace)
@js.native
object intervalMod extends js.Object {
  
  def default[V](delay: Double, value: V): EventStream[V] = js.native
}
