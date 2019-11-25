package typings.commandDashLineDashUsage.commandDashLineDashUsageMod

import typings.commandDashLineDashUsage.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Content section comprises a header and one or more lines of content. */
trait Content extends Section {
  /**
    * Overloaded property, accepting data in one of four formats.
    *  1. A single string (one line of text).
    *  2. An array of strings (multiple lines of text).
    *  3. An array of objects (recordset-style data). In this case, the data will be rendered in table format. The property names of each object are not important, so long as they are
    *     consistent throughout the array.
    *  4. An object with two properties - data and options. In this case, the data and options will be passed directly to the underlying table layout module for rendering.
    */
  var content: js.UndefOr[String | (js.Array[_ | String]) | Anon_Data] = js.undefined
  /** The section header, always bold and underlined. */
  var header: js.UndefOr[String] = js.undefined
  /** Set to true to avoid indentation and wrapping. Useful for banners. */
  var raw: js.UndefOr[Boolean] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    content: String | (js.Array[_ | String]) | Anon_Data = null,
    header: String = null,
    raw: js.UndefOr[Boolean] = js.undefined
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

