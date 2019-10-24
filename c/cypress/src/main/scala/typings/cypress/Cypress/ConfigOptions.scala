package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * The distance in pixels an element must exceed over time to be considered animating
    * @default 5
    */
  var animationDistanceThreshold: Double
  /**
    * Url used as prefix for [cy.visit()](https://on.cypress.io/visit) or [cy.request()](https://on.cypress.io/request) command’s url
    * @default null
    */
  var baseUrl: String | Null
  /**
    * Whether Chrome Web Security for same-origin policy and insecure mixed content is enabled. Read more about this here
    * @default true
    */
  var chromeWebSecurity: Boolean
  /**
    * Time, in milliseconds, to wait until most DOM based commands are considered timed out
    * @default 4000
    */
  var defaultCommandTimeout: Double
  /**
    * Any values to be set as [environment variables](https://docs.cypress.io/guides/guides/environment-variables.html)
    * @default {}
    */
  var env: StringDictionary[js.Any]
  /**
    * Time, in milliseconds, to wait for a system command to finish executing during a [cy.exec()](https://on.cypress.io/exec) command
    * @default 60000
    */
  var execTimeout: Double
  /**
    * Path to folder where application files will attempt to be served from
    * @default root project folder
    */
  var fileServerFolder: String
  /**
    * Path to folder containing fixture files (Pass false to disable)
    * @default "cypress/fixtures"
    */
  var fixturesFolder: String
  /**
    * A String or Array of glob patterns used to ignore test files that would otherwise be shown in your list of tests. Cypress uses minimatch with the options: {dot: true, matchBase: true}. We suggest using http://globtester.com to test what files would match.
    * @default "*.hot-update.js"
    */
  var ignoreTestFiles: String | js.Array[String]
  /**
    * Path to folder containing integration test files
    * @default "cypress/integration"
    */
  var integrationFolder: String
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
    * Path to plugins file. (Pass false to disable)
    * @default "cypress/plugins/index.js"
    */
  var pluginsFile: String
  /**
    * Port used to host Cypress. Normally this is a randomly generated port
    * @default null
    */
  var port: Double | Null
  /**
    * The [reporter](https://docs.cypress.io/guides/guides/reporters.html) used when running headlessly or in CI
    * @default "spec"
    */
  var reporter: String
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
    * Path to folder where screenshots will be saved from [cy.screenshot()](https://on.cypress.io/screenshot) command or after a headless or CI run’s test failure
    * @default "cypress/screenshots"
    */
  var screenshotsFolder: String
  /**
    * Path to file to load before test files load. This file is compiled and bundled. (Pass false to disable)
    * @default "cypress/support/index.js"
    */
  var supportFile: String
  /**
    * Whether Cypress will trash assets within the screenshotsFolder and videosFolder before headless test runs.
    * @default true
    */
  var trashAssetsBeforeRuns: Boolean
  /**
    * Whether Cypress will record a video of the test run when running headlessly.
    * @default true
    */
  var video: Boolean
  /**
    * The quality setting for the video compression, in Constant Rate Factor (CRF). The value can be false to disable compression or a value between 0 and 51, where a lower value results in better quality (at the expense of a higher file size).
    * @default 32
    */
  var videoCompression: Double
  /**
    * Whether Cypress will upload the video to the Dashboard even if all tests are passing. This applies only when recording your runs to the Dashboard. Turn this off if you’d like the video uploaded only when there are failing tests.
    * @default true
    */
  var videoUploadOnPasses: Boolean
  /**
    * Path to folder where videos will be saved after a headless or CI run
    * @default "cypress/videos"
    */
  var videosFolder: String
  /**
    * Default height in pixels for the application under tests’ viewport (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
    * @default 660
    */
  var viewportHeight: Double
  /**
    * Default width in pixels for the application under tests’ viewport. (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
    * @default 1000
    */
  var viewportWidth: Double
  /**
    * Whether to wait for elements to finish animating before executing commands
    * @default true
    */
  var waitForAnimations: Boolean
  /**
    * Whether to take a screenshot on test failure when running headlessly or in CI
    * @default true
    */
  var watchForFileChanges: Boolean
}

object ConfigOptions {
  @scala.inline
  def apply(
    animationDistanceThreshold: Double,
    chromeWebSecurity: Boolean,
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
    port: Int | Double = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold, chromeWebSecurity = chromeWebSecurity, defaultCommandTimeout = defaultCommandTimeout, env = env, execTimeout = execTimeout, fileServerFolder = fileServerFolder, fixturesFolder = fixturesFolder, ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder, nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory, pageLoadTimeout = pageLoadTimeout, pluginsFile = pluginsFile, reporter = reporter, requestTimeout = requestTimeout, resolvedNodePath = resolvedNodePath, resolvedNodeVersion = resolvedNodeVersion, responseTimeout = responseTimeout, screenshotsFolder = screenshotsFolder, supportFile = supportFile, trashAssetsBeforeRuns = trashAssetsBeforeRuns, video = video, videoCompression = videoCompression, videoUploadOnPasses = videoUploadOnPasses, videosFolder = videosFolder, viewportHeight = viewportHeight, viewportWidth = viewportWidth, waitForAnimations = waitForAnimations, watchForFileChanges = watchForFileChanges)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

