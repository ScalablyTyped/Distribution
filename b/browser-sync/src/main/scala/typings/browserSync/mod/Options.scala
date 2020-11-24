package typings.browserSync.mod

import typings.chokidar.mod.WatchOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The browser(s) to open
    * Default: default
    */
  var browser: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * ¯\_(ツ)_/¯
    * Best guess, when ghostMode (or SocketIO?) is setup the events
    * listed here will be emitted and able to hook into.
    */
  var clientEvents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Send file-change events to the browser
    * Default: true
    */
  var codeSync: js.UndefOr[Boolean] = js.native
  
  /**
    * Add HTTP access control (CORS) headers to assets served by Browsersync.
    * Default: false
    * Note: Requires at least version 2.16.0.
    */
  var cors: js.UndefOr[Boolean] = js.native
  
  /**
    * ¯\_(ツ)_/¯
    */
  var excludeFileTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Browsersync can watch your files as you work. Changes you make will either be injected into the page (CSS
    * & images) or will cause all browsers to do a full-page refresh. See anymatch for more information on glob
    * patterns.
    * Default: false
    */
  var files: js.UndefOr[String | (js.Array[String | FileCallback | js.Object])] = js.native
  
  /**
    * Clicks, Scrolls & Form inputs on any device will be mirrored to all others.
    * clicks - Default: true
    * scroll - Default: true
    * forms - Default: true
    */
  var ghostMode: js.UndefOr[GhostOptions | Boolean] = js.native
  
  /**
    * Override host detection if you know the correct IP to use
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Override http module to allow using 3rd party server modules (such as http2).
    */
  var httpModule: js.UndefOr[String] = js.native
  
  /**
    * Enable https for localhost development.
    * Note: This may not be needed for proxy option as it will try to infer from your target url.
    * Note: If privacy error is encountered please see HttpsOptions below, setting those will resolve.
    * Note: Requires at least version 1.3.0.
    */
  var https: js.UndefOr[Boolean | HttpsOptions] = js.native
  
  /**
    * Patterns for any watchers to ignore.
    * Anything provided here will end up inside 'watchOptions.ignored'.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to inject changes (rather than a page refresh)
    * Default: true
    */
  var injectChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * ¯\_(ツ)_/¯
    */
  var injectFileTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Support environments where dynamic hostnames are not required (ie: electron).
    */
  var localOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to log connections
    * Default: false
    */
  var logConnections: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to log information about changed files
    * Default: false
    */
  var logFileChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be either "info", "debug", "warn", or "silent"
    * Default: info
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * Change the console logging prefix. Useful if you're creating your own project based on Browsersync
    * Default: BS
    * Note: Requires at least version 1.5.1.
    */
  var logPrefix: js.UndefOr[String] = js.native
  
  /**
    * Log the snippet to the console when you're in snippet mode (no proxy/server)
    * Default: true
    * Note: Requires at least version 1.5.2.
    */
  var logSnippet: js.UndefOr[Boolean] = js.native
  
  /**
    * Functions or actual plugins used as middleware.
    */
  var middleware: js.UndefOr[
    MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])
  ] = js.native
  
  /**
    * Whether to minify the client script
    * Default: true
    */
  var minify: js.UndefOr[Boolean] = js.native
  
  /**
    * The small pop-over notifications in the browser are not always needed/wanted.
    * Default: true
    */
  @JSName("notify")
  var notify_FOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * Some features of Browsersync (such as xip & tunnel) require an internet connection, but if you're
    * working offline, you can reduce start-up time by setting this option to false
    */
  var online: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true
    * Decide which URL to open automatically when Browsersync starts. Defaults to "local" if none set.
    * Can be true, local, external, ui, ui-external, tunnel or false
    */
  var open: js.UndefOr[OpenOptions | Boolean] = js.native
  
  /**
    * User provided plugins
    * Default: []
    * Note: Requires at least version 2.6.0.
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Use a specific port (instead of the one auto-detected by Browsersync)
    * Default: 3000
    */
  var port: js.UndefOr[Double] = js.native
  
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
  var proxy: js.UndefOr[String | ProxyOptions] = js.native
  
  /**
    * Restrict the frequency in which browser:reload events can be emitted to connected clients
    * Default: 0
    * Note: Requires at least version 2.6.0.
    */
  var reloadDebounce: js.UndefOr[Double] = js.native
  
  /**
    * Time, in milliseconds, to wait before instructing the browser to reload/inject following a file
    * change event
    * Default: 0
    */
  var reloadDelay: js.UndefOr[Double] = js.native
  
  /**
    * Reload each browser when Browsersync is restarted.
    * Default: false
    */
  var reloadOnRestart: js.UndefOr[Boolean] = js.native
  
  /**
    * Emit only the first event during sequential time windows of a specified duration.
    * Note: Requires at least version 2.13.0.
    */
  var reloadThrottle: js.UndefOr[Double] = js.native
  
  /**
    * Add additional HTML rewriting rules.
    * Default: false
    * Note: Requires at least version 2.4.0.
    */
  var rewriteRules: js.UndefOr[Boolean | js.Array[RewriteRules]] = js.native
  
  /**
    * Alter the script path for complete control over where the Browsersync Javascript is served
    * from. Whatever you return from this function will be used as the script path.
    * Note: Requires at least version 1.5.0.
    */
  var scriptPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  
  /**
    * Default: []
    * Note: Requires at least version 2.9.0.
    * Sync the scroll position of any element on the page - where any scrolled element will cause
    * all others to match scroll position. This is helpful when a breakpoint alters which element
    * is actually scrolling
    */
  var scrollElementMapping: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Sync the scroll position of any element on the page. Add any amount of CSS selectors
    * Default: []
    * Note: Requires at least version 2.9.0.
    */
  var scrollElements: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * scrollProportionally: false // Sync viewports to TOP position
    * Default: true
    */
  var scrollProportionally: js.UndefOr[Boolean] = js.native
  
  /**
    * Decide which technique should be used to restore scroll position following a reload.
    * Can be window.name or cookie
    * Default: 'window.name'
    */
  var scrollRestoreTechnique: js.UndefOr[String] = js.native
  
  /**
    * How often to send scroll events
    * Default: 0
    */
  var scrollThrottle: js.UndefOr[Double] = js.native
  
  /**
    * Add additional directories from which static files should be served.
    * Should only be used in proxy or snippet mode.
    * Default: []
    * Note: Requires at least version 2.8.0.
    */
  var serveStatic: js.UndefOr[js.Array[StaticOptions | String]] = js.native
  
  /**
    * Options that are passed to the serve-static middleware when you use the
    * string[] syntax: eg: `serveStatic: ['./app']`.
    * Please see [serve-static](https://github.com/expressjs/serve-static) for details.
    */
  var serveStaticOptions: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.native
  
  /**
    * Use the built-in static server for basic HTML/JS/CSS websites.
    * Default: false
    */
  var server: js.UndefOr[String | Boolean | js.Array[String] | ServerOptions] = js.native
  
  /**
    * Serve an index.html file for all non-asset routes.
    * Useful when using client-routers.
    */
  var single: js.UndefOr[Boolean] = js.native
  
  /**
    * You can control how the snippet is injected onto each page via a custom regex + function.
    * You can also provide patterns for certain urls that should be ignored from the snippet injection.
    * Note: Requires at least version 2.0.0.
    */
  var snippetOptions: js.UndefOr[SnippetOptions] = js.native
  
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
  var socket: js.UndefOr[SocketOptions] = js.native
  
  /**
    * The initial path to load
    */
  var startPath: js.UndefOr[String] = js.native
  
  /**
    * ¯\_(ツ)_/¯
    */
  var tagNames: js.UndefOr[TagNamesOptions] = js.native
  
  /**
    * Append timestamps to injected files
    * Default: true
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  
  /**
    * Tunnel the Browsersync server through a random Public URL
    * Default: null
    */
  var tunnel: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Browsersync includes a user-interface that is accessed via a separate port. The UI allows to controls
    * all devices, push sync updates and much more.
    *
    * port - Default: 3001
    * weinre.port - Default: 8080
    * Note: Requires at least version 2.0.0.
    */
  var ui: js.UndefOr[UIOptions | Boolean] = js.native
  
  /**
    * Watch files automatically.
    */
  var watch: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify which file events to respond to.
    * Available events: `add`, `change`, `unlink`, `addDir`, `unlinkDir`
    */
  var watchEvents: js.UndefOr[WatchEvents | js.Array[String]] = js.native
  
  /**
    * File watching options that get passed along to Chokidar. Check their docs for available options
    * Default: undefined
    * Note: Requires at least version 2.6.0.
    */
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  
  /**
    * Requires an internet connection - useful for services such as Typekit as it allows you to configure
    * domains such as *.xip.io in your kit settings
    * Default: false
    */
  var xip: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrowserVarargs(value: String*): Self = this.set("browser", js.Array(value :_*))
    
    @scala.inline
    def setBrowser(value: String | js.Array[String]): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setClientEventsVarargs(value: String*): Self = this.set("clientEvents", js.Array(value :_*))
    
    @scala.inline
    def setClientEvents(value: js.Array[String]): Self = this.set("clientEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientEvents: Self = this.set("clientEvents", js.undefined)
    
    @scala.inline
    def setCodeSync(value: Boolean): Self = this.set("codeSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSync: Self = this.set("codeSync", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setExcludeFileTypesVarargs(value: String*): Self = this.set("excludeFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFileTypes(value: js.Array[String]): Self = this.set("excludeFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFileTypes: Self = this.set("excludeFileTypes", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: (String | FileCallback | js.Object)*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: String | (js.Array[String | FileCallback | js.Object])): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setGhostMode(value: GhostOptions | Boolean): Self = this.set("ghostMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhostMode: Self = this.set("ghostMode", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttpModule(value: String): Self = this.set("httpModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpModule: Self = this.set("httpModule", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean | HttpsOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setInjectChanges(value: Boolean): Self = this.set("injectChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectChanges: Self = this.set("injectChanges", js.undefined)
    
    @scala.inline
    def setInjectFileTypesVarargs(value: String*): Self = this.set("injectFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setInjectFileTypes(value: js.Array[String]): Self = this.set("injectFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectFileTypes: Self = this.set("injectFileTypes", js.undefined)
    
    @scala.inline
    def setLocalOnly(value: Boolean): Self = this.set("localOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalOnly: Self = this.set("localOnly", js.undefined)
    
    @scala.inline
    def setLogConnections(value: Boolean): Self = this.set("logConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConnections: Self = this.set("logConnections", js.undefined)
    
    @scala.inline
    def setLogFileChanges(value: Boolean): Self = this.set("logFileChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFileChanges: Self = this.set("logFileChanges", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogPrefix(value: String): Self = this.set("logPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogPrefix: Self = this.set("logPrefix", js.undefined)
    
    @scala.inline
    def setLogSnippet(value: Boolean): Self = this.set("logSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSnippet: Self = this.set("logSnippet", js.undefined)
    
    @scala.inline
    def setMiddlewareVarargs(value: (MiddlewareHandler | PerRouteMiddleware)*): Self = this.set("middleware", js.Array(value :_*))
    
    @scala.inline
    def setMiddlewareFunction3(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any
    ): Self = this.set("middleware", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMiddleware(value: MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setOnline(value: Boolean): Self = this.set("online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnline: Self = this.set("online", js.undefined)
    
    @scala.inline
    def setOpen(value: OpenOptions | Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProxy(value: String | ProxyOptions): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setReloadDebounce(value: Double): Self = this.set("reloadDebounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadDebounce: Self = this.set("reloadDebounce", js.undefined)
    
    @scala.inline
    def setReloadDelay(value: Double): Self = this.set("reloadDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadDelay: Self = this.set("reloadDelay", js.undefined)
    
    @scala.inline
    def setReloadOnRestart(value: Boolean): Self = this.set("reloadOnRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadOnRestart: Self = this.set("reloadOnRestart", js.undefined)
    
    @scala.inline
    def setReloadThrottle(value: Double): Self = this.set("reloadThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadThrottle: Self = this.set("reloadThrottle", js.undefined)
    
    @scala.inline
    def setRewriteRulesVarargs(value: RewriteRules*): Self = this.set("rewriteRules", js.Array(value :_*))
    
    @scala.inline
    def setRewriteRules(value: Boolean | js.Array[RewriteRules]): Self = this.set("rewriteRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewriteRules: Self = this.set("rewriteRules", js.undefined)
    
    @scala.inline
    def setScriptPath(value: /* path */ String => String): Self = this.set("scriptPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScriptPath: Self = this.set("scriptPath", js.undefined)
    
    @scala.inline
    def setScrollElementMappingVarargs(value: String*): Self = this.set("scrollElementMapping", js.Array(value :_*))
    
    @scala.inline
    def setScrollElementMapping(value: js.Array[String]): Self = this.set("scrollElementMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollElementMapping: Self = this.set("scrollElementMapping", js.undefined)
    
    @scala.inline
    def setScrollElementsVarargs(value: String*): Self = this.set("scrollElements", js.Array(value :_*))
    
    @scala.inline
    def setScrollElements(value: js.Array[String]): Self = this.set("scrollElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollElements: Self = this.set("scrollElements", js.undefined)
    
    @scala.inline
    def setScrollProportionally(value: Boolean): Self = this.set("scrollProportionally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollProportionally: Self = this.set("scrollProportionally", js.undefined)
    
    @scala.inline
    def setScrollRestoreTechnique(value: String): Self = this.set("scrollRestoreTechnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollRestoreTechnique: Self = this.set("scrollRestoreTechnique", js.undefined)
    
    @scala.inline
    def setScrollThrottle(value: Double): Self = this.set("scrollThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollThrottle: Self = this.set("scrollThrottle", js.undefined)
    
    @scala.inline
    def setServeStaticVarargs(value: (StaticOptions | String)*): Self = this.set("serveStatic", js.Array(value :_*))
    
    @scala.inline
    def setServeStatic(value: js.Array[StaticOptions | String]): Self = this.set("serveStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeStatic: Self = this.set("serveStatic", js.undefined)
    
    @scala.inline
    def setServeStaticOptions(value: ServeStaticOptions[ServerResponse]): Self = this.set("serveStaticOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeStaticOptions: Self = this.set("serveStaticOptions", js.undefined)
    
    @scala.inline
    def setServerVarargs(value: String*): Self = this.set("server", js.Array(value :_*))
    
    @scala.inline
    def setServer(value: String | Boolean | js.Array[String] | ServerOptions): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
    
    @scala.inline
    def setSnippetOptions(value: SnippetOptions): Self = this.set("snippetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetOptions: Self = this.set("snippetOptions", js.undefined)
    
    @scala.inline
    def setSocket(value: SocketOptions): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setStartPath(value: String): Self = this.set("startPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPath: Self = this.set("startPath", js.undefined)
    
    @scala.inline
    def setTagNames(value: TagNamesOptions): Self = this.set("tagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagNames: Self = this.set("tagNames", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setTunnel(value: String | Boolean): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
    
    @scala.inline
    def setUi(value: UIOptions | Boolean): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    
    @scala.inline
    def setWatchEventsVarargs(value: String*): Self = this.set("watchEvents", js.Array(value :_*))
    
    @scala.inline
    def setWatchEvents(value: WatchEvents | js.Array[String]): Self = this.set("watchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchEvents: Self = this.set("watchEvents", js.undefined)
    
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
    
    @scala.inline
    def setXip(value: Boolean): Self = this.set("xip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXip: Self = this.set("xip", js.undefined)
  }
}
