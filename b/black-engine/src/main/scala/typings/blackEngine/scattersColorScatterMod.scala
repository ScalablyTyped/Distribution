package typings.blackEngine

import typings.blackEngine.scattersColorScatterBaseMod.ColorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scattersColorScatterMod {
  
  @JSImport("black-engine/scatters/ColorScatter", "ColorScatter")
  @js.native
  open class ColorScatter () extends StObject {
    def this(startColor: Double) = this()
    def this(startColor: Double, endColor: Double) = this()
    def this(startColor: Unit, endColor: Double) = this()
    def this(startColor: Double, endColor: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(startColor: Double, endColor: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(startColor: Unit, endColor: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(startColor: Unit, endColor: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    
    var ease: Double = js.native
    
    var endColor: Double = js.native
    
    def getValueAt(t: Any): Double = js.native
    
    var startColor: Double = js.native
    
    var value: Double = js.native
  }
  /* static members */
  object ColorScatter {
    
    @JSImport("black-engine/scatters/ColorScatter", "ColorScatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(values: (Double | ColorScatterBase)*): ColorScatterBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ColorScatterBase]
  }
}
