package typings.atAwsDashSdkClientDashS3DashNode.typesBucketAlreadyExistsMod

import typings.atAwsDashSdkClientDashS3DashNode.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyExists
  extends ServiceException[_BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BucketAlreadyExists = js.native
}

