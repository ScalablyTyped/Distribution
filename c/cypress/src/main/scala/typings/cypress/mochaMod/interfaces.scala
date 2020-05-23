package typings.cypress.mochaMod

import typings.cypress.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "interfaces")
@js.native
object interfaces extends js.Object {
  def bdd(suite: Suite): Unit = js.native
  def exports(suite: Suite): Unit = js.native
  def qunit(suite: Suite): Unit = js.native
  def tdd(suite: Suite): Unit = js.native
}

