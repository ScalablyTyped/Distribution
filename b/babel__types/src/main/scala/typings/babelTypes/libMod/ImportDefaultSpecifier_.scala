package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDefaultSpecifier_
  extends StObject
     with BaseNode {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportDefaultSpecifier_ : "ImportDefaultSpecifier"
}
object ImportDefaultSpecifier_ {
  
  inline def apply(local: Identifier_): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  
  extension [Self <: ImportDefaultSpecifier_](x: Self) {
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ImportDefaultSpecifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
