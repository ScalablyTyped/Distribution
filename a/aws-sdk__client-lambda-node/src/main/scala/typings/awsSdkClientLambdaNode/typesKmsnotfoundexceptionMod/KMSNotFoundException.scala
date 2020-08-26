package typings.awsSdkClientLambdaNode.typesKmsnotfoundexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSNotFoundException
  extends ServiceException[KMSNotFoundExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSNotFoundException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException = js.native
}

object KMSNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException
  ): KMSNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSNotFoundException]
  }
  @scala.inline
  implicit class KMSNotFoundExceptionOps[Self <: KMSNotFoundException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

