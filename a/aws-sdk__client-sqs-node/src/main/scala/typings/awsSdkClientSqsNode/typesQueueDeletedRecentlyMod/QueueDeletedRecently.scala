package typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod

import typings.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDeletedRecently
  extends ServiceException[QueueDeletedRecentlyDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDeletedRecently: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently = js.native
}

