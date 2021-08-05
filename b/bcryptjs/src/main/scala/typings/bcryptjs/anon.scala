package typings.bcryptjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.ArrayLike<number>> */
  trait ReadonlyArrayLikenumber extends StObject {
    
    val length: Double
  }
  object ReadonlyArrayLikenumber {
    
    inline def apply(length: Double): ReadonlyArrayLikenumber = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyArrayLikenumber]
    }
    
    extension [Self <: ReadonlyArrayLikenumber](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
