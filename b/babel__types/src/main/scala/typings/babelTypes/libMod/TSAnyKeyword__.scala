package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSAnyKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSAnyKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSAnyKeyword__ : TSAnyKeyword
}
object TSAnyKeyword__ {
  
  inline def apply(): TSAnyKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[TSAnyKeyword__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSAnyKeyword__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
