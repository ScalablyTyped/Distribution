package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent[A /* <: sinonLib.sinonMod.SinonNs.SinonSpy */] extends js.Object {
  /**
    * Saves current spy / stub under an alias.
    * @see https://on.cypress.io/stubs-spies-and-clocks
    * @see https://on.cypress.io/as
    * @example
    *    cy.spy(win, 'fetch').as('winFetch') // Alias 'window.fetch' spy as "winFetch"
    */
  def as(alias: java.lang.String): (Omit[A, cypressLib.cypressLibStrings.withArgs]) with Agent[A] = js.native
  def log(): (Omit[A, cypressLib.cypressLibStrings.withArgs]) with Agent[A] = js.native
  def log(shouldOutput: scala.Boolean): (Omit[A, cypressLib.cypressLibStrings.withArgs]) with Agent[A] = js.native
  /**
    * Creates a spy / stub but only for calls with given arguments.
    * @see https://on.cypress.io/stubs-spies-and-clocks
    * @see https://on.cypress.io/as
    * @example
    *    const s = cy.stub(JSON, 'parse').withArgs('invalid').returns(42)
    *    expect(JSON.parse('invalid')).to.equal(42)
    *    expect(s).to.have.been.calledOnce
    */
  def withArgs(args: js.Any*): (Omit[A, cypressLib.cypressLibStrings.withArgs]) with Agent[A] = js.native
}

