package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerCreateOptions extends js.Object {
  
  var def_module: TriggerModule = js.native
  
  var def_name: String = js.native
  
  var key_value_pairs: js.Array[KeyValuePair] = js.native
  
  var name: String = js.native
  
  var service_name: String = js.native
  
  var system_key: String = js.native
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
  
  @scala.inline
  implicit class TriggerCreateOptionsOps[Self <: TriggerCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDef_module(value: TriggerModule): Self = this.set("def_module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDef_name(value: String): Self = this.set("def_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_value_pairsVarargs(value: KeyValuePair*): Self = this.set("key_value_pairs", js.Array(value :_*))
    
    @scala.inline
    def setKey_value_pairs(value: js.Array[KeyValuePair]): Self = this.set("key_value_pairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_name(value: String): Self = this.set("service_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_key(value: String): Self = this.set("system_key", value.asInstanceOf[js.Any])
  }
}
