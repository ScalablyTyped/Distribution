package typings
package bUnderscoreLib.bUnderscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends js.Object {
  def apply(block: java.lang.String): java.lang.String = js.native
  def apply(block: java.lang.String, elem: java.lang.String): java.lang.String = js.native
  def apply(block: java.lang.String, elem: java.lang.String, mods: Mods): java.lang.String = js.native
  def apply(block: java.lang.String, mods: Mods): java.lang.String = js.native
  def B(options: Options): Formatter = js.native
  def lock(block: java.lang.String): BlockFormatter = js.native
  def lock(block: java.lang.String, elem: java.lang.String): bUnderscoreLib.ElemFormatter = js.native
  def `with`(block: java.lang.String): BlockFormatter = js.native
  def `with`(block: java.lang.String, elem: java.lang.String): bUnderscoreLib.ElemFormatter = js.native
}

