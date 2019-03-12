package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(
    name: java.lang.String,
    description: java.lang.String,
    options: DeploymentOptions,
    callback: CbCallback
  ): scala.Unit
  def delete(name: java.lang.String, callback: CbCallback): scala.Unit
  def read(name: java.lang.String, callback: CbCallback): scala.Unit
  def readAll(query: QueryObj, callback: CbCallback): scala.Unit
  def update(name: java.lang.String, options: DeploymentOptions, callback: CbCallback): scala.Unit
}

object Deployment {
  @scala.inline
  def apply(
    create: (java.lang.String, java.lang.String, DeploymentOptions, CbCallback) => scala.Unit,
    delete: (java.lang.String, CbCallback) => scala.Unit,
    read: (java.lang.String, CbCallback) => scala.Unit,
    readAll: (QueryObj, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (java.lang.String, DeploymentOptions, CbCallback) => scala.Unit,
    user: APIUser
  ): Deployment = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction2(delete), read = js.Any.fromFunction2(read), readAll = js.Any.fromFunction2(readAll), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Deployment]
  }
}

