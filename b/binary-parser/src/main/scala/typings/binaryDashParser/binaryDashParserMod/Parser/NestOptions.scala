package typings.binaryDashParser.binaryDashParserMod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestOptions extends Options {
  var `type`: typings.binaryDashParser.binaryDashParserMod.Parser[_]
}

object NestOptions {
  @scala.inline
  def apply(
    `type`: typings.binaryDashParser.binaryDashParserMod.Parser[_],
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    formatter: /* value */ Data => _ = null
  ): NestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[NestOptions]
  }
}

