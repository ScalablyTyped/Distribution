package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerClass extends js.Object {
  def Create(name: String, options: TimerCreateOptions, callback: CbCallback): Unit = js.native
  def Fetch(name: String, callback: CbCallback): Unit = js.native
}

object TimerClass {
  @scala.inline
  def apply(Create: (String, TimerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TimerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TimerClass]
  }
  @scala.inline
  implicit class TimerClassOps[Self <: TimerClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: (String, TimerCreateOptions, CbCallback) => Unit): Self = this.set("Create", js.Any.fromFunction3(value))
    @scala.inline
    def setFetch(value: (String, CbCallback) => Unit): Self = this.set("Fetch", js.Any.fromFunction2(value))
  }
  
}

