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

/**
  * Config options that can be assigned on cypress.config.{js,ts,mjs,cjs} file
  */
/* Inlined cypress.Cypress.Omit<cypress.Cypress.ResolvedConfigOptions<ComponentDevServerOpts>, 'baseUrl' | 'excludeSpecPattern' | 'supportFile' | 'specPattern' | 'indexHtmlFile'> */
trait UserConfigOptions[ComponentDevServerOpts] extends StObject {
  
  var animationDistanceThreshold: Double
  
  var blockHosts: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  
  var chromeWebSecurity: Boolean
  
  var clientCertificates: js.Array[ClientCertificate]
  
  var component: ComponentConfigOptions[ComponentDevServerOpts]
  
  var defaultCommandTimeout: Double
  
  var downloadsFolder: String
  
  var e2e: OmitCoreConfigOptionsinde
  
  var env: StringDictionary[Any]
  
  var execTimeout: Double
  
  var experimentalFetchPolyfill: Boolean
  
  var experimentalInteractiveRunEvents: Boolean
  
  var experimentalModifyObstructiveThirdPartyCode: Boolean
  
  var experimentalSessionAndOrigin: Boolean
  
  var experimentalSourceRewriting: Boolean
  
  var experimentalStudio: Boolean
  
  var experimentalWebKitSupport: Boolean
  
  var fileServerFolder: String
  
  var fixturesFolder: String | `false`
  
  var includeShadowDom: Boolean
  
  var modifyObstructiveCode: Boolean
  
  var nodeVersion: system | bundled
  
  var numTestsKeptInMemory: Double
  
  var pageLoadTimeout: Double
  
  var port: js.UndefOr[Double | Null] = js.undefined
  
  var projectId: js.UndefOr[Null | String] = js.undefined
  
  var redirectionLimit: Double
  
  var reporter: String
  
  var reporterOptions: StringDictionary[Any]
  
  var requestTimeout: Double
  
  var resolvedNodePath: String
  
  var resolvedNodeVersion: String
  
  var responseTimeout: Double
  
  var retries: Nullable[Double | OpenMode]
  
  var screenshotOnRunFailure: Boolean
  
  var screenshotsFolder: String | `false`
  
  var scrollBehavior: scrollBehaviorOptions
  
  def setupNodeEvents(on: PluginEvents, config: PluginConfigOptions): (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
  @JSName("setupNodeEvents")
  var setupNodeEvents_Original: js.Function2[
    /* on */ PluginEvents, 
    /* config */ PluginConfigOptions, 
    (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
  ]
  
  var slowTestThreshold: Double
  
  var supportFolder: String
  
  var taskTimeout: Double
  
  var testIsolation: legacy | strict
  
  var trashAssetsBeforeRuns: Boolean
  
  var userAgent: js.UndefOr[Null | String] = js.undefined
  
  var video: Boolean
  
  var videoCompression: Double | `false`
  
  var videoUploadOnPasses: Boolean
  
  var videosFolder: String
  
  var viewportHeight: Double
  
  var viewportWidth: Double
  
  var waitForAnimations: Boolean
  
  var watchForFileChanges: Boolean
}
object UserConfigOptions {
  
  inline def apply[ComponentDevServerOpts](
    animationDistanceThreshold: Double,
    chromeWebSecurity: Boolean,
    clientCertificates: js.Array[ClientCertificate],
    component: ComponentConfigOptions[ComponentDevServerOpts],
    defaultCommandTimeout: Double,
    downloadsFolder: String,
    e2e: OmitCoreConfigOptionsinde,
    env: StringDictionary[Any],
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
    setupNodeEvents: (/* on */ PluginEvents, /* config */ PluginConfigOptions) => (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit,
    slowTestThreshold: Double,
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
  ): UserConfigOptions[ComponentDevServerOpts] = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], clientCertificates = clientCertificates.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], downloadsFolder = downloadsFolder.asInstanceOf[js.Any], e2e = e2e.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], experimentalFetchPolyfill = experimentalFetchPolyfill.asInstanceOf[js.Any], experimentalInteractiveRunEvents = experimentalInteractiveRunEvents.asInstanceOf[js.Any], experimentalModifyObstructiveThirdPartyCode = experimentalModifyObstructiveThirdPartyCode.asInstanceOf[js.Any], experimentalSessionAndOrigin = experimentalSessionAndOrigin.asInstanceOf[js.Any], experimentalSourceRewriting = experimentalSourceRewriting.asInstanceOf[js.Any], experimentalStudio = experimentalStudio.asInstanceOf[js.Any], experimentalWebKitSupport = experimentalWebKitSupport.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], includeShadowDom = includeShadowDom.asInstanceOf[js.Any], modifyObstructiveCode = modifyObstructiveCode.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], redirectionLimit = redirectionLimit.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterOptions = reporterOptions.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], resolvedNodePath = resolvedNodePath.asInstanceOf[js.Any], resolvedNodeVersion = resolvedNodeVersion.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], setupNodeEvents = js.Any.fromFunction2(setupNodeEvents), slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], supportFolder = supportFolder.asInstanceOf[js.Any], taskTimeout = taskTimeout.asInstanceOf[js.Any], testIsolation = testIsolation.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any], watchForFileChanges = watchForFileChanges.asInstanceOf[js.Any], retries = null)
    __obj.asInstanceOf[UserConfigOptions[ComponentDevServerOpts]]
  }
  
  extension [Self <: UserConfigOptions[?], ComponentDevServerOpts](x: Self & UserConfigOptions[ComponentDevServerOpts]) {
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setBlockHosts(value: String | js.Array[String]): Self = StObject.set(x, "blockHosts", value.asInstanceOf[js.Any])
    
    inline def setBlockHostsNull: Self = StObject.set(x, "blockHosts", null)
    
    inline def setBlockHostsUndefined: Self = StObject.set(x, "blockHosts", js.undefined)
    
    inline def setBlockHostsVarargs(value: String*): Self = StObject.set(x, "blockHosts", js.Array(value*))
    
    inline def setChromeWebSecurity(value: Boolean): Self = StObject.set(x, "chromeWebSecurity", value.asInstanceOf[js.Any])
    
    inline def setClientCertificates(value: js.Array[ClientCertificate]): Self = StObject.set(x, "clientCertificates", value.asInstanceOf[js.Any])
    
    inline def setClientCertificatesVarargs(value: ClientCertificate*): Self = StObject.set(x, "clientCertificates", js.Array(value*))
    
    inline def setComponent(value: ComponentConfigOptions[ComponentDevServerOpts]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultCommandTimeout(value: Double): Self = StObject.set(x, "defaultCommandTimeout", value.asInstanceOf[js.Any])
    
    inline def setDownloadsFolder(value: String): Self = StObject.set(x, "downloadsFolder", value.asInstanceOf[js.Any])
    
    inline def setE2e(value: OmitCoreConfigOptionsinde): Self = StObject.set(x, "e2e", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
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
    
    inline def setModifyObstructiveCode(value: Boolean): Self = StObject.set(x, "modifyObstructiveCode", value.asInstanceOf[js.Any])
    
    inline def setNodeVersion(value: system | bundled): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setNumTestsKeptInMemory(value: Double): Self = StObject.set(x, "numTestsKeptInMemory", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
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
      value: (/* on */ PluginEvents, /* config */ PluginConfigOptions) => (js.Promise[PluginConfigOptions | Unit]) | PluginConfigOptions | Unit
    ): Self = StObject.set(x, "setupNodeEvents", js.Any.fromFunction2(value))
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSupportFolder(value: String): Self = StObject.set(x, "supportFolder", value.asInstanceOf[js.Any])
    
    inline def setTaskTimeout(value: Double): Self = StObject.set(x, "taskTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestIsolation(value: legacy | strict): Self = StObject.set(x, "testIsolation", value.asInstanceOf[js.Any])
    
    inline def setTrashAssetsBeforeRuns(value: Boolean): Self = StObject.set(x, "trashAssetsBeforeRuns", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
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
