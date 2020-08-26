package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerClass extends js.Object {
  def Create(name: String, options: TriggerCreateOptions, callback: CbCallback): Unit = js.native
  def Fetch(name: String, callback: CbCallback): Unit = js.native
}

object TriggerClass {
  @scala.inline
  def apply(Create: (String, TriggerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TriggerClass]
  }
  @scala.inline
  implicit class TriggerClassOps[Self <: TriggerClass] (val x: Self) extends AnyVal {
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
    def setCreate(value: (String, TriggerCreateOptions, CbCallback) => Unit): Self = this.set("Create", js.Any.fromFunction3(value))
    @scala.inline
    def setFetch(value: (String, CbCallback) => Unit): Self = this.set("Fetch", js.Any.fromFunction2(value))
  }
  
}

