package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNeverKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSNeverKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSNeverKeyword_ : TSNeverKeyword
}
object TSNeverKeyword_ {
  
  @scala.inline
  def apply(): TSNeverKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[TSNeverKeyword_]
  }
  
  @scala.inline
  implicit class TSNeverKeyword_MutableBuilder[Self <: TSNeverKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
