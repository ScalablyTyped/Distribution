package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends StObject
@JSImport("@cesium/engine", "Visibility")
@js.native
object Visibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility & Double] = js.native
  
  /**
    * Represents that an object is visible in its entirety.
    */
  @js.native
  sealed trait FULL
    extends StObject
       with Visibility
  /* 1 */ val FULL: typings.cesiumEngine.mod.Visibility.FULL & Double = js.native
  
  /**
    * Represents that no part of an object is visible.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with Visibility
  /* -1 */ val NONE: typings.cesiumEngine.mod.Visibility.NONE & Double = js.native
  
  /**
    * Represents that part, but not all, of an object is visible
    */
  @js.native
  sealed trait PARTIAL
    extends StObject
       with Visibility
  /* 0 */ val PARTIAL: typings.cesiumEngine.mod.Visibility.PARTIAL & Double = js.native
}
