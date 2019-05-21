package typings
package cypressLib.cypressMod

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
  var browser: java.lang.String
  /**
    * Specify configuration
    */
  var config: stdLib.Partial[CypressConfiguration]
  /**
    * Open Cypress in detached mode
    */
  var detached: scala.Boolean
  /**
    * Specify environment variables
    */
  var env: js.Object
  /**
    * Run in global mode
    */
  var global: scala.Boolean
  /**
    * Override default port
    */
  var port: scala.Double
  /**
    * Path to a specific project
    */
  var project: java.lang.String
}

object CypressOpenOptions {
  @scala.inline
  def apply(
    browser: java.lang.String,
    config: stdLib.Partial[CypressConfiguration],
    detached: scala.Boolean,
    env: js.Object,
    global: scala.Boolean,
    port: scala.Double,
    project: java.lang.String
  ): CypressOpenOptions = {
    val __obj = js.Dynamic.literal(browser = browser, config = config, detached = detached, env = env, global = global, port = port, project = project)
  
    __obj.asInstanceOf[CypressOpenOptions]
  }
}

