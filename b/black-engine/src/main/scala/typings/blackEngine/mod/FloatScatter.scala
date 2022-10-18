package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "FloatScatter")
@js.native
open class FloatScatter ()
  extends typings.blackEngine.scattersFloatScatterMod.FloatScatter {
  def this(min: Double) = this()
  def this(min: Double, max: Double) = this()
  def this(min: Unit, max: Double) = this()
  def this(min: Double, max: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
  def this(min: Double, max: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
  def this(min: Unit, max: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
  def this(min: Unit, max: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
}
/* static members */
object FloatScatter {
  
  @JSImport("black-engine", "FloatScatter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObject(values: (Double | typings.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase)*): typings.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase]
}
