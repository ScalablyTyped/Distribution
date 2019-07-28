package typings.cypress.cypressMod

import typings.std.Partial
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
  def open(): js.Promise[Unit] = js.native
  def open(options: Partial[CypressOpenOptions]): js.Promise[Unit] = js.native
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
  def run(options: Partial[CypressRunOptions]): js.Promise[CypressRunResult] = js.native
}

