package typings.cypress.cypressMod

import typings.cypress.cypressNumbers.`false`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that one can pass to "cypress.run"
  * @see https://on.cypress.io/module-api#cypress-run
  * @example
  ```
  const cypress = require('cypress')
  cypress.run({
  reporter: 'junit',
  browser: 'chrome',
  config: {
  baseUrl: 'http://localhost:8080',
  chromeWebSecurity: false,
  },
  env: {
  foo: 'bar',
  baz: 'quux',
  }
  })
  ```
  */
trait CypressRunOptions extends CypressCommonOptions {
  /**
    * Specify different browser to run tests in, either by name or by filesystem path
    */
  var browser: String
  /**
    * Specify a unique identifier for a run to enable grouping or parallelization
    */
  var ciBuildId: String
  /**
    * Group recorded tests together under a single run name
    */
  var group: String
  /**
    * Display the Electron browser instead of running headlessly
    */
  var headed: Boolean
  /**
    * Specify your secret record key
    */
  var key: String
  /**
    * Keep Cypress open after all tests run
    */
  var noExit: Boolean
  /**
    * Run recorded specs in parallel across multiple machines
    */
  var parallel: Boolean
  /**
    * Override default port
    */
  var port: Double
  /**
    * Whether to record the test run
    */
  var record: Boolean
  /**
    * Specify a mocha reporter
    */
  var reporter: String
  /**
    * Specify mocha reporter options
    */
  var reporterOptions: js.Any
  /**
    * Specify the specs to run
    */
  var spec: String
}

object CypressRunOptions {
  @scala.inline
  def apply(
    browser: String,
    ciBuildId: String,
    config: Partial[CypressConfiguration],
    configFile: String | `false`,
    env: js.Object,
    group: String,
    headed: Boolean,
    key: String,
    noExit: Boolean,
    parallel: Boolean,
    port: Double,
    project: String,
    record: Boolean,
    reporter: String,
    reporterOptions: js.Any,
    spec: String
  ): CypressRunOptions = {
    val __obj = js.Dynamic.literal(browser = browser, ciBuildId = ciBuildId, config = config, configFile = configFile.asInstanceOf[js.Any], env = env, group = group, headed = headed, key = key, noExit = noExit, parallel = parallel, port = port, project = project, record = record, reporter = reporter, reporterOptions = reporterOptions, spec = spec)
  
    __obj.asInstanceOf[CypressRunOptions]
  }
}

