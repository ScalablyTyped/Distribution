package typings.blessed.blessedMod.Widgets

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TputsOptions extends IOptions {
  var debug: js.UndefOr[Boolean] = js.undefined
  var extended: js.UndefOr[Boolean] = js.undefined
  var termcap: js.UndefOr[String] = js.undefined
  var termcapFile: js.UndefOr[String] = js.undefined
  var terminal: js.UndefOr[String] = js.undefined
  var terminfoFile: js.UndefOr[String] = js.undefined
  var terminfoPrefix: js.UndefOr[String] = js.undefined
}

object TputsOptions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    extended: js.UndefOr[Boolean] = js.undefined,
    termcap: String = null,
    termcapFile: String = null,
    terminal: String = null,
    terminfoFile: String = null,
    terminfoPrefix: String = null
  ): TputsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended)
    if (termcap != null) __obj.updateDynamic("termcap")(termcap)
    if (termcapFile != null) __obj.updateDynamic("termcapFile")(termcapFile)
    if (terminal != null) __obj.updateDynamic("terminal")(terminal)
    if (terminfoFile != null) __obj.updateDynamic("terminfoFile")(terminfoFile)
    if (terminfoPrefix != null) __obj.updateDynamic("terminfoPrefix")(terminfoPrefix)
    __obj.asInstanceOf[TputsOptions]
  }
}

