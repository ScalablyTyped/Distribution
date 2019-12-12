package typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
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
  var name_TagException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.TagException = js.native
}

