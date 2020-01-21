package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/CreateBackupOutput", JSImport.Namespace)
@js.native
object typesCreateBackupOutputMod extends js.Object {
  @js.native
  trait CreateBackupOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the details of the backup created for the table.</p>
      */
    var BackupDetails: js.UndefOr[UnmarshalledBackupDetails] = js.native
  }
  
}

