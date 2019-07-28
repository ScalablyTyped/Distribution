package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Portal extends js.Object {
  var URI: String
  var name: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def fetch(callback: CbCallback): Unit
  def update(data: js.Object, callback: CbCallback): Unit
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
    val __obj = js.Dynamic.literal(URI = URI, fetch = js.Any.fromFunction1(fetch), name = name, systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction2(update), user = user)
  
    __obj.asInstanceOf[Portal]
  }
}

