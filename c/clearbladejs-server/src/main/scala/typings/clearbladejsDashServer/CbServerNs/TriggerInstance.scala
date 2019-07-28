package typings.clearbladejsDashServer.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerInstance extends js.Object {
  var name: String
  var systemKey: String
  def Delete(callback: CbCallback): Unit
  def Update(options: js.Object, callback: CbCallback): Unit
}

object TriggerInstance {
  @scala.inline
  def apply(
    Delete: CbCallback => Unit,
    Update: (js.Object, CbCallback) => Unit,
    name: String,
    systemKey: String
  ): TriggerInstance = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction1(Delete), Update = js.Any.fromFunction2(Update), name = name, systemKey = systemKey)
  
    __obj.asInstanceOf[TriggerInstance]
  }
}

