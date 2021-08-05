package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSBigIntKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSBigIntKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSBigIntKeyword_ : TSBigIntKeyword
}
object TSBigIntKeyword_ {
  
  inline def apply(): TSBigIntKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[TSBigIntKeyword_]
  }
  
  extension [Self <: TSBigIntKeyword_](x: Self) {
    
    inline def setType(value: TSBigIntKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
