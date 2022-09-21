package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNullKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNullKeyword: typings.babelTypes.babelTypesStrings.TSNullKeyword
}
object TSNullKeyword {
  
  inline def apply(): TSNullKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[TSNullKeyword]
  }
  
  extension [Self <: TSNullKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
