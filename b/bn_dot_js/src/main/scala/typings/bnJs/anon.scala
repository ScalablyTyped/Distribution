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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      inline def setA(value: BN): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: BN): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setGcd(value: BN): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Div extends StObject {
    
    var div: BN
    
    var mod: BN
  }
  object Div {
    
    inline def apply(div: BN, mod: BN): Div = {
      val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Div]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Div] (val x: Self) extends AnyVal {
      
      inline def setDiv(value: BN): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setMod(value: BN): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    }
  }
}
