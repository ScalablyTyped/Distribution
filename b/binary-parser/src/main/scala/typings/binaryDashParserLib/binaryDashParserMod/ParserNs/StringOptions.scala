package typings
package binaryDashParserLib.binaryDashParserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringOptions extends Options {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var greedy: js.UndefOr[scala.Boolean] = js.undefined
  var length: js.UndefOr[
    scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double])
  ] = js.undefined
  var stripNull: js.UndefOr[scala.Boolean] = js.undefined
  var zeroTerminated: js.UndefOr[scala.Boolean] = js.undefined
}

object StringOptions {
  @scala.inline
  def apply(
    assert: java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean]) = null,
    encoding: java.lang.String = null,
    formatter: js.Function1[/* value */ Data, _] = null,
    greedy: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double]) = null,
    stripNull: js.UndefOr[scala.Boolean] = js.undefined,
    zeroTerminated: js.UndefOr[scala.Boolean] = js.undefined
  ): StringOptions = {
    val __obj = js.Dynamic.literal()
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(stripNull)) __obj.updateDynamic("stripNull")(stripNull)
    if (!js.isUndefined(zeroTerminated)) __obj.updateDynamic("zeroTerminated")(zeroTerminated)
    __obj.asInstanceOf[StringOptions]
  }
}

