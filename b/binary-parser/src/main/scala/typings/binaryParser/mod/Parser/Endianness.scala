package typings.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.binaryParser.binaryParserStrings.little
  - typings.binaryParser.binaryParserStrings.big
*/
trait Endianness extends js.Object

object Endianness {
  @scala.inline
  def big: typings.binaryParser.binaryParserStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def little: typings.binaryParser.binaryParserStrings.little = this.cast("little")
}

