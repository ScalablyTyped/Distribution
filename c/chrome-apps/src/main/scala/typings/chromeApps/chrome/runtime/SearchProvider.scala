package typings.chromeApps.chrome.runtime

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProvider extends js.Object {
  var alternate_urls: js.UndefOr[js.Array[String]] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var favicon_url: js.UndefOr[String] = js.undefined
  var image_url: js.UndefOr[String] = js.undefined
  var image_url_post_params: js.UndefOr[String] = js.undefined
  var instant_url: js.UndefOr[String] = js.undefined
  var instant_url_post_params: js.UndefOr[String] = js.undefined
  var is_default: js.UndefOr[Boolean] = js.undefined
  var keyword: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prepopulated_id: js.UndefOr[integer] = js.undefined
  var search_url: String
  var search_url_post_params: js.UndefOr[String] = js.undefined
  var suggest_url: js.UndefOr[String] = js.undefined
  var suggest_url_post_params: js.UndefOr[String] = js.undefined
}

object SearchProvider {
  @scala.inline
  def apply(
    search_url: String,
    alternate_urls: js.Array[String] = null,
    encoding: String = null,
    favicon_url: String = null,
    image_url: String = null,
    image_url_post_params: String = null,
    instant_url: String = null,
    instant_url_post_params: String = null,
    is_default: js.UndefOr[Boolean] = js.undefined,
    keyword: String = null,
    name: String = null,
    prepopulated_id: Int | Double = null,
    search_url_post_params: String = null,
    suggest_url: String = null,
    suggest_url_post_params: String = null
  ): SearchProvider = {
    val __obj = js.Dynamic.literal(search_url = search_url.asInstanceOf[js.Any])
    if (alternate_urls != null) __obj.updateDynamic("alternate_urls")(alternate_urls.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (favicon_url != null) __obj.updateDynamic("favicon_url")(favicon_url.asInstanceOf[js.Any])
    if (image_url != null) __obj.updateDynamic("image_url")(image_url.asInstanceOf[js.Any])
    if (image_url_post_params != null) __obj.updateDynamic("image_url_post_params")(image_url_post_params.asInstanceOf[js.Any])
    if (instant_url != null) __obj.updateDynamic("instant_url")(instant_url.asInstanceOf[js.Any])
    if (instant_url_post_params != null) __obj.updateDynamic("instant_url_post_params")(instant_url_post_params.asInstanceOf[js.Any])
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prepopulated_id != null) __obj.updateDynamic("prepopulated_id")(prepopulated_id.asInstanceOf[js.Any])
    if (search_url_post_params != null) __obj.updateDynamic("search_url_post_params")(search_url_post_params.asInstanceOf[js.Any])
    if (suggest_url != null) __obj.updateDynamic("suggest_url")(suggest_url.asInstanceOf[js.Any])
    if (suggest_url_post_params != null) __obj.updateDynamic("suggest_url_post_params")(suggest_url_post_params.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvider]
  }
}

