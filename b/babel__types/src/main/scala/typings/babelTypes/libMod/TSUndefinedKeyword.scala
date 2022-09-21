package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUndefinedKeyword
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUndefinedKeyword: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
}
object TSUndefinedKeyword {
  
  inline def apply(): TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[TSUndefinedKeyword]
  }
  
  extension [Self <: TSUndefinedKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
