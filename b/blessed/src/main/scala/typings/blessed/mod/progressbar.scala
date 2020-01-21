package typings.blessed.mod

import typings.blessed.mod.Widgets.ProgressBarElement
import typings.blessed.mod.Widgets.ProgressBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "progressbar")
@js.native
object progressbar extends js.Object {
  def apply(): ProgressBarElement = js.native
  def apply(options: ProgressBarOptions): ProgressBarElement = js.native
}

