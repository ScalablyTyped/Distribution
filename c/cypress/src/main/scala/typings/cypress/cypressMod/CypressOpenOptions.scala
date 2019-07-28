package typings.cypress.cypressMod

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
trait CypressOpenOptions extends js.Object {
  /**
    * Specify a filesystem path to a custom browser
    */
  var browser: String
  /**
    * Specify configuration
    */
  var config: Partial[CypressConfiguration]
  /**
    * Open Cypress in detached mode
    */
  var detached: Boolean
  /**
    * Specify environment variables
    */
  var env: js.Object
  /**
    * Run in global mode
    */
  var global: Boolean
  /**
    * Override default port
    */
  var port: Double
  /**
    * Path to a specific project
    */
  var project: String
}

object CypressOpenOptions {
  @scala.inline
  def apply(
    browser: String,
    config: Partial[CypressConfiguration],
    detached: Boolean,
    env: js.Object,
    global: Boolean,
    port: Double,
    project: String
  ): CypressOpenOptions = {
    val __obj = js.Dynamic.literal(browser = browser, config = config, detached = detached, env = env, global = global, port = port, project = project)
  
    __obj.asInstanceOf[CypressOpenOptions]
  }
}

