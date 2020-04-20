package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerClass extends js.Object {
  def Create(name: String, options: TimerCreateOptions, callback: CbCallback): Unit
  def Fetch(name: String, callback: CbCallback): Unit
}

object TimerClass {
  @scala.inline
  def apply(Create: (String, TimerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TimerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TimerClass]
  }
}

