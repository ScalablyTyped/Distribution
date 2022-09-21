package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSStringKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSStringKeyword: typings.babelTypes.babelTypesStrings.TSStringKeyword
}
object TSStringKeyword {
  
  inline def apply(): TSStringKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[TSStringKeyword]
  }
  
  extension [Self <: TSStringKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
