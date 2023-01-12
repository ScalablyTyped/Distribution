package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atrule
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var block: Block | Null
  
  var name: String
  
  var prelude: AtrulePrelude | Raw | Null
  
  @JSName("type")
  var type_Atrule: typings.cssTree.cssTreeStrings.Atrule
}
object Atrule {
  
  inline def apply(name: String): Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null, prelude = null)
    __obj.updateDynamic("type")("Atrule")
    __obj.asInstanceOf[Atrule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Atrule] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockNull: Self = StObject.set(x, "block", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrelude(value: AtrulePrelude | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    inline def setPreludeNull: Self = StObject.set(x, "prelude", null)
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Atrule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
