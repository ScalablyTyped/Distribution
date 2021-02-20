package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends StObject
@JSImport("cesium", "Visibility")
@js.native
object Visibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  
  @js.native
  sealed trait FULL extends Visibility
  /* 2 */ val FULL: typings.cesium.mod.Visibility.FULL with Double = js.native
  
  @js.native
  sealed trait NONE extends Visibility
  /* 0 */ val NONE: typings.cesium.mod.Visibility.NONE with Double = js.native
  
  @js.native
  sealed trait PARTIAL extends Visibility
  /* 1 */ val PARTIAL: typings.cesium.mod.Visibility.PARTIAL with Double = js.native
}
