package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentPlaceholder_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_ArgumentPlaceholder_ : "ArgumentPlaceholder"
}
object ArgumentPlaceholder_ {
  
  inline def apply(): ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArgumentPlaceholder")
    __obj.asInstanceOf[ArgumentPlaceholder_]
  }
  
  extension [Self <: ArgumentPlaceholder_](x: Self) {
    
    inline def setType(value: "ArgumentPlaceholder"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
