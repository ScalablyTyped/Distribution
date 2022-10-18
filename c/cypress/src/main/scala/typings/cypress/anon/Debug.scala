package typings.cypress.anon

import typings.cypress.Cypress.CookieDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends StObject {
  
  def debug(enabled: Boolean): Unit = js.native
  def debug(enabled: Boolean, options: PartialDebugOptions): Unit = js.native
  
  /**
    * @deprecated Use `cy.session()` instead.
    * @see https://on.cypress.io/session
    */
  def defaults(options: PartialCookieDefaults): CookieDefaults = js.native
  
  /**
    * @deprecated Use `cy.session()` instead.
    * @see https://on.cypress.io/session
    */
  def preserveOnce(names: String*): Unit = js.native
}
