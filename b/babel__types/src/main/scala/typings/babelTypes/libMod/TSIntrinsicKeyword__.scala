package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIntrinsicKeyword__
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSIntrinsicKeyword__ : "TSIntrinsicKeyword"
}
object TSIntrinsicKeyword__ {
  
  inline def apply(): TSIntrinsicKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[TSIntrinsicKeyword__]
  }
  
  extension [Self <: TSIntrinsicKeyword__](x: Self) {
    
    inline def setType(value: "TSIntrinsicKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
