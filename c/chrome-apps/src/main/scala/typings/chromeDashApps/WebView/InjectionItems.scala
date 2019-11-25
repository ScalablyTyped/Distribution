package typings.chromeDashApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of injection item: code or a set of files. */
trait InjectionItems extends js.Object {
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.undefined
  /**
    * The list of JavaScript or CSS files to be injected into matching pages.
    * These are injected in the order they appear in this array.
    */
  var files: js.UndefOr[js.Array[_]] = js.undefined
}

object InjectionItems {
  @scala.inline
  def apply(code: String = null, files: js.Array[_] = null): InjectionItems = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectionItems]
  }
}

