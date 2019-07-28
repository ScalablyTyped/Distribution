package typings.bUnderscore.bUnderscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends js.Object {
  def apply(block: String): String = js.native
  def apply(block: String, elem: String): String = js.native
  def apply(block: String, elem: String, mods: Mods): String = js.native
  def apply(block: String, mods: Mods): String = js.native
  def B(options: Options): Formatter = js.native
  def lock(block: String): BlockFormatter = js.native
  def lock(block: String, elem: String): ElemFormatter = js.native
  def `with`(block: String): BlockFormatter = js.native
  def `with`(block: String, elem: String): ElemFormatter = js.native
}

