package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotifyMethods extends StObject
@JSImport("azdata", "NotifyMethods")
@js.native
object NotifyMethods extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotifyMethods with Double] = js.native
  
  @js.native
  sealed trait netSend extends NotifyMethods
  /* 4 */ val netSend: typings.azdata.mod.NotifyMethods.netSend with Double = js.native
  
  @js.native
  sealed trait none extends NotifyMethods
  /* 0 */ val none: typings.azdata.mod.NotifyMethods.none with Double = js.native
  
  @js.native
  sealed trait notifyAll extends NotifyMethods
  /* 7 */ @JSName("notifyAll")
  val notifyAll_ : notifyAll with Double = js.native
  
  @js.native
  sealed trait notifyEmail extends NotifyMethods
  /* 1 */ val notifyEmail: typings.azdata.mod.NotifyMethods.notifyEmail with Double = js.native
  
  @js.native
  sealed trait pager extends NotifyMethods
  /* 2 */ val pager: typings.azdata.mod.NotifyMethods.pager with Double = js.native
}
