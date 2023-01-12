package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtrulePlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var block: BlockPlain | Null
  
  var name: String
  
  var prelude: AtrulePreludePlain | Raw | Null
  
  @JSName("type")
  var type_AtrulePlain: typings.cssTree.cssTreeStrings.Atrule
}
object AtrulePlain {
  
  inline def apply(name: String): AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null, prelude = null)
    __obj.updateDynamic("type")("Atrule")
    __obj.asInstanceOf[AtrulePlain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AtrulePlain] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: BlockPlain): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockNull: Self = StObject.set(x, "block", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrelude(value: AtrulePreludePlain | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    inline def setPreludeNull: Self = StObject.set(x, "prelude", null)
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Atrule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
