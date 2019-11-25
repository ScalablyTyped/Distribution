package typings.binaryDashParser.binaryDashParserMod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.binaryDashParser.binaryDashParserStrings.little
  - typings.binaryDashParser.binaryDashParserStrings.big
*/
trait Endianness extends js.Object

object Endianness {
  @scala.inline
  def big: typings.binaryDashParser.binaryDashParserStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def little: typings.binaryDashParser.binaryDashParserStrings.little = this.cast("little")
}

