package typings
package binaryDashParserLib.binaryDashParserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends Options {
  @JSName("clone")
  var clone_FBufferOptions: js.UndefOr[scala.Boolean] = js.undefined
  var length: js.UndefOr[
    scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double])
  ] = js.undefined
  var readUntil: js.UndefOr[
    java.lang.String | (js.Function2[/* item */ scala.Double, /* buffer */ nodeLib.Buffer, scala.Boolean])
  ] = js.undefined
}

object BufferOptions {
  @scala.inline
  def apply(
    assert: java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean]) = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: js.Function1[/* value */ Data, _] = null,
    length: scala.Double | java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double]) = null,
    readUntil: java.lang.String | (js.Function2[/* item */ scala.Double, /* buffer */ nodeLib.Buffer, scala.Boolean]) = null
  ): BufferOptions = {
    val __obj = js.Dynamic.literal()
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (readUntil != null) __obj.updateDynamic("readUntil")(readUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}

