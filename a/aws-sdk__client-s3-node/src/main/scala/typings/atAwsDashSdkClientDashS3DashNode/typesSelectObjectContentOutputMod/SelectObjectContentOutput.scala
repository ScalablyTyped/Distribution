package typings.atAwsDashSdkClientDashS3DashNode.typesSelectObjectContentOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectObjectContentEventStreamMod._UnmarshalledSelectObjectContentEventStream
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectObjectContentOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _SelectObjectContentEventStream shape
    */
  var Payload: js.UndefOr[_UnmarshalledSelectObjectContentEventStream] = js.undefined
}

object SelectObjectContentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Payload: _UnmarshalledSelectObjectContentEventStream = null): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Payload != null) __obj.updateDynamic("Payload")(Payload)
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
}

