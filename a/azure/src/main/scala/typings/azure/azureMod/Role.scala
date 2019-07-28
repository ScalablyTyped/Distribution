package typings.azure.azureMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var instances: StringDictionary[RoleInstance]
  var name: String
}

object Role {
  @scala.inline
  def apply(instances: StringDictionary[RoleInstance], name: String): Role = {
    val __obj = js.Dynamic.literal(instances = instances, name = name)
  
    __obj.asInstanceOf[Role]
  }
}

