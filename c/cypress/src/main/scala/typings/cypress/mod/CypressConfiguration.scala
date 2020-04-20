package typings.cypress.mod

import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress configuration object.
  * @see https://on.cypress.io/configuration
  */
trait CypressConfiguration extends js.Object {
  //
  // animations
  //
  /**
    * The distance in pixels an element must exceed over
    * time to be considered animating.
    */
  var animationDistanceThreshold: Double
  //
  // global options
  //
  /**
    * Url used as prefix for `cy.visit()` or `cy.request()` command’s url
    */
  var baseUrl: String
  /**
    * A String or Array of hosts that you wish to block traffic for.
    */
  var blacklistHosts: String | js.Array[String]
  //
  // browser
  //
  /**
    * Whether Chrome Web Security for `same-origin` policy and
    * `insecure mixed content` is enabled.
    */
  var chromeWebSecurity: Boolean
  //
  // timeouts
  //
  /**
    * Time, in milliseconds, to wait until most DOM based commands
    * are considered timed out.
    */
  var defaultCommandTimeout: Double
  /**
    * Any values to be set as environment variables
    */
  var env: js.Object
  /**
    * Time, in milliseconds, to wait for a system command to
    * finish executing during a `cy.exec()` command.
    */
  var execTimeout: Double
  //
  // folders and files
  //
  /**
    * Path to folder where application files will attempt to be served from.
    */
  var fileServerFolder: String
  /**
    * Path to folder containing fixture files (Pass `false` to disable).
    */
  var fixturesFolder: String | `false`
  /**
    * A String or Array of glob patterns used to ignore test files
    * that would otherwise be shown in your list of tests.
    */
  var ignoreTestFiles: String | js.Array[String]
  /**
    * Path to folder containing integration test files.
    */
  var integrationFolder: String
  /**
    * Whether Cypress will search for and replace obstructive JS code
    * in `.js` or `.html` files.
    */
  var modifyObstructiveCode: Boolean
  /**
    * The number of tests for which snapshots and command data are kept in memory.
    * Reduce this number if you are experiencing high memory consumption in your browser during a test run.
    */
  var numTestsKeptInMemory: Double
  /**
    * Time, in milliseconds, to wait for page transition events or
    * `cy.visit()`, `cy.go()`, `cy.reload()` commands to fire
    * their page load events.
    */
  var pageLoadTimeout: Double
  /**
    * Path to plugins file. (Pass `false` to disable)
    */
  var pluginsFile: String | `false`
  /**
    * Port used to host Cypress. Normally this is a randomly generated port
    */
  var port: Double
  /**
    * The reporter used during the `cypress run`. Default is "spec"
    */
  var reporter: String
  /**
    * Time, in milliseconds, to wait for an XHR request to go out
    * in a `cy.wait()` command.
    */
  var requestTimeout: Double
  /**
    * Time, in milliseconds, to wait until a response in a
    * `cy.request()`, `cy.wait()`, `cy.fixture()`, `cy.getCookie()`,
    * `cy.getCookies()`, `cy.setCookie()`, `cy.clearCookie()`,
    * `cy.clearCookies()`, and `cy.screenshot()` commands.
    */
  var responseTimeout: Double
  /**
    * Path to folder where screenshots will be saved from `cy.screenshot()`
    * command or after a test fails during cypress run.
    */
  var screenshotsFolder: String
  /**
    * Path to file to load before test files load.
    * This file is compiled and bundled. (Pass `false` to disable).
    */
  var supportFile: String | `false`
  /**
    * Time, in milliseconds, to wait for a task to finish executing
    * during a `cy.task()` command.
    */
  var taskTimeout: Double
  /**
    * A String or Array of string glob pattern of the test files to load.
    */
  var testFiles: String | js.Array[String]
  //
  // screenshots
  //
  /**
    * Whether Cypress will trash assets within the `screenshotsFolder` and
    * `videosFolder` before tests run with cypress run. Default is `true`.
    */
  var trashAssetsBeforeRuns: Boolean
  /**
    * Enables you to override the default user agent the
    * browser sends in all request headers.
    */
  var userAgent: String
  /**
    * Whether Cypress will capture a video of the tests run with `cypress run`.
    */
  var video: Boolean
  //
  // videos
  //
  /**
    * The quality setting for the video compression, in Constant Rate Factor (CRF).
    * The value can be false to disable compression or a value between 0 and 51,
    * where a lower value results in better quality
    * (at the expense of a higher file size).
    */
  var videoCompression: Double | `false`
  /**
    * Whether Cypress will upload the video to the Dashboard even if
    * all tests are passing. This applies only when recording your runs
    * to the Dashboard. Turn this off if you’d like the video uploaded
    * only when there are failing tests.
    */
  var videoUploadOnPasses: Boolean
  /**
    * Path to folder where videos will be saved during `cypress run`
    */
  var videosFolder: String
  //
  // viewport
  //
  /**
    * Default height in pixels for the application under tests’ viewport
    * (Override with `cy.viewport()` command)
    */
  var viewportHeight: Double
  /**
    * Default width in pixels for the application under tests’ viewport.
    * (Override with `cy.viewport()` command)
    */
  var viewportWidth: Double
  /**
    * Whether to wait for elements to finish animating before executing commands.
    */
  var waitForAnimations: Boolean
}

object CypressConfiguration {
  @scala.inline
  def apply(
    animationDistanceThreshold: Double,
    baseUrl: String,
    blacklistHosts: String | js.Array[String],
    chromeWebSecurity: Boolean,
    defaultCommandTimeout: Double,
    env: js.Object,
    execTimeout: Double,
    fileServerFolder: String,
    fixturesFolder: String | `false`,
    ignoreTestFiles: String | js.Array[String],
    integrationFolder: String,
    modifyObstructiveCode: Boolean,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    pluginsFile: String | `false`,
    port: Double,
    reporter: String,
    requestTimeout: Double,
    responseTimeout: Double,
    screenshotsFolder: String,
    supportFile: String | `false`,
    taskTimeout: Double,
    testFiles: String | js.Array[String],
    trashAssetsBeforeRuns: Boolean,
    userAgent: String,
    video: Boolean,
    videoCompression: Double | `false`,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean
  ): CypressConfiguration = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], blacklistHosts = blacklistHosts.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder.asInstanceOf[js.Any], modifyObstructiveCode = modifyObstructiveCode.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pluginsFile = pluginsFile.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], taskTimeout = taskTimeout.asInstanceOf[js.Any], testFiles = testFiles.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressConfiguration]
  }
}

