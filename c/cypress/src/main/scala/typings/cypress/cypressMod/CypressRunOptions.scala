package typings.cypress.cypressMod

import typings.cypress.anon.PartialResolvedConfigOpti
import typings.cypress.cypressBooleans.`false`
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
    * Display the browser instead of running headlessly
    */
  var headed: Boolean
  /**
    * Hide the browser instead of running headed
    */
  var headless: Boolean
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
  /**
    * Tag string for the recorded run, like "production,nightly"
    */
  var tag: String
}

object CypressRunOptions {
  @scala.inline
  def apply(
    browser: String,
    ciBuildId: String,
    config: PartialResolvedConfigOpti,
    configFile: String | `false`,
    env: js.Object,
    group: String,
    headed: Boolean,
    headless: Boolean,
    key: String,
    noExit: Boolean,
    parallel: Boolean,
    port: Double,
    project: String,
    record: Boolean,
    reporter: String,
    reporterOptions: js.Any,
    spec: String,
    tag: String
  ): CypressRunOptions = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], ciBuildId = ciBuildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], headed = headed.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], noExit = noExit.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterOptions = reporterOptions.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressRunOptions]
  }
}

