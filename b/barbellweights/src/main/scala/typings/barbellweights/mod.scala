package typings.barbellweights

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barbellweights", "BarbellWeight")
  @js.native
  class BarbellWeight protected () extends StObject {
    def this(workingWeight: Double, lift: String) = this()
    def this(workingWeight: Double, lift: String, options: typings.barbellweights.mod.options) = this()
    
    def getResults(): js.Any = js.native
  }
  object BarbellWeight {
    
    object BarbellWeight {
      
      @JSImport("barbellweights", "BarbellWeight.BarbellWeight.getResults")
      @js.native
      def getResults(): Unit = js.native
    }
  }
  
  @js.native
  trait options extends StObject {
    
    var bar: js.UndefOr[Double] = js.native
    
    var plates: js.UndefOr[js.Array[Double]] = js.native
    
    var program: js.UndefOr[String] = js.native
    
    var warmup_round_to: js.UndefOr[Double] = js.native
  }
  object options {
    
    @scala.inline
    def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit class optionsMutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBar(value: Double): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      @scala.inline
      def setPlates(value: js.Array[Double]): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatesUndefined: Self = StObject.set(x, "plates", js.undefined)
      
      @scala.inline
      def setPlatesVarargs(value: Double*): Self = StObject.set(x, "plates", js.Array(value :_*))
      
      @scala.inline
      def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setWarmup_round_to(value: Double): Self = StObject.set(x, "warmup_round_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarmup_round_toUndefined: Self = StObject.set(x, "warmup_round_to", js.undefined)
    }
  }
}
