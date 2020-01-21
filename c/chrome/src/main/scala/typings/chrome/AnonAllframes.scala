package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllframes extends js.Object {
  var all_frames: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[js.Array[String]] = js.undefined
  var exclude_globs: js.UndefOr[js.Array[String]] = js.undefined
  var exclude_matches: js.UndefOr[js.Array[String]] = js.undefined
  var include_globs: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("js")
  var js_ : js.UndefOr[js.Array[String]] = js.undefined
  var match_about_blank: js.UndefOr[Boolean] = js.undefined
  var matches: js.UndefOr[js.Array[String]] = js.undefined
  var run_at: js.UndefOr[String] = js.undefined
}

object AnonAllframes {
  @scala.inline
  def apply(
    all_frames: js.UndefOr[Boolean] = js.undefined,
    css: js.Array[String] = null,
    exclude_globs: js.Array[String] = null,
    exclude_matches: js.Array[String] = null,
    include_globs: js.Array[String] = null,
    js_ : js.Array[String] = null,
    match_about_blank: js.UndefOr[Boolean] = js.undefined,
    matches: js.Array[String] = null,
    run_at: String = null
  ): AnonAllframes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all_frames)) __obj.updateDynamic("all_frames")(all_frames.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (exclude_globs != null) __obj.updateDynamic("exclude_globs")(exclude_globs.asInstanceOf[js.Any])
    if (exclude_matches != null) __obj.updateDynamic("exclude_matches")(exclude_matches.asInstanceOf[js.Any])
    if (include_globs != null) __obj.updateDynamic("include_globs")(include_globs.asInstanceOf[js.Any])
    if (js_ != null) __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (!js.isUndefined(match_about_blank)) __obj.updateDynamic("match_about_blank")(match_about_blank.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (run_at != null) __obj.updateDynamic("run_at")(run_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllframes]
  }
}

