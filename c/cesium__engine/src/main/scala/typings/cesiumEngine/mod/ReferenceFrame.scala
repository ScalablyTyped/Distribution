package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReferenceFrame extends StObject
@JSImport("@cesium/engine", "ReferenceFrame")
@js.native
object ReferenceFrame extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReferenceFrame & Double] = js.native
  
  /**
    * The fixed frame.
    */
  @js.native
  sealed trait FIXED
    extends StObject
       with ReferenceFrame
  /* 0 */ val FIXED: typings.cesiumEngine.mod.ReferenceFrame.FIXED & Double = js.native
  
  /**
    * The inertial frame.
    */
  @js.native
  sealed trait INERTIAL
    extends StObject
       with ReferenceFrame
  /* 1 */ val INERTIAL: typings.cesiumEngine.mod.ReferenceFrame.INERTIAL & Double = js.native
}
