package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSObjectKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSObjectKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSObjectKeyword_ : TSObjectKeyword
}
object TSObjectKeyword_ {
  
  inline def apply(): TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[TSObjectKeyword_]
  }
  
  extension [Self <: TSObjectKeyword_](x: Self) {
    
    inline def setType(value: TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
