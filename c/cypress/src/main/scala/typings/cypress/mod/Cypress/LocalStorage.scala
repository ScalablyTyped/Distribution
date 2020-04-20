package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStorage extends js.Object {
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

