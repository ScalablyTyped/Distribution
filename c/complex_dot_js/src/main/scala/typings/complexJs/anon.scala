package typings.complexJs

import typings.complexJs.complexMod._AValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abs
    extends StObject
       with _AValue {
    
    var abs: Double
    
    var arg: Double
  }
  object Abs {
    
    inline def apply(abs: Double, arg: Double): Abs = {
      val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], arg = arg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abs]
    }
    
    extension [Self <: Abs](x: Self) {
      
      inline def setAbs(value: Double): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
      
      inline def setArg(value: Double): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Im
    extends StObject
       with _AValue {
    
    var im: Double
    
    var re: Double
  }
  object Im {
    
    inline def apply(im: Double, re: Double): Im = {
      val __obj = js.Dynamic.literal(im = im.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
      __obj.asInstanceOf[Im]
    }
    
    extension [Self <: Im](x: Self) {
      
      inline def setIm(value: Double): Self = StObject.set(x, "im", value.asInstanceOf[js.Any])
      
      inline def setRe(value: Double): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    }
  }
  
  trait Phi
    extends StObject
       with _AValue {
    
    var phi: Double
    
    var r: Double
  }
  object Phi {
    
    inline def apply(phi: Double, r: Double): Phi = {
      val __obj = js.Dynamic.literal(phi = phi.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Phi]
    }
    
    extension [Self <: Phi](x: Self) {
      
      inline def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
