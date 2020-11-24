package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsListen[BaseT] extends js.Object {
  
  def apply[T /* <: BaseT */](`object`: js.Any, eventMap: EventMap): T = js.native
  def apply[T /* <: BaseT */](`object`: js.Any, events: String, callback: EventHandler): T = js.native
}
