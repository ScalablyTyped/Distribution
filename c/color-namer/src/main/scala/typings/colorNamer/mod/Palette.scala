package typings.colorNamer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.colorNamer.colorNamerStrings.roygbiv
  - typings.colorNamer.colorNamerStrings.basic
  - typings.colorNamer.colorNamerStrings.html
  - typings.colorNamer.colorNamerStrings.x11
  - typings.colorNamer.colorNamerStrings.pantone
  - typings.colorNamer.colorNamerStrings.ntc
*/
trait Palette extends js.Object

object Palette {
  @scala.inline
  def basic: typings.colorNamer.colorNamerStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typings.colorNamer.colorNamerStrings.html = this.cast("html")
  @scala.inline
  def ntc: typings.colorNamer.colorNamerStrings.ntc = this.cast("ntc")
  @scala.inline
  def pantone: typings.colorNamer.colorNamerStrings.pantone = this.cast("pantone")
  @scala.inline
  def roygbiv: typings.colorNamer.colorNamerStrings.roygbiv = this.cast("roygbiv")
  @scala.inline
  def x11: typings.colorNamer.colorNamerStrings.x11 = this.cast("x11")
}

