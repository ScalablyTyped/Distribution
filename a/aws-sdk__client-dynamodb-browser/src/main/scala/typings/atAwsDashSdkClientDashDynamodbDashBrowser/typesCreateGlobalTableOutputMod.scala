package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalTableDescriptionMod._UnmarshalledGlobalTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/CreateGlobalTableOutput", JSImport.Namespace)
@js.native
object typesCreateGlobalTableOutputMod extends js.Object {
  @js.native
  trait CreateGlobalTableOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the details of the global table.</p>
      */
    var GlobalTableDescription: js.UndefOr[_UnmarshalledGlobalTableDescription] = js.native
  }
  
}

