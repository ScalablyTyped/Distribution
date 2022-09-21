package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInterfaceBody
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var body: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSInterfaceBody: typings.babelTypes.babelTypesStrings.TSInterfaceBody
}
object TSInterfaceBody {
  
  inline def apply(body: js.Array[TSTypeElement]): TSInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[TSInterfaceBody]
  }
  
  extension [Self <: TSInterfaceBody](x: Self) {
    
    inline def setBody(value: js.Array[TSTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: TSTypeElement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
