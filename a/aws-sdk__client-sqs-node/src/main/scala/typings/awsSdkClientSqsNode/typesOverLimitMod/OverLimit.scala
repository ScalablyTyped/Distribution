package typings.awsSdkClientSqsNode.typesOverLimitMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverLimit extends ServiceException[OverLimitDetails] {
  @JSName("name")
  var name_OverLimit: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit = js.native
}

object OverLimit {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: OverLimitDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit
  ): OverLimit = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverLimit]
  }
  @scala.inline
  implicit class OverLimitOps[Self <: OverLimit] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

