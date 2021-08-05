package typings.bnJs

import typings.bnJs.mod.BN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var a: BN
    
    var b: BN
    
    var gcd: BN
  }
  object A {
    
    inline def apply(a: BN, b: BN, gcd: BN): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], gcd = gcd.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setA(value: BN): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: BN): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setGcd(value: BN): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
    }
  }
}
