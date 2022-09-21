package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Vector")
@js.native
open class Vector ()
  extends typings.blackEngine.vectorMod.Vector {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
}
/* static members */
object Vector {
  
  @JSImport("black-engine", "Vector")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Vector.__cache")
  @js.native
  val cache: typings.blackEngine.vectorMod.Vector = js.native
  
  inline def fromAngle(angle: Double): typings.blackEngine.vectorMod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.vectorMod.Vector]
  inline def fromAngle(angle: Double, outVector: typings.blackEngine.vectorMod.Vector): typings.blackEngine.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.vectorMod.Vector]
  
  @JSImport("black-engine", "Vector.pool")
  @js.native
  val pool: typings.blackEngine.objectPoolMod.ObjectPool = js.native
  
  inline def randomRange(vectorMin: typings.blackEngine.vectorMod.Vector, vectorMax: typings.blackEngine.vectorMod.Vector): typings.blackEngine.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.vectorMod.Vector]
  inline def randomRange(
    vectorMin: typings.blackEngine.vectorMod.Vector,
    vectorMax: typings.blackEngine.vectorMod.Vector,
    outVector: typings.blackEngine.vectorMod.Vector
  ): typings.blackEngine.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.vectorMod.Vector]
}
