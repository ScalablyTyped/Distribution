package typings.atAwsDashSdkClientDashS3DashBrowser.typesBucketAlreadyExistsMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyExists
  extends ServiceException[_BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.BucketAlreadyExists = js.native
}

