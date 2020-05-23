package typings.deku.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "createApp")
@js.native
object createApp extends js.Object {
  /**
    * Create a DOM renderer using a container element.
    * Everything will be rendered inside of that container.
    * Returns a function that accepts new state that can replace what is currently rendered.
    */
  def apply(el: HTMLElement): Render = js.native
  def apply(el: HTMLElement, dispatch: Dispatch): Render = js.native
}

