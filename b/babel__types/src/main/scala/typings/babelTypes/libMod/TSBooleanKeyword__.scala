package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSBooleanKeyword__
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSBooleanKeyword__ : "TSBooleanKeyword"
}
object TSBooleanKeyword__ {
  
  inline def apply(): TSBooleanKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[TSBooleanKeyword__]
  }
  
  extension [Self <: TSBooleanKeyword__](x: Self) {
    
    inline def setType(value: "TSBooleanKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
