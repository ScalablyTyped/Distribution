package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSNumberKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSNumberKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSNumberKeyword_ : TSNumberKeyword
}
object TSNumberKeyword_ {
  
  @scala.inline
  def apply(): TSNumberKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[TSNumberKeyword_]
  }
  
  @scala.inline
  implicit class TSNumberKeyword_MutableBuilder[Self <: TSNumberKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
