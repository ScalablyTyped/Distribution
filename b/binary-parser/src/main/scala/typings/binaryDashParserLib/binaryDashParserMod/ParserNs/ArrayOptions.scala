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

object ArrayOptions {
  @scala.inline
  def apply(
    `type`: java.lang.String | binaryDashParserLib.binaryDashParserMod.Parser[_],
    assert: java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean]) = null,
    formatter: js.Function1[/* value */ Data, _] = null,
    length: scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double]) = null,
    lengthInBytes: scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double]) = null,
    readUntil: java.lang.String | (js.Function2[/* item */ scala.Double, /* buffer */ nodeLib.Buffer, scala.Boolean]) = null
  ): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lengthInBytes != null) __obj.updateDynamic("lengthInBytes")(lengthInBytes.asInstanceOf[js.Any])
    if (readUntil != null) __obj.updateDynamic("readUntil")(readUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions]
  }
}

