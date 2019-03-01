package typings
package blessedLib.blessedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlessedProgramOptions extends js.Object {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var dump: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[nodeLib.streamMod.Readable] = js.undefined
  var log: js.UndefOr[java.lang.String] = js.undefined
  var output: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
  var resizeTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var term: js.UndefOr[java.lang.String] = js.undefined
  var terminal: js.UndefOr[java.lang.String] = js.undefined
  var tput: js.UndefOr[java.lang.String] = js.undefined
  var zero: js.UndefOr[scala.Boolean] = js.undefined
}

object IBlessedProgramOptions {
  @scala.inline
  def apply(
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dump: js.UndefOr[scala.Boolean] = js.undefined,
    input: nodeLib.streamMod.Readable = null,
    log: java.lang.String = null,
    output: nodeLib.streamMod.Writable = null,
    resizeTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    term: java.lang.String = null,
    terminal: java.lang.String = null,
    tput: java.lang.String = null,
    zero: js.UndefOr[scala.Boolean] = js.undefined
  ): IBlessedProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(dump)) __obj.updateDynamic("dump")(dump)
    if (input != null) __obj.updateDynamic("input")(input)
    if (log != null) __obj.updateDynamic("log")(log)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(resizeTimeout)) __obj.updateDynamic("resizeTimeout")(resizeTimeout)
    if (term != null) __obj.updateDynamic("term")(term)
    if (terminal != null) __obj.updateDynamic("terminal")(terminal)
    if (tput != null) __obj.updateDynamic("tput")(tput)
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[IBlessedProgramOptions]
  }
}

