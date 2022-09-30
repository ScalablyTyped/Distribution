package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSVoidKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSVoidKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSVoidKeyword__ : TSVoidKeyword
}
object TSVoidKeyword__ {
  
  inline def apply(): TSVoidKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[TSVoidKeyword__]
  }
  
  extension [Self <: TSVoidKeyword__](x: Self) {
    
    inline def setType(value: TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
