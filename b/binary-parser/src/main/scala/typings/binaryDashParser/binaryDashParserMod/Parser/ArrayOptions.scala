package typings.binaryDashParser.binaryDashParserMod.Parser

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions extends Options {
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typings.binaryDashParser.binaryDashParserMod.Parser[_], Double])
  ] = js.undefined
  var lengthInBytes: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typings.binaryDashParser.binaryDashParserMod.Parser[_], Double])
  ] = js.undefined
  var readUntil: js.UndefOr[String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])] = js.undefined
  var `type`: String | typings.binaryDashParser.binaryDashParserMod.Parser[_]
}

object ArrayOptions {
  @scala.inline
  def apply(
    `type`: String | typings.binaryDashParser.binaryDashParserMod.Parser[_],
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    formatter: /* value */ Data => _ = null,
    length: Double | String | (js.ThisFunction0[/* this */ typings.binaryDashParser.binaryDashParserMod.Parser[_], Double]) = null,
    lengthInBytes: Double | String | (js.ThisFunction0[/* this */ typings.binaryDashParser.binaryDashParserMod.Parser[_], Double]) = null,
    readUntil: String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean]) = null
  ): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lengthInBytes != null) __obj.updateDynamic("lengthInBytes")(lengthInBytes.asInstanceOf[js.Any])
    if (readUntil != null) __obj.updateDynamic("readUntil")(readUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions]
  }
}

