package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Portal extends js.Object {
  var URI: String = js.native
  var name: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def fetch(callback: CbCallback): Unit = js.native
  def update(data: js.Object, callback: CbCallback): Unit = js.native
}

object Portal {
  @scala.inline
  def apply(
    URI: String,
    fetch: CbCallback => Unit,
    name: String,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): Portal = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fetch = js.Any.fromFunction1(fetch), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Portal]
  }
  @scala.inline
  implicit class PortalOps[Self <: Portal] (val x: Self) extends AnyVal {
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
    def setFetch(value: CbCallback => Unit): Self = this.set("fetch", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (js.Object, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

