package typings.blessed.blessedMod

import typings.blessed.blessedMod.Widgets.Log
import typings.blessed.blessedMod.Widgets.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "log")
@js.native
object log extends js.Object {
  def apply(): Log = js.native
  def apply(options: LogOptions): Log = js.native
}

