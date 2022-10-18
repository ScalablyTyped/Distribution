package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalStorage extends StObject {
  
  /**
    * Called internally to clear `localStorage` in two situations.
    *
    * 1. Before every test, this is called with no argument to clear all keys.
    * 2. On `cy.clearLocalStorage(keys)` this is called with `keys` as an argument.
    *
    * You should not call this method directly to clear `localStorage`; instead, use `cy.clearLocalStorage(key)`.
    *
    * @see https://on.cypress.io/clearlocalstorage
    */
  def clear(): Unit = js.native
  def clear(keys: js.Array[String]): Unit = js.native
}
