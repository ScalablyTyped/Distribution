package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSThisType
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSThisType: typings.babelTypes.babelTypesStrings.TSThisType
}
object TSThisType {
  
  inline def apply(): TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[TSThisType]
  }
  
  extension [Self <: TSThisType](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
