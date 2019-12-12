package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidMessageContentsMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMessageContents
  extends ServiceException[_InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidMessageContents = js.native
}

