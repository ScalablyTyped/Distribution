package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginModuleWithName extends StObject {
  
  var module: PluginModule
  
  var name: String
}
object PluginModuleWithName {
  
  inline def apply(module: PluginModule, name: String): PluginModuleWithName = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginModuleWithName]
  }
  
  extension [Self <: PluginModuleWithName](x: Self) {
    
    inline def setModule(value: PluginModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
