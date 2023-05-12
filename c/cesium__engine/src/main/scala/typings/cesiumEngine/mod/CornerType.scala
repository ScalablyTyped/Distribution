package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CornerType extends StObject
@JSImport("@cesium/engine", "CornerType")
@js.native
object CornerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CornerType & Double] = js.native
  
  /**
    * <img src="Images/CornerTypeBeveled.png" style="vertical-align: middle;" width="186" height="189" />
    *
    * Corner is clipped.
    */
  @js.native
  sealed trait BEVELED
    extends StObject
       with CornerType
  /* 2 */ val BEVELED: typings.cesiumEngine.mod.CornerType.BEVELED & Double = js.native
  
  /**
    * <img src="Images/CornerTypeMitered.png" style="vertical-align: middle;" width="186" height="189" />
    *
    * Corner point is the intersection of adjacent edges.
    */
  @js.native
  sealed trait MITERED
    extends StObject
       with CornerType
  /* 1 */ val MITERED: typings.cesiumEngine.mod.CornerType.MITERED & Double = js.native
  
  /**
    * <img src="Images/CornerTypeRounded.png" style="vertical-align: middle;" width="186" height="189" />
    *
    * Corner has a smooth edge.
    */
  @js.native
  sealed trait ROUNDED
    extends StObject
       with CornerType
  /* 0 */ val ROUNDED: typings.cesiumEngine.mod.CornerType.ROUNDED & Double = js.native
}
