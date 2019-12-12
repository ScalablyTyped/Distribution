package typings.atAwsDashSdkClientDashS3DashNode.typesBucketAlreadyOwnedByYouMod

import typings.atAwsDashSdkClientDashS3DashNode.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyOwnedByYou
  extends ServiceException[_BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BucketAlreadyOwnedByYou = js.native
}

