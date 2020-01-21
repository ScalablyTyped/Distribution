package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBackupDescriptionMod.UnmarshalledBackupDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/DescribeBackupOutput", JSImport.Namespace)
@js.native
object typesDescribeBackupOutputMod extends js.Object {
  @js.native
  trait DescribeBackupOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the description of the backup created for the table.</p>
      */
    var BackupDescription: js.UndefOr[UnmarshalledBackupDescription] = js.native
  }
  
}

