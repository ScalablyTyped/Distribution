package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInterfaceBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSInterfaceBody_
  extends StObject
     with BaseNode
     with TypeScript {
  
  var body: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSInterfaceBody_ : TSInterfaceBody
}
object TSInterfaceBody_ {
  
  inline def apply(body: js.Array[TSTypeElement]): TSInterfaceBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[TSInterfaceBody_]
  }
  
  extension [Self <: TSInterfaceBody_](x: Self) {
    
    inline def setBody(value: js.Array[TSTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: TSTypeElement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
