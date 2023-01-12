package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSNeverKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNeverKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNeverKeyword__ : TSNeverKeyword
}
object TSNeverKeyword__ {
  
  inline def apply(): TSNeverKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[TSNeverKeyword__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNeverKeyword__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
