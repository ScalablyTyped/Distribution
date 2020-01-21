package typings.blueprintjsTable.resizeHandleMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("@blueprintjs/table/lib/esm/interactions/resizeHandle", "Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL extends Orientation
  
  @js.native
  sealed trait VERTICAL extends Orientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 1 */ @js.native
  object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
  
  /* 0 */ @js.native
  object VERTICAL extends TopLevel[VERTICAL with Double]
  
}

