package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSUndefinedKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSUndefinedKeyword_ : TSUndefinedKeyword
}
object TSUndefinedKeyword_ {
  
  inline def apply(): TSUndefinedKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[TSUndefinedKeyword_]
  }
  
  extension [Self <: TSUndefinedKeyword_](x: Self) {
    
    inline def setType(value: TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
