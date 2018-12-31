package typings
package commonmarkLib.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlRenderingOptions extends XmlRenderingOptions {
  /**
    *  if true, raw HTML will not be passed through to HTML output (it will be replaced by comments), and potentially unsafe URLs in links and images
    *  (those beginning with javascript:, vbscript:, file:, and with a few exceptions data:) will be replaced with empty strings.
    */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
    */
  var smart: js.UndefOr[scala.Boolean] = js.undefined
}

