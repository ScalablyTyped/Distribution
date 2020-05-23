package typings.clearbladejsClient.CbClient

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
  
}

