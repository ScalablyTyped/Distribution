package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSUnknownKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUnknownKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUnknownKeyword__ : TSUnknownKeyword
}
object TSUnknownKeyword__ {
  
  inline def apply(): TSUnknownKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[TSUnknownKeyword__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSUnknownKeyword__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSUnknownKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
