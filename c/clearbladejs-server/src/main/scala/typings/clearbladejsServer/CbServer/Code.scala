package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def execute(name: String, params: js.Object, loggingEnabled: Boolean, callback: CbCallback): Unit = js.native
  def getAllServices(callback: CbCallback): Unit = js.native
}

object Code {
  @scala.inline
  def apply(
    execute: (String, js.Object, Boolean, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute), getAllServices = js.Any.fromFunction1(getAllServices), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setExecute(value: (String, js.Object, Boolean, CbCallback) => Unit): Self = this.set("execute", js.Any.fromFunction4(value))
    @scala.inline
    def setGetAllServices(value: CbCallback => Unit): Self = this.set("getAllServices", js.Any.fromFunction1(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

