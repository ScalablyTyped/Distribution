package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUnknownKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUnknownKeyword: typings.babelTypes.babelTypesStrings.TSUnknownKeyword
}
object TSUnknownKeyword {
  
  inline def apply(): TSUnknownKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[TSUnknownKeyword]
  }
  
  extension [Self <: TSUnknownKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSUnknownKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
