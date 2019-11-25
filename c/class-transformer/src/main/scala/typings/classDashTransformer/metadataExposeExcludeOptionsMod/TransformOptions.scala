package typings.classDashTransformer.metadataExposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var since: js.UndefOr[Double] = js.undefined
  var toClassOnly: js.UndefOr[Boolean] = js.undefined
  var toPlainOnly: js.UndefOr[Boolean] = js.undefined
  var until: js.UndefOr[Double] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    groups: js.Array[String] = null,
    since: Int | Double = null,
    toClassOnly: js.UndefOr[Boolean] = js.undefined,
    toPlainOnly: js.UndefOr[Boolean] = js.undefined,
    until: Int | Double = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(toClassOnly)) __obj.updateDynamic("toClassOnly")(toClassOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(toPlainOnly)) __obj.updateDynamic("toPlainOnly")(toPlainOnly.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

