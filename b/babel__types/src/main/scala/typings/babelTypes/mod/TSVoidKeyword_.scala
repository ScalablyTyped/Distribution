package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSVoidKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSVoidKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSVoidKeyword_ : TSVoidKeyword
}
object TSVoidKeyword_ {
  
  inline def apply(): TSVoidKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[TSVoidKeyword_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSVoidKeyword_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
