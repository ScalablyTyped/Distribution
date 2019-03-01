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
    create: js.Function4[java.lang.String, java.lang.String, DeploymentOptions, CbCallback, scala.Unit],
    delete: js.Function2[java.lang.String, CbCallback, scala.Unit],
    read: js.Function2[java.lang.String, CbCallback, scala.Unit],
    readAll: js.Function2[QueryObj, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[java.lang.String, DeploymentOptions, CbCallback, scala.Unit],
    user: APIUser
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("readAll")(readAll)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("systemSecret")(systemSecret)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Deployment]
  }
}

