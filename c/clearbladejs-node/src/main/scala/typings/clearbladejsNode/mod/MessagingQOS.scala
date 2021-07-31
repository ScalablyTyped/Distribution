package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessagingQOS extends StObject
@JSImport("clearbladejs-node", "MessagingQOS")
@js.native
object MessagingQOS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagingQOS & Double] = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_AT_LEAST_ONCE
    extends StObject
       with MessagingQOS
  /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typings.clearbladejsNode.mod.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE & Double = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_AT_MOST_ONCE
    extends StObject
       with MessagingQOS
  /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typings.clearbladejsNode.mod.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE & Double = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_EXACTLY_ONCE
    extends StObject
       with MessagingQOS
  /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typings.clearbladejsNode.mod.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE & Double = js.native
}
