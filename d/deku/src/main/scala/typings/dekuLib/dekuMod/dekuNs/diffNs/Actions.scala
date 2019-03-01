package typings
package dekuLib.dekuMod.dekuNs.diffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var _keys: js.Array[java.lang.String]
  var _name: java.lang.String
}

object Actions {
  @scala.inline
  def apply(_keys: js.Array[java.lang.String], _name: java.lang.String): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_keys")(_keys)
    __obj.updateDynamic("_name")(_name)
    __obj.asInstanceOf[Actions]
  }
}

