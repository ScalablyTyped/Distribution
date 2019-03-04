package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var instances: org.scalablytyped.runtime.StringDictionary[RoleInstance]
  var name: java.lang.String
}

object Role {
  @scala.inline
  def apply(instances: org.scalablytyped.runtime.StringDictionary[RoleInstance], name: java.lang.String): Role = {
    val __obj = js.Dynamic.literal(instances = instances, name = name)
  
    __obj.asInstanceOf[Role]
  }
}

