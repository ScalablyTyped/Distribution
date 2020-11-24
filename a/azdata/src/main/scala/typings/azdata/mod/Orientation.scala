package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends js.Object
@JSImport("azdata", "Orientation")
@js.native
object Orientation extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation with String] = js.native
  
  @js.native
  sealed trait Horizontal extends Orientation
  /* "horizontal" */ @js.native
  object Horizontal extends TopLevel[Horizontal with String]
  
  @js.native
  sealed trait Vertical extends Orientation
  /* "vertial" */ @js.native
  object Vertical extends TopLevel[Vertical with String]
}
