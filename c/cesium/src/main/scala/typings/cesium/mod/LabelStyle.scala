package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelStyle extends StObject
@JSImport("cesium", "LabelStyle")
@js.native
object LabelStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelStyle & Double] = js.native
  
  /**
    * Fill the text of the label, but do not outline.
    */
  @js.native
  sealed trait FILL
    extends StObject
       with LabelStyle
  /* 0 */ val FILL: typings.cesium.mod.LabelStyle.FILL & Double = js.native
  
  /**
    * Fill and outline the text of the label.
    */
  @js.native
  sealed trait FILL_AND_OUTLINE
    extends StObject
       with LabelStyle
  /* 2 */ val FILL_AND_OUTLINE: typings.cesium.mod.LabelStyle.FILL_AND_OUTLINE & Double = js.native
  
  /**
    * Outline the text of the label, but do not fill.
    */
  @js.native
  sealed trait OUTLINE
    extends StObject
       with LabelStyle
  /* 1 */ val OUTLINE: typings.cesium.mod.LabelStyle.OUTLINE & Double = js.native
}
