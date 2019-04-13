package typings
package coDashViewsLib.coDashViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * cache compiled templates
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default extname
    */
  var default: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default extname
    */
  var ext: js.UndefOr[java.lang.String] = js.undefined
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
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    default: java.lang.String = null,
    ext: java.lang.String = null,
    locals: js.Object = null,
    map: js.Object = null,
    partials: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (default != null) __obj.updateDynamic("default")(default)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (map != null) __obj.updateDynamic("map")(map)
    if (partials != null) __obj.updateDynamic("partials")(partials)
    __obj.asInstanceOf[Options]
  }
}

