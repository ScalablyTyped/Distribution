package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSNullKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNullKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNullKeyword__ : TSNullKeyword
}
object TSNullKeyword__ {
  
  inline def apply(): TSNullKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[TSNullKeyword__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNullKeyword__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
