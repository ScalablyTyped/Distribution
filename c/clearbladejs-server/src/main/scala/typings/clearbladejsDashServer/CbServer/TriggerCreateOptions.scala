package typings.clearbladejsDashServer.CbServer

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
    val __obj = js.Dynamic.literal(def_module = def_module.asInstanceOf[js.Any], def_name = def_name.asInstanceOf[js.Any], key_value_pairs = key_value_pairs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service_name = service_name.asInstanceOf[js.Any], system_key = system_key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TriggerCreateOptions]
  }
}

