package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.InfoWindowOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.InfoWindow")
@js.native
class InfoWindow protected ()
  extends typings.baidumapWebSdk.BMap.InfoWindow {
  def this(content: String) = this()
  def this(content: HTMLElement) = this()
  def this(content: String, opts: InfoWindowOptions) = this()
  def this(content: HTMLElement, opts: InfoWindowOptions) = this()
}

