package typings
package binaryDashParserLib.binaryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParserNs {
  type Data = scala.Double | java.lang.String | (js.Array[scala.Double | Parsed]) | Parsed | nodeLib.Buffer
  type Endianness = binaryDashParserLib.binaryDashParserLibStrings.little | binaryDashParserLib.binaryDashParserLibStrings.big
}
