package typings.cli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `0`: String | Boolean
    
    var `1`: String
    
    var `2`: js.UndefOr[String] = js.undefined
    
    var `3`: js.UndefOr[Any] = js.undefined
  }
  object `0` {
    
    inline def apply(`0`: String | Boolean, `1`: String): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def set0(value: String | Boolean): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      inline def set3(value: Any): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set3Undefined: Self = StObject.set(x, "3", js.undefined)
    }
  }
}
