package typings.azdata.mod.window

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageLevel extends js.Object
@JSImport("azdata", "window.MessageLevel")
@js.native
object MessageLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
  
  @js.native
  sealed trait Error extends MessageLevel
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Information extends MessageLevel
  /* 2 */ @js.native
  object Information extends TopLevel[Information with Double]
  
  @js.native
  sealed trait Warning extends MessageLevel
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
