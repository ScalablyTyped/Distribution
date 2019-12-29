package typings.bingmaps.Microsoft.Maps.DrawingTools

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

@JSGlobal("Microsoft.Maps.DrawingTools.ShapeType")
@js.native
object ShapeType extends js.Object {
  /** A polygon shape type. */
  @js.native
  sealed trait polygon extends ShapeType
  
  /** A polyline shape type. */
  @js.native
  sealed trait polyline extends ShapeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
  /* 0 */ @js.native
  object polygon extends TopLevel[polygon with Double]
  
  /* 1 */ @js.native
  object polyline extends TopLevel[polyline with Double]
  
}

