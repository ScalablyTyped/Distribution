package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.cypressBooleans.`false`
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.darwin
import typings.cypress.cypressStrings.linux
import typings.cypress.cypressStrings.system
import typings.cypress.cypressStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line
/**
  * The configuration for Cypress.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cypress.Cypress.RuntimeServerConfigOptions because var conflicts: autoOpen, browser, browserUrl, clientRoute, cypressEnv, isNewProject, isTextTerminal, morgan, parentTestsFolder, parentTestsFolderDisplay, projectName, proxyUrl, remote, report, reporterRoute, reporterUrl, socketId, socketIoCookie, socketIoRoute, spec, specs. Inlined  */ trait Config
  extends StObject
     with ResolvedConfigOptions[Any]
     with RuntimeConfigOptions
object Config {
  
  inline def apply(
    animationDistanceThreshold: Double,
    arch: String,
    browsers: js.Array[Browser],
    chromeWebSecurity: Boolean,
    clientCertificates: js.Array[ClientCertificate],
    component: ComponentConfigOptions[Any],
    configFile: String,
    cypressBinaryRoot: String,
    defaultCommandTimeout: Double,
    devServerPublicPathRoute: String,
    downloadsFolder: String,
    e2e: EndToEndConfigOptions,
    env: StringDictionary[Any],
    excludeSpecPattern: String | js.Array[String],
    execTimeout: Double,
    experimentalFetchPolyfill: Boolean,
    experimentalInteractiveRunEvents: Boolean,
    experimentalMemoryManagement: Boolean,
    experimentalModifyObstructiveThirdPartyCode: Boolean,
    experimentalSourceRewriting: Boolean,
    experimentalStudio: Boolean,
    experimentalWebKitSupport: Boolean,
    fileServerFolder: String,
    fixturesFolder: String | `false`,
    includeShadowDom: Boolean,
    indexHtmlFile: String,
    isInteractive: Boolean,
    modifyObstructiveCode: Boolean,
    namespace: String,
    nodeVersion: system | bundled,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    platform: linux | darwin | win32,
    projectRoot: String,
    redirectionLimit: Double,
    remote: RemoteState,
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
    testIsolation: Boolean,
    trashAssetsBeforeRuns: Boolean,
    version: String,
    video: Boolean,
    videoCompression: Double | `false`,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean,
    watchForFileChanges: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], clientCertificates = clientCertificates.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], cypressBinaryRoot = cypressBinaryRoot.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], devServerPublicPathRoute = devServerPublicPathRoute.asInstanceOf[js.Any], downloadsFolder = downloadsFolder.asInstanceOf[js.Any], e2e = e2e.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], excludeSpecPattern = excludeSpecPattern.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], experimentalFetchPolyfill = experimentalFetchPolyfill.asInstanceOf[js.Any], experimentalInteractiveRunEvents = experimentalInteractiveRunEvents.asInstanceOf[js.Any], experimentalMemoryManagement = experimentalMemoryManagement.asInstanceOf[js.Any], experimentalModifyObstructiveThirdPartyCode = experimentalModifyObstructiveThirdPartyCode.asInstanceOf[js.Any], experimentalSourceRewriting = experimentalSourceRewriting.asInstanceOf[js.Any], experimentalStudio = experimentalStudio.asInstanceOf[js.Any], experimentalWebKitSupport = experimentalWebKitSupport.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], includeShadowDom = includeShadowDom.asInstanceOf[js.Any], indexHtmlFile = indexHtmlFile.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], modifyObstructiveCode = modifyObstructiveCode.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], redirectionLimit = redirectionLimit.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterOptions = reporterOptions.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], resolvedNodePath = resolvedNodePath.asInstanceOf[js.Any], resolvedNodeVersion = resolvedNodeVersion.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], setupNodeEvents = js.Any.fromFunction2(setupNodeEvents), slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], specPattern = specPattern.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], supportFolder = supportFolder.asInstanceOf[js.Any], taskTimeout = taskTimeout.asInstanceOf[js.Any], testIsolation = testIsolation.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any], watchForFileChanges = watchForFileChanges.asInstanceOf[js.Any], baseUrl = null, blockHosts = null, experimentalSkipDomainInjection = null, hosts = null, port = null, projectId = null, repoRoot = null, retries = null, userAgent = null)
    __obj.asInstanceOf[Config]
  }
}
