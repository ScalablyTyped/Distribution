package typings.baseui.spinnerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SIZE extends js.Object

@JSImport("baseui/spinner", "SIZE")
@js.native
object SIZE extends js.Object {
  @js.native
  sealed trait large extends SIZE
  
  @js.native
  sealed trait medium extends SIZE
  
  @js.native
  sealed trait small extends SIZE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SIZE with String] = js.native
  /* "large" */ @js.native
  object large extends TopLevel[large with String]
  
  /* "medium" */ @js.native
  object medium extends TopLevel[medium with String]
  
  /* "small" */ @js.native
  object small extends TopLevel[small with String]
  
}

