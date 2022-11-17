package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSBooleanKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSBooleanKeyword_ : "TSBooleanKeyword"
}
object TSBooleanKeyword_ {
  
  inline def apply(): TSBooleanKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[TSBooleanKeyword_]
  }
  
  extension [Self <: TSBooleanKeyword_](x: Self) {
    
    inline def setType(value: "TSBooleanKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
