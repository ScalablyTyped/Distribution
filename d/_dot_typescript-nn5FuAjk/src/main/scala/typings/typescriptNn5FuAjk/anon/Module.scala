package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.RequireResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module
  extends StObject
     with RequireResult {
  
  var error: Message
  
  var module: Unit
}
object Module {
  
  inline def apply(error: Message, module: Unit): Module = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Unit): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
