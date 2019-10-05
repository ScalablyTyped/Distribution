package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triggers extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(name: String, data: js.Object, callback: CbCallback): Unit
  def delete(name: String, callback: CbCallback): Unit
  def fetchDefinitions(callback: CbCallback): Unit
  def update(name: String, data: js.Object, callback: CbCallback): Unit
}

object Triggers {
  @scala.inline
  def apply(
    URI: String,
    create: (String, js.Object, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    fetchDefinitions: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Triggers = {
    val __obj = js.Dynamic.literal(URI = URI, create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), fetchDefinitions = js.Any.fromFunction1(fetchDefinitions), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Triggers]
  }
}

