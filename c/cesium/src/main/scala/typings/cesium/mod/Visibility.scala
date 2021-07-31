package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends StObject
@JSImport("cesium", "Visibility")
@js.native
object Visibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility & Double] = js.native
  
  @js.native
  sealed trait FULL
    extends StObject
       with Visibility
  /* 2 */ val FULL: typings.cesium.mod.Visibility.FULL & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with Visibility
  /* 0 */ val NONE: typings.cesium.mod.Visibility.NONE & Double = js.native
  
  @js.native
  sealed trait PARTIAL
    extends StObject
       with Visibility
  /* 1 */ val PARTIAL: typings.cesium.mod.Visibility.PARTIAL & Double = js.native
}
