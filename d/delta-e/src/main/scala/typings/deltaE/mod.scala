package typings.deltaE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delta-e", "getDeltaE00")
  @js.native
  val getDeltaE00: DeltaECalculation = js.native
  
  @JSImport("delta-e", "getDeltaE76")
  @js.native
  val getDeltaE76: DeltaECalculation = js.native
  
  @JSImport("delta-e", "getDeltaE94")
  @js.native
  val getDeltaE94: DeltaECalculation = js.native
  
  type DeltaECalculation = js.Function2[/* color1 */ LAB, /* color2 */ LAB, Double]
  
  trait LAB extends StObject {
    
    var A: Double
    
    var B: Double
    
    var L: Double
  }
  object LAB {
    
    inline def apply(A: Double, B: Double, L: Double): LAB = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
      __obj.asInstanceOf[LAB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LAB] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    }
  }
}
