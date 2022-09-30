package typings.browserUpdate

import typings.browserUpdate.anon.RequiredBrowserseastringn
import typings.browserUpdate.browserUpdateBooleans.`false`
import typings.browserUpdate.browserUpdateBooleans.`true`
import typings.browserUpdate.browserUpdateStrings.TV
import typings.browserUpdate.browserUpdateStrings.`below required`
import typings.browserUpdate.browserUpdateStrings.`do not notify mobile`
import typings.browserUpdate.browserUpdateStrings.`is latest version of the browser`
import typings.browserUpdate.browserUpdateStrings.`mobile without upgrade path or landing page`
import typings.browserUpdate.browserUpdateStrings.`niche browser`
import typings.browserUpdate.browserUpdateStrings.`no device update`
import typings.browserUpdate.browserUpdateStrings.`no vendor support`
import typings.browserUpdate.browserUpdateStrings.bot
import typings.browserUpdate.browserUpdateStrings.bottom
import typings.browserUpdate.browserUpdateStrings.c
import typings.browserUpdate.browserUpdateStrings.corner
import typings.browserUpdate.browserUpdateStrings.e
import typings.browserUpdate.browserUpdateStrings.f
import typings.browserUpdate.browserUpdateStrings.i
import typings.browserUpdate.browserUpdateStrings.insecure
import typings.browserUpdate.browserUpdateStrings.ios
import typings.browserUpdate.browserUpdateStrings.o
import typings.browserUpdate.browserUpdateStrings.s
import typings.browserUpdate.browserUpdateStrings.top
import typings.std.HTMLDivElement
import typings.std.Node
import typings.std.Omit
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Unit, test: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(options: Options, test: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("browser-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {[ K in browser-update.browser-update.DetectedBrowsers as / * template literal string: text_for_${K} * / string ]:? browser-update.browser-update.TextConfig | string | undefined} */
  trait BrowserWithLanguageTextOptions extends StObject {
    
    var c: js.UndefOr[TextConfig | String] = js.undefined
    
    var e: js.UndefOr[TextConfig | String] = js.undefined
    
    var e_a: js.UndefOr[TextConfig | String] = js.undefined
    
    var f: js.UndefOr[TextConfig | String] = js.undefined
    
    var i: js.UndefOr[TextConfig | String] = js.undefined
    
    var io: js.UndefOr[TextConfig | String] = js.undefined
    
    var ios: js.UndefOr[TextConfig | String] = js.undefined
    
    var o: js.UndefOr[TextConfig | String] = js.undefined
    
    var o_a: js.UndefOr[TextConfig | String] = js.undefined
    
    var s: js.UndefOr[TextConfig | String] = js.undefined
    
    var samsung: js.UndefOr[TextConfig | String] = js.undefined
    
    var silk: js.UndefOr[TextConfig | String] = js.undefined
    
    var so: js.UndefOr[TextConfig | String] = js.undefined
    
    var uc: js.UndefOr[TextConfig | String] = js.undefined
    
    var v: js.UndefOr[TextConfig | String] = js.undefined
    
    var x: js.UndefOr[TextConfig | String] = js.undefined
    
    var y: js.UndefOr[TextConfig | String] = js.undefined
  }
  object BrowserWithLanguageTextOptions {
    
    inline def apply(): BrowserWithLanguageTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserWithLanguageTextOptions]
    }
    
    extension [Self <: BrowserWithLanguageTextOptions](x: Self) {
      
      inline def setC(value: TextConfig | String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setE(value: TextConfig | String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setE_a(value: TextConfig | String): Self = StObject.set(x, "e_a", value.asInstanceOf[js.Any])
      
      inline def setE_aUndefined: Self = StObject.set(x, "e_a", js.undefined)
      
      inline def setF(value: TextConfig | String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setI(value: TextConfig | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIo(value: TextConfig | String): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setIos(value: TextConfig | String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setO(value: TextConfig | String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setO_a(value: TextConfig | String): Self = StObject.set(x, "o_a", value.asInstanceOf[js.Any])
      
      inline def setO_aUndefined: Self = StObject.set(x, "o_a", js.undefined)
      
      inline def setS(value: TextConfig | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSamsung(value: TextConfig | String): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
      
      inline def setSilk(value: TextConfig | String): Self = StObject.set(x, "silk", value.asInstanceOf[js.Any])
      
      inline def setSilkUndefined: Self = StObject.set(x, "silk", js.undefined)
      
      inline def setSo(value: TextConfig | String): Self = StObject.set(x, "so", value.asInstanceOf[js.Any])
      
      inline def setSoUndefined: Self = StObject.set(x, "so", js.undefined)
      
      inline def setUc(value: TextConfig | String): Self = StObject.set(x, "uc", value.asInstanceOf[js.Any])
      
      inline def setUcUndefined: Self = StObject.set(x, "uc", js.undefined)
      
      inline def setV(value: TextConfig | String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setX(value: TextConfig | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: TextConfig | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait DetectedBrowser extends StObject {
    
    var age_years: js.UndefOr[Double] = js.undefined
    
    var available: RequiredBrowserseastringn
    
    var discontinued: Boolean
    
    var embedded: Boolean
    
    var engine: js.UndefOr[ios | i | c | e | f | s | o] = js.undefined
    
    var engine_version: js.UndefOr[Double] = js.undefined
    
    var esr: js.UndefOr[`true`] = js.undefined
    
    var fullv: String
    
    var is_insecure: js.UndefOr[Boolean] = js.undefined
    
    var is_latest: js.UndefOr[Boolean] = js.undefined
    
    var is_supported: js.UndefOr[Boolean] = js.undefined
    
    var mobile: Boolean
    
    var n: DetectedBrowsers
    
    var no_device_update: Boolean
    
    var other: bot | TV | (`niche browser`) | (`mobile without upgrade path or landing page`) | `false`
    
    var t: String
    
    var v: Double
    
    var vmaj: Double
  }
  object DetectedBrowser {
    
    inline def apply(
      available: RequiredBrowserseastringn,
      discontinued: Boolean,
      embedded: Boolean,
      fullv: String,
      mobile: Boolean,
      n: DetectedBrowsers,
      no_device_update: Boolean,
      other: bot | TV | (`niche browser`) | (`mobile without upgrade path or landing page`) | `false`,
      t: String,
      v: Double,
      vmaj: Double
    ): DetectedBrowser = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discontinued = discontinued.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], fullv = fullv.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], no_device_update = no_device_update.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], vmaj = vmaj.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedBrowser]
    }
    
    extension [Self <: DetectedBrowser](x: Self) {
      
      inline def setAge_years(value: Double): Self = StObject.set(x, "age_years", value.asInstanceOf[js.Any])
      
      inline def setAge_yearsUndefined: Self = StObject.set(x, "age_years", js.undefined)
      
      inline def setAvailable(value: RequiredBrowserseastringn): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setDiscontinued(value: Boolean): Self = StObject.set(x, "discontinued", value.asInstanceOf[js.Any])
      
      inline def setEmbedded(value: Boolean): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: ios | i | c | e | f | s | o): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngine_version(value: Double): Self = StObject.set(x, "engine_version", value.asInstanceOf[js.Any])
      
      inline def setEngine_versionUndefined: Self = StObject.set(x, "engine_version", js.undefined)
      
      inline def setEsr(value: `true`): Self = StObject.set(x, "esr", value.asInstanceOf[js.Any])
      
      inline def setEsrUndefined: Self = StObject.set(x, "esr", js.undefined)
      
      inline def setFullv(value: String): Self = StObject.set(x, "fullv", value.asInstanceOf[js.Any])
      
      inline def setIs_insecure(value: Boolean): Self = StObject.set(x, "is_insecure", value.asInstanceOf[js.Any])
      
      inline def setIs_insecureUndefined: Self = StObject.set(x, "is_insecure", js.undefined)
      
      inline def setIs_latest(value: Boolean): Self = StObject.set(x, "is_latest", value.asInstanceOf[js.Any])
      
      inline def setIs_latestUndefined: Self = StObject.set(x, "is_latest", js.undefined)
      
      inline def setIs_supported(value: Boolean): Self = StObject.set(x, "is_supported", value.asInstanceOf[js.Any])
      
      inline def setIs_supportedUndefined: Self = StObject.set(x, "is_supported", js.undefined)
      
      inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setN(value: DetectedBrowsers): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNo_device_update(value: Boolean): Self = StObject.set(x, "no_device_update", value.asInstanceOf[js.Any])
      
      inline def setOther(value: bot | TV | (`niche browser`) | (`mobile without upgrade path or landing page`) | `false`): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVmaj(value: Double): Self = StObject.set(x, "vmaj", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.browserUpdate.browserUpdateStrings.c
    - typings.browserUpdate.browserUpdateStrings.f
    - typings.browserUpdate.browserUpdateStrings.io
    - typings.browserUpdate.browserUpdateStrings.uc
    - typings.browserUpdate.browserUpdateStrings.i
    - typings.browserUpdate.browserUpdateStrings.e
    - typings.browserUpdate.browserUpdateStrings.e_a
    - typings.browserUpdate.browserUpdateStrings.v
    - typings.browserUpdate.browserUpdateStrings.o
    - typings.browserUpdate.browserUpdateStrings.o_a
    - typings.browserUpdate.browserUpdateStrings.y
    - typings.browserUpdate.browserUpdateStrings.samsung
    - typings.browserUpdate.browserUpdateStrings.silk
    - typings.browserUpdate.browserUpdateStrings.ios
    - typings.browserUpdate.browserUpdateStrings.s
    - typings.browserUpdate.browserUpdateStrings.so
    - typings.browserUpdate.browserUpdateStrings.x
  */
  trait DetectedBrowsers extends StObject
  object DetectedBrowsers {
    
    inline def c: typings.browserUpdate.browserUpdateStrings.c = "c".asInstanceOf[typings.browserUpdate.browserUpdateStrings.c]
    
    inline def e: typings.browserUpdate.browserUpdateStrings.e = "e".asInstanceOf[typings.browserUpdate.browserUpdateStrings.e]
    
    inline def e_a: typings.browserUpdate.browserUpdateStrings.e_a = "e_a".asInstanceOf[typings.browserUpdate.browserUpdateStrings.e_a]
    
    inline def f: typings.browserUpdate.browserUpdateStrings.f = "f".asInstanceOf[typings.browserUpdate.browserUpdateStrings.f]
    
    inline def i: typings.browserUpdate.browserUpdateStrings.i = "i".asInstanceOf[typings.browserUpdate.browserUpdateStrings.i]
    
    inline def io: typings.browserUpdate.browserUpdateStrings.io = "io".asInstanceOf[typings.browserUpdate.browserUpdateStrings.io]
    
    inline def ios: typings.browserUpdate.browserUpdateStrings.ios = "ios".asInstanceOf[typings.browserUpdate.browserUpdateStrings.ios]
    
    inline def o: typings.browserUpdate.browserUpdateStrings.o = "o".asInstanceOf[typings.browserUpdate.browserUpdateStrings.o]
    
    inline def o_a: typings.browserUpdate.browserUpdateStrings.o_a = "o_a".asInstanceOf[typings.browserUpdate.browserUpdateStrings.o_a]
    
    inline def s: typings.browserUpdate.browserUpdateStrings.s = "s".asInstanceOf[typings.browserUpdate.browserUpdateStrings.s]
    
    inline def samsung: typings.browserUpdate.browserUpdateStrings.samsung = "samsung".asInstanceOf[typings.browserUpdate.browserUpdateStrings.samsung]
    
    inline def silk: typings.browserUpdate.browserUpdateStrings.silk = "silk".asInstanceOf[typings.browserUpdate.browserUpdateStrings.silk]
    
    inline def so: typings.browserUpdate.browserUpdateStrings.so = "so".asInstanceOf[typings.browserUpdate.browserUpdateStrings.so]
    
    inline def uc: typings.browserUpdate.browserUpdateStrings.uc = "uc".asInstanceOf[typings.browserUpdate.browserUpdateStrings.uc]
    
    inline def v: typings.browserUpdate.browserUpdateStrings.v = "v".asInstanceOf[typings.browserUpdate.browserUpdateStrings.v]
    
    inline def x: typings.browserUpdate.browserUpdateStrings.x = "x".asInstanceOf[typings.browserUpdate.browserUpdateStrings.x]
    
    inline def y: typings.browserUpdate.browserUpdateStrings.y = "y".asInstanceOf[typings.browserUpdate.browserUpdateStrings.y]
  }
  
  /* Inlined {  required :browser-update.browser-update.RequiredBrowsers | undefined,   insecure :boolean | undefined,   unsupported :boolean | undefined,   notify_esr :boolean | undefined,   mobile :boolean | undefined,   reminder :number | undefined,   reminderClosed :number | undefined,   text :browser-update.browser-update.TextConfig | string | undefined,   l :string | false | undefined,   test :boolean | undefined,   dont_show_debuginfo :boolean | undefined,   newwindow :boolean | undefined,   url :string | undefined,   url_permanent_hide :string | undefined,   noclose :boolean | undefined,   nomessage :boolean | undefined,   no_permanent_hide :boolean | undefined,   jsshowurl :string | undefined,   domain :string | undefined,   pageurl :string | undefined,   container :std.Node | undefined,   api :number | undefined,   onshow :(options : browser-update.browser-update.ParsedOptions): void | undefined,   onclick :(options : browser-update.browser-update.ParsedOptions): void | undefined,   onclose :(options : browser-update.browser-update.ParsedOptions): void | undefined,   ignorecookie :boolean | undefined,   override_ua :string | undefined,   style :'top' | 'bottom' | 'corner' | undefined,   shift_page_down :boolean | undefined} & browser-update.browser-update.BrowserWithLanguageTextOptions */
  trait Options extends StObject {
    
    /**
      * This is the version of the browser-update api to use.
      */
    var api: js.UndefOr[Double] = js.undefined
    
    var c: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * DOM Element where the notification will be injected.
      *
      * @default document.body
      */
    var container: js.UndefOr[Node] = js.undefined
    
    /**
      * Domain part of the URL where the script, that shows the notification, is located.
      * For example, if `domain` is set to `"https://browser-update.org"`, then the URL
      * to load the script will be: `"https://browser-update.org/update.show.min.js"`.
      *
      * This setting is ignored when `jsshowurl` is set.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `true` to hide debug info when `test` is set to `true`.
      *
      * @default false
      */
    var dont_show_debuginfo: js.UndefOr[Boolean] = js.undefined
    
    var e: js.UndefOr[TextConfig | String] = js.undefined
    
    var e_a: js.UndefOr[TextConfig | String] = js.undefined
    
    var f: js.UndefOr[TextConfig | String] = js.undefined
    
    var i: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * Ignore cookie value when determining whether notification was already shown.
      */
    var ignorecookie: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this option means that all browser that are severely insecure get notified.
      * "Severely insecure" means that the browser has security issues that allow remote code execution
      * and similar stuff, and that they are being actively exploited on the internet.
      *
      * @default false
      */
    var insecure: js.UndefOr[Boolean] = js.undefined
    
    var io: js.UndefOr[TextConfig | String] = js.undefined
    
    var ios: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * URL where the script, that shows the notification, is located. This is only loaded if the user
      * actually has an outdated browser.
      *
      * @default '//browser-update.org/update.show.min.js'
      */
    var jsshowurl: js.UndefOr[String] = js.undefined
    
    /**
      * Set a fixed language for the message, e.g. "en". This overrides the default detection.
      */
    var l: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Show notification on mobile platforms.
      *
      * @default true
      */
    var mobile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Open link in new window/tab.
      *
      * @default true
      */
    var newwindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not give the user the option to permanently hide the notification.
      *
      * @default false
      */
    var no_permanent_hide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not show the "ignore" button to close the notification.
      *
      * @default false
      */
    var noclose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not show a message if the browser is out of date, just call the `onshow` callback function.
      *
      * @default false
      */
    var nomessage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Also notify [Firefox ESR](https://www.mozilla.org/firefox/enterprise/) (Extended Support releases)
      * versions if they are below requirement - although they are still supported. They are supported by
      * Mozilla for about a year after their initial release.
      *
      * @default false
      */
    var notify_esr: js.UndefOr[Boolean] = js.undefined
    
    var o: js.UndefOr[TextConfig | String] = js.undefined
    
    var o_a: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * Callback called after notification was clicked.
      */
    var onclick: js.UndefOr[js.Function1[/* options */ ParsedOptions, Unit]] = js.undefined
    
    /**
      * Callback called after notification was closed.
      */
    var onclose: js.UndefOr[js.Function1[/* options */ ParsedOptions, Unit]] = js.undefined
    
    /**
      * Callback called after notification has appeared.
      */
    var onshow: js.UndefOr[js.Function1[/* options */ ParsedOptions, Unit]] = js.undefined
    
    /**
      * User agent string to use instead of `navigator.userAgent`.
      */
    var override_ua: js.UndefOr[String] = js.undefined
    
    /**
      * @default location.hostname
      */
    var pageurl: js.UndefOr[String] = js.undefined
    
    /**
      * After how many hours should the message reappear. Use `0` to show message all the time.
      *
      * @default 24*7
      */
    var reminder: js.UndefOr[Double] = js.undefined
    
    /**
      * If the user explicitly closes message it reappears after `reminderClosed` hours.
      *
      * @default 24*7
      */
    var reminderClosed: js.UndefOr[Double] = js.undefined
    
    /**
      * By passing `required` option you can specify the versions to notify.
      *
      * - Specifying a version number for a browser means that this is the required version on the site
      * and all versions before the specified one will be notified.
      * - Negative numbers specify how many versions behind the latest version are required.
      * - 0 means the latest version is needed.
      * - You can omit the configuration and it will fall back to a default.
      * - Version history comparison uses "semantic version" comparison: e.g. "2.10">"2.1"
      *
      * @example
      * import browserUpdate = require('browser-update');
      *
      * browserUpdate({
      *     required:{
      *         f:58,
      *         s:-1,
      *         c:"67.0.3396.12",
      *     }
      * });
      *
      * // Firefox (`f`) 58 is required on the site and all versions before 58 (<58) will be notified.
      * // s:-1 means Safari version 10.1 is needed if latest version ist 11.1.
      * // To use build versions use a version in a string: c: "67.0.3396.12".
      */
    var required: js.UndefOr[RequiredBrowsers] = js.undefined
    
    var s: js.UndefOr[TextConfig | String] = js.undefined
    
    var samsung: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * Shift down the page in order not to obscure content behind the notification bar.
      * Adds `margin-top` to the `<body>` tag.
      *
      * @default true
      */
    var shift_page_down: js.UndefOr[Boolean] = js.undefined
    
    var silk: js.UndefOr[TextConfig | String] = js.undefined
    
    var so: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * The position where the notification should be shown.
      *
      * @default 'top'
      */
    var style: js.UndefOr[top | bottom | corner] = js.undefined
    
    /**
      * Set to `true` to always show the bar (for testing).
      *
      * @default false
      */
    var test: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can use a custom text message (html) by specifying the parts of the message that get presented to users.
      *
      * Placeholders:
      *  - `{brow_name}` will be replaced with the browser name
      *  - `{up_but}` will be replaced with attributes of the update link
      *  - `{ignore_but}` will be replaced with attributes for the ignore link
      *
      * @example
      * import browserUpdate = require('browser-update');
      *
      * browserUpdate({
      *     text: "Your browser, {brow_name}, is too old: <a{up_but}>update</a> or <a{ignore_but}>ignore</a>."
      * });
      *
      * @example
      * import browserUpdate = require('browser-update');
      *
      * browserUpdate({
      *     text: {
      *         msg: 'Your web browser ({brow_name}) is out of date.',
      *         msgmore: 'Update your browser for more security, speed and the best experience on this site.',
      *         bupdate: 'Update browser',
      *         bignore: 'Ignore',
      *         remind: 'You will be reminded in {days} days.',
      *         bnever: 'Never show again',
      *     }
      * });
      */
    var text: js.UndefOr[TextConfig | String] = js.undefined
    
    var uc: js.UndefOr[TextConfig | String] = js.undefined
    
    /**
      * Setting this option means that additionally to the browsers you set, also all browser versions
      * that are not supplied with updates by the vendor any more get notified. Usually this is all but
      * the latest version of the browser. Exceptions are Internet Explorer 11 and Firefox Long term support
      * releases, which are still supported but are not the latest version.
      *
      * @default false
      */
    var unsupported: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL to go to after clicking the notification.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * The URL to go to after clicking the "hide permanently" option.
      */
    var url_permanent_hide: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[TextConfig | String] = js.undefined
    
    var x: js.UndefOr[TextConfig | String] = js.undefined
    
    var y: js.UndefOr[TextConfig | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApi(value: Double): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setC(value: TextConfig | String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setContainer(value: Node): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDont_show_debuginfo(value: Boolean): Self = StObject.set(x, "dont_show_debuginfo", value.asInstanceOf[js.Any])
      
      inline def setDont_show_debuginfoUndefined: Self = StObject.set(x, "dont_show_debuginfo", js.undefined)
      
      inline def setE(value: TextConfig | String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setE_a(value: TextConfig | String): Self = StObject.set(x, "e_a", value.asInstanceOf[js.Any])
      
      inline def setE_aUndefined: Self = StObject.set(x, "e_a", js.undefined)
      
      inline def setF(value: TextConfig | String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setI(value: TextConfig | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIgnorecookie(value: Boolean): Self = StObject.set(x, "ignorecookie", value.asInstanceOf[js.Any])
      
      inline def setIgnorecookieUndefined: Self = StObject.set(x, "ignorecookie", js.undefined)
      
      inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      inline def setIo(value: TextConfig | String): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setIos(value: TextConfig | String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setJsshowurl(value: String): Self = StObject.set(x, "jsshowurl", value.asInstanceOf[js.Any])
      
      inline def setJsshowurlUndefined: Self = StObject.set(x, "jsshowurl", js.undefined)
      
      inline def setL(value: String | `false`): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setNewwindow(value: Boolean): Self = StObject.set(x, "newwindow", value.asInstanceOf[js.Any])
      
      inline def setNewwindowUndefined: Self = StObject.set(x, "newwindow", js.undefined)
      
      inline def setNo_permanent_hide(value: Boolean): Self = StObject.set(x, "no_permanent_hide", value.asInstanceOf[js.Any])
      
      inline def setNo_permanent_hideUndefined: Self = StObject.set(x, "no_permanent_hide", js.undefined)
      
      inline def setNoclose(value: Boolean): Self = StObject.set(x, "noclose", value.asInstanceOf[js.Any])
      
      inline def setNocloseUndefined: Self = StObject.set(x, "noclose", js.undefined)
      
      inline def setNomessage(value: Boolean): Self = StObject.set(x, "nomessage", value.asInstanceOf[js.Any])
      
      inline def setNomessageUndefined: Self = StObject.set(x, "nomessage", js.undefined)
      
      inline def setNotify_esr(value: Boolean): Self = StObject.set(x, "notify_esr", value.asInstanceOf[js.Any])
      
      inline def setNotify_esrUndefined: Self = StObject.set(x, "notify_esr", js.undefined)
      
      inline def setO(value: TextConfig | String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setO_a(value: TextConfig | String): Self = StObject.set(x, "o_a", value.asInstanceOf[js.Any])
      
      inline def setO_aUndefined: Self = StObject.set(x, "o_a", js.undefined)
      
      inline def setOnclick(value: /* options */ ParsedOptions => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOnclose(value: /* options */ ParsedOptions => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOnshow(value: /* options */ ParsedOptions => Unit): Self = StObject.set(x, "onshow", js.Any.fromFunction1(value))
      
      inline def setOnshowUndefined: Self = StObject.set(x, "onshow", js.undefined)
      
      inline def setOverride_ua(value: String): Self = StObject.set(x, "override_ua", value.asInstanceOf[js.Any])
      
      inline def setOverride_uaUndefined: Self = StObject.set(x, "override_ua", js.undefined)
      
      inline def setPageurl(value: String): Self = StObject.set(x, "pageurl", value.asInstanceOf[js.Any])
      
      inline def setPageurlUndefined: Self = StObject.set(x, "pageurl", js.undefined)
      
      inline def setReminder(value: Double): Self = StObject.set(x, "reminder", value.asInstanceOf[js.Any])
      
      inline def setReminderClosed(value: Double): Self = StObject.set(x, "reminderClosed", value.asInstanceOf[js.Any])
      
      inline def setReminderClosedUndefined: Self = StObject.set(x, "reminderClosed", js.undefined)
      
      inline def setReminderUndefined: Self = StObject.set(x, "reminder", js.undefined)
      
      inline def setRequired(value: RequiredBrowsers): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setS(value: TextConfig | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSamsung(value: TextConfig | String): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
      
      inline def setShift_page_down(value: Boolean): Self = StObject.set(x, "shift_page_down", value.asInstanceOf[js.Any])
      
      inline def setShift_page_downUndefined: Self = StObject.set(x, "shift_page_down", js.undefined)
      
      inline def setSilk(value: TextConfig | String): Self = StObject.set(x, "silk", value.asInstanceOf[js.Any])
      
      inline def setSilkUndefined: Self = StObject.set(x, "silk", js.undefined)
      
      inline def setSo(value: TextConfig | String): Self = StObject.set(x, "so", value.asInstanceOf[js.Any])
      
      inline def setSoUndefined: Self = StObject.set(x, "so", js.undefined)
      
      inline def setStyle(value: top | bottom | corner): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setText(value: TextConfig | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUc(value: TextConfig | String): Self = StObject.set(x, "uc", value.asInstanceOf[js.Any])
      
      inline def setUcUndefined: Self = StObject.set(x, "uc", js.undefined)
      
      inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedUndefined: Self = StObject.set(x, "unsupported", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrl_permanent_hide(value: String): Self = StObject.set(x, "url_permanent_hide", value.asInstanceOf[js.Any])
      
      inline def setUrl_permanent_hideUndefined: Self = StObject.set(x, "url_permanent_hide", js.undefined)
      
      inline def setV(value: TextConfig | String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setX(value: TextConfig | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: TextConfig | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined parent browser-update.browser-update.WithRequiredProperties<browser-update.browser-update.Options, 'domain' | 'required' | 'reminder' | 'reminderClosed' | 'onshow' | 'onclick' | 'onclose' | 'pageurl' | 'newwindow' | 'test' | 'ignorecookie'> */
  trait ParsedOptions extends StObject {
    
    var addmargin: js.UndefOr[Boolean] = js.undefined
    
    var already_shown: Boolean
    
    var api: js.UndefOr[Double] = js.undefined
    
    var apiver: Double
    
    var bodymt: js.UndefOr[String] = js.undefined
    
    var c: js.UndefOr[TextConfig | String] = js.undefined
    
    var container: js.UndefOr[Node] = js.undefined
    
    var div: js.UndefOr[HTMLDivElement] = js.undefined
    
    var domain: String
    
    var dont_show_debuginfo: js.UndefOr[Boolean] = js.undefined
    
    var e: js.UndefOr[TextConfig | String] = js.undefined
    
    var e_a: js.UndefOr[TextConfig | String] = js.undefined
    
    var f: js.UndefOr[TextConfig | String] = js.undefined
    
    var hide_reasons: js.Array[
        (/* template literal string: is other browser:${string} */ String) | (`do not notify mobile`) | (`is latest version of the browser`) | (`no device update`)
      ]
    
    var i: js.UndefOr[TextConfig | String] = js.undefined
    
    var ignorecookie: Boolean
    
    var insecure: js.UndefOr[Boolean] = js.undefined
    
    var io: js.UndefOr[TextConfig | String] = js.undefined
    
    var ios: js.UndefOr[TextConfig | String] = js.undefined
    
    var is_below_required: Boolean
    
    var jsshowurl: js.UndefOr[String] = js.undefined
    
    var jsv: String
    
    var l: js.UndefOr[String | `false`] = js.undefined
    
    var ll: String
    
    var llfull: String
    
    var mobile: js.UndefOr[Boolean] = js.undefined
    
    var newwindow: Boolean
    
    var no_permanent_hide: js.UndefOr[Boolean] = js.undefined
    
    var noclose: js.UndefOr[Boolean] = js.undefined
    
    var nomessage: js.UndefOr[Boolean] = js.undefined
    
    var notified: Boolean
    
    var notify_esr: js.UndefOr[Boolean] = js.undefined
    
    var o: js.UndefOr[TextConfig | String] = js.undefined
    
    var o_a: js.UndefOr[TextConfig | String] = js.undefined
    
    def onclick(options: this.type): Unit
    @JSName("onclick")
    var onclick_Original: js.Function1[/* options */ this.type, Unit]
    
    def onclose(options: this.type): Unit
    @JSName("onclose")
    var onclose_Original: js.Function1[/* options */ this.type, Unit]
    
    def onshow(options: this.type): Unit
    @JSName("onshow")
    var onshow_Original: js.Function1[/* options */ this.type, Unit]
    
    var override_ua: js.UndefOr[String] = js.undefined
    
    var pageurl: String
    
    var reasons: js.Array[(`below required`) | insecure | (`no vendor support`)]
    
    var reminder: Double
    
    var reminderClosed: Double
    
    var required: RequiredBrowsers
    
    var s: js.UndefOr[TextConfig | String] = js.undefined
    
    var samsung: js.UndefOr[TextConfig | String] = js.undefined
    
    def setCookie(hours: Double): Unit
    
    var shift_page_down: js.UndefOr[Boolean] = js.undefined
    
    var silk: js.UndefOr[TextConfig | String] = js.undefined
    
    var so: js.UndefOr[TextConfig | String] = js.undefined
    
    var style: js.UndefOr[top | bottom | corner] = js.undefined
    
    var test: Boolean
    
    var text: js.UndefOr[TextConfig | String] = js.undefined
    
    var uc: js.UndefOr[TextConfig | String] = js.undefined
    
    var unsupported: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var url_permanent_hide: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[TextConfig | String] = js.undefined
    
    var x: js.UndefOr[TextConfig | String] = js.undefined
    
    var y: js.UndefOr[TextConfig | String] = js.undefined
  }
  object ParsedOptions {
    
    inline def apply(
      already_shown: Boolean,
      apiver: Double,
      domain: String,
      hide_reasons: js.Array[
          (/* template literal string: is other browser:${string} */ String) | (`do not notify mobile`) | (`is latest version of the browser`) | (`no device update`)
        ],
      ignorecookie: Boolean,
      is_below_required: Boolean,
      jsv: String,
      ll: String,
      llfull: String,
      newwindow: Boolean,
      notified: Boolean,
      onclick: ParsedOptions => Unit,
      onclose: ParsedOptions => Unit,
      onshow: ParsedOptions => Unit,
      pageurl: String,
      reasons: js.Array[(`below required`) | insecure | (`no vendor support`)],
      reminder: Double,
      reminderClosed: Double,
      required: RequiredBrowsers,
      setCookie: Double => Unit,
      test: Boolean
    ): ParsedOptions = {
      val __obj = js.Dynamic.literal(already_shown = already_shown.asInstanceOf[js.Any], apiver = apiver.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], hide_reasons = hide_reasons.asInstanceOf[js.Any], ignorecookie = ignorecookie.asInstanceOf[js.Any], is_below_required = is_below_required.asInstanceOf[js.Any], jsv = jsv.asInstanceOf[js.Any], ll = ll.asInstanceOf[js.Any], llfull = llfull.asInstanceOf[js.Any], newwindow = newwindow.asInstanceOf[js.Any], notified = notified.asInstanceOf[js.Any], onclick = js.Any.fromFunction1(onclick), onclose = js.Any.fromFunction1(onclose), onshow = js.Any.fromFunction1(onshow), pageurl = pageurl.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], reminder = reminder.asInstanceOf[js.Any], reminderClosed = reminderClosed.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setCookie = js.Any.fromFunction1(setCookie), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    extension [Self <: ParsedOptions](x: Self) {
      
      inline def setAddmargin(value: Boolean): Self = StObject.set(x, "addmargin", value.asInstanceOf[js.Any])
      
      inline def setAddmarginUndefined: Self = StObject.set(x, "addmargin", js.undefined)
      
      inline def setAlready_shown(value: Boolean): Self = StObject.set(x, "already_shown", value.asInstanceOf[js.Any])
      
      inline def setApi(value: Double): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setApiver(value: Double): Self = StObject.set(x, "apiver", value.asInstanceOf[js.Any])
      
      inline def setBodymt(value: String): Self = StObject.set(x, "bodymt", value.asInstanceOf[js.Any])
      
      inline def setBodymtUndefined: Self = StObject.set(x, "bodymt", js.undefined)
      
      inline def setC(value: TextConfig | String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setContainer(value: Node): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDont_show_debuginfo(value: Boolean): Self = StObject.set(x, "dont_show_debuginfo", value.asInstanceOf[js.Any])
      
      inline def setDont_show_debuginfoUndefined: Self = StObject.set(x, "dont_show_debuginfo", js.undefined)
      
      inline def setE(value: TextConfig | String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setE_a(value: TextConfig | String): Self = StObject.set(x, "e_a", value.asInstanceOf[js.Any])
      
      inline def setE_aUndefined: Self = StObject.set(x, "e_a", js.undefined)
      
      inline def setF(value: TextConfig | String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setHide_reasons(
        value: js.Array[
              (/* template literal string: is other browser:${string} */ String) | (`do not notify mobile`) | (`is latest version of the browser`) | (`no device update`)
            ]
      ): Self = StObject.set(x, "hide_reasons", value.asInstanceOf[js.Any])
      
      inline def setHide_reasonsVarargs(
        value: ((/* template literal string: is other browser:${string} */ String) | (`do not notify mobile`) | (`is latest version of the browser`) | (`no device update`))*
      ): Self = StObject.set(x, "hide_reasons", js.Array(value*))
      
      inline def setI(value: TextConfig | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIgnorecookie(value: Boolean): Self = StObject.set(x, "ignorecookie", value.asInstanceOf[js.Any])
      
      inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      inline def setIo(value: TextConfig | String): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setIos(value: TextConfig | String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setIs_below_required(value: Boolean): Self = StObject.set(x, "is_below_required", value.asInstanceOf[js.Any])
      
      inline def setJsshowurl(value: String): Self = StObject.set(x, "jsshowurl", value.asInstanceOf[js.Any])
      
      inline def setJsshowurlUndefined: Self = StObject.set(x, "jsshowurl", js.undefined)
      
      inline def setJsv(value: String): Self = StObject.set(x, "jsv", value.asInstanceOf[js.Any])
      
      inline def setL(value: String | `false`): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      inline def setLl(value: String): Self = StObject.set(x, "ll", value.asInstanceOf[js.Any])
      
      inline def setLlfull(value: String): Self = StObject.set(x, "llfull", value.asInstanceOf[js.Any])
      
      inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setNewwindow(value: Boolean): Self = StObject.set(x, "newwindow", value.asInstanceOf[js.Any])
      
      inline def setNo_permanent_hide(value: Boolean): Self = StObject.set(x, "no_permanent_hide", value.asInstanceOf[js.Any])
      
      inline def setNo_permanent_hideUndefined: Self = StObject.set(x, "no_permanent_hide", js.undefined)
      
      inline def setNoclose(value: Boolean): Self = StObject.set(x, "noclose", value.asInstanceOf[js.Any])
      
      inline def setNocloseUndefined: Self = StObject.set(x, "noclose", js.undefined)
      
      inline def setNomessage(value: Boolean): Self = StObject.set(x, "nomessage", value.asInstanceOf[js.Any])
      
      inline def setNomessageUndefined: Self = StObject.set(x, "nomessage", js.undefined)
      
      inline def setNotified(value: Boolean): Self = StObject.set(x, "notified", value.asInstanceOf[js.Any])
      
      inline def setNotify_esr(value: Boolean): Self = StObject.set(x, "notify_esr", value.asInstanceOf[js.Any])
      
      inline def setNotify_esrUndefined: Self = StObject.set(x, "notify_esr", js.undefined)
      
      inline def setO(value: TextConfig | String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setO_a(value: TextConfig | String): Self = StObject.set(x, "o_a", value.asInstanceOf[js.Any])
      
      inline def setO_aUndefined: Self = StObject.set(x, "o_a", js.undefined)
      
      inline def setOnclick(value: ParsedOptions => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
      
      inline def setOnclose(value: ParsedOptions => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
      
      inline def setOnshow(value: ParsedOptions => Unit): Self = StObject.set(x, "onshow", js.Any.fromFunction1(value))
      
      inline def setOverride_ua(value: String): Self = StObject.set(x, "override_ua", value.asInstanceOf[js.Any])
      
      inline def setOverride_uaUndefined: Self = StObject.set(x, "override_ua", js.undefined)
      
      inline def setPageurl(value: String): Self = StObject.set(x, "pageurl", value.asInstanceOf[js.Any])
      
      inline def setReasons(value: js.Array[(`below required`) | insecure | (`no vendor support`)]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      inline def setReasonsVarargs(value: ((`below required`) | insecure | (`no vendor support`))*): Self = StObject.set(x, "reasons", js.Array(value*))
      
      inline def setReminder(value: Double): Self = StObject.set(x, "reminder", value.asInstanceOf[js.Any])
      
      inline def setReminderClosed(value: Double): Self = StObject.set(x, "reminderClosed", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: RequiredBrowsers): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setS(value: TextConfig | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSamsung(value: TextConfig | String): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
      
      inline def setSetCookie(value: Double => Unit): Self = StObject.set(x, "setCookie", js.Any.fromFunction1(value))
      
      inline def setShift_page_down(value: Boolean): Self = StObject.set(x, "shift_page_down", value.asInstanceOf[js.Any])
      
      inline def setShift_page_downUndefined: Self = StObject.set(x, "shift_page_down", js.undefined)
      
      inline def setSilk(value: TextConfig | String): Self = StObject.set(x, "silk", value.asInstanceOf[js.Any])
      
      inline def setSilkUndefined: Self = StObject.set(x, "silk", js.undefined)
      
      inline def setSo(value: TextConfig | String): Self = StObject.set(x, "so", value.asInstanceOf[js.Any])
      
      inline def setSoUndefined: Self = StObject.set(x, "so", js.undefined)
      
      inline def setStyle(value: top | bottom | corner): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextConfig | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUc(value: TextConfig | String): Self = StObject.set(x, "uc", value.asInstanceOf[js.Any])
      
      inline def setUcUndefined: Self = StObject.set(x, "uc", js.undefined)
      
      inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedUndefined: Self = StObject.set(x, "unsupported", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrl_permanent_hide(value: String): Self = StObject.set(x, "url_permanent_hide", value.asInstanceOf[js.Any])
      
      inline def setUrl_permanent_hideUndefined: Self = StObject.set(x, "url_permanent_hide", js.undefined)
      
      inline def setV(value: TextConfig | String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setX(value: TextConfig | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: TextConfig | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait RequiredBrowsers extends StObject {
    
    /**
      * Specifies required Android Browser version.
      */
    var a: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Chrome version.
      */
    var c: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Edge version.
      *
      * Falls back to value specified in `i` when omitted.
      */
    var e: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Firefox version.
      */
    var f: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Internet Explorer version.
      *
      * Falls back to value specified in `e` when omitted.
      */
    var i: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required iOS browser version.
      *
      * Falls back to `s` when omitted.
      */
    var ios: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Opera version.
      */
    var o: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Opera (Android) version.
      */
    var o_a: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Safari version.
      */
    var s: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Samsung Internet (Android) version.
      */
    var samsung: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required UC Browser version.
      */
    var uc: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Vivaldi version.
      */
    var v: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Specifies required Yandex Browser version.
      */
    var y: js.UndefOr[String | Double] = js.undefined
  }
  object RequiredBrowsers {
    
    inline def apply(): RequiredBrowsers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequiredBrowsers]
    }
    
    extension [Self <: RequiredBrowsers](x: Self) {
      
      inline def setA(value: String | Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setC(value: String | Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setE(value: String | Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setF(value: String | Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setI(value: String | Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIos(value: String | Double): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setO(value: String | Double): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setO_a(value: String | Double): Self = StObject.set(x, "o_a", value.asInstanceOf[js.Any])
      
      inline def setO_aUndefined: Self = StObject.set(x, "o_a", js.undefined)
      
      inline def setS(value: String | Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSamsung(value: String | Double): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
      
      inline def setUc(value: String | Double): Self = StObject.set(x, "uc", value.asInstanceOf[js.Any])
      
      inline def setUcUndefined: Self = StObject.set(x, "uc", js.undefined)
      
      inline def setV(value: String | Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait TextConfig extends StObject {
    
    var bignore: js.UndefOr[String] = js.undefined
    
    var bnever: js.UndefOr[String] = js.undefined
    
    var bupdate: js.UndefOr[String] = js.undefined
    
    var msg: js.UndefOr[String] = js.undefined
    
    var msgmore: js.UndefOr[String] = js.undefined
    
    var remind: js.UndefOr[String] = js.undefined
  }
  object TextConfig {
    
    inline def apply(): TextConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextConfig]
    }
    
    extension [Self <: TextConfig](x: Self) {
      
      inline def setBignore(value: String): Self = StObject.set(x, "bignore", value.asInstanceOf[js.Any])
      
      inline def setBignoreUndefined: Self = StObject.set(x, "bignore", js.undefined)
      
      inline def setBnever(value: String): Self = StObject.set(x, "bnever", value.asInstanceOf[js.Any])
      
      inline def setBneverUndefined: Self = StObject.set(x, "bnever", js.undefined)
      
      inline def setBupdate(value: String): Self = StObject.set(x, "bupdate", value.asInstanceOf[js.Any])
      
      inline def setBupdateUndefined: Self = StObject.set(x, "bupdate", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setMsgmore(value: String): Self = StObject.set(x, "msgmore", value.asInstanceOf[js.Any])
      
      inline def setMsgmoreUndefined: Self = StObject.set(x, "msgmore", js.undefined)
      
      inline def setRemind(value: String): Self = StObject.set(x, "remind", value.asInstanceOf[js.Any])
      
      inline def setRemindUndefined: Self = StObject.set(x, "remind", js.undefined)
    }
  }
  
  type WithRequiredProperties[TObj /* <: js.Object */, TReq /* <: /* keyof TObj */ String */] = (Required[Pick[TObj, TReq]]) & (Omit[TObj, TReq])
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      @JSName("$bu_getBrowser")
      def $bu_getBrowser(): DetectedBrowsers = js.native
      @JSName("$bu_getBrowser")
      def $bu_getBrowser(ua: String): DetectedBrowsers = js.native
      
      @JSName("$buo")
      var $buo: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof browserUpdate */ Any = js.native
      
      @JSName("$buoop")
      var $buoop: js.UndefOr[Options] = js.native
    }
  }
}
