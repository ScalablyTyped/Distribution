package typings.awsSdkClientKmsNode.typesLimitExceededExceptionMod

import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with EnableKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with TagResourceExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.LimitExceededException = js.native
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.LimitExceededException
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
  @scala.inline
  implicit class LimitExceededExceptionOps[Self <: LimitExceededException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.LimitExceededException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

