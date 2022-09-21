package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SplitDirection extends StObject
@JSImport("cesium", "SplitDirection")
@js.native
object SplitDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplitDirection & Double] = js.native
  
  /**
    * Display the primitive or ImageryLayer to the left of the {@link Scene#splitPosition}.
    */
  @js.native
  sealed trait LEFT
    extends StObject
       with SplitDirection
  /* -1 */ val LEFT: typings.cesium.mod.SplitDirection.LEFT & Double = js.native
  
  /**
    * Always display the primitive or ImageryLayer.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with SplitDirection
  /* 0 */ val NONE: typings.cesium.mod.SplitDirection.NONE & Double = js.native
  
  /**
    * Display the primitive or ImageryLayer to the right of the {@link Scene#splitPosition}.
    */
  @js.native
  sealed trait RIGHT
    extends StObject
       with SplitDirection
  /* 1 */ val RIGHT: typings.cesium.mod.SplitDirection.RIGHT & Double = js.native
}
