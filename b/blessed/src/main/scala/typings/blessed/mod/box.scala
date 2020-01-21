package typings.blessed.mod

import typings.blessed.mod.Widgets.BoxElement
import typings.blessed.mod.Widgets.BoxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "box")
@js.native
object box extends js.Object {
  def apply(): BoxElement = js.native
  def apply(options: BoxOptions): BoxElement = js.native
}

