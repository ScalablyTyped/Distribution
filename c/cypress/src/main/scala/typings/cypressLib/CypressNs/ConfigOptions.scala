package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigOptions extends js.Object {
  /**
       * The distance in pixels an element must exceed over time to be considered animating
       * @default 5
       */
  var animationDistanceThreshold: scala.Double
  /**
       * Url used as prefix for [cy.visit()](https://on.cypress.io/visit) or [cy.request()](https://on.cypress.io/request) command’s url
       * @default null
       */
  var baseUrl: java.lang.String | scala.Null
  /**
       * Whether Chrome Web Security for same-origin policy and insecure mixed content is enabled. Read more about this here
       * @default true
       */
  var chromeWebSecurity: scala.Boolean
  /**
       * Time, in milliseconds, to wait until most DOM based commands are considered timed out
       * @default 4000
       */
  var defaultCommandTimeout: scala.Double
  /**
       * Any values to be set as [environment variables](https://docs.cypress.io/guides/guides/environment-variables.html)
       * @default {}
       */
  var env: ScalablyTyped.runtime.StringDictionary[js.Any]
  /**
       * Time, in milliseconds, to wait for a system command to finish executing during a [cy.exec()](https://on.cypress.io/exec) command
       * @default 60000
       */
  var execTimeout: scala.Double
  /**
       * Path to folder where application files will attempt to be served from
       * @default root project folder
       */
  var fileServerFolder: java.lang.String
  /**
       * Path to folder containing fixture files (Pass false to disable)
       * @default "cypress/fixtures"
       */
  var fixturesFolder: java.lang.String
  /**
       * A String or Array of glob patterns used to ignore test files that would otherwise be shown in your list of tests. Cypress uses minimatch with the options: {dot: true, matchBase: true}. We suggest using http://globtester.com to test what files would match.
       * @default "*.hot-update.js"
       */
  var ignoreTestFiles: java.lang.String | js.Array[java.lang.String]
  /**
       * Path to folder containing integration test files
       * @default "cypress/integration"
       */
  var integrationFolder: java.lang.String
  /**
       * The number of tests for which snapshots and command data are kept in memory. Reduce this number if you are experiencing high memory consumption in your browser during a test run.
       * @default 50
       */
  var numTestsKeptInMemory: scala.Double
  /**
       * Time, in milliseconds, to wait for page transition events or [cy.visit()](https://on.cypress.io/visit), [cy.go()](https://on.cypress.io/go), [cy.reload()](https://on.cypress.io/reload) commands to fire their page load events
       * @default 60000
       */
  var pageLoadTimeout: scala.Double
  /**
       * Path to plugins file. (Pass false to disable)
       * @default "cypress/plugins/index.js"
       */
  var pluginsFile: java.lang.String
  /**
       * Port used to host Cypress. Normally this is a randomly generated port
       * @default null
       */
  var port: scala.Double | scala.Null
  /**
       * The [reporter](https://docs.cypress.io/guides/guides/reporters.html) used when running headlessly or in CI
       * @default "spec"
       */
  var reporter: java.lang.String
  /**
       * Time, in milliseconds, to wait for an XHR request to go out in a [cy.wait()](https://on.cypress.io/wait) command
       * @default 5000
       */
  var requestTimeout: scala.Double
  /**
       * Time, in milliseconds, to wait until a response in a [cy.request()](https://on.cypress.io/request), [cy.wait()](https://on.cypress.io/wait), [cy.fixture()](https://on.cypress.io/fixture), [cy.getCookie()](https://on.cypress.io/getcookie), [cy.getCookies()](https://on.cypress.io/getcookies), [cy.setCookie()](https://on.cypress.io/setcookie), [cy.clearCookie()](https://on.cypress.io/clearcookie), [cy.clearCookies()](https://on.cypress.io/clearcookies), and [cy.screenshot()](https://on.cypress.io/screenshot) commands
       * @default 30000
       */
  var responseTimeout: scala.Double
  /**
       * Path to folder where screenshots will be saved from [cy.screenshot()](https://on.cypress.io/screenshot) command or after a headless or CI run’s test failure
       * @default "cypress/screenshots"
       */
  var screenshotsFolder: java.lang.String
  /**
       * Path to file to load before test files load. This file is compiled and bundled. (Pass false to disable)
       * @default "cypress/support/index.js"
       */
  var supportFile: java.lang.String
  /**
       * Whether Cypress will trash assets within the screenshotsFolder and videosFolder before headless test runs.
       * @default true
       */
  var trashAssetsBeforeRuns: scala.Boolean
  /**
       * Whether Cypress will record a video of the test run when running headlessly.
       * @default true
       */
  var video: scala.Boolean
  /**
       * The quality setting for the video compression, in Constant Rate Factor (CRF). The value can be false to disable compression or a value between 0 and 51, where a lower value results in better quality (at the expense of a higher file size).
       * @default 32
       */
  var videoCompression: scala.Double
  /**
       * Whether Cypress will upload the video to the Dashboard even if all tests are passing. This applies only when recording your runs to the Dashboard. Turn this off if you’d like the video uploaded only when there are failing tests.
       * @default true
       */
  var videoUploadOnPasses: scala.Boolean
  /**
       * Path to folder where videos will be saved after a headless or CI run
       * @default "cypress/videos"
       */
  var videosFolder: java.lang.String
  /**
       * Default height in pixels for the application under tests’ viewport (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
       * @default 660
       */
  var viewportHeight: scala.Double
  /**
       * Default width in pixels for the application under tests’ viewport. (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
       * @default 1000
       */
  var viewportWidth: scala.Double
  /**
       * Whether to wait for elements to finish animating before executing commands
       * @default true
       */
  var waitForAnimations: scala.Boolean
  /**
       * Whether to take a screenshot on test failure when running headlessly or in CI
       * @default true
       */
  var watchForFileChanges: scala.Boolean
}

