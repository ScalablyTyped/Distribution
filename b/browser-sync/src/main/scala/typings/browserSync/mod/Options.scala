package typings.browserSync.mod

import typings.chokidar.mod.WatchOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * The browser(s) to open
    * Default: default
    */
  var browser: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * ¯\_(ツ)_/¯
    * Best guess, when ghostMode (or SocketIO?) is setup the events
    * listed here will be emitted and able to hook into.
    */
  var clientEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Send file-change events to the browser
    * Default: true
    */
  var codeSync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add HTTP access control (CORS) headers to assets served by Browsersync.
    * Default: false
    * Note: Requires at least version 2.16.0.
    */
  var cors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ¯\_(ツ)_/¯
    */
  var excludeFileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Browsersync can watch your files as you work. Changes you make will either be injected into the page (CSS
    * & images) or will cause all browsers to do a full-page refresh. See anymatch for more information on glob
    * patterns.
    * Default: false
    */
  var files: js.UndefOr[String | (js.Array[String | FileCallback | js.Object])] = js.undefined
  
  /**
    * Clicks, Scrolls & Form inputs on any device will be mirrored to all others.
    * clicks - Default: true
    * scroll - Default: true
    * forms - Default: true
    */
  var ghostMode: js.UndefOr[GhostOptions | Boolean] = js.undefined
  
  /**
    * Override host detection if you know the correct IP to use
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Override http module to allow using 3rd party server modules (such as http2).
    */
  var httpModule: js.UndefOr[String] = js.undefined
  
  /**
    * Enable https for localhost development.
    * Note: This may not be needed for proxy option as it will try to infer from your target url.
    * Note: If privacy error is encountered please see HttpsOptions below, setting those will resolve.
    * Note: Requires at least version 1.3.0.
    */
  var https: js.UndefOr[Boolean | HttpsOptions] = js.undefined
  
  /**
    * Patterns for any watchers to ignore.
    * Anything provided here will end up inside 'watchOptions.ignored'.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to inject changes (rather than a page refresh)
    * Default: true
    */
  var injectChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ¯\_(ツ)_/¯
    */
  var injectFileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Support environments where dynamic hostnames are not required (ie: electron).
    */
  var localOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to log connections
    * Default: false
    */
  var logConnections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to log information about changed files
    * Default: false
    */
  var logFileChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be either "info", "debug", "warn", or "silent"
    * Default: info
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * Change the console logging prefix. Useful if you're creating your own project based on Browsersync
    * Default: BS
    * Note: Requires at least version 1.5.1.
    */
  var logPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Log the snippet to the console when you're in snippet mode (no proxy/server)
    * Default: true
    * Note: Requires at least version 1.5.2.
    */
  var logSnippet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Functions or actual plugins used as middleware.
    */
  var middleware: js.UndefOr[
    MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])
  ] = js.undefined
  
  /**
    * Whether to minify the client script
    * Default: true
    */
  var minify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The small pop-over notifications in the browser are not always needed/wanted.
    * Default: true
    */
  @JSName("notify")
  var notify_FOptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Some features of Browsersync (such as xip & tunnel) require an internet connection, but if you're
    * working offline, you can reduce start-up time by setting this option to false
    */
  var online: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: true
    * Decide which URL to open automatically when Browsersync starts. Defaults to "local" if none set.
    * Can be true, local, external, ui, ui-external, tunnel or false
    */
  var open: js.UndefOr[OpenOptions | Boolean] = js.undefined
  
  /**
    * User provided plugins
    * Default: []
    * Note: Requires at least version 2.6.0.
    */
  var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Use a specific port (instead of the one auto-detected by Browsersync)
    * Default: 3000
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Proxy an EXISTING vhost. Browsersync will wrap your vhost with a proxy URL to view your site.
    * Passing only a URL as a string equates to passing only target property of ProxyOptions type.
    * target - Default: undefined
    * ws - Default: undefined
    * middleware - Default: undefined
    * reqHeaders - Default: undefined
    * proxyRes - Default: undefined (http.ServerResponse if expecting single parameter)
    * proxyReq - Default: undefined
    */
  var proxy: js.UndefOr[String | ProxyOptions] = js.undefined
  
  /**
    * Restrict the frequency in which browser:reload events can be emitted to connected clients
    * Default: 0
    * Note: Requires at least version 2.6.0.
    */
  var reloadDebounce: js.UndefOr[Double] = js.undefined
  
  /**
    * Time, in milliseconds, to wait before instructing the browser to reload/inject following a file
    * change event
    * Default: 0
    */
  var reloadDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Reload each browser when Browsersync is restarted.
    * Default: false
    */
  var reloadOnRestart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emit only the first event during sequential time windows of a specified duration.
    * Note: Requires at least version 2.13.0.
    */
  var reloadThrottle: js.UndefOr[Double] = js.undefined
  
  /**
    * Add additional HTML rewriting rules.
    * Default: false
    * Note: Requires at least version 2.4.0.
    */
  var rewriteRules: js.UndefOr[Boolean | js.Array[RewriteRules]] = js.undefined
  
  /**
    * Alter the script path for complete control over where the Browsersync Javascript is served
    * from. Whatever you return from this function will be used as the script path.
    * Note: Requires at least version 1.5.0.
    */
  var scriptPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  
  /**
    * Default: []
    * Note: Requires at least version 2.9.0.
    * Sync the scroll position of any element on the page - where any scrolled element will cause
    * all others to match scroll position. This is helpful when a breakpoint alters which element
    * is actually scrolling
    */
  var scrollElementMapping: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Sync the scroll position of any element on the page. Add any amount of CSS selectors
    * Default: []
    * Note: Requires at least version 2.9.0.
    */
  var scrollElements: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * scrollProportionally: false // Sync viewports to TOP position
    * Default: true
    */
  var scrollProportionally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Decide which technique should be used to restore scroll position following a reload.
    * Can be window.name or cookie
    * Default: 'window.name'
    */
  var scrollRestoreTechnique: js.UndefOr[String] = js.undefined
  
  /**
    * How often to send scroll events
    * Default: 0
    */
  var scrollThrottle: js.UndefOr[Double] = js.undefined
  
  /**
    * Add additional directories from which static files should be served.
    * Should only be used in proxy or snippet mode.
    * Default: []
    * Note: Requires at least version 2.8.0.
    */
  var serveStatic: js.UndefOr[js.Array[StaticOptions | String]] = js.undefined
  
  /**
    * Options that are passed to the serve-static middleware when you use the
    * string[] syntax: eg: `serveStatic: ['./app']`.
    * Please see [serve-static](https://github.com/expressjs/serve-static) for details.
    */
  var serveStaticOptions: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.undefined
  
  /**
    * Use the built-in static server for basic HTML/JS/CSS websites.
    * Default: false
    */
  var server: js.UndefOr[String | Boolean | js.Array[String] | ServerOptions] = js.undefined
  
  /**
    * Serve an index.html file for all non-asset routes.
    * Useful when using client-routers.
    */
  var single: js.UndefOr[Boolean] = js.undefined
  
  /**
    * You can control how the snippet is injected onto each page via a custom regex + function.
    * You can also provide patterns for certain urls that should be ignored from the snippet injection.
    * Note: Requires at least version 2.0.0.
    */
  var snippetOptions: js.UndefOr[SnippetOptions] = js.undefined
  
  /**
    * Configure the Socket.IO path and namespace & domain to avoid collisions.
    * path - Default: "/browser-sync/socket.io"
    * clientPath - Default: "/browser-sync"
    * namespace - Default: "/browser-sync"
    * domain - Default: undefined
    * port - Default: undefined
    * clients.heartbeatTimeout - Default: 5000
    * Note: Requires at least version 1.6.2.
    */
  var socket: js.UndefOr[SocketOptions] = js.undefined
  
  /**
    * The initial path to load
    */
  var startPath: js.UndefOr[String] = js.undefined
  
  /**
    * ¯\_(ツ)_/¯
    */
  var tagNames: js.UndefOr[TagNamesOptions] = js.undefined
  
  /**
    * Append timestamps to injected files
    * Default: true
    */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tunnel the Browsersync server through a random Public URL
    * Default: null
    */
  var tunnel: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * Browsersync includes a user-interface that is accessed via a separate port. The UI allows to controls
    * all devices, push sync updates and much more.
    *
    * port - Default: 3001
    * weinre.port - Default: 8080
    * Note: Requires at least version 2.0.0.
    */
  var ui: js.UndefOr[UIOptions | Boolean] = js.undefined
  
  /**
    * Watch files automatically.
    */
  var watch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify which file events to respond to.
    * Available events: `add`, `change`, `unlink`, `addDir`, `unlinkDir`
    */
  var watchEvents: js.UndefOr[WatchEvents | js.Array[String]] = js.undefined
  
  /**
    * File watching options that get passed along to Chokidar. Check their docs for available options
    * Default: undefined
    * Note: Requires at least version 2.6.0.
    */
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
  
  /**
    * Requires an internet connection - useful for services such as Typekit as it allows you to configure
    * domains such as *.xip.io in your kit settings
    * Default: false
    */
  var xip: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setBrowser(value: String | js.Array[String]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowserVarargs(value: String*): Self = StObject.set(x, "browser", js.Array(value :_*))
    
    inline def setClientEvents(value: js.Array[String]): Self = StObject.set(x, "clientEvents", value.asInstanceOf[js.Any])
    
    inline def setClientEventsUndefined: Self = StObject.set(x, "clientEvents", js.undefined)
    
    inline def setClientEventsVarargs(value: String*): Self = StObject.set(x, "clientEvents", js.Array(value :_*))
    
    inline def setCodeSync(value: Boolean): Self = StObject.set(x, "codeSync", value.asInstanceOf[js.Any])
    
    inline def setCodeSyncUndefined: Self = StObject.set(x, "codeSync", js.undefined)
    
    inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setExcludeFileTypes(value: js.Array[String]): Self = StObject.set(x, "excludeFileTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludeFileTypesUndefined: Self = StObject.set(x, "excludeFileTypes", js.undefined)
    
    inline def setExcludeFileTypesVarargs(value: String*): Self = StObject.set(x, "excludeFileTypes", js.Array(value :_*))
    
    inline def setFiles(value: String | (js.Array[String | FileCallback | js.Object])): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: (String | FileCallback | js.Object)*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    inline def setGhostMode(value: GhostOptions | Boolean): Self = StObject.set(x, "ghostMode", value.asInstanceOf[js.Any])
    
    inline def setGhostModeUndefined: Self = StObject.set(x, "ghostMode", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttpModule(value: String): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
    
    inline def setHttpModuleUndefined: Self = StObject.set(x, "httpModule", js.undefined)
    
    inline def setHttps(value: Boolean | HttpsOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    inline def setInjectChanges(value: Boolean): Self = StObject.set(x, "injectChanges", value.asInstanceOf[js.Any])
    
    inline def setInjectChangesUndefined: Self = StObject.set(x, "injectChanges", js.undefined)
    
    inline def setInjectFileTypes(value: js.Array[String]): Self = StObject.set(x, "injectFileTypes", value.asInstanceOf[js.Any])
    
    inline def setInjectFileTypesUndefined: Self = StObject.set(x, "injectFileTypes", js.undefined)
    
    inline def setInjectFileTypesVarargs(value: String*): Self = StObject.set(x, "injectFileTypes", js.Array(value :_*))
    
    inline def setLocalOnly(value: Boolean): Self = StObject.set(x, "localOnly", value.asInstanceOf[js.Any])
    
    inline def setLocalOnlyUndefined: Self = StObject.set(x, "localOnly", js.undefined)
    
    inline def setLogConnections(value: Boolean): Self = StObject.set(x, "logConnections", value.asInstanceOf[js.Any])
    
    inline def setLogConnectionsUndefined: Self = StObject.set(x, "logConnections", js.undefined)
    
    inline def setLogFileChanges(value: Boolean): Self = StObject.set(x, "logFileChanges", value.asInstanceOf[js.Any])
    
    inline def setLogFileChangesUndefined: Self = StObject.set(x, "logFileChanges", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogPrefix(value: String): Self = StObject.set(x, "logPrefix", value.asInstanceOf[js.Any])
    
    inline def setLogPrefixUndefined: Self = StObject.set(x, "logPrefix", js.undefined)
    
    inline def setLogSnippet(value: Boolean): Self = StObject.set(x, "logSnippet", value.asInstanceOf[js.Any])
    
    inline def setLogSnippetUndefined: Self = StObject.set(x, "logSnippet", js.undefined)
    
    inline def setMiddleware(value: MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareFunction3(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any
    ): Self = StObject.set(x, "middleware", js.Any.fromFunction3(value))
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setMiddlewareVarargs(value: (MiddlewareHandler | PerRouteMiddleware)*): Self = StObject.set(x, "middleware", js.Array(value :_*))
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
    
    inline def setOpen(value: OpenOptions | Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProxy(value: String | ProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setReloadDebounce(value: Double): Self = StObject.set(x, "reloadDebounce", value.asInstanceOf[js.Any])
    
    inline def setReloadDebounceUndefined: Self = StObject.set(x, "reloadDebounce", js.undefined)
    
    inline def setReloadDelay(value: Double): Self = StObject.set(x, "reloadDelay", value.asInstanceOf[js.Any])
    
    inline def setReloadDelayUndefined: Self = StObject.set(x, "reloadDelay", js.undefined)
    
    inline def setReloadOnRestart(value: Boolean): Self = StObject.set(x, "reloadOnRestart", value.asInstanceOf[js.Any])
    
    inline def setReloadOnRestartUndefined: Self = StObject.set(x, "reloadOnRestart", js.undefined)
    
    inline def setReloadThrottle(value: Double): Self = StObject.set(x, "reloadThrottle", value.asInstanceOf[js.Any])
    
    inline def setReloadThrottleUndefined: Self = StObject.set(x, "reloadThrottle", js.undefined)
    
    inline def setRewriteRules(value: Boolean | js.Array[RewriteRules]): Self = StObject.set(x, "rewriteRules", value.asInstanceOf[js.Any])
    
    inline def setRewriteRulesUndefined: Self = StObject.set(x, "rewriteRules", js.undefined)
    
    inline def setRewriteRulesVarargs(value: RewriteRules*): Self = StObject.set(x, "rewriteRules", js.Array(value :_*))
    
    inline def setScriptPath(value: /* path */ String => String): Self = StObject.set(x, "scriptPath", js.Any.fromFunction1(value))
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
    
    inline def setScrollElementMapping(value: js.Array[String]): Self = StObject.set(x, "scrollElementMapping", value.asInstanceOf[js.Any])
    
    inline def setScrollElementMappingUndefined: Self = StObject.set(x, "scrollElementMapping", js.undefined)
    
    inline def setScrollElementMappingVarargs(value: String*): Self = StObject.set(x, "scrollElementMapping", js.Array(value :_*))
    
    inline def setScrollElements(value: js.Array[String]): Self = StObject.set(x, "scrollElements", value.asInstanceOf[js.Any])
    
    inline def setScrollElementsUndefined: Self = StObject.set(x, "scrollElements", js.undefined)
    
    inline def setScrollElementsVarargs(value: String*): Self = StObject.set(x, "scrollElements", js.Array(value :_*))
    
    inline def setScrollProportionally(value: Boolean): Self = StObject.set(x, "scrollProportionally", value.asInstanceOf[js.Any])
    
    inline def setScrollProportionallyUndefined: Self = StObject.set(x, "scrollProportionally", js.undefined)
    
    inline def setScrollRestoreTechnique(value: String): Self = StObject.set(x, "scrollRestoreTechnique", value.asInstanceOf[js.Any])
    
    inline def setScrollRestoreTechniqueUndefined: Self = StObject.set(x, "scrollRestoreTechnique", js.undefined)
    
    inline def setScrollThrottle(value: Double): Self = StObject.set(x, "scrollThrottle", value.asInstanceOf[js.Any])
    
    inline def setScrollThrottleUndefined: Self = StObject.set(x, "scrollThrottle", js.undefined)
    
    inline def setServeStatic(value: js.Array[StaticOptions | String]): Self = StObject.set(x, "serveStatic", value.asInstanceOf[js.Any])
    
    inline def setServeStaticOptions(value: ServeStaticOptions[ServerResponse]): Self = StObject.set(x, "serveStaticOptions", value.asInstanceOf[js.Any])
    
    inline def setServeStaticOptionsUndefined: Self = StObject.set(x, "serveStaticOptions", js.undefined)
    
    inline def setServeStaticUndefined: Self = StObject.set(x, "serveStatic", js.undefined)
    
    inline def setServeStaticVarargs(value: (StaticOptions | String)*): Self = StObject.set(x, "serveStatic", js.Array(value :_*))
    
    inline def setServer(value: String | Boolean | js.Array[String] | ServerOptions): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setServerVarargs(value: String*): Self = StObject.set(x, "server", js.Array(value :_*))
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setSnippetOptions(value: SnippetOptions): Self = StObject.set(x, "snippetOptions", value.asInstanceOf[js.Any])
    
    inline def setSnippetOptionsUndefined: Self = StObject.set(x, "snippetOptions", js.undefined)
    
    inline def setSocket(value: SocketOptions): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    inline def setStartPath(value: String): Self = StObject.set(x, "startPath", value.asInstanceOf[js.Any])
    
    inline def setStartPathUndefined: Self = StObject.set(x, "startPath", js.undefined)
    
    inline def setTagNames(value: TagNamesOptions): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    inline def setTagNamesUndefined: Self = StObject.set(x, "tagNames", js.undefined)
    
    inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTunnel(value: String | Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    inline def setUi(value: UIOptions | Boolean): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchEvents(value: WatchEvents | js.Array[String]): Self = StObject.set(x, "watchEvents", value.asInstanceOf[js.Any])
    
    inline def setWatchEventsUndefined: Self = StObject.set(x, "watchEvents", js.undefined)
    
    inline def setWatchEventsVarargs(value: String*): Self = StObject.set(x, "watchEvents", js.Array(value :_*))
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setXip(value: Boolean): Self = StObject.set(x, "xip", value.asInstanceOf[js.Any])
    
    inline def setXipUndefined: Self = StObject.set(x, "xip", js.undefined)
  }
}
