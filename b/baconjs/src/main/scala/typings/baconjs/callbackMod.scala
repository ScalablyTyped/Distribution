package typings.baconjs

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/callback", JSImport.Namespace)
@js.native
object callbackMod extends js.Object {
  
  def fromCallback[V](f: js.Function, args: js.Any*): EventStream[V] = js.native
  
  def fromNodeCallback[V](f: js.Function, args: js.Any*): EventStream[V] = js.native
}
