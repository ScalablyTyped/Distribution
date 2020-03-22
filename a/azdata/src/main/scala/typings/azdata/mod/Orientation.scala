package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("azdata", "Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Horizontal extends Orientation
  
  @js.native
  sealed trait Vertical extends Orientation
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation with String] = js.native
  /* "horizontal" */ @js.native
  object Horizontal extends TopLevel[Horizontal with String]
  
  /* "vertial" */ @js.native
  object Vertical extends TopLevel[Vertical with String]
  
}

