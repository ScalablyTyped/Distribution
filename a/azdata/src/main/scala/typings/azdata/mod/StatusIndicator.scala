package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusIndicator extends js.Object
@JSImport("azdata", "StatusIndicator")
@js.native
object StatusIndicator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusIndicator with Double] = js.native
  
  @js.native
  sealed trait Error extends StatusIndicator
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait None extends StatusIndicator
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Ok extends StatusIndicator
  /* 1 */ @js.native
  object Ok extends TopLevel[Ok with Double]
  
  @js.native
  sealed trait Warning extends StatusIndicator
  /* 2 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
