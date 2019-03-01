package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleInstance extends js.Object {
  var endpoints: org.scalablytyped.runtime.StringDictionary[RoleInstanceEndpoint]
  var faultDomain: java.lang.String
  var id: java.lang.String
  var updateDomain: java.lang.String
}

object RoleInstance {
  @scala.inline
  def apply(
    endpoints: org.scalablytyped.runtime.StringDictionary[RoleInstanceEndpoint],
    faultDomain: java.lang.String,
    id: java.lang.String,
    updateDomain: java.lang.String
  ): RoleInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoints")(endpoints)
    __obj.updateDynamic("faultDomain")(faultDomain)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("updateDomain")(updateDomain)
    __obj.asInstanceOf[RoleInstance]
  }
}

