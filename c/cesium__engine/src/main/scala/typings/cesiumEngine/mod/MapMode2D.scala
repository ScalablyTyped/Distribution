package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapMode2D extends StObject
@JSImport("@cesium/engine", "MapMode2D")
@js.native
object MapMode2D extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode2D & Double] = js.native
  
  /**
    * The 2D map can be scrolled infinitely in the horizontal direction.
    */
  @js.native
  sealed trait INFINITE_SCROLL
    extends StObject
       with MapMode2D
  /* 1 */ val INFINITE_SCROLL: typings.cesiumEngine.mod.MapMode2D.INFINITE_SCROLL & Double = js.native
  
  /**
    * The 2D map can be rotated about the z axis.
    */
  @js.native
  sealed trait ROTATE
    extends StObject
       with MapMode2D
  /* 0 */ val ROTATE: typings.cesiumEngine.mod.MapMode2D.ROTATE & Double = js.native
}
