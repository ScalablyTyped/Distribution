package typings.atAwsDashSdkClientDashKmsDashNode.typesTagExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagException
  extends ServiceException[_TagExceptionDetails]
     with CreateKeyExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion {
  @JSName("name")
  var name_TagException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.TagException = js.native
}

