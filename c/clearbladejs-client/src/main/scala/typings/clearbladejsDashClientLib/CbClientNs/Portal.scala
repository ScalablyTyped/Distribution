package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Portal extends js.Object {
  var URI: java.lang.String
  var name: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def fetch(callback: CbCallback): scala.Unit
  def update(data: js.Object, callback: CbCallback): scala.Unit
}

object Portal {
  @scala.inline
  def apply(
    URI: java.lang.String,
    fetch: CbCallback => scala.Unit,
    name: java.lang.String,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): Portal = {
    val __obj = js.Dynamic.literal(URI = URI, fetch = js.Any.fromFunction1(fetch), name = name, systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction2(update), user = user)
  
    __obj.asInstanceOf[Portal]
  }
}

