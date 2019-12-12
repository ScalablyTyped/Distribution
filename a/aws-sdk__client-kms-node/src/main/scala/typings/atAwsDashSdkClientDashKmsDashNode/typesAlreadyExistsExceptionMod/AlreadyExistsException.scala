package typings.atAwsDashSdkClientDashKmsDashNode.typesAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlreadyExistsException
  extends ServiceException[_AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.AlreadyExistsException = js.native
}

