package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptInfoVersion extends StObject {
  
  var svc: Double
  
  var text: Double
}
object ScriptInfoVersion {
  
  inline def apply(svc: Double, text: Double): ScriptInfoVersion = {
    val __obj = js.Dynamic.literal(svc = svc.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptInfoVersion]
  }
  
  extension [Self <: ScriptInfoVersion](x: Self) {
    
    inline def setSvc(value: Double): Self = StObject.set(x, "svc", value.asInstanceOf[js.Any])
    
    inline def setText(value: Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
