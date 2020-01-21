package typings.awsSdkClientSqsNode.typesInvalidMessageContentsMod

import typings.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMessageContents
  extends ServiceException[InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents = js.native
}

