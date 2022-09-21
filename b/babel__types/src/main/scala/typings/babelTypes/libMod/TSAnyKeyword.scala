package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSAnyKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSAnyKeyword: typings.babelTypes.babelTypesStrings.TSAnyKeyword
}
object TSAnyKeyword {
  
  inline def apply(): TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[TSAnyKeyword]
  }
  
  extension [Self <: TSAnyKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
