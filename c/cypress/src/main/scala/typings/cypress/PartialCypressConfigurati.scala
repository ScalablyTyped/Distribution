package typings.cypress

import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.CypressConfiguration> */
trait PartialCypressConfigurati extends js.Object {
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var blacklistHosts: js.UndefOr[String | js.Array[String]] = js.undefined
  var chromeWebSecurity: js.UndefOr[Boolean] = js.undefined
  var defaultCommandTimeout: js.UndefOr[Double] = js.undefined
  var env: js.UndefOr[js.Object] = js.undefined
  var execTimeout: js.UndefOr[Double] = js.undefined
  var fileServerFolder: js.UndefOr[String] = js.undefined
  var fixturesFolder: js.UndefOr[String | `false`] = js.undefined
  var ignoreTestFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var integrationFolder: js.UndefOr[String] = js.undefined
  var modifyObstructiveCode: js.UndefOr[Boolean] = js.undefined
  var numTestsKeptInMemory: js.UndefOr[Double] = js.undefined
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  var pluginsFile: js.UndefOr[String | `false`] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var responseTimeout: js.UndefOr[Double] = js.undefined
  var screenshotsFolder: js.UndefOr[String] = js.undefined
  var supportFile: js.UndefOr[String | `false`] = js.undefined
  var taskTimeout: js.UndefOr[Double] = js.undefined
  var testFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
  var videoCompression: js.UndefOr[Double | `false`] = js.undefined
  var videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined
  var videosFolder: js.UndefOr[String] = js.undefined
  var viewportHeight: js.UndefOr[Double] = js.undefined
  var viewportWidth: js.UndefOr[Double] = js.undefined
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
}

object PartialCypressConfigurati {
  @scala.inline
  def apply(
    animationDistanceThreshold: Int | Double = null,
    baseUrl: String = null,
    blacklistHosts: String | js.Array[String] = null,
    chromeWebSecurity: js.UndefOr[Boolean] = js.undefined,
    defaultCommandTimeout: Int | Double = null,
    env: js.Object = null,
    execTimeout: Int | Double = null,
    fileServerFolder: String = null,
    fixturesFolder: String | `false` = null,
    ignoreTestFiles: String | js.Array[String] = null,
    integrationFolder: String = null,
    modifyObstructiveCode: js.UndefOr[Boolean] = js.undefined,
    numTestsKeptInMemory: Int | Double = null,
    pageLoadTimeout: Int | Double = null,
    pluginsFile: String | `false` = null,
    port: Int | Double = null,
    reporter: String = null,
    requestTimeout: Int | Double = null,
    responseTimeout: Int | Double = null,
    screenshotsFolder: String = null,
    supportFile: String | `false` = null,
    taskTimeout: Int | Double = null,
    testFiles: String | js.Array[String] = null,
    trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null,
    video: js.UndefOr[Boolean] = js.undefined,
    videoCompression: Double | `false` = null,
    videoUploadOnPasses: js.UndefOr[Boolean] = js.undefined,
    videosFolder: String = null,
    viewportHeight: Int | Double = null,
    viewportWidth: Int | Double = null,
    waitForAnimations: js.UndefOr[Boolean] = js.undefined
  ): PartialCypressConfigurati = {
    val __obj = js.Dynamic.literal()
    if (animationDistanceThreshold != null) __obj.updateDynamic("animationDistanceThreshold")(animationDistanceThreshold.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (blacklistHosts != null) __obj.updateDynamic("blacklistHosts")(blacklistHosts.asInstanceOf[js.Any])
    if (!js.isUndefined(chromeWebSecurity)) __obj.updateDynamic("chromeWebSecurity")(chromeWebSecurity.asInstanceOf[js.Any])
    if (defaultCommandTimeout != null) __obj.updateDynamic("defaultCommandTimeout")(defaultCommandTimeout.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execTimeout != null) __obj.updateDynamic("execTimeout")(execTimeout.asInstanceOf[js.Any])
    if (fileServerFolder != null) __obj.updateDynamic("fileServerFolder")(fileServerFolder.asInstanceOf[js.Any])
    if (fixturesFolder != null) __obj.updateDynamic("fixturesFolder")(fixturesFolder.asInstanceOf[js.Any])
    if (ignoreTestFiles != null) __obj.updateDynamic("ignoreTestFiles")(ignoreTestFiles.asInstanceOf[js.Any])
    if (integrationFolder != null) __obj.updateDynamic("integrationFolder")(integrationFolder.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyObstructiveCode)) __obj.updateDynamic("modifyObstructiveCode")(modifyObstructiveCode.asInstanceOf[js.Any])
    if (numTestsKeptInMemory != null) __obj.updateDynamic("numTestsKeptInMemory")(numTestsKeptInMemory.asInstanceOf[js.Any])
    if (pageLoadTimeout != null) __obj.updateDynamic("pageLoadTimeout")(pageLoadTimeout.asInstanceOf[js.Any])
    if (pluginsFile != null) __obj.updateDynamic("pluginsFile")(pluginsFile.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (responseTimeout != null) __obj.updateDynamic("responseTimeout")(responseTimeout.asInstanceOf[js.Any])
    if (screenshotsFolder != null) __obj.updateDynamic("screenshotsFolder")(screenshotsFolder.asInstanceOf[js.Any])
    if (supportFile != null) __obj.updateDynamic("supportFile")(supportFile.asInstanceOf[js.Any])
    if (taskTimeout != null) __obj.updateDynamic("taskTimeout")(taskTimeout.asInstanceOf[js.Any])
    if (testFiles != null) __obj.updateDynamic("testFiles")(testFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(trashAssetsBeforeRuns)) __obj.updateDynamic("trashAssetsBeforeRuns")(trashAssetsBeforeRuns.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoCompression != null) __obj.updateDynamic("videoCompression")(videoCompression.asInstanceOf[js.Any])
    if (!js.isUndefined(videoUploadOnPasses)) __obj.updateDynamic("videoUploadOnPasses")(videoUploadOnPasses.asInstanceOf[js.Any])
    if (videosFolder != null) __obj.updateDynamic("videosFolder")(videosFolder.asInstanceOf[js.Any])
    if (viewportHeight != null) __obj.updateDynamic("viewportHeight")(viewportHeight.asInstanceOf[js.Any])
    if (viewportWidth != null) __obj.updateDynamic("viewportWidth")(viewportWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimations)) __obj.updateDynamic("waitForAnimations")(waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCypressConfigurati]
  }
}

