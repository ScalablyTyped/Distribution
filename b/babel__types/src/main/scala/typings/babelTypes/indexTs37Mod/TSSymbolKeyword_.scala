package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSSymbolKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSSymbolKeyword_ : TSSymbolKeyword
}
object TSSymbolKeyword_ {
  
  @scala.inline
  def apply(): TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[TSSymbolKeyword_]
  }
  
  @scala.inline
  implicit class TSSymbolKeyword_MutableBuilder[Self <: TSSymbolKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
