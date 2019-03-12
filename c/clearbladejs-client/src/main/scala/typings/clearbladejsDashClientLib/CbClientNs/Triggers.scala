package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triggers extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(name: java.lang.String, data: js.Object, callback: CbCallback): scala.Unit
  def delete(name: java.lang.String, callback: CbCallback): scala.Unit
  def fetchDefinitions(callback: CbCallback): scala.Unit
  def update(name: java.lang.String, data: js.Object, callback: CbCallback): scala.Unit
}

object Triggers {
  @scala.inline
  def apply(
    URI: java.lang.String,
    create: (java.lang.String, js.Object, CbCallback) => scala.Unit,
    delete: (java.lang.String, CbCallback) => scala.Unit,
    fetchDefinitions: CbCallback => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (java.lang.String, js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): Triggers = {
    val __obj = js.Dynamic.literal(URI = URI, create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), fetchDefinitions = js.Any.fromFunction1(fetchDefinitions), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Triggers]
  }
}

