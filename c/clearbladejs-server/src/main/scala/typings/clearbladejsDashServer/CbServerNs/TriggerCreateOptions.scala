package typings.clearbladejsDashServer.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerCreateOptions extends js.Object {
  var def_module: TriggerModule
  var def_name: String
  var key_value_pairs: js.Array[KeyValuePair]
  var name: String
  var service_name: String
  var system_key: String
}

object TriggerCreateOptions {
  @scala.inline
  def apply(
    def_module: TriggerModule,
    def_name: String,
    key_value_pairs: js.Array[KeyValuePair],
    name: String,
    service_name: String,
    system_key: String
  ): TriggerCreateOptions = {
    val __obj = js.Dynamic.literal(def_module = def_module, def_name = def_name, key_value_pairs = key_value_pairs, name = name, service_name = service_name, system_key = system_key)
  
    __obj.asInstanceOf[TriggerCreateOptions]
  }
}

