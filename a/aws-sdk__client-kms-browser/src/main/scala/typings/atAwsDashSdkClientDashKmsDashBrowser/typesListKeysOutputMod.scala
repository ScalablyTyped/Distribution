package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreKeyListEntryMod._UnmarshalledKeyListEntry
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/ListKeysOutput", JSImport.Namespace)
@js.native
object typesListKeysOutputMod extends js.Object {
  @js.native
  trait ListKeysOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of customer master keys (CMKs).</p>
      */
    var Keys: js.UndefOr[js.Array[_UnmarshalledKeyListEntry]] = js.native
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.native
  }
  
}

