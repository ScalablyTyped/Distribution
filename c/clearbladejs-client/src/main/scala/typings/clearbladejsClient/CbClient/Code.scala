package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var URI: String = js.native
  var callTimeout: Double = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def create(name: String, body: String, callback: CbCallback): Unit = js.native
  def delete(name: String, callback: CbCallback): Unit = js.native
  def execute(name: String, params: js.Object, callback: CbCallback): Unit = js.native
  def getAllServices(callback: CbCallback): Unit = js.native
  def getCompletedServices(callback: CbCallback): Unit = js.native
  def getFailedServices(callback: CbCallback): Unit = js.native
  def update(name: String, body: String, callback: CbCallback): Unit = js.native
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    create: (String, String, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    execute: (String, js.Object, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    getCompletedServices: CbCallback => Unit,
    getFailedServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, String, CbCallback) => Unit,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), execute = js.Any.fromFunction3(execute), getAllServices = js.Any.fromFunction1(getAllServices), getCompletedServices = js.Any.fromFunction1(getCompletedServices), getFailedServices = js.Any.fromFunction1(getFailedServices), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
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
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallTimeout(value: Double): Self = this.set("callTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: (String, String, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def setDelete(value: (String, CbCallback) => Unit): Self = this.set("delete", js.Any.fromFunction2(value))
    @scala.inline
    def setExecute(value: (String, js.Object, CbCallback) => Unit): Self = this.set("execute", js.Any.fromFunction3(value))
    @scala.inline
    def setGetAllServices(value: CbCallback => Unit): Self = this.set("getAllServices", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCompletedServices(value: CbCallback => Unit): Self = this.set("getCompletedServices", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFailedServices(value: CbCallback => Unit): Self = this.set("getFailedServices", js.Any.fromFunction1(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (String, String, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

