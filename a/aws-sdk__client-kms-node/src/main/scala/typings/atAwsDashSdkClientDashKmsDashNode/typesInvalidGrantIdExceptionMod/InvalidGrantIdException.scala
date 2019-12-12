package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidGrantIdExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidGrantIdException
  extends ServiceException[_InvalidGrantIdExceptionDetails]
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantIdException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidGrantIdException = js.native
}

