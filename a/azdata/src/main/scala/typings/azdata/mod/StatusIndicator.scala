package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusIndicator extends js.Object

@JSImport("azdata", "StatusIndicator")
@js.native
object StatusIndicator extends js.Object {
  @js.native
  sealed trait Error extends StatusIndicator
  
  @js.native
  sealed trait None extends StatusIndicator
  
  @js.native
  sealed trait Ok extends StatusIndicator
  
  @js.native
  sealed trait Warning extends StatusIndicator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusIndicator with Double] = js.native
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Ok extends TopLevel[Ok with Double]
  
  /* 2 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

