package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IonWorldImageryStyle extends StObject
@JSImport("cesium", "IonWorldImageryStyle")
@js.native
object IonWorldImageryStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IonWorldImageryStyle & Double] = js.native
  
  /**
    * Aerial imagery.
    */
  @js.native
  sealed trait AERIAL
    extends StObject
       with IonWorldImageryStyle
  /* 2 */ val AERIAL: typings.cesium.mod.IonWorldImageryStyle.AERIAL & Double = js.native
  
  /**
    * Aerial imagery with a road overlay.
    */
  @js.native
  sealed trait AERIAL_WITH_LABELS
    extends StObject
       with IonWorldImageryStyle
  /* 3 */ val AERIAL_WITH_LABELS: typings.cesium.mod.IonWorldImageryStyle.AERIAL_WITH_LABELS & Double = js.native
  
  /**
    * Roads without additional imagery.
    */
  @js.native
  sealed trait ROAD
    extends StObject
       with IonWorldImageryStyle
  /* 4 */ val ROAD: typings.cesium.mod.IonWorldImageryStyle.ROAD & Double = js.native
}
