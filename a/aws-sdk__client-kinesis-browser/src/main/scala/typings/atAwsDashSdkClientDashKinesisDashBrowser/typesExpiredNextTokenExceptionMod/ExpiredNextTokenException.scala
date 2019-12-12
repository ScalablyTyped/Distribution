package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesExpiredNextTokenExceptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredNextTokenException
  extends ServiceException[_ExpiredNextTokenExceptionDetails]
     with ListShardsExceptionsUnion
     with ListStreamConsumersExceptionsUnion {
  @JSName("name")
  var name_ExpiredNextTokenException: typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ExpiredNextTokenException = js.native
}

