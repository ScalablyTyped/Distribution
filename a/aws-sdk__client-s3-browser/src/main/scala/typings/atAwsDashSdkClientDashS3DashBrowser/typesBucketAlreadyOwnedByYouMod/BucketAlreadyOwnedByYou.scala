package typings.atAwsDashSdkClientDashS3DashBrowser.typesBucketAlreadyOwnedByYouMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyOwnedByYou
  extends ServiceException[_BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.BucketAlreadyOwnedByYou = js.native
}

