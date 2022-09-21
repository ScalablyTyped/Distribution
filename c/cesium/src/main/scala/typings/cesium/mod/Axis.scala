package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Axis extends StObject
@JSImport("cesium", "Axis")
@js.native
object Axis extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Axis & Double] = js.native
  
  /**
    * Denotes the x-axis.
    */
  @js.native
  sealed trait X
    extends StObject
       with Axis
  /* 0 */ val X: typings.cesium.mod.Axis.X & Double = js.native
  
  /**
    * Denotes the y-axis.
    */
  @js.native
  sealed trait Y
    extends StObject
       with Axis
  /* 1 */ val Y: typings.cesium.mod.Axis.Y & Double = js.native
  
  /**
    * Denotes the z-axis.
    */
  @js.native
  sealed trait Z
    extends StObject
       with Axis
  /* 2 */ val Z: typings.cesium.mod.Axis.Z & Double = js.native
}
