package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(name: String, description: String, options: DeploymentOptions, callback: CbCallback): Unit
  def delete(name: String, callback: CbCallback): Unit
  def read(name: String, callback: CbCallback): Unit
  def readAll(query: QueryObj, callback: CbCallback): Unit
  def update(name: String, options: DeploymentOptions, callback: CbCallback): Unit
}

object Deployment {
  @scala.inline
  def apply(
    create: (String, String, DeploymentOptions, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    read: (String, CbCallback) => Unit,
    readAll: (QueryObj, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, DeploymentOptions, CbCallback) => Unit,
    user: APIUser
  ): Deployment = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction2(delete), read = js.Any.fromFunction2(read), readAll = js.Any.fromFunction2(readAll), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Deployment]
  }
}

