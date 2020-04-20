package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerClass extends js.Object {
  def Create(name: String, options: TriggerCreateOptions, callback: CbCallback): Unit
  def Fetch(name: String, callback: CbCallback): Unit
}

object TriggerClass {
  @scala.inline
  def apply(Create: (String, TriggerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TriggerClass]
  }
}

