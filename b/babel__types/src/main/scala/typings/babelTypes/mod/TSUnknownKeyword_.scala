package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSUnknownKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSUnknownKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUnknownKeyword_ : TSUnknownKeyword
}
object TSUnknownKeyword_ {
  
  inline def apply(): TSUnknownKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[TSUnknownKeyword_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSUnknownKeyword_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSUnknownKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
