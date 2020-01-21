package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagingQOS with Double] = js.native
  /* 1 */ @js.native
  object MESSAGING_QOS_AT_LEAST_ONCE extends TopLevel[MESSAGING_QOS_AT_LEAST_ONCE with Double]
  
  /* 0 */ @js.native
  object MESSAGING_QOS_AT_MOST_ONCE extends TopLevel[MESSAGING_QOS_AT_MOST_ONCE with Double]
  
  /* 2 */ @js.native
  object MESSAGING_QOS_EXACTLY_ONCE extends TopLevel[MESSAGING_QOS_EXACTLY_ONCE with Double]
  
}

