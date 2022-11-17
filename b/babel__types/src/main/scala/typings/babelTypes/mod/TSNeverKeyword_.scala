package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNeverKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSNeverKeyword_ : "TSNeverKeyword"
}
object TSNeverKeyword_ {
  
  inline def apply(): TSNeverKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[TSNeverKeyword_]
  }
  
  extension [Self <: TSNeverKeyword_](x: Self) {
    
    inline def setType(value: "TSNeverKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
