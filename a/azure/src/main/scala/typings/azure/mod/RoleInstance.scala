package typings.azure.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleInstance extends js.Object {
  var endpoints: StringDictionary[RoleInstanceEndpoint]
  var faultDomain: String
  var id: String
  var updateDomain: String
}

object RoleInstance {
  @scala.inline
  def apply(
    endpoints: StringDictionary[RoleInstanceEndpoint],
    faultDomain: String,
    id: String,
    updateDomain: String
  ): RoleInstance = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], faultDomain = faultDomain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updateDomain = updateDomain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoleInstance]
  }
}

