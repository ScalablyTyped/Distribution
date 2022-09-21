package typings.currencyFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Neg extends StObject {
    
    var neg: String
    
    var pos: String
    
    var zero: String
  }
  object Neg {
    
    inline def apply(neg: String, pos: String, zero: String): Neg = {
      val __obj = js.Dynamic.literal(neg = neg.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Neg]
    }
    
    extension [Self <: Neg](x: Self) {
      
      inline def setNeg(value: String): Self = StObject.set(x, "neg", value.asInstanceOf[js.Any])
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    }
  }
}
