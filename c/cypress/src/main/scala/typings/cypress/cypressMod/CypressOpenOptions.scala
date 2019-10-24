package typings.cypress.cypressMod

import typings.cypress.cypressNumbers.`false`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that one can pass to "cypress.open"
  * @see https://on.cypress.io/module-api#cypress-open
  * @example
  ```
  const cypress = require('cypress')
  cypress.open({
  env: {
  username: 'Joe Doe',
  email: 'joe@acme.co'
  },
  project: '~/demos/my-project'
  })
  ```
  */
trait CypressOpenOptions extends CypressCommonOptions {
  /**
    * Specify a filesystem path to a custom browser
    */
  var browser: String
  /**
    * Open Cypress in detached mode
    */
  var detached: Boolean
  /**
    * Run in global mode
    */
  var global: Boolean
  /**
    * Override default port
    */
  var port: Double
}

object CypressOpenOptions {
  @scala.inline
  def apply(
    browser: String,
    config: Partial[CypressConfiguration],
    configFile: String | `false`,
    detached: Boolean,
    env: js.Object,
    global: Boolean,
    port: Double,
    project: String
  ): CypressOpenOptions = {
    val __obj = js.Dynamic.literal(browser = browser, config = config, configFile = configFile.asInstanceOf[js.Any], detached = detached, env = env, global = global, port = port, project = project)
  
    __obj.asInstanceOf[CypressOpenOptions]
  }
}

