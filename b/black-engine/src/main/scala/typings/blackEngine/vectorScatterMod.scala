package typings.blackEngine

import typings.blackEngine.vectorMod.Vector
import typings.blackEngine.vectorScatterBaseMod.VectorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorScatterMod {
  
  @JSImport("black-engine/scatters/VectorScatter", "VectorScatter")
  @js.native
  open class VectorScatter () extends VectorScatterBase {
    def this(minX: Double) = this()
    def this(minX: Double, minY: Double) = this()
    def this(minX: Unit, minY: Double) = this()
    def this(minX: Double, minY: Double, maxX: Double) = this()
    def this(minX: Double, minY: Unit, maxX: Double) = this()
    def this(minX: Unit, minY: Double, maxX: Double) = this()
    def this(minX: Unit, minY: Unit, maxX: Double) = this()
    def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
    def this(minX: Double, minY: Double, maxX: Unit, maxY: Double) = this()
    def this(minX: Double, minY: Unit, maxX: Double, maxY: Double) = this()
    def this(minX: Double, minY: Unit, maxX: Unit, maxY: Double) = this()
    def this(minX: Unit, minY: Double, maxX: Double, maxY: Double) = this()
    def this(minX: Unit, minY: Double, maxX: Unit, maxY: Double) = this()
    def this(minX: Unit, minY: Unit, maxX: Double, maxY: Double) = this()
    def this(minX: Unit, minY: Unit, maxX: Unit, maxY: Double) = this()
    def this(
      minX: Double,
      minY: Double,
      maxX: Double,
      maxY: Double,
      ease: js.Function1[/* arg0 */ Double, Double]
    ) = this()
    def this(
      minX: Double,
      minY: Double,
      maxX: Double,
      maxY: Unit,
      ease: js.Function1[/* arg0 */ Double, Double]
    ) = this()
    def this(
      minX: Double,
      minY: Double,
      maxX: Unit,
      maxY: Double,
      ease: js.Function1[/* arg0 */ Double, Double]
    ) = this()
    def this(minX: Double, minY: Double, maxX: Unit, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(
      minX: Double,
      minY: Unit,
      maxX: Double,
      maxY: Double,
      ease: js.Function1[/* arg0 */ Double, Double]
    ) = this()
    def this(minX: Double, minY: Unit, maxX: Double, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Double, minY: Unit, maxX: Unit, maxY: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Double, minY: Unit, maxX: Unit, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(
      minX: Unit,
      minY: Double,
      maxX: Double,
      maxY: Double,
      ease: js.Function1[/* arg0 */ Double, Double]
    ) = this()
    def this(minX: Unit, minY: Double, maxX: Double, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Unit, minY: Double, maxX: Unit, maxY: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Unit, minY: Double, maxX: Unit, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Unit, minY: Unit, maxX: Double, maxY: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Unit, minY: Unit, maxX: Double, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Unit, minY: Unit, maxX: Unit, maxY: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    def this(minX: Unit, minY: Unit, maxX: Unit, maxY: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
    
    def ease(arg0: Vector): Vector = js.native
    
    var maxX: Double = js.native
    
    var maxY: Double = js.native
    
    var minX: Double = js.native
    
    var minY: Double = js.native
  }
  /* static members */
  object VectorScatter {
    
    @JSImport("black-engine/scatters/VectorScatter", "VectorScatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(values: (Double | VectorScatterBase)*): VectorScatterBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[VectorScatterBase]
  }
}
