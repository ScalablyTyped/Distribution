package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessagingQOS extends js.Object

@JSGlobal("CbClient.MessagingQOS")
@js.native
object MessagingQOS extends js.Object {
  @js.native
  sealed trait MESSAGING_QOS_AT_LEAST_ONCE extends MessagingQOS
  
  @js.native
  sealed trait MESSAGING_QOS_AT_MOST_ONCE extends MessagingQOS
  
  @js.native
  sealed trait MESSAGING_QOS_EXACTLY_ONCE extends MessagingQOS
  
  /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typings.clearbladejsDashClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
  /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typings.clearbladejsDashClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
  /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typings.clearbladejsDashClient.CbClient.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagingQOS with Double] = js.native
}

