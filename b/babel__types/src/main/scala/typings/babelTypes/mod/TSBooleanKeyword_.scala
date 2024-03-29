package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSBooleanKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSBooleanKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSBooleanKeyword_ : TSBooleanKeyword
}
object TSBooleanKeyword_ {
  
  inline def apply(): TSBooleanKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[TSBooleanKeyword_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSBooleanKeyword_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSBooleanKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
