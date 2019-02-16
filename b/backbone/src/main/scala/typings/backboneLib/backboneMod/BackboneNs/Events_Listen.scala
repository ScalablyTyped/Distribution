package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events_Listen[BaseT] extends js.Object {
  def apply[T /* <: BaseT */](`this`: T, `object`: js.Any, eventMap: EventMap): T = js.native
  def apply[T /* <: BaseT */](`this`: T, `object`: js.Any, events: java.lang.String, callback: EventHandler): T = js.native
}

