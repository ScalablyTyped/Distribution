package typings
package cypressLib.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress NPM module interface.
  * @see https://on.cypress.io/module-api
  * @example
  ```
  const cypress = require('cypress')
  cypress.run().then(results => ...)
  ```
  */
@js.native
trait CypressNpmApi extends js.Object {
  /**
    * Opens Cypress GUI. Resolves with void when the
    * GUI is closed.
    * @see https://on.cypress.io/module-api#cypress-open
    */
  def open(): js.Promise[scala.Unit] = js.native
  def open(options: stdLib.Partial[CypressOpenOptions]): js.Promise[scala.Unit] = js.native
  /**
    * Execute a headless Cypress test run.
    * @see https://on.cypress.io/module-api#cypress-run
    * @example
    ```
    const cypress = require('cypress')
    // runs all spec files matching a wildcard
    cypress.run({
    spec: 'cypress/integration/admin*-spec.js'
    }).then(results => {
    // inspect results object
    })
    ```
    */
  def run(): js.Promise[CypressRunResult] = js.native
  def run(options: stdLib.Partial[CypressRunOptions]): js.Promise[CypressRunResult] = js.native
}

