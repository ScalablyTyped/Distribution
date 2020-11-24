package typings.baseui.spinnerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SIZE extends js.Object
@JSImport("baseui/spinner", "SIZE")
@js.native
object SIZE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SIZE with String] = js.native
  
  @js.native
  sealed trait large extends SIZE
  /* "large" */ @js.native
  object large extends TopLevel[large with String]
  
  @js.native
  sealed trait medium extends SIZE
  /* "medium" */ @js.native
  object medium extends TopLevel[medium with String]
  
  @js.native
  sealed trait small extends SIZE
  /* "small" */ @js.native
  object small extends TopLevel[small with String]
}
