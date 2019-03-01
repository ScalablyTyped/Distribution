package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerInstance extends js.Object {
  var name: java.lang.String
  var systemKey: java.lang.String
  def Delete(callback: CbCallback): scala.Unit
  def Update(options: js.Object, callback: CbCallback): scala.Unit
}

object TriggerInstance {
  @scala.inline
  def apply(
    Delete: js.Function1[CbCallback, scala.Unit],
    Update: js.Function2[js.Object, CbCallback, scala.Unit],
    name: java.lang.String,
    systemKey: java.lang.String
  ): TriggerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Delete")(Delete)
    __obj.updateDynamic("Update")(Update)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.asInstanceOf[TriggerInstance]
  }
}

