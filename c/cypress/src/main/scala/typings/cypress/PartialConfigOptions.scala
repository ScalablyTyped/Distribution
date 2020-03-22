package typings.cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.cypressMod.Nullable
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ConfigOptions> */
trait PartialConfigOptions extends js.Object {
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var chromeWebSecurity: js.UndefOr[Boolean] = js.undefined
  var defaultCommandTimeout: js.UndefOr[Double] = js.undefined
  var env: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var execTimeout: js.UndefOr[Double] = js.undefined
  var fileServerFolder: js.UndefOr[String] = js.undefined
  var firefoxGcInterval: js.UndefOr[Nullable[Double | AnonOpenMode]] = js.undefined
  var fixturesFolder: js.UndefOr[String] = js.undefined
  var ignoreTestFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var integrationFolder: js.UndefOr[String] = js.undefined
  var nodeVersion: js.UndefOr[system | bundled] = js.undefined
  var numTestsKeptInMemory: js.UndefOr[Double] = js.undefined
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  var pluginsFile: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var resolvedNodePath: js.UndefOr[String] = js.undefined
  var resolvedNodeVersion: js.UndefOr[String] = js.undefined
  var responseTimeout: js.UndefOr[Double] = js.undefined
  var screenshotsFolder: js.UndefOr[String] = js.undefined
  var supportFile: js.UndefOr[String] = js.undefined
  var trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
  var videoCompression: js.UndefOr[Double] = js.undefined
  var videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined
  var videosFolder: js.UndefOr[String] = js.undefined
  var viewportHeight: js.UndefOr[Double] = js.undefined
  var viewportWidth: js.UndefOr[Double] = js.undefined
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
  var watchForFileChanges: js.UndefOr[Boolean] = js.undefined
}

object PartialConfigOptions {
  @scala.inline
  def apply(
    animationDistanceThreshold: Int | Double = null,
    baseUrl: String = null,
    chromeWebSecurity: js.UndefOr[Boolean] = js.undefined,
    defaultCommandTimeout: Int | Double = null,
    env: StringDictionary[js.Any] = null,
    execTimeout: Int | Double = null,
    fileServerFolder: String = null,
    firefoxGcInterval: Nullable[Double | AnonOpenMode] = null,
    fixturesFolder: String = null,
    ignoreTestFiles: String | js.Array[String] = null,
    integrationFolder: String = null,
    nodeVersion: system | bundled = null,
    numTestsKeptInMemory: Int | Double = null,
    pageLoadTimeout: Int | Double = null,
    pluginsFile: String = null,
    port: Int | Double = null,
    reporter: String = null,
    requestTimeout: Int | Double = null,
    resolvedNodePath: String = null,
    resolvedNodeVersion: String = null,
    responseTimeout: Int | Double = null,
    screenshotsFolder: String = null,
    supportFile: String = null,
    trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined,
    videoCompression: Int | Double = null,
    videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined,
    videosFolder: String = null,
    viewportHeight: Int | Double = null,
    viewportWidth: Int | Double = null,
    waitForAnimations: js.UndefOr[Boolean] = js.undefined,
    watchForFileChanges: js.UndefOr[Boolean] = js.undefined
  ): PartialConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (animationDistanceThreshold != null) __obj.updateDynamic("animationDistanceThreshold")(animationDistanceThreshold.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(chromeWebSecurity)) __obj.updateDynamic("chromeWebSecurity")(chromeWebSecurity.asInstanceOf[js.Any])
    if (defaultCommandTimeout != null) __obj.updateDynamic("defaultCommandTimeout")(defaultCommandTimeout.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execTimeout != null) __obj.updateDynamic("execTimeout")(execTimeout.asInstanceOf[js.Any])
    if (fileServerFolder != null) __obj.updateDynamic("fileServerFolder")(fileServerFolder.asInstanceOf[js.Any])
    if (firefoxGcInterval != null) __obj.updateDynamic("firefoxGcInterval")(firefoxGcInterval.asInstanceOf[js.Any])
    if (fixturesFolder != null) __obj.updateDynamic("fixturesFolder")(fixturesFolder.asInstanceOf[js.Any])
    if (ignoreTestFiles != null) __obj.updateDynamic("ignoreTestFiles")(ignoreTestFiles.asInstanceOf[js.Any])
    if (integrationFolder != null) __obj.updateDynamic("integrationFolder")(integrationFolder.asInstanceOf[js.Any])
    if (nodeVersion != null) __obj.updateDynamic("nodeVersion")(nodeVersion.asInstanceOf[js.Any])
    if (numTestsKeptInMemory != null) __obj.updateDynamic("numTestsKeptInMemory")(numTestsKeptInMemory.asInstanceOf[js.Any])
    if (pageLoadTimeout != null) __obj.updateDynamic("pageLoadTimeout")(pageLoadTimeout.asInstanceOf[js.Any])
    if (pluginsFile != null) __obj.updateDynamic("pluginsFile")(pluginsFile.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (resolvedNodePath != null) __obj.updateDynamic("resolvedNodePath")(resolvedNodePath.asInstanceOf[js.Any])
    if (resolvedNodeVersion != null) __obj.updateDynamic("resolvedNodeVersion")(resolvedNodeVersion.asInstanceOf[js.Any])
    if (responseTimeout != null) __obj.updateDynamic("responseTimeout")(responseTimeout.asInstanceOf[js.Any])
    if (screenshotsFolder != null) __obj.updateDynamic("screenshotsFolder")(screenshotsFolder.asInstanceOf[js.Any])
    if (supportFile != null) __obj.updateDynamic("supportFile")(supportFile.asInstanceOf[js.Any])
    if (!js.isUndefined(trashAssetsBeforeRuns)) __obj.updateDynamic("trashAssetsBeforeRuns")(trashAssetsBeforeRuns.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoCompression != null) __obj.updateDynamic("videoCompression")(videoCompression.asInstanceOf[js.Any])
    if (!js.isUndefined(videoUploadOnPasses)) __obj.updateDynamic("videoUploadOnPasses")(videoUploadOnPasses.asInstanceOf[js.Any])
    if (videosFolder != null) __obj.updateDynamic("videosFolder")(videosFolder.asInstanceOf[js.Any])
    if (viewportHeight != null) __obj.updateDynamic("viewportHeight")(viewportHeight.asInstanceOf[js.Any])
    if (viewportWidth != null) __obj.updateDynamic("viewportWidth")(viewportWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimations)) __obj.updateDynamic("waitForAnimations")(waitForAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(watchForFileChanges)) __obj.updateDynamic("watchForFileChanges")(watchForFileChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfigOptions]
  }
}

