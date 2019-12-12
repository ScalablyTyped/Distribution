package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreContinuousBackupsDescriptionMod._UnmarshalledContinuousBackupsDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/UpdateContinuousBackupsOutput", JSImport.Namespace)
@js.native
object typesUpdateContinuousBackupsOutputMod extends js.Object {
  @js.native
  trait UpdateContinuousBackupsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Represents the continuous backups and point in time recovery settings on the table.</p>
      */
    var ContinuousBackupsDescription: js.UndefOr[_UnmarshalledContinuousBackupsDescription] = js.native
  }
  
}

