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

/**
  * All configuration items are optional.
  */
/* Inlined std.Partial<cypress.Cypress.ResolvedConfigOptions> */
trait ConfigOptions extends js.Object {
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var chromeWebSecurity: js.UndefOr[Boolean] = js.undefined
  var defaultCommandTimeout: js.UndefOr[Double] = js.undefined
  var env: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var execTimeout: js.UndefOr[Double] = js.undefined
  var experimentalGetCookiesSameSite: js.UndefOr[Boolean] = js.undefined
  var experimentalShadowDomSupport: js.UndefOr[Boolean] = js.undefined
  var experimentalSourceRewriting: js.UndefOr[Boolean] = js.undefined
  var fileServerFolder: js.UndefOr[String] = js.undefined
  var firefoxGcInterval: js.UndefOr[Nullable[Double | OpenMode]] = js.undefined
  var fixturesFolder: js.UndefOr[String | `false`] = js.undefined
  var ignoreTestFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var integrationFolder: js.UndefOr[String] = js.undefined
  var nodeVersion: js.UndefOr[system | bundled] = js.undefined
  var numTestsKeptInMemory: js.UndefOr[Double] = js.undefined
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  var pluginsFile: js.UndefOr[String | `false`] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var resolvedNodePath: js.UndefOr[String] = js.undefined
  var resolvedNodeVersion: js.UndefOr[String] = js.undefined
  var responseTimeout: js.UndefOr[Double] = js.undefined
  var screenshotsFolder: js.UndefOr[String | `false`] = js.undefined
  var supportFile: js.UndefOr[String | `false`] = js.undefined
  var taskTimeout: js.UndefOr[Double] = js.undefined
  var trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
  var videoCompression: js.UndefOr[Double | `false`] = js.undefined
  var videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined
  var videosFolder: js.UndefOr[String] = js.undefined
  var viewportHeight: js.UndefOr[Double] = js.undefined
  var viewportWidth: js.UndefOr[Double] = js.undefined
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
  var watchForFileChanges: js.UndefOr[Boolean] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    animationDistanceThreshold: js.UndefOr[Double] = js.undefined,
    baseUrl: String = null,
    chromeWebSecurity: js.UndefOr[Boolean] = js.undefined,
    defaultCommandTimeout: js.UndefOr[Double] = js.undefined,
    env: StringDictionary[js.Any] = null,
    execTimeout: js.UndefOr[Double] = js.undefined,
    experimentalGetCookiesSameSite: js.UndefOr[Boolean] = js.undefined,
    experimentalShadowDomSupport: js.UndefOr[Boolean] = js.undefined,
    experimentalSourceRewriting: js.UndefOr[Boolean] = js.undefined,
    fileServerFolder: String = null,
    firefoxGcInterval: js.UndefOr[Null | (Nullable[Double | OpenMode])] = js.undefined,
    fixturesFolder: String | `false` = null,
    ignoreTestFiles: String | js.Array[String] = null,
    integrationFolder: String = null,
    nodeVersion: system | bundled = null,
    numTestsKeptInMemory: js.UndefOr[Double] = js.undefined,
    pageLoadTimeout: js.UndefOr[Double] = js.undefined,
    pluginsFile: String | `false` = null,
    port: js.UndefOr[Double] = js.undefined,
    reporter: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    resolvedNodePath: String = null,
    resolvedNodeVersion: String = null,
    responseTimeout: js.UndefOr[Double] = js.undefined,
    screenshotsFolder: String | `false` = null,
    supportFile: String | `false` = null,
    taskTimeout: js.UndefOr[Double] = js.undefined,
    trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined,
    videoCompression: Double | `false` = null,
    videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined,
    videosFolder: String = null,
    viewportHeight: js.UndefOr[Double] = js.undefined,
    viewportWidth: js.UndefOr[Double] = js.undefined,
    waitForAnimations: js.UndefOr[Boolean] = js.undefined,
    watchForFileChanges: js.UndefOr[Boolean] = js.undefined
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDistanceThreshold)) __obj.updateDynamic("animationDistanceThreshold")(animationDistanceThreshold.get.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(chromeWebSecurity)) __obj.updateDynamic("chromeWebSecurity")(chromeWebSecurity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCommandTimeout)) __obj.updateDynamic("defaultCommandTimeout")(defaultCommandTimeout.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(execTimeout)) __obj.updateDynamic("execTimeout")(execTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalGetCookiesSameSite)) __obj.updateDynamic("experimentalGetCookiesSameSite")(experimentalGetCookiesSameSite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalShadowDomSupport)) __obj.updateDynamic("experimentalShadowDomSupport")(experimentalShadowDomSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalSourceRewriting)) __obj.updateDynamic("experimentalSourceRewriting")(experimentalSourceRewriting.get.asInstanceOf[js.Any])
    if (fileServerFolder != null) __obj.updateDynamic("fileServerFolder")(fileServerFolder.asInstanceOf[js.Any])
    if (!js.isUndefined(firefoxGcInterval)) __obj.updateDynamic("firefoxGcInterval")(firefoxGcInterval.asInstanceOf[js.Any])
    if (fixturesFolder != null) __obj.updateDynamic("fixturesFolder")(fixturesFolder.asInstanceOf[js.Any])
    if (ignoreTestFiles != null) __obj.updateDynamic("ignoreTestFiles")(ignoreTestFiles.asInstanceOf[js.Any])
    if (integrationFolder != null) __obj.updateDynamic("integrationFolder")(integrationFolder.asInstanceOf[js.Any])
    if (nodeVersion != null) __obj.updateDynamic("nodeVersion")(nodeVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(numTestsKeptInMemory)) __obj.updateDynamic("numTestsKeptInMemory")(numTestsKeptInMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLoadTimeout)) __obj.updateDynamic("pageLoadTimeout")(pageLoadTimeout.get.asInstanceOf[js.Any])
    if (pluginsFile != null) __obj.updateDynamic("pluginsFile")(pluginsFile.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (resolvedNodePath != null) __obj.updateDynamic("resolvedNodePath")(resolvedNodePath.asInstanceOf[js.Any])
    if (resolvedNodeVersion != null) __obj.updateDynamic("resolvedNodeVersion")(resolvedNodeVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(responseTimeout)) __obj.updateDynamic("responseTimeout")(responseTimeout.get.asInstanceOf[js.Any])
    if (screenshotsFolder != null) __obj.updateDynamic("screenshotsFolder")(screenshotsFolder.asInstanceOf[js.Any])
    if (supportFile != null) __obj.updateDynamic("supportFile")(supportFile.asInstanceOf[js.Any])
    if (!js.isUndefined(taskTimeout)) __obj.updateDynamic("taskTimeout")(taskTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trashAssetsBeforeRuns)) __obj.updateDynamic("trashAssetsBeforeRuns")(trashAssetsBeforeRuns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.get.asInstanceOf[js.Any])
    if (videoCompression != null) __obj.updateDynamic("videoCompression")(videoCompression.asInstanceOf[js.Any])
    if (!js.isUndefined(videoUploadOnPasses)) __obj.updateDynamic("videoUploadOnPasses")(videoUploadOnPasses.get.asInstanceOf[js.Any])
    if (videosFolder != null) __obj.updateDynamic("videosFolder")(videosFolder.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportHeight)) __obj.updateDynamic("viewportHeight")(viewportHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportWidth)) __obj.updateDynamic("viewportWidth")(viewportWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimations)) __obj.updateDynamic("waitForAnimations")(waitForAnimations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchForFileChanges)) __obj.updateDynamic("watchForFileChanges")(watchForFileChanges.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

