package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInterfaceBody
  extends StObject
     with Node {
  
  var body: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSInterfaceBody: typings.babelTypes.babelTypesStrings.TSInterfaceBody
}
object TSInterfaceBody {
  
  @JSImport("babel-types/ts3.6", "TSInterfaceBody")
  @js.native
  def apply(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
  
  extension [Self <: TSInterfaceBody](x: Self) {
    
    inline def setBody(value: js.Array[TSTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: TSTypeElement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
