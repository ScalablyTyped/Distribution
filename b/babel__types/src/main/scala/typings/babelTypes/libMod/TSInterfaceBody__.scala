package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSInterfaceBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInterfaceBody__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var body: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSInterfaceBody__ : TSInterfaceBody
}
object TSInterfaceBody__ {
  
  inline def apply(body: js.Array[TSTypeElement]): TSInterfaceBody__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[TSInterfaceBody__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSInterfaceBody__] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[TSTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: TSTypeElement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
