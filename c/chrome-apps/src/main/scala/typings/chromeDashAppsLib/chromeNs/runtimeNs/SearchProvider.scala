package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProvider extends js.Object {
  var alternate_urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var favicon_url: js.UndefOr[java.lang.String] = js.undefined
  var image_url: js.UndefOr[java.lang.String] = js.undefined
  var image_url_post_params: js.UndefOr[java.lang.String] = js.undefined
  var instant_url: js.UndefOr[java.lang.String] = js.undefined
  var instant_url_post_params: js.UndefOr[java.lang.String] = js.undefined
  var is_default: js.UndefOr[scala.Boolean] = js.undefined
  var keyword: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var prepopulated_id: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var search_url: java.lang.String
  var search_url_post_params: js.UndefOr[java.lang.String] = js.undefined
  var suggest_url: js.UndefOr[java.lang.String] = js.undefined
  var suggest_url_post_params: js.UndefOr[java.lang.String] = js.undefined
}

object SearchProvider {
  @scala.inline
  def apply(
    search_url: java.lang.String,
    alternate_urls: js.Array[java.lang.String] = null,
    encoding: java.lang.String = null,
    favicon_url: java.lang.String = null,
    image_url: java.lang.String = null,
    image_url_post_params: java.lang.String = null,
    instant_url: java.lang.String = null,
    instant_url_post_params: java.lang.String = null,
    is_default: js.UndefOr[scala.Boolean] = js.undefined,
    keyword: java.lang.String = null,
    name: java.lang.String = null,
    prepopulated_id: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    search_url_post_params: java.lang.String = null,
    suggest_url: java.lang.String = null,
    suggest_url_post_params: java.lang.String = null
  ): SearchProvider = {
    val __obj = js.Dynamic.literal(search_url = search_url)
    if (alternate_urls != null) __obj.updateDynamic("alternate_urls")(alternate_urls)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (favicon_url != null) __obj.updateDynamic("favicon_url")(favicon_url)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    if (image_url_post_params != null) __obj.updateDynamic("image_url_post_params")(image_url_post_params)
    if (instant_url != null) __obj.updateDynamic("instant_url")(instant_url)
    if (instant_url_post_params != null) __obj.updateDynamic("instant_url_post_params")(instant_url_post_params)
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prepopulated_id)) __obj.updateDynamic("prepopulated_id")(prepopulated_id)
    if (search_url_post_params != null) __obj.updateDynamic("search_url_post_params")(search_url_post_params)
    if (suggest_url != null) __obj.updateDynamic("suggest_url")(suggest_url)
    if (suggest_url_post_params != null) __obj.updateDynamic("suggest_url_post_params")(suggest_url_post_params)
    __obj.asInstanceOf[SearchProvider]
  }
}

