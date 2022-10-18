package typings.blackEngine

import typings.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scattersFloatScatterMod {
  
  @JSImport("black-engine/scatters/FloatScatter", "FloatScatter")
  @js.native
  open class FloatScatter () extends FloatScatterBase {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
    def this(min: Unit, max: Double) = this()
    def this(min: Double, max: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(min: Double, max: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(min: Unit, max: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(min: Unit, max: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    
    def ease(arg0: Double): Double = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
  }
  /* static members */
  object FloatScatter {
    
    @JSImport("black-engine/scatters/FloatScatter", "FloatScatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(values: (Double | FloatScatterBase)*): FloatScatterBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FloatScatterBase]
  }
}
