package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidGrantIdExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
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
  var name_InvalidGrantIdException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidGrantIdException = js.native
}

