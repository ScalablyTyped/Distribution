package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.anon.OmitCoreConfigOptionsinde
import typings.cypress.anon.OpenMode
import typings.cypress.cypressBooleans.`false`
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.legacy
import typings.cypress.cypressStrings.strict
import typings.cypress.cypressStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedConfigOptions[ComponentDevServerOpts] extends StObject {
  
  /**
    * The distance in pixels an element must exceed over time to be considered animating
    * @default 5
    */
  var animationDistanceThreshold: Double
  
  /**
    * Url used as prefix for [cy.visit()](https://on.cypress.io/visit) or [cy.request()](https://on.cypress.io/request) command's url
    * @default null
    */
  var baseUrl: String | Null
  
  /**
    * The list of hosts to be blocked
    */
  var blockHosts: Null | String | js.Array[String]
  
  /**
    * Whether Chrome Web Security for same-origin policy and insecure mixed content is enabled. Read more about this here
    * @default true
    */
  var chromeWebSecurity: Boolean
  
  /**
    * An array of objects defining the certificates
    */
  var clientCertificates: js.Array[ClientCertificate]
  
  /**
    * Override default config options for Component Testing runner.
    * @default {}
    */
  var component: ComponentConfigOptions[ComponentDevServerOpts]
  
  /**
    * Time, in milliseconds, to wait until most DOM based commands are considered timed out
    * @default 4000
    */
  var defaultCommandTimeout: Double
  
  /**
    * Path to folder where files downloaded during a test are saved
    * @default "cypress/downloads"
    */
  var downloadsFolder: String
  
  /**
    * Override default config options for E2E Testing runner.
    * @default {}
    */
  var e2e: OmitCoreConfigOptionsinde
  
  /**
    * Any values to be set as [environment variables](https://docs.cypress.io/guides/guides/environment-variables.html)
    * @default {}
    */
  var env: StringDictionary[Any]
  
  /**
    * A String or Array of glob patterns used to ignore test files that would otherwise be shown in your list of tests. Cypress uses minimatch with the options: {dot: true, matchBase: true}. We suggest using http://globtester.com to test what files would match.
    * @default "*.hot-update.js"
    */
  var excludeSpecPattern: String | js.Array[String]
  
  /**
    * Time, in milliseconds, to wait for a system command to finish executing during a [cy.exec()](https://on.cypress.io/exec) command
    * @default 60000
    */
  var execTimeout: Double
  
  /**
    * Polyfills `window.fetch` to enable Network spying and stubbing
    */
  var experimentalFetchPolyfill: Boolean
  
  /**
    * Allows listening to the `before:run`, `after:run`, `before:spec`, and `after:spec` events in the plugins file during interactive mode.
    * @default false
    */
  var experimentalInteractiveRunEvents: Boolean
  
  /**
    * Whether Cypress will search for and replace obstructive code in third party .js or .html files.
    * NOTE: Setting this flag to true removes Subresource Integrity (SRI).
    * Please see https://developer.mozilla.org/en-US/docs/Web/Security/Subresource_Integrity.
    * This option has no impact on experimentalSourceRewriting and is only used with the
    * non-experimental source rewriter.
    * @see https://on.cypress.io/configuration#experimentalModifyObstructiveThirdPartyCode
    */
  var experimentalModifyObstructiveThirdPartyCode: Boolean
  
  /**
    * Enables cross-origin and improved session support, including the `cy.origin` and `cy.session` commands. See https://on.cypress.io/origin and https://on.cypress.io/session.
    * @default false
    */
  var experimentalSessionAndOrigin: Boolean
  
  /**
    * Enables AST-based JS/HTML rewriting. This may fix issues caused by the existing regex-based JS/HTML replacement algorithm.
    * @default false
    */
  var experimentalSourceRewriting: Boolean
  
  /**
    * Generate and save commands directly to your test suite by interacting with your app as an end user would.
    * @default false
    */
  var experimentalStudio: Boolean
  
  /**
    * Adds support for testing in the WebKit browser engine used by Safari. See https://on.cypress.io/webkit-experiment for more information.
    * @default false
    */
  var experimentalWebKitSupport: Boolean
  
  /**
    * Path to folder where application files will attempt to be served from
    * @default root project folder
    */
  var fileServerFolder: String
  
  /**
    * Path to folder containing fixture files (Pass false to disable)
    * @default "cypress/fixtures"
    */
  var fixturesFolder: String | `false`
  
  /**
    * Enables including elements within the shadow DOM when using querying
    * commands (e.g. cy.get(), cy.find()). Can be set globally in cypress.config.{js,ts,mjs,cjs},
    * per-suite or per-test in the test configuration object, or programmatically
    * with Cypress.config()
    * @default false
    */
  var includeShadowDom: Boolean
  
  var indexHtmlFile: String
  
  /**
    * Whether Cypress will search for and replace
    * obstructive JS code in .js or .html files.
    *
    * @see https://on.cypress.io/configuration#modifyObstructiveCode
    */
  var modifyObstructiveCode: Boolean
  
  /**
    * If set to `system`, Cypress will try to find a `node` executable on your path to use when executing your plugins. Otherwise, Cypress will use the Node version bundled with Cypress.
    * @default "bundled"
    */
  var nodeVersion: system | bundled
  
  /**
    * The number of tests for which snapshots and command data are kept in memory. Reduce this number if you are experiencing high memory consumption in your browser during a test run.
    * @default 50
    */
  var numTestsKeptInMemory: Double
  
  /**
    * Time, in milliseconds, to wait for page transition events or [cy.visit()](https://on.cypress.io/visit), [cy.go()](https://on.cypress.io/go), [cy.reload()](https://on.cypress.io/reload) commands to fire their page load events
    * @default 60000
    */
  var pageLoadTimeout: Double
  
  /**
    * Port used to host Cypress. Normally this is a randomly generated port
    * @default null
    */
  var port: Double | Null
  
  /**
    * A unique ID for the project used for recording
    */
  var projectId: Null | String
  
  /**
    * The application under test cannot redirect more than this limit.
    * @default 20
    */
  var redirectionLimit: Double
  
  /**
    * The [reporter](https://docs.cypress.io/guides/guides/reporters.html) used when running headlessly or in CI
    * @default "spec"
    */
  var reporter: String
  
  /**
    * Some reporters accept [reporterOptions](https://on.cypress.io/reporters) that customize their behavior
    * @default "spec"
    */
  var reporterOptions: StringDictionary[Any]
  
  /**
    * Time, in milliseconds, to wait for an XHR request to go out in a [cy.wait()](https://on.cypress.io/wait) command
    * @default 5000
    */
  var requestTimeout: Double
  
  /**
    * If `nodeVersion === 'system'` and a `node` executable is found, this will be the full filesystem path to that executable.
    * @default null
    */
  var resolvedNodePath: String
  
  /**
    * The version of `node` that is being used to execute plugins.
    * @example 1.2.3
    */
  var resolvedNodeVersion: String
  
  /**
    * Time, in milliseconds, to wait until a response in a [cy.request()](https://on.cypress.io/request), [cy.wait()](https://on.cypress.io/wait), [cy.fixture()](https://on.cypress.io/fixture), [cy.getCookie()](https://on.cypress.io/getcookie), [cy.getCookies()](https://on.cypress.io/getcookies), [cy.setCookie()](https://on.cypress.io/setcookie), [cy.clearCookie()](https://on.cypress.io/clearcookie), [cy.clearCookies()](https://on.cypress.io/clearcookies), and [cy.screenshot()](https://on.cypress.io/screenshot) commands
    * @default 30000
    */
  var responseTimeout: Double
  
  /**
    * Number of times to retry a failed test.
    * If a number is set, tests will retry in both runMode and openMode.
    * To enable test retries only in runMode, set e.g. `{ openMode: null, runMode: 2 }`
    * @default null
    */
  var retries: Nullable[Double | OpenMode]
  
  /**
    * Whether Cypress will take a screenshot when a test fails during cypress run.
    * @default true
    */
  var screenshotOnRunFailure: Boolean
  
  /**
    * Path to folder where screenshots will be saved from [cy.screenshot()](https://on.cypress.io/screenshot) command or after a headless or CI run's test failure
    * @default "cypress/screenshots"
    */
  var screenshotsFolder: String | `false`
  
  /**
    * Viewport position to which an element should be scrolled prior to action commands. Setting `false` disables scrolling.
    * @default 'top'
    */
  var scrollBehavior: scrollBehaviorOptions
  
  /**
    * Handle Cypress plugins
    */
  def setupNodeEvents(on: PluginEvents, config: PluginConfigOptions): (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
  
  /**
    * Slow test threshold in milliseconds. Only affects the visual output of some reporters. For example, the spec reporter will display the test time in yellow if over the threshold.
    * @default 10000
    */
  var slowTestThreshold: Double
  
  /**
    * Glob pattern to determine what test files to load.
    */
  var specPattern: String | js.Array[String]
  
  /**
    * Path to file to load before test files load. This file is compiled and bundled. (Pass false to disable)
    * @default "cypress/support/{e2e|component}.js"
    */
  var supportFile: String | `false`
  
  /**
    * Path to the support folder.
    */
  var supportFolder: String
  
  /**
    * Time, in milliseconds, to wait for a task to finish executing during a cy.task() command
    * @default 60000
    */
  var taskTimeout: Double
  
  /**
    * The test isolation level applied to ensure a clean slate between tests.
    *   - legacy - resets/clears aliases, intercepts, clock, viewport, cookies, and local storage before each test.
    *   - strict - applies all resets/clears from legacy, plus clears the page by visiting 'about:blank' to ensure clean app state before each test.
    * @default "legacy", however, when experimentalSessionAndOrigin=true, the default is "strict"
    */
  var testIsolation: legacy | strict
  
  /**
    * Whether Cypress will trash assets within the screenshotsFolder and videosFolder before headless test runs.
    * @default true
    */
  var trashAssetsBeforeRuns: Boolean
  
  /**
    * The user agent the browser sends in all request headers.
    */
  var userAgent: Null | String
  
  /**
    * Whether Cypress will record a video of the test run when running headlessly.
    * @default true
    */
  var video: Boolean
  
  /**
    * The quality setting for the video compression, in Constant Rate Factor (CRF). The value can be false to disable compression or a value between 0 and 51, where a lower value results in better quality (at the expense of a higher file size).
    * @default 32
    */
  var videoCompression: Double | `false`
  
  /**
    * Whether Cypress will upload the video to the Dashboard even if all tests are passing. This applies only when recording your runs to the Dashboard. Turn this off if you'd like the video uploaded only when there are failing tests.
    * @default true
    */
  var videoUploadOnPasses: Boolean
  
  /**
    * Path to folder where videos will be saved after a headless or CI run
    * @default "cypress/videos"
    */
  var videosFolder: String
  
  /**
    * Default height in pixels for the application under tests' viewport (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
    * @default 660
    */
  var viewportHeight: Double
  
  /**
    * Default width in pixels for the application under tests' viewport. (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
    * @default 1000
    */
  var viewportWidth: Double
  
  /**
    * Whether to wait for elements to finish animating before executing commands
    * @default true
    */
  var waitForAnimations: Boolean
  
  /**
    * Whether Cypress will watch and restart tests on test file changes
    * @default true
    */
  var watchForFileChanges: Boolean
}
object ResolvedConfigOptions {
  
  inline def apply[ComponentDevServerOpts](
    animationDistanceThreshold: Double,
    chromeWebSecurity: Boolean,
    clientCertificates: js.Array[ClientCertificate],
    component: ComponentConfigOptions[ComponentDevServerOpts],
    defaultCommandTimeout: Double,
    downloadsFolder: String,
    e2e: OmitCoreConfigOptionsinde,
    env: StringDictionary[Any],
    excludeSpecPattern: String | js.Array[String],
    execTimeout: Double,
    experimentalFetchPolyfill: Boolean,
    experimentalInteractiveRunEvents: Boolean,
    experimentalModifyObstructiveThirdPartyCode: Boolean,
    experimentalSessionAndOrigin: Boolean,
    experimentalSourceRewriting: Boolean,
    experimentalStudio: Boolean,
    experimentalWebKitSupport: Boolean,
    fileServerFolder: String,
    fixturesFolder: String | `false`,
    includeShadowDom: Boolean,
    indexHtmlFile: String,
    modifyObstructiveCode: Boolean,
    nodeVersion: system | bundled,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    redirectionLimit: Double,
    reporter: String,
    reporterOptions: StringDictionary[Any],
    requestTimeout: Double,
    resolvedNodePath: String,
    resolvedNodeVersion: String,
    responseTimeout: Double,
    screenshotOnRunFailure: Boolean,
    screenshotsFolder: String | `false`,
    scrollBehavior: scrollBehaviorOptions,
    setupNodeEvents: (PluginEvents, PluginConfigOptions) => (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit,
    slowTestThreshold: Double,
    specPattern: String | js.Array[String],
    supportFile: String | `false`,
    supportFolder: String,
    taskTimeout: Double,
    testIsolation: legacy | strict,
    trashAssetsBeforeRuns: Boolean,
    video: Boolean,
    videoCompression: Double | `false`,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean,
    watchForFileChanges: Boolean
  ): ResolvedConfigOptions[ComponentDevServerOpts] = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], clientCertificates = clientCertificates.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], downloadsFolder = downloadsFolder.asInstanceOf[js.Any], e2e = e2e.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], excludeSpecPattern = excludeSpecPattern.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], experimentalFetchPolyfill = experimentalFetchPolyfill.asInstanceOf[js.Any], experimentalInteractiveRunEvents = experimentalInteractiveRunEvents.asInstanceOf[js.Any], experimentalModifyObstructiveThirdPartyCode = experimentalModifyObstructiveThirdPartyCode.asInstanceOf[js.Any], experimentalSessionAndOrigin = experimentalSessionAndOrigin.asInstanceOf[js.Any], experimentalSourceRewriting = experimentalSourceRewriting.asInstanceOf[js.Any], experimentalStudio = experimentalStudio.asInstanceOf[js.Any], experimentalWebKitSupport = experimentalWebKitSupport.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], includeShadowDom = includeShadowDom.asInstanceOf[js.Any], indexHtmlFile = indexHtmlFile.asInstanceOf[js.Any], modifyObstructiveCode = modifyObstructiveCode.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], redirectionLimit = redirectionLimit.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterOptions = reporterOptions.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], resolvedNodePath = resolvedNodePath.asInstanceOf[js.Any], resolvedNodeVersion = resolvedNodeVersion.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], setupNodeEvents = js.Any.fromFunction2(setupNodeEvents), slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], specPattern = specPattern.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], supportFolder = supportFolder.asInstanceOf[js.Any], taskTimeout = taskTimeout.asInstanceOf[js.Any], testIsolation = testIsolation.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any], watchForFileChanges = watchForFileChanges.asInstanceOf[js.Any], baseUrl = null, blockHosts = null, port = null, projectId = null, retries = null, userAgent = null)
    __obj.asInstanceOf[ResolvedConfigOptions[ComponentDevServerOpts]]
  }
  
  extension [Self <: ResolvedConfigOptions[?], ComponentDevServerOpts](x: Self & ResolvedConfigOptions[ComponentDevServerOpts]) {
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlNull: Self = StObject.set(x, "baseUrl", null)
    
    inline def setBlockHosts(value: String | js.Array[String]): Self = StObject.set(x, "blockHosts", value.asInstanceOf[js.Any])
    
    inline def setBlockHostsNull: Self = StObject.set(x, "blockHosts", null)
    
    inline def setBlockHostsVarargs(value: String*): Self = StObject.set(x, "blockHosts", js.Array(value*))
    
    inline def setChromeWebSecurity(value: Boolean): Self = StObject.set(x, "chromeWebSecurity", value.asInstanceOf[js.Any])
    
    inline def setClientCertificates(value: js.Array[ClientCertificate]): Self = StObject.set(x, "clientCertificates", value.asInstanceOf[js.Any])
    
    inline def setClientCertificatesVarargs(value: ClientCertificate*): Self = StObject.set(x, "clientCertificates", js.Array(value*))
    
    inline def setComponent(value: ComponentConfigOptions[ComponentDevServerOpts]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultCommandTimeout(value: Double): Self = StObject.set(x, "defaultCommandTimeout", value.asInstanceOf[js.Any])
    
    inline def setDownloadsFolder(value: String): Self = StObject.set(x, "downloadsFolder", value.asInstanceOf[js.Any])
    
    inline def setE2e(value: OmitCoreConfigOptionsinde): Self = StObject.set(x, "e2e", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setExcludeSpecPattern(value: String | js.Array[String]): Self = StObject.set(x, "excludeSpecPattern", value.asInstanceOf[js.Any])
    
    inline def setExcludeSpecPatternVarargs(value: String*): Self = StObject.set(x, "excludeSpecPattern", js.Array(value*))
    
    inline def setExecTimeout(value: Double): Self = StObject.set(x, "execTimeout", value.asInstanceOf[js.Any])
    
    inline def setExperimentalFetchPolyfill(value: Boolean): Self = StObject.set(x, "experimentalFetchPolyfill", value.asInstanceOf[js.Any])
    
    inline def setExperimentalInteractiveRunEvents(value: Boolean): Self = StObject.set(x, "experimentalInteractiveRunEvents", value.asInstanceOf[js.Any])
    
    inline def setExperimentalModifyObstructiveThirdPartyCode(value: Boolean): Self = StObject.set(x, "experimentalModifyObstructiveThirdPartyCode", value.asInstanceOf[js.Any])
    
    inline def setExperimentalSessionAndOrigin(value: Boolean): Self = StObject.set(x, "experimentalSessionAndOrigin", value.asInstanceOf[js.Any])
    
    inline def setExperimentalSourceRewriting(value: Boolean): Self = StObject.set(x, "experimentalSourceRewriting", value.asInstanceOf[js.Any])
    
    inline def setExperimentalStudio(value: Boolean): Self = StObject.set(x, "experimentalStudio", value.asInstanceOf[js.Any])
    
    inline def setExperimentalWebKitSupport(value: Boolean): Self = StObject.set(x, "experimentalWebKitSupport", value.asInstanceOf[js.Any])
    
    inline def setFileServerFolder(value: String): Self = StObject.set(x, "fileServerFolder", value.asInstanceOf[js.Any])
    
    inline def setFixturesFolder(value: String | `false`): Self = StObject.set(x, "fixturesFolder", value.asInstanceOf[js.Any])
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
    
    inline def setIndexHtmlFile(value: String): Self = StObject.set(x, "indexHtmlFile", value.asInstanceOf[js.Any])
    
    inline def setModifyObstructiveCode(value: Boolean): Self = StObject.set(x, "modifyObstructiveCode", value.asInstanceOf[js.Any])
    
    inline def setNodeVersion(value: system | bundled): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setNumTestsKeptInMemory(value: Double): Self = StObject.set(x, "numTestsKeptInMemory", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setRedirectionLimit(value: Double): Self = StObject.set(x, "redirectionLimit", value.asInstanceOf[js.Any])
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterOptions(value: StringDictionary[Any]): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setResolvedNodePath(value: String): Self = StObject.set(x, "resolvedNodePath", value.asInstanceOf[js.Any])
    
    inline def setResolvedNodeVersion(value: String): Self = StObject.set(x, "resolvedNodeVersion", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Nullable[Double | OpenMode]): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesNull: Self = StObject.set(x, "retries", null)
    
    inline def setScreenshotOnRunFailure(value: Boolean): Self = StObject.set(x, "screenshotOnRunFailure", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsFolder(value: String | `false`): Self = StObject.set(x, "screenshotsFolder", value.asInstanceOf[js.Any])
    
    inline def setScrollBehavior(value: scrollBehaviorOptions): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setSetupNodeEvents(
      value: (PluginEvents, PluginConfigOptions) => (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
    ): Self = StObject.set(x, "setupNodeEvents", js.Any.fromFunction2(value))
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSpecPattern(value: String | js.Array[String]): Self = StObject.set(x, "specPattern", value.asInstanceOf[js.Any])
    
    inline def setSpecPatternVarargs(value: String*): Self = StObject.set(x, "specPattern", js.Array(value*))
    
    inline def setSupportFile(value: String | `false`): Self = StObject.set(x, "supportFile", value.asInstanceOf[js.Any])
    
    inline def setSupportFolder(value: String): Self = StObject.set(x, "supportFolder", value.asInstanceOf[js.Any])
    
    inline def setTaskTimeout(value: Double): Self = StObject.set(x, "taskTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestIsolation(value: legacy | strict): Self = StObject.set(x, "testIsolation", value.asInstanceOf[js.Any])
    
    inline def setTrashAssetsBeforeRuns(value: Boolean): Self = StObject.set(x, "trashAssetsBeforeRuns", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoCompression(value: Double | `false`): Self = StObject.set(x, "videoCompression", value.asInstanceOf[js.Any])
    
    inline def setVideoUploadOnPasses(value: Boolean): Self = StObject.set(x, "videoUploadOnPasses", value.asInstanceOf[js.Any])
    
    inline def setVideosFolder(value: String): Self = StObject.set(x, "videosFolder", value.asInstanceOf[js.Any])
    
    inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    
    inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimations(value: Boolean): Self = StObject.set(x, "waitForAnimations", value.asInstanceOf[js.Any])
    
    inline def setWatchForFileChanges(value: Boolean): Self = StObject.set(x, "watchForFileChanges", value.asInstanceOf[js.Any])
  }
}
