package typings
package binaryDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object binaryDashParserLibStrings {
  @js.native
  sealed trait Next extends js.Object
  
  @js.native
  sealed trait big
    extends binaryDashParserLib.binaryDashParserMod.ParserNs.Endianness
  
  @js.native
  sealed trait little
    extends binaryDashParserLib.binaryDashParserMod.ParserNs.Endianness
  
  @scala.inline
  def Next: Next = "Next".asInstanceOf[Next]
  @scala.inline
  def big: big = "big".asInstanceOf[big]
  @scala.inline
  def little: little = "little".asInstanceOf[little]
}

