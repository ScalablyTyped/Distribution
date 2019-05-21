package typings
package cypressLib.cypressMod

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
trait CypressRunOptions extends js.Object {
  /**
    * Specify different browser to run tests in, either by name or by filesystem path
    */
  var browser: java.lang.String
  /**
    * Specify a unique identifier for a run to enable grouping or parallelization
    */
  var ciBuildId: java.lang.String
  /**
    * Specify configuration
    */
  var config: stdLib.Partial[CypressConfiguration]
  /**
    * Specify environment variables
    */
  var env: js.Object
  /**
    * Group recorded tests together under a single run name
    */
  var group: java.lang.String
  /**
    * Display the Electron browser instead of running headlessly
    */
  var headed: scala.Boolean
  /**
    * Specify your secret record key
    */
  var key: java.lang.String
  /**
    * Keep Cypress open after all tests run
    */
  var noExit: scala.Boolean
  /**
    * Run recorded specs in parallel across multiple machines
    */
  var parallel: scala.Boolean
  /**
    * Override default port
    */
  var port: scala.Double
  /**
    * Path to a specific project
    */
  var project: java.lang.String
  /**
    * Whether to record the test run
    */
  var record: scala.Boolean
  /**
    * Specify a mocha reporter
    */
  var reporter: java.lang.String
  /**
    * Specify mocha reporter options
    */
  var reporterOptions: js.Any
  /**
    * Specify the specs to run
    */
  var spec: java.lang.String
}

object CypressRunOptions {
  @scala.inline
  def apply(
    browser: java.lang.String,
    ciBuildId: java.lang.String,
    config: stdLib.Partial[CypressConfiguration],
    env: js.Object,
    group: java.lang.String,
    headed: scala.Boolean,
    key: java.lang.String,
    noExit: scala.Boolean,
    parallel: scala.Boolean,
    port: scala.Double,
    project: java.lang.String,
    record: scala.Boolean,
    reporter: java.lang.String,
    reporterOptions: js.Any,
    spec: java.lang.String
  ): CypressRunOptions = {
    val __obj = js.Dynamic.literal(browser = browser, ciBuildId = ciBuildId, config = config, env = env, group = group, headed = headed, key = key, noExit = noExit, parallel = parallel, port = port, project = project, record = record, reporter = reporter, reporterOptions = reporterOptions, spec = spec)
  
    __obj.asInstanceOf[CypressRunOptions]
  }
}

