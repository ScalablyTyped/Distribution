package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActiveInputState extends js.Object
@JSGlobal("cast.framework.ActiveInputState")
@js.native
object ActiveInputState extends js.Object {
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_NO extends ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_UNKNOWN extends ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_YES extends ActiveInputState
}
