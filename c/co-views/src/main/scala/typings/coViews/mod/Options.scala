package typings.coViews.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * cache compiled templates
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * default extname
    */
  var default: js.UndefOr[String] = js.undefined
  /**
    * default extname
    */
  var ext: js.UndefOr[String] = js.undefined
  /**
    * common locals data
    */
  var locals: js.UndefOr[js.Object] = js.undefined
  /**
    * engine map
    */
  var map: js.UndefOr[js.Object] = js.undefined
  /**
    * proxy partials
    */
  var partials: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    default: String = null,
    ext: String = null,
    locals: js.Object = null,
    map: js.Object = null,
    partials: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (partials != null) __obj.updateDynamic("partials")(partials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

