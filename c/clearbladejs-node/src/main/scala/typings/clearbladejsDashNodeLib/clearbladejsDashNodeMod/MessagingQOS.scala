package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessagingQOS extends js.Object

@JSImport("clearbladejs-node", "MessagingQOS")
@js.native
object MessagingQOS extends js.Object {
  @js.native
  sealed trait MESSAGING_QOS_AT_LEAST_ONCE
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.MessagingQOS
  
  @js.native
  sealed trait MESSAGING_QOS_AT_MOST_ONCE
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.MessagingQOS
  
  @js.native
  sealed trait MESSAGING_QOS_EXACTLY_ONCE
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.MessagingQOS
  
  /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: MESSAGING_QOS_AT_LEAST_ONCE with scala.Double = js.native
  /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: MESSAGING_QOS_AT_MOST_ONCE with scala.Double = js.native
  /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: MESSAGING_QOS_EXACTLY_ONCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[clearbladejsDashNodeLib.clearbladejsDashNodeMod.MessagingQOS with scala.Double] = js.native
}

