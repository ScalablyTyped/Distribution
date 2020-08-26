package typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesSelectObjectContentEventStreamMod.UnmarshalledSelectObjectContentEventStream
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _SelectObjectContentEventStream shape
    */
  var Payload: js.UndefOr[UnmarshalledSelectObjectContentEventStream] = js.native
}

object SelectObjectContentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
  @scala.inline
  implicit class SelectObjectContentOutputOps[Self <: SelectObjectContentOutput] (val x: Self) extends AnyVal {
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
    def setPayload(value: UnmarshalledSelectObjectContentEventStream): Self = this.set("Payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
  }
  
}

