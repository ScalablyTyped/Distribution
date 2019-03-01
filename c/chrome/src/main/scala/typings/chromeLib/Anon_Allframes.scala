package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allframes extends js.Object {
  var all_frames: js.UndefOr[scala.Boolean] = js.undefined
  var css: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude_matches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("js")
  var `js_`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var matches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var run_at: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Allframes {
  @scala.inline
  def apply(
    all_frames: js.UndefOr[scala.Boolean] = js.undefined,
    css: js.Array[java.lang.String] = null,
    exclude_globs: js.Array[java.lang.String] = null,
    exclude_matches: js.Array[java.lang.String] = null,
    include_globs: js.Array[java.lang.String] = null,
    `js_`: js.Array[java.lang.String] = null,
    matches: js.Array[java.lang.String] = null,
    run_at: java.lang.String = null
  ): Anon_Allframes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all_frames)) __obj.updateDynamic("all_frames")(all_frames)
    if (css != null) __obj.updateDynamic("css")(css)
    if (exclude_globs != null) __obj.updateDynamic("exclude_globs")(exclude_globs)
    if (exclude_matches != null) __obj.updateDynamic("exclude_matches")(exclude_matches)
    if (include_globs != null) __obj.updateDynamic("include_globs")(include_globs)
    if (`js_` != null) __obj.updateDynamic("js")(`js_`)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (run_at != null) __obj.updateDynamic("run_at")(run_at)
    __obj.asInstanceOf[Anon_Allframes]
  }
}

