package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSNullKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSNullKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNullKeyword_ : TSNullKeyword
}
object TSNullKeyword_ {
  
  inline def apply(): TSNullKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[TSNullKeyword_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNullKeyword_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
