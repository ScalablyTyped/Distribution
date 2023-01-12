package typings.branchSdk

import org.scalablytyped.runtime.StringDictionary
import typings.branchSdk.mod.UriRedirectMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Amount extends StObject {
    
    var amount: Double
    
    var bucket: String
    
    var date: String
    
    var id: String
    
    var `type`: Double
  }
  object Amount {
    
    inline def apply(amount: Double, bucket: String, date: String, id: String, `type`: Double): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictcustomkey
    extends StObject
       with // Custom data
  /* custom_key */ StringDictionary[Any] {
    
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
    
    inline def apply(): Dictcustomkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictcustomkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictcustomkey] (val x: Self) extends AnyVal {
      
      inline def set$after_click_url(value: String): Self = StObject.set(x, "$after_click_url", value.asInstanceOf[js.Any])
      
      inline def set$after_click_urlUndefined: Self = StObject.set(x, "$after_click_url", js.undefined)
      
      inline def set$always_deeplink(value: Boolean): Self = StObject.set(x, "$always_deeplink", value.asInstanceOf[js.Any])
      
      inline def set$always_deeplinkUndefined: Self = StObject.set(x, "$always_deeplink", js.undefined)
      
      inline def set$android_deeplink_path(value: String): Self = StObject.set(x, "$android_deeplink_path", value.asInstanceOf[js.Any])
      
      inline def set$android_deeplink_pathUndefined: Self = StObject.set(x, "$android_deeplink_path", js.undefined)
      
      inline def set$android_deepview(value: String): Self = StObject.set(x, "$android_deepview", value.asInstanceOf[js.Any])
      
      inline def set$android_deepviewUndefined: Self = StObject.set(x, "$android_deepview", js.undefined)
      
      inline def set$android_passive_deepview(value: String): Self = StObject.set(x, "$android_passive_deepview", value.asInstanceOf[js.Any])
      
      inline def set$android_passive_deepviewUndefined: Self = StObject.set(x, "$android_passive_deepview", js.undefined)
      
      inline def set$android_redirect_timeout(value: Double): Self = StObject.set(x, "$android_redirect_timeout", value.asInstanceOf[js.Any])
      
      inline def set$android_redirect_timeoutUndefined: Self = StObject.set(x, "$android_redirect_timeout", js.undefined)
      
      inline def set$android_url(value: String): Self = StObject.set(x, "$android_url", value.asInstanceOf[js.Any])
      
      inline def set$android_urlUndefined: Self = StObject.set(x, "$android_url", js.undefined)
      
      inline def set$android_wechat_url(value: String): Self = StObject.set(x, "$android_wechat_url", value.asInstanceOf[js.Any])
      
      inline def set$android_wechat_urlUndefined: Self = StObject.set(x, "$android_wechat_url", js.undefined)
      
      inline def set$blackberry_url(value: String): Self = StObject.set(x, "$blackberry_url", value.asInstanceOf[js.Any])
      
      inline def set$blackberry_urlUndefined: Self = StObject.set(x, "$blackberry_url", js.undefined)
      
      inline def set$canonical_identifier(value: String): Self = StObject.set(x, "$canonical_identifier", value.asInstanceOf[js.Any])
      
      inline def set$canonical_identifierUndefined: Self = StObject.set(x, "$canonical_identifier", js.undefined)
      
      inline def set$click_conversion_window_days(value: Double): Self = StObject.set(x, "$click_conversion_window_days", value.asInstanceOf[js.Any])
      
      inline def set$click_conversion_window_daysUndefined: Self = StObject.set(x, "$click_conversion_window_days", js.undefined)
      
      inline def set$click_install_window_days(value: Double): Self = StObject.set(x, "$click_install_window_days", value.asInstanceOf[js.Any])
      
      inline def set$click_install_window_daysUndefined: Self = StObject.set(x, "$click_install_window_days", js.undefined)
      
      inline def set$click_session_start_window_days(value: Double): Self = StObject.set(x, "$click_session_start_window_days", value.asInstanceOf[js.Any])
      
      inline def set$click_session_start_window_daysUndefined: Self = StObject.set(x, "$click_session_start_window_days", js.undefined)
      
      inline def set$content_type(value: String): Self = StObject.set(x, "$content_type", value.asInstanceOf[js.Any])
      
      inline def set$content_typeUndefined: Self = StObject.set(x, "$content_type", js.undefined)
      
      inline def set$custom_meta_tags(value: String): Self = StObject.set(x, "$custom_meta_tags", value.asInstanceOf[js.Any])
      
      inline def set$custom_meta_tagsUndefined: Self = StObject.set(x, "$custom_meta_tags", js.undefined)
      
      inline def set$custom_sms_text(value: String): Self = StObject.set(x, "$custom_sms_text", value.asInstanceOf[js.Any])
      
      inline def set$custom_sms_textUndefined: Self = StObject.set(x, "$custom_sms_text", js.undefined)
      
      inline def set$deeplink_no_attribution(value: Boolean): Self = StObject.set(x, "$deeplink_no_attribution", value.asInstanceOf[js.Any])
      
      inline def set$deeplink_no_attributionUndefined: Self = StObject.set(x, "$deeplink_no_attribution", js.undefined)
      
      inline def set$deeplink_path(value: String): Self = StObject.set(x, "$deeplink_path", value.asInstanceOf[js.Any])
      
      inline def set$deeplink_pathUndefined: Self = StObject.set(x, "$deeplink_path", js.undefined)
      
      inline def set$desktop_deeplink_path(value: String): Self = StObject.set(x, "$desktop_deeplink_path", value.asInstanceOf[js.Any])
      
      inline def set$desktop_deeplink_pathUndefined: Self = StObject.set(x, "$desktop_deeplink_path", js.undefined)
      
      inline def set$desktop_deepview(value: String): Self = StObject.set(x, "$desktop_deepview", value.asInstanceOf[js.Any])
      
      inline def set$desktop_deepviewUndefined: Self = StObject.set(x, "$desktop_deepview", js.undefined)
      
      inline def set$desktop_url(value: String): Self = StObject.set(x, "$desktop_url", value.asInstanceOf[js.Any])
      
      inline def set$desktop_urlUndefined: Self = StObject.set(x, "$desktop_url", js.undefined)
      
      inline def set$do_not_process(value: Boolean): Self = StObject.set(x, "$do_not_process", value.asInstanceOf[js.Any])
      
      inline def set$do_not_processUndefined: Self = StObject.set(x, "$do_not_process", js.undefined)
      
      inline def set$fallback_url(value: String): Self = StObject.set(x, "$fallback_url", value.asInstanceOf[js.Any])
      
      inline def set$fallback_urlUndefined: Self = StObject.set(x, "$fallback_url", js.undefined)
      
      inline def set$fire_url(value: String): Self = StObject.set(x, "$fire_url", value.asInstanceOf[js.Any])
      
      inline def set$fire_urlUndefined: Self = StObject.set(x, "$fire_url", js.undefined)
      
      inline def set$impression_conversion_window_days(value: Double): Self = StObject.set(x, "$impression_conversion_window_days", value.asInstanceOf[js.Any])
      
      inline def set$impression_conversion_window_daysUndefined: Self = StObject.set(x, "$impression_conversion_window_days", js.undefined)
      
      inline def set$impression_install_window_days(value: Double): Self = StObject.set(x, "$impression_install_window_days", value.asInstanceOf[js.Any])
      
      inline def set$impression_install_window_daysUndefined: Self = StObject.set(x, "$impression_install_window_days", js.undefined)
      
      inline def set$impression_session_start_window_days(value: Double): Self = StObject.set(x, "$impression_session_start_window_days", value.asInstanceOf[js.Any])
      
      inline def set$impression_session_start_window_daysUndefined: Self = StObject.set(x, "$impression_session_start_window_days", js.undefined)
      
      inline def set$ios_deeplink_path(value: String): Self = StObject.set(x, "$ios_deeplink_path", value.asInstanceOf[js.Any])
      
      inline def set$ios_deeplink_pathUndefined: Self = StObject.set(x, "$ios_deeplink_path", js.undefined)
      
      inline def set$ios_deepview(value: String): Self = StObject.set(x, "$ios_deepview", value.asInstanceOf[js.Any])
      
      inline def set$ios_deepviewUndefined: Self = StObject.set(x, "$ios_deepview", js.undefined)
      
      inline def set$ios_passive_deepview(value: String): Self = StObject.set(x, "$ios_passive_deepview", value.asInstanceOf[js.Any])
      
      inline def set$ios_passive_deepviewUndefined: Self = StObject.set(x, "$ios_passive_deepview", js.undefined)
      
      inline def set$ios_redirect_timeout(value: Double): Self = StObject.set(x, "$ios_redirect_timeout", value.asInstanceOf[js.Any])
      
      inline def set$ios_redirect_timeoutUndefined: Self = StObject.set(x, "$ios_redirect_timeout", js.undefined)
      
      inline def set$ios_url(value: String): Self = StObject.set(x, "$ios_url", value.asInstanceOf[js.Any])
      
      inline def set$ios_urlUndefined: Self = StObject.set(x, "$ios_url", js.undefined)
      
      inline def set$ios_wechat_url(value: String): Self = StObject.set(x, "$ios_wechat_url", value.asInstanceOf[js.Any])
      
      inline def set$ios_wechat_urlUndefined: Self = StObject.set(x, "$ios_wechat_url", js.undefined)
      
      inline def set$ipad_url(value: String): Self = StObject.set(x, "$ipad_url", value.asInstanceOf[js.Any])
      
      inline def set$ipad_urlUndefined: Self = StObject.set(x, "$ipad_url", js.undefined)
      
      inline def set$marketing_title(value: String): Self = StObject.set(x, "$marketing_title", value.asInstanceOf[js.Any])
      
      inline def set$marketing_titleUndefined: Self = StObject.set(x, "$marketing_title", js.undefined)
      
      inline def set$match_duration(value: Double): Self = StObject.set(x, "$match_duration", value.asInstanceOf[js.Any])
      
      inline def set$match_durationUndefined: Self = StObject.set(x, "$match_duration", js.undefined)
      
      inline def set$og_app_id(value: String): Self = StObject.set(x, "$og_app_id", value.asInstanceOf[js.Any])
      
      inline def set$og_app_idUndefined: Self = StObject.set(x, "$og_app_id", js.undefined)
      
      inline def set$og_description(value: String): Self = StObject.set(x, "$og_description", value.asInstanceOf[js.Any])
      
      inline def set$og_descriptionUndefined: Self = StObject.set(x, "$og_description", js.undefined)
      
      inline def set$og_image_height(value: Double): Self = StObject.set(x, "$og_image_height", value.asInstanceOf[js.Any])
      
      inline def set$og_image_heightUndefined: Self = StObject.set(x, "$og_image_height", js.undefined)
      
      inline def set$og_image_url(value: String): Self = StObject.set(x, "$og_image_url", value.asInstanceOf[js.Any])
      
      inline def set$og_image_urlUndefined: Self = StObject.set(x, "$og_image_url", js.undefined)
      
      inline def set$og_image_width(value: Double): Self = StObject.set(x, "$og_image_width", value.asInstanceOf[js.Any])
      
      inline def set$og_image_widthUndefined: Self = StObject.set(x, "$og_image_width", js.undefined)
      
      inline def set$og_redirect(value: String): Self = StObject.set(x, "$og_redirect", value.asInstanceOf[js.Any])
      
      inline def set$og_redirectUndefined: Self = StObject.set(x, "$og_redirect", js.undefined)
      
      inline def set$og_title(value: String): Self = StObject.set(x, "$og_title", value.asInstanceOf[js.Any])
      
      inline def set$og_titleUndefined: Self = StObject.set(x, "$og_title", js.undefined)
      
      inline def set$og_type(value: String): Self = StObject.set(x, "$og_type", value.asInstanceOf[js.Any])
      
      inline def set$og_typeUndefined: Self = StObject.set(x, "$og_type", js.undefined)
      
      inline def set$og_url(value: String): Self = StObject.set(x, "$og_url", value.asInstanceOf[js.Any])
      
      inline def set$og_urlUndefined: Self = StObject.set(x, "$og_url", js.undefined)
      
      inline def set$og_video(value: String): Self = StObject.set(x, "$og_video", value.asInstanceOf[js.Any])
      
      inline def set$og_videoUndefined: Self = StObject.set(x, "$og_video", js.undefined)
      
      inline def set$samsung_url(value: String): Self = StObject.set(x, "$samsung_url", value.asInstanceOf[js.Any])
      
      inline def set$samsung_urlUndefined: Self = StObject.set(x, "$samsung_url", js.undefined)
      
      inline def set$twitter_app_country(value: String): Self = StObject.set(x, "$twitter_app_country", value.asInstanceOf[js.Any])
      
      inline def set$twitter_app_countryUndefined: Self = StObject.set(x, "$twitter_app_country", js.undefined)
      
      inline def set$twitter_card(value: String): Self = StObject.set(x, "$twitter_card", value.asInstanceOf[js.Any])
      
      inline def set$twitter_cardUndefined: Self = StObject.set(x, "$twitter_card", js.undefined)
      
      inline def set$twitter_description(value: String): Self = StObject.set(x, "$twitter_description", value.asInstanceOf[js.Any])
      
      inline def set$twitter_descriptionUndefined: Self = StObject.set(x, "$twitter_description", js.undefined)
      
      inline def set$twitter_player(value: String): Self = StObject.set(x, "$twitter_player", value.asInstanceOf[js.Any])
      
      inline def set$twitter_playerUndefined: Self = StObject.set(x, "$twitter_player", js.undefined)
      
      inline def set$twitter_player_height(value: Double): Self = StObject.set(x, "$twitter_player_height", value.asInstanceOf[js.Any])
      
      inline def set$twitter_player_heightUndefined: Self = StObject.set(x, "$twitter_player_height", js.undefined)
      
      inline def set$twitter_player_width(value: Double): Self = StObject.set(x, "$twitter_player_width", value.asInstanceOf[js.Any])
      
      inline def set$twitter_player_widthUndefined: Self = StObject.set(x, "$twitter_player_width", js.undefined)
      
      inline def set$twitter_site(value: String): Self = StObject.set(x, "$twitter_site", value.asInstanceOf[js.Any])
      
      inline def set$twitter_siteUndefined: Self = StObject.set(x, "$twitter_site", js.undefined)
      
      inline def set$twitter_title(value: String): Self = StObject.set(x, "$twitter_title", value.asInstanceOf[js.Any])
      
      inline def set$twitter_titleUndefined: Self = StObject.set(x, "$twitter_title", js.undefined)
      
      inline def set$uri_redirect_mode(value: UriRedirectMode): Self = StObject.set(x, "$uri_redirect_mode", value.asInstanceOf[js.Any])
      
      inline def set$uri_redirect_modeUndefined: Self = StObject.set(x, "$uri_redirect_mode", js.undefined)
      
      inline def set$web_only(value: Boolean): Self = StObject.set(x, "$web_only", value.asInstanceOf[js.Any])
      
      inline def set$web_onlyUndefined: Self = StObject.set(x, "$web_only", js.undefined)
      
      inline def set$windows_phone_url(value: String): Self = StObject.set(x, "$windows_phone_url", value.asInstanceOf[js.Any])
      
      inline def set$windows_phone_urlUndefined: Self = StObject.set(x, "$windows_phone_url", js.undefined)
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setTildekeyword(value: js.Array[String]): Self = StObject.set(x, "~keyword", value.asInstanceOf[js.Any])
      
      inline def setTildekeywordUndefined: Self = StObject.set(x, "~keyword", js.undefined)
      
      inline def setTildekeywordVarargs(value: String*): Self = StObject.set(x, "~keyword", js.Array(value*))
      
      inline def setTwitter_image_url(value: String): Self = StObject.set(x, "twitter_image_url", value.asInstanceOf[js.Any])
      
      inline def setTwitter_image_urlUndefined: Self = StObject.set(x, "twitter_image_url", js.undefined)
    }
  }
  
  trait Makenewlink extends StObject {
    
    var make_new_link: js.UndefOr[Boolean] = js.undefined
  }
  object Makenewlink {
    
    inline def apply(): Makenewlink = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Makenewlink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Makenewlink] (val x: Self) extends AnyVal {
      
      inline def setMake_new_link(value: Boolean): Self = StObject.set(x, "make_new_link", value.asInstanceOf[js.Any])
      
      inline def setMake_new_linkUndefined: Self = StObject.set(x, "make_new_link", js.undefined)
    }
  }
}
