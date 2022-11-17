package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameter_
  extends StObject
     with BaseNode {
  
  var default: TSType | Null
  
  var constraint: TSType | Null
  
  var in: Boolean | Null
  
  var name: String
  
  var out: Boolean | Null
  
  @JSName("type")
  var type_TSTypeParameter_ : "TSTypeParameter"
}
object TSTypeParameter_ {
  
  inline def apply(name: String): TSTypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], constraint = null, default = null, end = null, in = null, innerComments = null, leadingComments = null, loc = null, out = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[TSTypeParameter_]
  }
  
  extension [Self <: TSTypeParameter_](x: Self) {
    
    inline def setConstraint(value: TSType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintNull: Self = StObject.set(x, "constraint", null)
    
    inline def setDefault(value: TSType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInNull: Self = StObject.set(x, "in", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutNull: Self = StObject.set(x, "out", null)
    
    inline def setType(value: "TSTypeParameter"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
