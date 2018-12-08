package typings
package binaryDashParserLib.binaryDashParserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArrayOptions extends Options {
  var length: js.UndefOr[
    scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double])
  ] = js.undefined
  var lengthInBytes: js.UndefOr[
    scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double])
  ] = js.undefined
  var readUntil: js.UndefOr[
    java.lang.String | (js.Function2[/* item */ scala.Double, /* buffer */ nodeLib.Buffer, scala.Boolean])
  ] = js.undefined
  var `type`: java.lang.String | binaryDashParserLib.binaryDashParserMod.Parser[_]
}

