package typings.cypress.cypressMod.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.AnonOpenMode
import typings.cypress.cypressBooleans.`false`
import typings.cypress.cypressMod.Nullable
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfigOptions extends ConfigOptions {
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
    fileServerFolder: String,
    fixturesFolder: String,
    ignoreTestFiles: String | js.Array[String],
    integrationFolder: String,
    nodeVersion: system | bundled,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    pluginsFile: String,
    projectRoot: String,
    reporter: String,
    requestTimeout: Double,
    resolvedNodePath: String,
    resolvedNodeVersion: String,
    responseTimeout: Double,
    screenshotsFolder: String,
    supportFile: String,
    trashAssetsBeforeRuns: Boolean,
    video: Boolean,
    videoCompression: Double,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean,
    watchForFileChanges: Boolean,
    baseUrl: String = null,
    firefoxGcInterval: Nullable[Double | AnonOpenMode] = null,
    port: Int | Double = null
  ): PluginConfigOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pluginsFile = pluginsFile.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], resolvedNodePath = resolvedNodePath.asInstanceOf[js.Any], resolvedNodeVersion = resolvedNodeVersion.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any], watchForFileChanges = watchForFileChanges.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (firefoxGcInterval != null) __obj.updateDynamic("firefoxGcInterval")(firefoxGcInterval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfigOptions]
  }
}

