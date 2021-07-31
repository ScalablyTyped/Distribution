package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerCreateOptions extends StObject {
  
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
  
  @scala.inline
  implicit class TriggerCreateOptionsMutableBuilder[Self <: TriggerCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDef_module(value: TriggerModule): Self = StObject.set(x, "def_module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDef_name(value: String): Self = StObject.set(x, "def_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_value_pairs(value: js.Array[KeyValuePair]): Self = StObject.set(x, "key_value_pairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_value_pairsVarargs(value: KeyValuePair*): Self = StObject.set(x, "key_value_pairs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_name(value: String): Self = StObject.set(x, "service_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_key(value: String): Self = StObject.set(x, "system_key", value.asInstanceOf[js.Any])
  }
}
