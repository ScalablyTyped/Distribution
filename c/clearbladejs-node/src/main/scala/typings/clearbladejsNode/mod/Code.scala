package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var URI: String = js.native
  var URIPrefix: String = js.native
  var callTimeout: Double = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def execute(name: String, params: js.Object, callback: CbCallback): Unit = js.native
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    URIPrefix: String,
    callTimeout: Double,
    execute: (String, js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], URIPrefix = URIPrefix.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], execute = js.Any.fromFunction3(execute), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
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
    def setURIPrefix(value: String): Self = this.set("URIPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallTimeout(value: Double): Self = this.set("callTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: (String, js.Object, CbCallback) => Unit): Self = this.set("execute", js.Any.fromFunction3(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

