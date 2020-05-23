package typings.classTransformer.exposeExcludeOptionsMod

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
    since: js.UndefOr[Double] = js.undefined,
    toClassOnly: js.UndefOr[Boolean] = js.undefined,
    toPlainOnly: js.UndefOr[Boolean] = js.undefined,
    until: js.UndefOr[Double] = js.undefined
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toClassOnly)) __obj.updateDynamic("toClassOnly")(toClassOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toPlainOnly)) __obj.updateDynamic("toPlainOnly")(toPlainOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(until)) __obj.updateDynamic("until")(until.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

