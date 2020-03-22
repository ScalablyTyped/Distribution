package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotifyMethods extends js.Object

@JSImport("azdata", "NotifyMethods")
@js.native
object NotifyMethods extends js.Object {
  @js.native
  sealed trait netSend extends NotifyMethods
  
  @js.native
  sealed trait none extends NotifyMethods
  
  @js.native
  sealed trait notifyAll extends NotifyMethods
  
  @js.native
  sealed trait notifyEmail extends NotifyMethods
  
  @js.native
  sealed trait pager extends NotifyMethods
  
  /* 7 */ @JSName("notifyAll")
  val notifyAll_ : notifyAll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotifyMethods with Double] = js.native
  /* 4 */ @js.native
  object netSend extends TopLevel[netSend with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notifyEmail extends TopLevel[notifyEmail with Double]
  
  /* 2 */ @js.native
  object pager extends TopLevel[pager with Double]
  
}

