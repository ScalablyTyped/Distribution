package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultActionPolicy extends js.Object

@JSGlobal("chrome.cast.DefaultActionPolicy")
@js.native
object DefaultActionPolicy extends js.Object {
  @js.native
  sealed trait CAST_THIS_TAB extends DefaultActionPolicy
  
  @js.native
  sealed trait CREATE_SESSION extends DefaultActionPolicy
  
}

