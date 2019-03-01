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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("def_module")(def_module)
    __obj.updateDynamic("def_name")(def_name)
    __obj.updateDynamic("key_value_pairs")(key_value_pairs)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("service_name")(service_name)
    __obj.updateDynamic("system_key")(system_key)
    __obj.asInstanceOf[TriggerCreateOptions]
  }
}

