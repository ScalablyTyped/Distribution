package typings
package cleanDashCssLib.cleanDashCssMod.CleanCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring the CSS formatting
  */
trait FormatOptions extends js.Object {
  /**
    * Controls the new line character, can be `'\r\n'` or `'\n'`(aliased as `'windows'` and `'unix'`
    * or `'crlf'` and `'lf'`); defaults to system one, so former on Windows and latter on Unix
    */
  var breakWith: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Controls where to insert breaks
    */
  var breaks: js.UndefOr[cleanDashCssLib.Anon_AfterAtRule] = js.undefined
  /**
    * Controls number of characters to indent with; defaults to `0`
    */
  var indentBy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls a character to indent with, can be `'space'` or `'tab'`; defaults to `'space'`
    */
  var indentWith: js.UndefOr[
    cleanDashCssLib.cleanDashCssLibStrings.space | cleanDashCssLib.cleanDashCssLibStrings.tab
  ] = js.undefined
  /**
    * Controls where to insert spaces
    */
  var spaces: js.UndefOr[cleanDashCssLib.Anon_AroundSelectorRelation] = js.undefined
  /**
    * Controls maximum line length; defaults to `false`
    */
  var wrapAt: js.UndefOr[cleanDashCssLib.cleanDashCssLibNumbers.`false` | scala.Double] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    breakWith: java.lang.String = null,
    breaks: cleanDashCssLib.Anon_AfterAtRule = null,
    indentBy: scala.Int | scala.Double = null,
    indentWith: cleanDashCssLib.cleanDashCssLibStrings.space | cleanDashCssLib.cleanDashCssLibStrings.tab = null,
    spaces: cleanDashCssLib.Anon_AroundSelectorRelation = null,
    wrapAt: cleanDashCssLib.cleanDashCssLibNumbers.`false` | scala.Double = null
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (breakWith != null) __obj.updateDynamic("breakWith")(breakWith)
    if (breaks != null) __obj.updateDynamic("breaks")(breaks)
    if (indentBy != null) __obj.updateDynamic("indentBy")(indentBy.asInstanceOf[js.Any])
    if (indentWith != null) __obj.updateDynamic("indentWith")(indentWith.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces)
    if (wrapAt != null) __obj.updateDynamic("wrapAt")(wrapAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

