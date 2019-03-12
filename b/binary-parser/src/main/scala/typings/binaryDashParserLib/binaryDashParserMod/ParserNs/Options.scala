package typings
package binaryDashParserLib.binaryDashParserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assert: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean])
  ] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* value */ Data, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assert: java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean]) = null,
    formatter: /* value */ Data => _ = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[Options]
  }
}

