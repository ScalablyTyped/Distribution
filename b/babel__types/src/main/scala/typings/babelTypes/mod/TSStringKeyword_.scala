package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSStringKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSStringKeyword_ : "TSStringKeyword"
}
object TSStringKeyword_ {
  
  inline def apply(): TSStringKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[TSStringKeyword_]
  }
  
  extension [Self <: TSStringKeyword_](x: Self) {
    
    inline def setType(value: "TSStringKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
