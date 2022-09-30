package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSStringKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSStringKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSStringKeyword__ : TSStringKeyword
}
object TSStringKeyword__ {
  
  inline def apply(): TSStringKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[TSStringKeyword__]
  }
  
  extension [Self <: TSStringKeyword__](x: Self) {
    
    inline def setType(value: TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
