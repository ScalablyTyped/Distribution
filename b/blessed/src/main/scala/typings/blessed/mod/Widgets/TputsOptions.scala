package typings.blessed.mod.Widgets

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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended.get.asInstanceOf[js.Any])
    if (termcap != null) __obj.updateDynamic("termcap")(termcap.asInstanceOf[js.Any])
    if (termcapFile != null) __obj.updateDynamic("termcapFile")(termcapFile.asInstanceOf[js.Any])
    if (terminal != null) __obj.updateDynamic("terminal")(terminal.asInstanceOf[js.Any])
    if (terminfoFile != null) __obj.updateDynamic("terminfoFile")(terminfoFile.asInstanceOf[js.Any])
    if (terminfoPrefix != null) __obj.updateDynamic("terminfoPrefix")(terminfoPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TputsOptions]
  }
}

