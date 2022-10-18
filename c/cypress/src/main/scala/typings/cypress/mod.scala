package typings.cypress

import org.scalablytyped.runtime.Shortcut
import typings.cypress.Cypress.ConfigOptions
import typings.cypress.CypressCommandLine.CypressCliParser
import typings.cypress.CypressCommandLine.CypressFailedRunResult
import typings.cypress.CypressCommandLine.CypressRunResult
import typings.cypress.anon.PartialCypressOpenOptions
import typings.cypress.anon.PartialCypressRunOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cypress", JSImport.Namespace)
  @js.native
  val ^ : CypressNpmApi = js.native
  
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
  trait CypressNpmApi extends StObject {
    
    /**
      * Utility functions for parsing CLI arguments the same way
      * Cypress does
      */
    var cli: CypressCliParser = js.native
    
    /**
      * Provides automatic code completion for configuration in many popular code editors.
      * While it's not strictly necessary for Cypress to parse your configuration, we
      * recommend wrapping your config object with `defineConfig()`
      * @example
      * module.exports = defineConfig({
      *   viewportWith: 400
      * })
      *
      * @see ../types/cypress-npm-api.d.ts
      * @param {Cypress.ConfigOptions} config
      * @returns {Cypress.ConfigOptions} the configuration passed in parameter
      */
    def defineConfig[ComponentDevServerOpts](config: ConfigOptions[ComponentDevServerOpts]): ConfigOptions[Any] = js.native
    
    /**
      * Opens Cypress GUI. Resolves with void when the
      * GUI is closed.
      * @see https://on.cypress.io/module-api#cypress-open
      */
    def open(): js.Promise[Unit] = js.native
    def open(options: PartialCypressOpenOptions): js.Promise[Unit] = js.native
    
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
      if (results.status === 'failed') {
      // Cypress could not run
      } else {
      // inspect results object
      }
      })
      ```
      */
    def run(): js.Promise[CypressRunResult | CypressFailedRunResult] = js.native
    def run(options: PartialCypressRunOptions): js.Promise[CypressRunResult | CypressFailedRunResult] = js.native
  }
  
  type _To = CypressNpmApi
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CypressNpmApi = ^
}
