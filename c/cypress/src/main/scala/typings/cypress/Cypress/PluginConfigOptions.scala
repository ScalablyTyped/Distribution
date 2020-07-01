package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.Nullable
import typings.cypress.anon.OpenMode
import typings.cypress.cypressBooleans.`false`
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfigOptions extends ResolvedConfigOptions {
  /**
    * Absolute path to the config file (default: <projectRoot>/cypress.json) or false
    */
  var configFile: String | `false`
  /**
    * Absolute path to the root of the project
    */
  var projectRoot: String
}

object PluginConfigOptions {
  @scala.inline
  def apply(
    animationDistanceThreshold: Double,
    chromeWebSecurity: Boolean,
    configFile: String | `false`,
    defaultCommandTimeout: Double,
    env: StringDictionary[js.Any],
    execTimeout: Double,
    experimentalGetCookiesSameSite: Boolean,
    experimentalShadowDomSupport: Boolean,
    experimentalSourceRewriting: Boolean,
    fileServerFolder: String,
    fixturesFolder: String | `false`,
    ignoreTestFiles: String | js.Array[String],
    integrationFolder: String,
    nodeVersion: system | bundled,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    pluginsFile: String | `false`,
    projectRoot: String,
    reporter: String,
    requestTimeout: Double,
    resolvedNodePath: String,
    resolvedNodeVersion: String,
    responseTimeout: Double,
    screenshotsFolder: String | `false`,
    supportFile: String | `false`,
    taskTimeout: Double,
    trashAssetsBeforeRuns: Boolean,
    video: Boolean,
    videoCompression: Double | `false`,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean,
    watchForFileChanges: Boolean,
    baseUrl: String = null,
    firefoxGcInterval: Nullable[Double | OpenMode] = null,
    port: Double = null.asInstanceOf[Double]
  ): PluginConfigOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], experimentalGetCookiesSameSite = experimentalGetCookiesSameSite.asInstanceOf[js.Any], experimentalShadowDomSupport = experimentalShadowDomSupport.asInstanceOf[js.Any], experimentalSourceRewriting = experimentalSourceRewriting.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pluginsFile = pluginsFile.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], resolvedNodePath = resolvedNodePath.asInstanceOf[js.Any], resolvedNodeVersion = resolvedNodeVersion.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], taskTimeout = taskTimeout.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any], watchForFileChanges = watchForFileChanges.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], firefoxGcInterval = firefoxGcInterval.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfigOptions]
  }
}

