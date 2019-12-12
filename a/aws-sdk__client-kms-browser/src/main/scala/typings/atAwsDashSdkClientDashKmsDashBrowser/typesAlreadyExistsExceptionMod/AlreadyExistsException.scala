package typings.atAwsDashSdkClientDashKmsDashBrowser.typesAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlreadyExistsException
  extends ServiceException[_AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.AlreadyExistsException = js.native
}

