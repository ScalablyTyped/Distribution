package typings.bufferhelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bufferhelper.bufferhelperStrings.ascii
  - typings.bufferhelper.bufferhelperStrings.utf8
  - typings.bufferhelper.bufferhelperStrings.utf16le
  - typings.bufferhelper.bufferhelperStrings.ucs2
  - typings.bufferhelper.bufferhelperStrings.base64
  - typings.bufferhelper.bufferhelperStrings.binary
  - typings.bufferhelper.bufferhelperStrings.hex
*/
trait encoding extends js.Object

object encoding {
  @scala.inline
  def ascii: typings.bufferhelper.bufferhelperStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typings.bufferhelper.bufferhelperStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typings.bufferhelper.bufferhelperStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.bufferhelper.bufferhelperStrings.hex = this.cast("hex")
  @scala.inline
  def ucs2: typings.bufferhelper.bufferhelperStrings.ucs2 = this.cast("ucs2")
  @scala.inline
  def utf16le: typings.bufferhelper.bufferhelperStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typings.bufferhelper.bufferhelperStrings.utf8 = this.cast("utf8")
}

