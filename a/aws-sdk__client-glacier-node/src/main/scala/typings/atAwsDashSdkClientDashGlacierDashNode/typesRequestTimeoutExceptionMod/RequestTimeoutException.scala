package typings.atAwsDashSdkClientDashGlacierDashNode.typesRequestTimeoutExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTimeoutException
  extends ServiceException[_RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.RequestTimeoutException = js.native
}

