package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGlobalTableAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableAlreadyExistsException
  extends ServiceException[_GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.GlobalTableAlreadyExistsException = js.native
}

