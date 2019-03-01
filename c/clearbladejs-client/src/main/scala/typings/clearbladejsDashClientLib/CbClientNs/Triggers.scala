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
    create: js.Function3[java.lang.String, js.Object, CbCallback, scala.Unit],
    delete: js.Function2[java.lang.String, CbCallback, scala.Unit],
    fetchDefinitions: js.Function1[CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[java.lang.String, js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): Triggers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("fetchDefinitions")(fetchDefinitions)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("systemSecret")(systemSecret)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Triggers]
  }
}

