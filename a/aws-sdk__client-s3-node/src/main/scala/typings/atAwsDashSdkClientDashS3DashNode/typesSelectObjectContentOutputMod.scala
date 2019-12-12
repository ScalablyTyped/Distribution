package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectObjectContentEventStreamMod._UnmarshalledSelectObjectContentEventStream
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/SelectObjectContentOutput", JSImport.Namespace)
@js.native
object typesSelectObjectContentOutputMod extends js.Object {
  @js.native
  trait SelectObjectContentOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _SelectObjectContentEventStream shape
      */
    var Payload: js.UndefOr[_UnmarshalledSelectObjectContentEventStream] = js.native
  }
  
}

