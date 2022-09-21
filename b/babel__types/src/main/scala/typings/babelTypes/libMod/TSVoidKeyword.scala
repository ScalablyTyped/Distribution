package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSVoidKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSVoidKeyword: typings.babelTypes.babelTypesStrings.TSVoidKeyword
}
object TSVoidKeyword {
  
  inline def apply(): TSVoidKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[TSVoidKeyword]
  }
  
  extension [Self <: TSVoidKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
