package typings.cypress.mod

import typings.cypress.mod.Cypress.cy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter
  extends typings.eventemitter2.mod.EventEmitter2 {
  def emitMap(eventName: String, args: js.Array[_]): js.Array[js.Function1[/* repeated */ _, _]] = js.native
  def emitThen(eventName: String, args: js.Array[_]): Bluebird[_] = js.native
  def proxyTo(cy: cy): Null = js.native
}

