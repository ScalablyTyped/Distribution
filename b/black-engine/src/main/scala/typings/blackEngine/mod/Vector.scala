package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Vector")
@js.native
open class Vector ()
  extends typings.blackEngine.geomVectorMod.Vector {
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
  val cache: typings.blackEngine.geomVectorMod.Vector = js.native
  
  inline def fromAngle(angle: Double): typings.blackEngine.geomVectorMod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.geomVectorMod.Vector]
  inline def fromAngle(angle: Double, outVector: typings.blackEngine.geomVectorMod.Vector): typings.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomVectorMod.Vector]
  
  @JSImport("black-engine", "Vector.pool")
  @js.native
  val pool: typings.blackEngine.utilsObjectPoolMod.ObjectPool = js.native
  
  inline def randomRange(
    vectorMin: typings.blackEngine.geomVectorMod.Vector,
    vectorMax: typings.blackEngine.geomVectorMod.Vector
  ): typings.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomVectorMod.Vector]
  inline def randomRange(
    vectorMin: typings.blackEngine.geomVectorMod.Vector,
    vectorMax: typings.blackEngine.geomVectorMod.Vector,
    outVector: typings.blackEngine.geomVectorMod.Vector
  ): typings.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomVectorMod.Vector]
}
