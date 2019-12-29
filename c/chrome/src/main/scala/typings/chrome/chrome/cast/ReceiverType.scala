package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReceiverType with String] = js.native
  /* "cast" */ @js.native
  object CAST extends TopLevel[CAST with String]
  
  /* "custom" */ @js.native
  object CUSTOM extends TopLevel[CUSTOM with String]
  
  /* "dial" */ @js.native
  object DIAL extends TopLevel[DIAL with String]
  
  /* "hangout" */ @js.native
  object HANGOUT extends TopLevel[HANGOUT with String]
  
}

