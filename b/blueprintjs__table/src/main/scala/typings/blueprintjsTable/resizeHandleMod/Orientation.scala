package typings.blueprintjsTable.resizeHandleMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends js.Object
@JSImport("@blueprintjs/table/lib/esm/interactions/resizeHandle", "Orientation")
@js.native
object Orientation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  
  @js.native
  sealed trait HORIZONTAL extends Orientation
  /* 1 */ @js.native
  object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
  
  @js.native
  sealed trait VERTICAL extends Orientation
  /* 0 */ @js.native
  object VERTICAL extends TopLevel[VERTICAL with Double]
}
