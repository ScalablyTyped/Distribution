package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for prompt modals */

trait BootboxPromptOptions
  extends BootboxBaseOptions[java.lang.String] {
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  var inputOptions: js.UndefOr[js.Array[Anon_Text]] = js.undefined
  var inputType: js.UndefOr[
    bootboxLib.bootboxLibStrings.text | bootboxLib.bootboxLibStrings.textarea | bootboxLib.bootboxLibStrings.email | bootboxLib.bootboxLibStrings.select | bootboxLib.bootboxLibStrings.checkbox | bootboxLib.bootboxLibStrings.date | bootboxLib.bootboxLibStrings.time | bootboxLib.bootboxLibStrings.number | bootboxLib.bootboxLibStrings.password
  ] = js.undefined
  @JSName("title")
  var title_BootboxPromptOptions: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: java.lang.String): js.Any
}

