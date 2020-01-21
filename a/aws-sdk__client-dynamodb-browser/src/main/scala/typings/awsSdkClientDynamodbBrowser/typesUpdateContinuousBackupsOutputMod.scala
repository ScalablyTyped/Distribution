package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsDescriptionMod.UnmarshalledContinuousBackupsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/UpdateContinuousBackupsOutput", JSImport.Namespace)
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
    var ContinuousBackupsDescription: js.UndefOr[UnmarshalledContinuousBackupsDescription] = js.native
  }
  
}

