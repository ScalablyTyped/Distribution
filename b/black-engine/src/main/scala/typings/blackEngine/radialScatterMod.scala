package typings.blackEngine

import typings.blackEngine.vectorScatterBaseMod.VectorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radialScatterMod {
  
  @JSImport("black-engine/scatters/RadialScatter", "RadialScatter")
  @js.native
  open class RadialScatter () extends VectorScatterBase {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, minRadius: Double) = this()
    def this(x: Double, y: Unit, minRadius: Double) = this()
    def this(x: Unit, y: Double, minRadius: Double) = this()
    def this(x: Unit, y: Unit, minRadius: Double) = this()
    def this(x: Double, y: Double, minRadius: Double, maxRadius: Double) = this()
    def this(x: Double, y: Double, minRadius: Unit, maxRadius: Double) = this()
    def this(x: Double, y: Unit, minRadius: Double, maxRadius: Double) = this()
    def this(x: Double, y: Unit, minRadius: Unit, maxRadius: Double) = this()
    def this(x: Unit, y: Double, minRadius: Double, maxRadius: Double) = this()
    def this(x: Unit, y: Double, minRadius: Unit, maxRadius: Double) = this()
    def this(x: Unit, y: Unit, minRadius: Double, maxRadius: Double) = this()
    def this(x: Unit, y: Unit, minRadius: Unit, maxRadius: Double) = this()
    
    var maxRadius: Double = js.native
    
    var minRadius: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
