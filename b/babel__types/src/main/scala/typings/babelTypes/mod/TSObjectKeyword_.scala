package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSObjectKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSObjectKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSObjectKeyword_ : TSObjectKeyword
}
object TSObjectKeyword_ {
  
  @scala.inline
  def apply(): TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[TSObjectKeyword_]
  }
  
  @scala.inline
  implicit class TSObjectKeyword_MutableBuilder[Self <: TSObjectKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
