package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessagingQOS extends js.Object
@JSImport("clearbladejs-node", "MessagingQOS")
@js.native
object MessagingQOS extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagingQOS with Double] = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_AT_LEAST_ONCE extends MessagingQOS
  /* 1 */ @js.native
  object MESSAGING_QOS_AT_LEAST_ONCE extends TopLevel[MESSAGING_QOS_AT_LEAST_ONCE with Double]
  
  @js.native
  sealed trait MESSAGING_QOS_AT_MOST_ONCE extends MessagingQOS
  /* 0 */ @js.native
  object MESSAGING_QOS_AT_MOST_ONCE extends TopLevel[MESSAGING_QOS_AT_MOST_ONCE with Double]
  
  @js.native
  sealed trait MESSAGING_QOS_EXACTLY_ONCE extends MessagingQOS
  /* 2 */ @js.native
  object MESSAGING_QOS_EXACTLY_ONCE extends TopLevel[MESSAGING_QOS_EXACTLY_ONCE with Double]
}
