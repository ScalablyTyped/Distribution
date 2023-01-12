package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSThisType_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSThisType_ : TSThisType
}
object TSThisType_ {
  
  inline def apply(): TSThisType_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[TSThisType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSThisType_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
