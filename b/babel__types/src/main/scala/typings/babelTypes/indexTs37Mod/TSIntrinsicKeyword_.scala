package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSIntrinsicKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSIntrinsicKeyword_ : TSIntrinsicKeyword
}
object TSIntrinsicKeyword_ {
  
  inline def apply(): TSIntrinsicKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[TSIntrinsicKeyword_]
  }
  
  extension [Self <: TSIntrinsicKeyword_](x: Self) {
    
    inline def setType(value: TSIntrinsicKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
