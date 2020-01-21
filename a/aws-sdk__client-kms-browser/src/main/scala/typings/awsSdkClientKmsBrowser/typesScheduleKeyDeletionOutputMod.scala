package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/ScheduleKeyDeletionOutput", JSImport.Namespace)
@js.native
object typesScheduleKeyDeletionOutputMod extends js.Object {
  @js.native
  trait ScheduleKeyDeletionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The date and time after which AWS KMS deletes the customer master key (CMK).</p>
      */
    var DeletionDate: js.UndefOr[Date] = js.native
    /**
      * <p>The unique identifier of the customer master key (CMK) for which deletion is scheduled.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
  }
  
}

