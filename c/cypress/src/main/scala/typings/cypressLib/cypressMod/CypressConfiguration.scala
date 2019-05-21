package typings
package cypressLib.cypressMod

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
  var animationDistanceThreshold: scala.Double
  //
  // global options
  //
  /**
    * Url used as prefix for `cy.visit()` or `cy.request()` command’s url
    */
  var baseUrl: java.lang.String
  /**
    * A String or Array of hosts that you wish to block traffic for.
    */
  var blacklistHosts: java.lang.String | js.Array[java.lang.String]
  //
  // browser
  //
  /**
    * Whether Chrome Web Security for `same-origin` policy and
    * `insecure mixed content` is enabled.
    */
  var chromeWebSecurity: scala.Boolean
  //
  // timeouts
  //
  /**
    * Time, in milliseconds, to wait until most DOM based commands
    * are considered timed out.
    */
  var defaultCommandTimeout: scala.Double
  /**
    * Any values to be set as environment variables
    */
  var env: js.Object
  /**
    * Time, in milliseconds, to wait for a system command to
    * finish executing during a `cy.exec()` command.
    */
  var execTimeout: scala.Double
  //
  // folders and files
  //
  /**
    * Path to folder where application files will attempt to be served from.
    */
  var fileServerFolder: java.lang.String
  /**
    * Path to folder containing fixture files (Pass `false` to disable).
    */
  var fixturesFolder: java.lang.String | cypressLib.cypressLibNumbers.`false`
  /**
    * A String or Array of glob patterns used to ignore test files
    * that would otherwise be shown in your list of tests.
    */
  var ignoreTestFiles: java.lang.String | js.Array[java.lang.String]
  /**
    * Path to folder containing integration test files.
    */
  var integrationFolder: java.lang.String
  /**
    * Whether Cypress will search for and replace obstructive JS code
    * in `.js` or `.html` files.
    */
  var modifyObstructiveCode: scala.Boolean
  /**
    * The number of tests for which snapshots and command data are kept in memory.
    * Reduce this number if you are experiencing high memory consumption in your browser during a test run.
    */
  var numTestsKeptInMemory: scala.Double
  /**
    * Time, in milliseconds, to wait for page transition events or
    * `cy.visit()`, `cy.go()`, `cy.reload()` commands to fire
    * their page load events.
    */
  var pageLoadTimeout: scala.Double
  /**
    * Path to plugins file. (Pass `false` to disable)
    */
  var pluginsFile: java.lang.String | cypressLib.cypressLibNumbers.`false`
  /**
    * Port used to host Cypress. Normally this is a randomly generated port
    */
  var port: scala.Double
  /**
    * The reporter used during the `cypress run`. Default is "spec"
    */
  var reporter: java.lang.String
  /**
    * Time, in milliseconds, to wait for an XHR request to go out
    * in a `cy.wait()` command.
    */
  var requestTimeout: scala.Double
  /**
    * Time, in milliseconds, to wait until a response in a
    * `cy.request()`, `cy.wait()`, `cy.fixture()`, `cy.getCookie()`,
    * `cy.getCookies()`, `cy.setCookie()`, `cy.clearCookie()`,
    * `cy.clearCookies()`, and `cy.screenshot()` commands.
    */
  var responseTimeout: scala.Double
  /**
    * Path to folder where screenshots will be saved from `cy.screenshot()`
    * command or after a test fails during cypress run.
    */
  var screenshotsFolder: java.lang.String
  /**
    * Path to file to load before test files load.
    * This file is compiled and bundled. (Pass `false` to disable).
    */
  var supportFile: java.lang.String | cypressLib.cypressLibNumbers.`false`
  /**
    * Time, in milliseconds, to wait for a task to finish executing
    * during a `cy.task()` command.
    */
  var taskTimeout: scala.Double
  /**
    * A String glob pattern of the test files to load.
    */
  var testFiles: java.lang.String
  //
  // screenshots
  //
  /**
    * Whether Cypress will trash assets within the `screenshotsFolder` and
    * `videosFolder` before tests run with cypress run. Default is `true`.
    */
  var trashAssetsBeforeRuns: scala.Boolean
  /**
    * Enables you to override the default user agent the
    * browser sends in all request headers.
    */
  var userAgent: java.lang.String
  /**
    * Whether Cypress will capture a video of the tests run with `cypress run`.
    */
  var video: scala.Boolean
  //
  // videos
  //
  /**
    * The quality setting for the video compression, in Constant Rate Factor (CRF).
    * The value can be false to disable compression or a value between 0 and 51,
    * where a lower value results in better quality
    * (at the expense of a higher file size).
    */
  var videoCompression: scala.Double | cypressLib.cypressLibNumbers.`false`
  /**
    * Whether Cypress will upload the video to the Dashboard even if
    * all tests are passing. This applies only when recording your runs
    * to the Dashboard. Turn this off if you’d like the video uploaded
    * only when there are failing tests.
    */
  var videoUploadOnPasses: scala.Boolean
  /**
    * Path to folder where videos will be saved during `cypress run`
    */
  var videosFolder: java.lang.String
  //
  // viewport
  //
  /**
    * Default height in pixels for the application under tests’ viewport
    * (Override with `cy.viewport()` command)
    */
  var viewportHeight: scala.Double
  /**
    * Default width in pixels for the application under tests’ viewport.
    * (Override with `cy.viewport()` command)
    */
  var viewportWidth: scala.Double
  /**
    * Whether to wait for elements to finish animating before executing commands.
    */
  var waitForAnimations: scala.Boolean
}

object CypressConfiguration {
  @scala.inline
  def apply(
    animationDistanceThreshold: scala.Double,
    baseUrl: java.lang.String,
    blacklistHosts: java.lang.String | js.Array[java.lang.String],
    chromeWebSecurity: scala.Boolean,
    defaultCommandTimeout: scala.Double,
    env: js.Object,
    execTimeout: scala.Double,
    fileServerFolder: java.lang.String,
    fixturesFolder: java.lang.String | cypressLib.cypressLibNumbers.`false`,
    ignoreTestFiles: java.lang.String | js.Array[java.lang.String],
    integrationFolder: java.lang.String,
    modifyObstructiveCode: scala.Boolean,
    numTestsKeptInMemory: scala.Double,
    pageLoadTimeout: scala.Double,
    pluginsFile: java.lang.String | cypressLib.cypressLibNumbers.`false`,
    port: scala.Double,
    reporter: java.lang.String,
    requestTimeout: scala.Double,
    responseTimeout: scala.Double,
    screenshotsFolder: java.lang.String,
    supportFile: java.lang.String | cypressLib.cypressLibNumbers.`false`,
    taskTimeout: scala.Double,
    testFiles: java.lang.String,
    trashAssetsBeforeRuns: scala.Boolean,
    userAgent: java.lang.String,
    video: scala.Boolean,
    videoCompression: scala.Double | cypressLib.cypressLibNumbers.`false`,
    videoUploadOnPasses: scala.Boolean,
    videosFolder: java.lang.String,
    viewportHeight: scala.Double,
    viewportWidth: scala.Double,
    waitForAnimations: scala.Boolean
  ): CypressConfiguration = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold, baseUrl = baseUrl, blacklistHosts = blacklistHosts.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity, defaultCommandTimeout = defaultCommandTimeout, env = env, execTimeout = execTimeout, fileServerFolder = fileServerFolder, fixturesFolder = fixturesFolder.asInstanceOf[js.Any], ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder, modifyObstructiveCode = modifyObstructiveCode, numTestsKeptInMemory = numTestsKeptInMemory, pageLoadTimeout = pageLoadTimeout, pluginsFile = pluginsFile.asInstanceOf[js.Any], port = port, reporter = reporter, requestTimeout = requestTimeout, responseTimeout = responseTimeout, screenshotsFolder = screenshotsFolder, supportFile = supportFile.asInstanceOf[js.Any], taskTimeout = taskTimeout, testFiles = testFiles, trashAssetsBeforeRuns = trashAssetsBeforeRuns, userAgent = userAgent, video = video, videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses, videosFolder = videosFolder, viewportHeight = viewportHeight, viewportWidth = viewportWidth, waitForAnimations = waitForAnimations)
  
    __obj.asInstanceOf[CypressConfiguration]
  }
}

