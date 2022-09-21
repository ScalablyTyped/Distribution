package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSBigIntKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSBigIntKeyword: typings.babelTypes.babelTypesStrings.TSBigIntKeyword
}
object TSBigIntKeyword {
  
  inline def apply(): TSBigIntKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[TSBigIntKeyword]
  }
  
  extension [Self <: TSBigIntKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSBigIntKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
