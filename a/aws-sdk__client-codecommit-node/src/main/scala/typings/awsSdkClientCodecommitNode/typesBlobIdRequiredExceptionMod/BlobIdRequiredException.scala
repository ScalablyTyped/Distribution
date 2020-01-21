package typings.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobIdRequiredException
  extends ServiceException[BlobIdRequiredExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException = js.native
}

