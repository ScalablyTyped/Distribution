package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIntrinsicKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSIntrinsicKeyword: typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword
}
object TSIntrinsicKeyword {
  
  inline def apply(): TSIntrinsicKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[TSIntrinsicKeyword]
  }
  
  extension [Self <: TSIntrinsicKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
