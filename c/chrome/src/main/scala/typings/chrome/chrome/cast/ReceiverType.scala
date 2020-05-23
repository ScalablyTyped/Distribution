package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverType extends js.Object

@JSGlobal("chrome.cast.ReceiverType")
@js.native
object ReceiverType extends js.Object {
  @js.native
  sealed trait CAST extends ReceiverType
  
  @js.native
  sealed trait CUSTOM extends ReceiverType
  
  @js.native
  sealed trait DIAL extends ReceiverType
  
  @js.native
  sealed trait HANGOUT extends ReceiverType
  
}

