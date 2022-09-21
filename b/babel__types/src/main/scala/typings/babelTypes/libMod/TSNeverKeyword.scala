package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNeverKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNeverKeyword: typings.babelTypes.babelTypesStrings.TSNeverKeyword
}
object TSNeverKeyword {
  
  inline def apply(): TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[TSNeverKeyword]
  }
  
  extension [Self <: TSNeverKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
