package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerCreateOptions extends js.Object {
  var def_module: TriggerModule
  var def_name: java.lang.String
  var key_value_pairs: js.Array[KeyValuePair]
  var name: java.lang.String
  var service_name: java.lang.String
  var system_key: java.lang.String
}

object TriggerCreateOptions {
  @scala.inline
  def apply(
    def_module: TriggerModule,
    def_name: java.lang.String,
    key_value_pairs: js.Array[KeyValuePair],
    name: java.lang.String,
    service_name: java.lang.String,
    system_key: java.lang.String
  ): TriggerCreateOptions = {
    val __obj = js.Dynamic.literal(def_module = def_module, def_name = def_name, key_value_pairs = key_value_pairs, name = name, service_name = service_name, system_key = system_key)
  
    __obj.asInstanceOf[TriggerCreateOptions]
  }
}

