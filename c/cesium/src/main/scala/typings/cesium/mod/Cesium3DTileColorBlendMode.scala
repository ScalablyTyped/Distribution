package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Cesium3DTileColorBlendMode extends StObject
@JSImport("cesium", "Cesium3DTileColorBlendMode")
@js.native
object Cesium3DTileColorBlendMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cesium3DTileColorBlendMode & Double] = js.native
  
  @js.native
  sealed trait HIGHLIGHT
    extends StObject
       with Cesium3DTileColorBlendMode
  /* 0 */ val HIGHLIGHT: typings.cesium.mod.Cesium3DTileColorBlendMode.HIGHLIGHT & Double = js.native
  
  @js.native
  sealed trait MIX
    extends StObject
       with Cesium3DTileColorBlendMode
  /* 2 */ val MIX: typings.cesium.mod.Cesium3DTileColorBlendMode.MIX & Double = js.native
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with Cesium3DTileColorBlendMode
  /* 1 */ val REPLACE: typings.cesium.mod.Cesium3DTileColorBlendMode.REPLACE & Double = js.native
}
