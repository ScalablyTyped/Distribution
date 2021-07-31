package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorBlendMode extends StObject
@JSImport("cesium", "ColorBlendMode")
@js.native
object ColorBlendMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorBlendMode & Double] = js.native
  
  @js.native
  sealed trait HIGHLIGHT
    extends StObject
       with ColorBlendMode
  /* 0 */ val HIGHLIGHT: typings.cesium.mod.ColorBlendMode.HIGHLIGHT & Double = js.native
  
  @js.native
  sealed trait MIX
    extends StObject
       with ColorBlendMode
  /* 2 */ val MIX: typings.cesium.mod.ColorBlendMode.MIX & Double = js.native
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with ColorBlendMode
  /* 1 */ val REPLACE: typings.cesium.mod.ColorBlendMode.REPLACE & Double = js.native
}
