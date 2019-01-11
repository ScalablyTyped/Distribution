package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Global variable `Cypress` holds common utilities and constants.
    * @see https://on.cypress.io/api
    * @example
    *    Cypress.config("pageLoadTimeout") // => 60000
    *    Cypress.version // => "1.4.0"
    *    Cypress._ // => Lodash _
    */
  val Cypress: cypressLib.CypressNs.Cypress = js.native
  val assert: chaiLib.ChaiNs.AssertStatic = js.native
  /**
    * Global variables `cy` added by Cypress with all API commands.
    * @see https://on.cypress.io/api
    * @example
    *    cy.get('button').click()
    *    cy.get('.result').contains('Expected text')
    */
  val cy: cypressLib.CypressNs.Chainable[js.UndefOr[scala.Nothing]] = js.native
  // Cypress adds chai expect and assert to global
  val expect: chaiLib.ChaiNs.ExpectStatic = js.native
}

