package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerInstance extends js.Object {
  var name: String = js.native
  var systemKey: String = js.native
  def Delete(callback: CbCallback): Unit = js.native
  def Update(options: js.Object, callback: CbCallback): Unit = js.native
}

object TriggerInstance {
  @scala.inline
  def apply(
    Delete: CbCallback => Unit,
    Update: (js.Object, CbCallback) => Unit,
    name: String,
    systemKey: String
  ): TriggerInstance = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction1(Delete), Update = js.Any.fromFunction2(Update), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerInstance]
  }
  @scala.inline
  implicit class TriggerInstanceOps[Self <: TriggerInstance] (val x: Self) extends AnyVal {
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
    def setDelete(value: CbCallback => Unit): Self = this.set("Delete", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: (js.Object, CbCallback) => Unit): Self = this.set("Update", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
  }
  
}

