package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUndefinedKeyword__
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSUndefinedKeyword__ : "TSUndefinedKeyword"
}
object TSUndefinedKeyword__ {
  
  inline def apply(): TSUndefinedKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[TSUndefinedKeyword__]
  }
  
  extension [Self <: TSUndefinedKeyword__](x: Self) {
    
    inline def setType(value: "TSUndefinedKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
