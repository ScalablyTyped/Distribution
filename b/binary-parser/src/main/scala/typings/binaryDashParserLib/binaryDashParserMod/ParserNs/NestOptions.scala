package typings
package binaryDashParserLib.binaryDashParserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestOptions extends Options {
  var `type`: binaryDashParserLib.binaryDashParserMod.Parser[_]
}

object NestOptions {
  @scala.inline
  def apply(
    `type`: binaryDashParserLib.binaryDashParserMod.Parser[_],
    assert: java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean]) = null,
    formatter: js.Function1[/* value */ Data, _] = null
  ): NestOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    __obj.asInstanceOf[NestOptions]
  }
}

