package typings.barbellweights

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barbellweights", "BarbellWeight")
  @js.native
  open class BarbellWeight protected () extends StObject {
    def this(workingWeight: Double, lift: String) = this()
    def this(workingWeight: Double, lift: String, options: typings.barbellweights.mod.options) = this()
    
    def getResults(): Any = js.native
  }
  object BarbellWeight {
    
    object BarbellWeight {
      
      @JSImport("barbellweights", "BarbellWeight.BarbellWeight")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getResults(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getResults")().asInstanceOf[Unit]
    }
  }
  
  trait options extends StObject {
    
    var bar: js.UndefOr[Double] = js.undefined
    
    var plates: js.UndefOr[js.Array[Double]] = js.undefined
    
    var program: js.UndefOr[String] = js.undefined
    
    var warmup_round_to: js.UndefOr[Double] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setBar(value: Double): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      inline def setPlates(value: js.Array[Double]): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      inline def setPlatesUndefined: Self = StObject.set(x, "plates", js.undefined)
      
      inline def setPlatesVarargs(value: Double*): Self = StObject.set(x, "plates", js.Array(value*))
      
      inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setWarmup_round_to(value: Double): Self = StObject.set(x, "warmup_round_to", value.asInstanceOf[js.Any])
      
      inline def setWarmup_round_toUndefined: Self = StObject.set(x, "warmup_round_to", js.undefined)
    }
  }
}
