package typings.branchSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.branchSdk.mod.UriRedirectMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictcustomkey
  extends // Custom data
/* custom_key */ StringDictionary[js.Any] {
  /**
    * When a user returns to the browser after going to the app, take them to this URL. iOS only; Android coming soon
    */
  @JSName("$after_click_url")
  var $after_click_url: js.UndefOr[String] = js.undefined
  /**
    * Set to false to make links always fall back to your mobile site. Does not apply to Universal Links or Android App Links.
    */
  @JSName("$always_deeplink")
  var $always_deeplink: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the deep link path for Android apps. When the Branch SDK receives a link with this parameter set, it will automatically load the custom Android URI path contained within
    */
  @JSName("$android_deeplink_path")
  var $android_deeplink_path: js.UndefOr[String] = js.undefined
  /**
    * The name of the deepview template to use for Android
    */
  @JSName("$android_deepview")
  var $android_deepview: js.UndefOr[String] = js.undefined
  /**
    * The name of the template to use for Android.
    */
  @JSName("$android_passive_deepview")
  var $android_passive_deepview: js.UndefOr[String] = js.undefined
  /**
    * Control the timeout that the client side JS waits after trying to open up the app before redirecting to the Play Store. Specified in milliseconds
    */
  @JSName("$android_redirect_timeout")
  var $android_redirect_timeout: js.UndefOr[Double] = js.undefined
  /**
    * Change the redirect endpoint for Android Play Store page for your app
    */
  @JSName("$android_url")
  var $android_url: js.UndefOr[String] = js.undefined
  /**
    * Change the redirect endpoint for WeChat on Android devices $android_url value
    */
  @JSName("$android_wechat_url")
  var $android_wechat_url: js.UndefOr[String] = js.undefined
  /**
    * Change the redirect endpoint for Blackberry OS BlackBerry default URL
    */
  @JSName("$blackberry_url")
  var $blackberry_url: js.UndefOr[String] = js.undefined
  /**
    * This is the unique identifier for content that will help Branch dedupe across many instances of the same thing.
    * Suitable options: a website with pathing, or a database with identifiers for entities
    */
  @JSName("$canonical_identifier")
  var $canonical_identifier: js.UndefOr[String] = js.undefined
  /**
    * Time between a click or a web to app auto redirect and a conversion event.
    * Conversion events include commerce events (e.g. purchase, add to cart), all custom events, and all view events like pageviews & content views.
    */
  @JSName("$click_conversion_window_days")
  var $click_conversion_window_days: js.UndefOr[Double] = js.undefined
  // Attribution windows
  /**
    * Time between a click or a web to app auto redirect and an install or reinstall.
    */
  @JSName("$click_install_window_days")
  var $click_install_window_days: js.UndefOr[Double] = js.undefined
  /**
    * Time between a click or a web to app auto redirect and an open or web session start.
    */
  @JSName("$click_session_start_window_days")
  var $click_session_start_window_days: js.UndefOr[Double] = js.undefined
  /**
    * This is a label for the type of content present.
    */
  @JSName("$content_type")
  var $content_type: js.UndefOr[String] = js.undefined
  // Custom Tags
  /**
    * Valid stringified JSON dictionary of the tags’ keys and values
    */
  @JSName("$custom_meta_tags")
  var $custom_meta_tags: js.UndefOr[String] = js.undefined
  /**
    * Text for SMS link sent for desktop clicks to this link. Must contain {{ link }} Value of Text me the app page in Settings
    */
  @JSName("$custom_sms_text")
  var $custom_sms_text: js.UndefOr[String] = js.undefined
  /**
    * Set to true for the links to only support deep linking without any attribution for that link.
    */
  @JSName("$deeplink_no_attribution")
  var $deeplink_no_attribution: js.UndefOr[Boolean] = js.undefined
  // Deep linking
  /**
    * Set the deep link path for all platforms - so you don't have to enable it by platform.
    * When the Branch SDK receives a link with this parameter set, it will automatically load the custom URI path contained within
    */
  @JSName("$deeplink_path")
  var $deeplink_path: js.UndefOr[String] = js.undefined
  /**
    * Set the deep link path for Desktop apps. You will have to fetch this parameter and route the user accordingly
    */
  @JSName("$desktop_deeplink_path")
  var $desktop_deeplink_path: js.UndefOr[String] = js.undefined
  /**
    * The name of the deepview template to use for the Desktop
    */
  @JSName("$desktop_deepview")
  var $desktop_deepview: js.UndefOr[String] = js.undefined
  /**
    * Change the redirect endpoint on desktops
    */
  @JSName("$desktop_url")
  var $desktop_url: js.UndefOr[String] = js.undefined
  /**
    * This will prevent click tracking and storage of link analytics. Deep link data will still flow into the app from link click to app open.
    */
  @JSName("$do_not_process")
  var $do_not_process: js.UndefOr[Boolean] = js.undefined
  // Redirections
  /**
    * Change the redirect endpoint for all platforms - so you don't have to enable it by platform.
    * Note that Branch will forward all robots to this URL, which overrides any OG tags entered in the link.
    */
  @JSName("$fallback_url")
  var $fallback_url: js.UndefOr[String] = js.undefined
  /**
    * Change the redirect endpoint for Amazon Fire OS Fire default URL
    */
  @JSName("$fire_url")
  var $fire_url: js.UndefOr[String] = js.undefined
  /**
    * Time between an ad impression and a conversion event.
    * Conversion events include commerce events (e.g. purchase, add to cart), all custom events, and all view events like pageviews & content views.
    */
  @JSName("$impression_conversion_window_days")
  var $impression_conversion_window_days: js.UndefOr[Double] = js.undefined
  /**
    * Time between an ad impression and an install or reinstall.
    */
  @JSName("$impression_install_window_days")
  var $impression_install_window_days: js.UndefOr[Double] = js.undefined
  /**
    * Time between an ad impression and an open or web session start.
    */
  @JSName("$impression_session_start_window_days")
  var $impression_session_start_window_days: js.UndefOr[Double] = js.undefined
  /**
    * Set the deep link path for iOS apps. When the Branch SDK receives a link with this parameter set, it will automatically load the custom iOS URI path contained within
    */
  @JSName("$ios_deeplink_path")
  var $ios_deeplink_path: js.UndefOr[String] = js.undefined
  // Deepview
  /**
    * The name of the deepview template to use for iOS
    */
  @JSName("$ios_deepview")
  var $ios_deepview: js.UndefOr[String] = js.undefined
  /**
    * The name of the template to use for iOS.
    */
  @JSName("$ios_passive_deepview")
  var $ios_passive_deepview: js.UndefOr[String] = js.undefined
  /**
    * Control the timeout that the client-side JS waits after trying to open up the app before redirecting to the App Store. Specified in milliseconds
    */
  @JSName("$ios_redirect_timeout")
  var $ios_redirect_timeout: js.UndefOr[Double] = js.undefined
  /**
    * Change the redirect endpoint for iOS App Store page for your app
    */
  @JSName("$ios_url")
  var $ios_url: js.UndefOr[String] = js.undefined
  /*
    * Change the redirect endpoint for WeChat on iOS devices $ios_url value
    */
  @JSName("$ios_wechat_url")
  var $ios_wechat_url: js.UndefOr[String] = js.undefined
  /**
    * Change the redirect endpoint for iPads $ios_url value
    */
  @JSName("$ipad_url")
  var $ipad_url: js.UndefOr[String] = js.undefined
  /**
    * Set the marketing title for the deep link.
    */
  @JSName("$marketing_title")
  var $marketing_title: js.UndefOr[String] = js.undefined
  /**
    * Lets you control the snapshotting match timeout (the time that a click will wait for an app open to match) also known as attribution window. Specified in seconds
    */
  @JSName("$match_duration")
  var $match_duration: js.UndefOr[Double] = js.undefined
  /**
    * (Rarely used) Sets the app id tag
    */
  @JSName("$og_app_id")
  var $og_app_id: js.UndefOr[String] = js.undefined
  /**
    * Set the description of the link as it will be seen in social media displays
    */
  @JSName("$og_description")
  var $og_description: js.UndefOr[String] = js.undefined
  /**
    * Set the image's height in pixels for social media displays
    */
  @JSName("$og_image_height")
  var $og_image_height: js.UndefOr[Double] = js.undefined
  /**
    * Set the image of the link as it will be seen in social media displays
    */
  @JSName("$og_image_url")
  var $og_image_url: js.UndefOr[String] = js.undefined
  /**
    * Set the image's width in pixels for social media displays
    */
  @JSName("$og_image_width")
  var $og_image_width: js.UndefOr[Double] = js.undefined
  /**
    * (Advanced, not recommended) Set a custom URL that we redirect the social media robots to in order to retrieve all the appropriate tags
    */
  @JSName("$og_redirect")
  var $og_redirect: js.UndefOr[String] = js.undefined
  // Open Graph
  /**
    * Set the title of the link as it will be seen in social media displays
    */
  @JSName("$og_title")
  var $og_title: js.UndefOr[String] = js.undefined
  /**
    * Set the type of custom card format link as it will be seen in social media displays. Don't set this property when sharing deep links on Facebook
    */
  @JSName("$og_type")
  var $og_type: js.UndefOr[String] = js.undefined
  /**
    * Set the base URL of the link as it will be seen in social media displays
    */
  @JSName("$og_url")
  var $og_url: js.UndefOr[String] = js.undefined
  /**
    * Set a video as it will be seen in social media displays
    */
  @JSName("$og_video")
  var $og_video: js.UndefOr[String] = js.undefined
  /**
    * Redirect to Samsung Galaxy Store on Samsung devices. Only link level control. Format should be http://www.samsungapps.com/appquery/appDetail.as?appId=YOUR.PACKAGE.NAME
    */
  @JSName("$samsung_url")
  var $samsung_url: js.UndefOr[String] = js.undefined
  /**
    * Set the app country for the app card
    */
  @JSName("$twitter_app_country")
  var $twitter_app_country: js.UndefOr[String] = js.undefined
  // Twitter
  /**
    * Set the Twitter card type of the link (e.g. player) (you must whitelist your deep link with the Twitter Card Validator)
    */
  @JSName("$twitter_card")
  var $twitter_card: js.UndefOr[String] = js.undefined
  /**
    * Set the description of the Twitter card
    */
  @JSName("$twitter_description")
  var $twitter_description: js.UndefOr[String] = js.undefined
  /**
    * Set the video player's URL. Defaults to the value of $og_video.
    */
  @JSName("$twitter_player")
  var $twitter_player: js.UndefOr[String] = js.undefined
  /**
    * Set the player's height in pixels
    */
  @JSName("$twitter_player_height")
  var $twitter_player_height: js.UndefOr[Double] = js.undefined
  /**
    * Set the player's width in pixels
    */
  @JSName("$twitter_player_width")
  var $twitter_player_width: js.UndefOr[Double] = js.undefined
  /**
    * Set the site for Twitter
    */
  @JSName("$twitter_site")
  var $twitter_site: js.UndefOr[String] = js.undefined
  /**
    * Set the title of the Twitter card
    */
  @JSName("$twitter_title")
  var $twitter_title: js.UndefOr[String] = js.undefined
  // Forced redirections
  /**
    * Prevent error messages from other apps when Branch deep links are clicked
    */
  @JSName("$uri_redirect_mode")
  var $uri_redirect_mode: js.UndefOr[UriRedirectMode] = js.undefined
  /**
    * Force to open the $fallback_url instead of the app
    */
  @JSName("$web_only")
  var $web_only: js.UndefOr[Boolean] = js.undefined
  /**
    * Change the redirect endpoint for Windows OS Windows Phone default URL
    */
  @JSName("$windows_phone_url")
  var $windows_phone_url: js.UndefOr[String] = js.undefined
  // Content
  /**
    * Keywords for which this content should be discovered by. Just assign an array of strings with the keywords you'd like to use
    */
  @JSName("~keyword")
  var Tildekeyword: js.UndefOr[js.Array[String]] = js.undefined
  // Link appearance
  /**
    * Specify a link alias to replace of the standard encoded short URL (e.g. https://example.app.link/aQXXDHaxKF -> https://example.app.link/october-campaign).
    * Link aliases must be unique per app (a 409 error will occur if you create an alias already taken)
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * Set the image URL for the Twitter card
    */
  var twitter_image_url: js.UndefOr[String] = js.undefined
}

object Dictcustomkey {
  @scala.inline
  def apply(
    $after_click_url: String = null,
    $always_deeplink: js.UndefOr[Boolean] = js.undefined,
    $android_deeplink_path: String = null,
    $android_deepview: String = null,
    $android_passive_deepview: String = null,
    $android_redirect_timeout: js.UndefOr[Double] = js.undefined,
    $android_url: String = null,
    $android_wechat_url: String = null,
    $blackberry_url: String = null,
    $canonical_identifier: String = null,
    $click_conversion_window_days: js.UndefOr[Double] = js.undefined,
    $click_install_window_days: js.UndefOr[Double] = js.undefined,
    $click_session_start_window_days: js.UndefOr[Double] = js.undefined,
    $content_type: String = null,
    $custom_meta_tags: String = null,
    $custom_sms_text: String = null,
    $deeplink_no_attribution: js.UndefOr[Boolean] = js.undefined,
    $deeplink_path: String = null,
    $desktop_deeplink_path: String = null,
    $desktop_deepview: String = null,
    $desktop_url: String = null,
    $do_not_process: js.UndefOr[Boolean] = js.undefined,
    $fallback_url: String = null,
    $fire_url: String = null,
    $impression_conversion_window_days: js.UndefOr[Double] = js.undefined,
    $impression_install_window_days: js.UndefOr[Double] = js.undefined,
    $impression_session_start_window_days: js.UndefOr[Double] = js.undefined,
    $ios_deeplink_path: String = null,
    $ios_deepview: String = null,
    $ios_passive_deepview: String = null,
    $ios_redirect_timeout: js.UndefOr[Double] = js.undefined,
    $ios_url: String = null,
    $ios_wechat_url: String = null,
    $ipad_url: String = null,
    $marketing_title: String = null,
    $match_duration: js.UndefOr[Double] = js.undefined,
    $og_app_id: String = null,
    $og_description: String = null,
    $og_image_height: js.UndefOr[Double] = js.undefined,
    $og_image_url: String = null,
    $og_image_width: js.UndefOr[Double] = js.undefined,
    $og_redirect: String = null,
    $og_title: String = null,
    $og_type: String = null,
    $og_url: String = null,
    $og_video: String = null,
    $samsung_url: String = null,
    $twitter_app_country: String = null,
    $twitter_card: String = null,
    $twitter_description: String = null,
    $twitter_player: String = null,
    $twitter_player_height: js.UndefOr[Double] = js.undefined,
    $twitter_player_width: js.UndefOr[Double] = js.undefined,
    $twitter_site: String = null,
    $twitter_title: String = null,
    $uri_redirect_mode: UriRedirectMode = null,
    $web_only: js.UndefOr[Boolean] = js.undefined,
    $windows_phone_url: String = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    Tildekeyword: js.Array[String] = null,
    alias: String = null,
    twitter_image_url: String = null
  ): Dictcustomkey = {
    val __obj = js.Dynamic.literal()
    if ($after_click_url != null) __obj.updateDynamic("$after_click_url")($after_click_url.asInstanceOf[js.Any])
    if (!js.isUndefined($always_deeplink)) __obj.updateDynamic("$always_deeplink")($always_deeplink.get.asInstanceOf[js.Any])
    if ($android_deeplink_path != null) __obj.updateDynamic("$android_deeplink_path")($android_deeplink_path.asInstanceOf[js.Any])
    if ($android_deepview != null) __obj.updateDynamic("$android_deepview")($android_deepview.asInstanceOf[js.Any])
    if ($android_passive_deepview != null) __obj.updateDynamic("$android_passive_deepview")($android_passive_deepview.asInstanceOf[js.Any])
    if (!js.isUndefined($android_redirect_timeout)) __obj.updateDynamic("$android_redirect_timeout")($android_redirect_timeout.get.asInstanceOf[js.Any])
    if ($android_url != null) __obj.updateDynamic("$android_url")($android_url.asInstanceOf[js.Any])
    if ($android_wechat_url != null) __obj.updateDynamic("$android_wechat_url")($android_wechat_url.asInstanceOf[js.Any])
    if ($blackberry_url != null) __obj.updateDynamic("$blackberry_url")($blackberry_url.asInstanceOf[js.Any])
    if ($canonical_identifier != null) __obj.updateDynamic("$canonical_identifier")($canonical_identifier.asInstanceOf[js.Any])
    if (!js.isUndefined($click_conversion_window_days)) __obj.updateDynamic("$click_conversion_window_days")($click_conversion_window_days.get.asInstanceOf[js.Any])
    if (!js.isUndefined($click_install_window_days)) __obj.updateDynamic("$click_install_window_days")($click_install_window_days.get.asInstanceOf[js.Any])
    if (!js.isUndefined($click_session_start_window_days)) __obj.updateDynamic("$click_session_start_window_days")($click_session_start_window_days.get.asInstanceOf[js.Any])
    if ($content_type != null) __obj.updateDynamic("$content_type")($content_type.asInstanceOf[js.Any])
    if ($custom_meta_tags != null) __obj.updateDynamic("$custom_meta_tags")($custom_meta_tags.asInstanceOf[js.Any])
    if ($custom_sms_text != null) __obj.updateDynamic("$custom_sms_text")($custom_sms_text.asInstanceOf[js.Any])
    if (!js.isUndefined($deeplink_no_attribution)) __obj.updateDynamic("$deeplink_no_attribution")($deeplink_no_attribution.get.asInstanceOf[js.Any])
    if ($deeplink_path != null) __obj.updateDynamic("$deeplink_path")($deeplink_path.asInstanceOf[js.Any])
    if ($desktop_deeplink_path != null) __obj.updateDynamic("$desktop_deeplink_path")($desktop_deeplink_path.asInstanceOf[js.Any])
    if ($desktop_deepview != null) __obj.updateDynamic("$desktop_deepview")($desktop_deepview.asInstanceOf[js.Any])
    if ($desktop_url != null) __obj.updateDynamic("$desktop_url")($desktop_url.asInstanceOf[js.Any])
    if (!js.isUndefined($do_not_process)) __obj.updateDynamic("$do_not_process")($do_not_process.get.asInstanceOf[js.Any])
    if ($fallback_url != null) __obj.updateDynamic("$fallback_url")($fallback_url.asInstanceOf[js.Any])
    if ($fire_url != null) __obj.updateDynamic("$fire_url")($fire_url.asInstanceOf[js.Any])
    if (!js.isUndefined($impression_conversion_window_days)) __obj.updateDynamic("$impression_conversion_window_days")($impression_conversion_window_days.get.asInstanceOf[js.Any])
    if (!js.isUndefined($impression_install_window_days)) __obj.updateDynamic("$impression_install_window_days")($impression_install_window_days.get.asInstanceOf[js.Any])
    if (!js.isUndefined($impression_session_start_window_days)) __obj.updateDynamic("$impression_session_start_window_days")($impression_session_start_window_days.get.asInstanceOf[js.Any])
    if ($ios_deeplink_path != null) __obj.updateDynamic("$ios_deeplink_path")($ios_deeplink_path.asInstanceOf[js.Any])
    if ($ios_deepview != null) __obj.updateDynamic("$ios_deepview")($ios_deepview.asInstanceOf[js.Any])
    if ($ios_passive_deepview != null) __obj.updateDynamic("$ios_passive_deepview")($ios_passive_deepview.asInstanceOf[js.Any])
    if (!js.isUndefined($ios_redirect_timeout)) __obj.updateDynamic("$ios_redirect_timeout")($ios_redirect_timeout.get.asInstanceOf[js.Any])
    if ($ios_url != null) __obj.updateDynamic("$ios_url")($ios_url.asInstanceOf[js.Any])
    if ($ios_wechat_url != null) __obj.updateDynamic("$ios_wechat_url")($ios_wechat_url.asInstanceOf[js.Any])
    if ($ipad_url != null) __obj.updateDynamic("$ipad_url")($ipad_url.asInstanceOf[js.Any])
    if ($marketing_title != null) __obj.updateDynamic("$marketing_title")($marketing_title.asInstanceOf[js.Any])
    if (!js.isUndefined($match_duration)) __obj.updateDynamic("$match_duration")($match_duration.get.asInstanceOf[js.Any])
    if ($og_app_id != null) __obj.updateDynamic("$og_app_id")($og_app_id.asInstanceOf[js.Any])
    if ($og_description != null) __obj.updateDynamic("$og_description")($og_description.asInstanceOf[js.Any])
    if (!js.isUndefined($og_image_height)) __obj.updateDynamic("$og_image_height")($og_image_height.get.asInstanceOf[js.Any])
    if ($og_image_url != null) __obj.updateDynamic("$og_image_url")($og_image_url.asInstanceOf[js.Any])
    if (!js.isUndefined($og_image_width)) __obj.updateDynamic("$og_image_width")($og_image_width.get.asInstanceOf[js.Any])
    if ($og_redirect != null) __obj.updateDynamic("$og_redirect")($og_redirect.asInstanceOf[js.Any])
    if ($og_title != null) __obj.updateDynamic("$og_title")($og_title.asInstanceOf[js.Any])
    if ($og_type != null) __obj.updateDynamic("$og_type")($og_type.asInstanceOf[js.Any])
    if ($og_url != null) __obj.updateDynamic("$og_url")($og_url.asInstanceOf[js.Any])
    if ($og_video != null) __obj.updateDynamic("$og_video")($og_video.asInstanceOf[js.Any])
    if ($samsung_url != null) __obj.updateDynamic("$samsung_url")($samsung_url.asInstanceOf[js.Any])
    if ($twitter_app_country != null) __obj.updateDynamic("$twitter_app_country")($twitter_app_country.asInstanceOf[js.Any])
    if ($twitter_card != null) __obj.updateDynamic("$twitter_card")($twitter_card.asInstanceOf[js.Any])
    if ($twitter_description != null) __obj.updateDynamic("$twitter_description")($twitter_description.asInstanceOf[js.Any])
    if ($twitter_player != null) __obj.updateDynamic("$twitter_player")($twitter_player.asInstanceOf[js.Any])
    if (!js.isUndefined($twitter_player_height)) __obj.updateDynamic("$twitter_player_height")($twitter_player_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined($twitter_player_width)) __obj.updateDynamic("$twitter_player_width")($twitter_player_width.get.asInstanceOf[js.Any])
    if ($twitter_site != null) __obj.updateDynamic("$twitter_site")($twitter_site.asInstanceOf[js.Any])
    if ($twitter_title != null) __obj.updateDynamic("$twitter_title")($twitter_title.asInstanceOf[js.Any])
    if ($uri_redirect_mode != null) __obj.updateDynamic("$uri_redirect_mode")($uri_redirect_mode.asInstanceOf[js.Any])
    if (!js.isUndefined($web_only)) __obj.updateDynamic("$web_only")($web_only.get.asInstanceOf[js.Any])
    if ($windows_phone_url != null) __obj.updateDynamic("$windows_phone_url")($windows_phone_url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (Tildekeyword != null) __obj.updateDynamic("~keyword")(Tildekeyword.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (twitter_image_url != null) __obj.updateDynamic("twitter_image_url")(twitter_image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictcustomkey]
  }
}

